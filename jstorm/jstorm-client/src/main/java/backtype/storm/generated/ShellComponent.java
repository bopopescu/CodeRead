/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package backtype.storm.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShellComponent implements org.apache.thrift7.TBase<ShellComponent, ShellComponent._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift7.protocol.TStruct STRUCT_DESC = new org.apache.thrift7.protocol.TStruct("ShellComponent");

  private static final org.apache.thrift7.protocol.TField EXECUTION_COMMAND_FIELD_DESC = new org.apache.thrift7.protocol.TField("execution_command", org.apache.thrift7.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift7.protocol.TField SCRIPT_FIELD_DESC = new org.apache.thrift7.protocol.TField("script", org.apache.thrift7.protocol.TType.STRING, (short)2);

  private String execution_command; // required
  private String script; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift7.TFieldIdEnum {
    EXECUTION_COMMAND((short)1, "execution_command"),
    SCRIPT((short)2, "script");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // EXECUTION_COMMAND
          return EXECUTION_COMMAND;
        case 2: // SCRIPT
          return SCRIPT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift7.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift7.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXECUTION_COMMAND, new org.apache.thrift7.meta_data.FieldMetaData("execution_command", org.apache.thrift7.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    tmpMap.put(_Fields.SCRIPT, new org.apache.thrift7.meta_data.FieldMetaData("script", org.apache.thrift7.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift7.meta_data.FieldValueMetaData(org.apache.thrift7.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift7.meta_data.FieldMetaData.addStructMetaDataMap(ShellComponent.class, metaDataMap);
  }

  public ShellComponent() {
  }

  public ShellComponent(
    String execution_command,
    String script)
  {
    this();
    this.execution_command = execution_command;
    this.script = script;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ShellComponent(ShellComponent other) {
    if (other.is_set_execution_command()) {
      this.execution_command = other.execution_command;
    }
    if (other.is_set_script()) {
      this.script = other.script;
    }
  }

  public ShellComponent deepCopy() {
    return new ShellComponent(this);
  }

  @Override
  public void clear() {
    this.execution_command = null;
    this.script = null;
  }

  public String get_execution_command() {
    return this.execution_command;
  }

  public void set_execution_command(String execution_command) {
    this.execution_command = execution_command;
  }

  public void unset_execution_command() {
    this.execution_command = null;
  }

  /** Returns true if field execution_command is set (has been assigned a value) and false otherwise */
  public boolean is_set_execution_command() {
    return this.execution_command != null;
  }

  public void set_execution_command_isSet(boolean value) {
    if (!value) {
      this.execution_command = null;
    }
  }

  public String get_script() {
    return this.script;
  }

  public void set_script(String script) {
    this.script = script;
  }

  public void unset_script() {
    this.script = null;
  }

  /** Returns true if field script is set (has been assigned a value) and false otherwise */
  public boolean is_set_script() {
    return this.script != null;
  }

  public void set_script_isSet(boolean value) {
    if (!value) {
      this.script = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EXECUTION_COMMAND:
      if (value == null) {
        unset_execution_command();
      } else {
        set_execution_command((String)value);
      }
      break;

    case SCRIPT:
      if (value == null) {
        unset_script();
      } else {
        set_script((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EXECUTION_COMMAND:
      return get_execution_command();

    case SCRIPT:
      return get_script();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EXECUTION_COMMAND:
      return is_set_execution_command();
    case SCRIPT:
      return is_set_script();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ShellComponent)
      return this.equals((ShellComponent)that);
    return false;
  }

  public boolean equals(ShellComponent that) {
    if (that == null)
      return false;

    boolean this_present_execution_command = true && this.is_set_execution_command();
    boolean that_present_execution_command = true && that.is_set_execution_command();
    if (this_present_execution_command || that_present_execution_command) {
      if (!(this_present_execution_command && that_present_execution_command))
        return false;
      if (!this.execution_command.equals(that.execution_command))
        return false;
    }

    boolean this_present_script = true && this.is_set_script();
    boolean that_present_script = true && that.is_set_script();
    if (this_present_script || that_present_script) {
      if (!(this_present_script && that_present_script))
        return false;
      if (!this.script.equals(that.script))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_execution_command = true && (is_set_execution_command());
    builder.append(present_execution_command);
    if (present_execution_command)
      builder.append(execution_command);

    boolean present_script = true && (is_set_script());
    builder.append(present_script);
    if (present_script)
      builder.append(script);

    return builder.toHashCode();
  }

  public int compareTo(ShellComponent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ShellComponent typedOther = (ShellComponent)other;

    lastComparison = Boolean.valueOf(is_set_execution_command()).compareTo(typedOther.is_set_execution_command());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_execution_command()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.execution_command, typedOther.execution_command);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_script()).compareTo(typedOther.is_set_script());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_script()) {
      lastComparison = org.apache.thrift7.TBaseHelper.compareTo(this.script, typedOther.script);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift7.protocol.TProtocol iprot) throws org.apache.thrift7.TException {
    org.apache.thrift7.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift7.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // EXECUTION_COMMAND
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.execution_command = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SCRIPT
          if (field.type == org.apache.thrift7.protocol.TType.STRING) {
            this.script = iprot.readString();
          } else { 
            org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift7.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(org.apache.thrift7.protocol.TProtocol oprot) throws org.apache.thrift7.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.execution_command != null) {
      oprot.writeFieldBegin(EXECUTION_COMMAND_FIELD_DESC);
      oprot.writeString(this.execution_command);
      oprot.writeFieldEnd();
    }
    if (this.script != null) {
      oprot.writeFieldBegin(SCRIPT_FIELD_DESC);
      oprot.writeString(this.script);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ShellComponent(");
    boolean first = true;

    sb.append("execution_command:");
    if (this.execution_command == null) {
      sb.append("null");
    } else {
      sb.append(this.execution_command);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("script:");
    if (this.script == null) {
      sb.append("null");
    } else {
      sb.append(this.script);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift7.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift7.protocol.TCompactProtocol(new org.apache.thrift7.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift7.TException te) {
      throw new java.io.IOException(te);
    }
  }

}

