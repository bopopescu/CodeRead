/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.deploy.worker.ui

import java.io.{File, FileWriter}

import org.mockito.Mockito.mock
import org.scalatest.{FunSuite, PrivateMethodTester}

class LogPageSuite extends FunSuite with PrivateMethodTester {

  test("get logs simple") {
    val webui = mock(classOf[WorkerWebUI])
    val logPage = new LogPage(webui)

    // Prepare some fake log files to read later
    val out = "some stdout here"
    val err = "some stderr here"
    val tmpDir = new File(sys.props("java.io.tmpdir"))
    val tmpOut = new File(tmpDir, "stdout")
    val tmpErr = new File(tmpDir, "stderr")
    val tmpRand = new File(tmpDir, "random")
    write(tmpOut, out)
    write(tmpErr, err)
    write(tmpRand, "1 6 4 5 2 7 8")

    // Get the logs. All log types other than "stderr" or "stdout" will be rejected
    val getLog = PrivateMethod[(String, Long, Long, Long)]('getLog)
    val (stdout, _, _, _) =
      logPage invokePrivate getLog(tmpDir.getAbsolutePath, "stdout", None, 100)
    val (stderr, _, _, _) =
      logPage invokePrivate getLog(tmpDir.getAbsolutePath, "stderr", None, 100)
    val (error1, _, _, _) =
      logPage invokePrivate getLog(tmpDir.getAbsolutePath, "random", None, 100)
    val (error2, _, _, _) =
      logPage invokePrivate getLog(tmpDir.getAbsolutePath, "does-not-exist.txt", None, 100)
    assert(stdout === out)
    assert(stderr === err)
    assert(error1.startsWith("Error"))
    assert(error2.startsWith("Error"))
  }

  /** Write the specified string to the file. */
  private def write(f: File, s: String): Unit = {
    val writer = new FileWriter(f)
    try {
      writer.write(s)
    } finally {
      writer.close()
    }
  }

}
