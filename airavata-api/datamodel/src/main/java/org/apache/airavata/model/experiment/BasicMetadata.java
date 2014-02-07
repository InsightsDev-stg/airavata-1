/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.airavata.model.experiment;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

/**
 * A structure holding the basic experiment metadata.
 * 
 * userName:
 *   The user name of the targeted gateway end user on whose behalf the experiment is being created.
 *     the associated gateway identity can only be inferred from the security hand-shake so as to avoid
 *     authorized Airavata Clients mimicking an unauthorized request. If a gateway is not registered with
 *     Airavata, an authorization exception is thrown.
 * 
 * experimentName:
 *   The name of the experiment as defined by the user. The name need not be unique as uniqueness is enforced
 *      by the generated experiment id.
 * 
 * experimentDescription:
 *    The verbose description of the experiment. This is an optional parameter.
 */
@SuppressWarnings("all") public class BasicMetadata implements org.apache.thrift.TBase<BasicMetadata, BasicMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<BasicMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BasicMetadata");

  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EXPERIMENT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PROJECT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("projectID", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EXPERIMENT_DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentDescription", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SHARE_EXPERIMENT_PUBLICLY_FIELD_DESC = new org.apache.thrift.protocol.TField("shareExperimentPublicly", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField EXPERIMENT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("experimentID", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BasicMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BasicMetadataTupleSchemeFactory());
  }

  private String userName; // required
  private String experimentName; // required
  private String projectID; // required
  private String experimentDescription; // optional
  private boolean shareExperimentPublicly; // optional
  private String experimentID; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_NAME((short)1, "userName"),
    EXPERIMENT_NAME((short)2, "experimentName"),
    PROJECT_ID((short)3, "projectID"),
    EXPERIMENT_DESCRIPTION((short)4, "experimentDescription"),
    SHARE_EXPERIMENT_PUBLICLY((short)5, "shareExperimentPublicly"),
    EXPERIMENT_ID((short)6, "experimentID");

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
        case 1: // USER_NAME
          return USER_NAME;
        case 2: // EXPERIMENT_NAME
          return EXPERIMENT_NAME;
        case 3: // PROJECT_ID
          return PROJECT_ID;
        case 4: // EXPERIMENT_DESCRIPTION
          return EXPERIMENT_DESCRIPTION;
        case 5: // SHARE_EXPERIMENT_PUBLICLY
          return SHARE_EXPERIMENT_PUBLICLY;
        case 6: // EXPERIMENT_ID
          return EXPERIMENT_ID;
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
  private static final int __SHAREEXPERIMENTPUBLICLY_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.EXPERIMENT_DESCRIPTION,_Fields.SHARE_EXPERIMENT_PUBLICLY};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPERIMENT_NAME, new org.apache.thrift.meta_data.FieldMetaData("experimentName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROJECT_ID, new org.apache.thrift.meta_data.FieldMetaData("projectID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXPERIMENT_DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("experimentDescription", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SHARE_EXPERIMENT_PUBLICLY, new org.apache.thrift.meta_data.FieldMetaData("shareExperimentPublicly", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.EXPERIMENT_ID, new org.apache.thrift.meta_data.FieldMetaData("experimentID", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BasicMetadata.class, metaDataMap);
  }

  public BasicMetadata() {
    this.projectID = "default";

    this.shareExperimentPublicly = false;

    this.experimentID = "DO_NOT_SET";

  }

  public BasicMetadata(
    String userName,
    String experimentName,
    String projectID,
    String experimentID)
  {
    this();
    this.userName = userName;
    this.experimentName = experimentName;
    this.projectID = projectID;
    this.experimentID = experimentID;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BasicMetadata(BasicMetadata other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
    if (other.isSetExperimentName()) {
      this.experimentName = other.experimentName;
    }
    if (other.isSetProjectID()) {
      this.projectID = other.projectID;
    }
    if (other.isSetExperimentDescription()) {
      this.experimentDescription = other.experimentDescription;
    }
    this.shareExperimentPublicly = other.shareExperimentPublicly;
    if (other.isSetExperimentID()) {
      this.experimentID = other.experimentID;
    }
  }

  public BasicMetadata deepCopy() {
    return new BasicMetadata(this);
  }

  @Override
  public void clear() {
    this.userName = null;
    this.experimentName = null;
    this.projectID = "default";

    this.experimentDescription = null;
    this.shareExperimentPublicly = false;

    this.experimentID = "DO_NOT_SET";

  }

  public String getUserName() {
    return this.userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public String getExperimentName() {
    return this.experimentName;
  }

  public void setExperimentName(String experimentName) {
    this.experimentName = experimentName;
  }

  public void unsetExperimentName() {
    this.experimentName = null;
  }

  /** Returns true if field experimentName is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentName() {
    return this.experimentName != null;
  }

  public void setExperimentNameIsSet(boolean value) {
    if (!value) {
      this.experimentName = null;
    }
  }

  public String getProjectID() {
    return this.projectID;
  }

  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  public void unsetProjectID() {
    this.projectID = null;
  }

  /** Returns true if field projectID is set (has been assigned a value) and false otherwise */
  public boolean isSetProjectID() {
    return this.projectID != null;
  }

  public void setProjectIDIsSet(boolean value) {
    if (!value) {
      this.projectID = null;
    }
  }

  public String getExperimentDescription() {
    return this.experimentDescription;
  }

  public void setExperimentDescription(String experimentDescription) {
    this.experimentDescription = experimentDescription;
  }

  public void unsetExperimentDescription() {
    this.experimentDescription = null;
  }

  /** Returns true if field experimentDescription is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentDescription() {
    return this.experimentDescription != null;
  }

  public void setExperimentDescriptionIsSet(boolean value) {
    if (!value) {
      this.experimentDescription = null;
    }
  }

  public boolean isShareExperimentPublicly() {
    return this.shareExperimentPublicly;
  }

  public void setShareExperimentPublicly(boolean shareExperimentPublicly) {
    this.shareExperimentPublicly = shareExperimentPublicly;
    setShareExperimentPubliclyIsSet(true);
  }

  public void unsetShareExperimentPublicly() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHAREEXPERIMENTPUBLICLY_ISSET_ID);
  }

  /** Returns true if field shareExperimentPublicly is set (has been assigned a value) and false otherwise */
  public boolean isSetShareExperimentPublicly() {
    return EncodingUtils.testBit(__isset_bitfield, __SHAREEXPERIMENTPUBLICLY_ISSET_ID);
  }

  public void setShareExperimentPubliclyIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHAREEXPERIMENTPUBLICLY_ISSET_ID, value);
  }

  public String getExperimentID() {
    return this.experimentID;
  }

  public void setExperimentID(String experimentID) {
    this.experimentID = experimentID;
  }

  public void unsetExperimentID() {
    this.experimentID = null;
  }

  /** Returns true if field experimentID is set (has been assigned a value) and false otherwise */
  public boolean isSetExperimentID() {
    return this.experimentID != null;
  }

  public void setExperimentIDIsSet(boolean value) {
    if (!value) {
      this.experimentID = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    case EXPERIMENT_NAME:
      if (value == null) {
        unsetExperimentName();
      } else {
        setExperimentName((String)value);
      }
      break;

    case PROJECT_ID:
      if (value == null) {
        unsetProjectID();
      } else {
        setProjectID((String)value);
      }
      break;

    case EXPERIMENT_DESCRIPTION:
      if (value == null) {
        unsetExperimentDescription();
      } else {
        setExperimentDescription((String)value);
      }
      break;

    case SHARE_EXPERIMENT_PUBLICLY:
      if (value == null) {
        unsetShareExperimentPublicly();
      } else {
        setShareExperimentPublicly((Boolean)value);
      }
      break;

    case EXPERIMENT_ID:
      if (value == null) {
        unsetExperimentID();
      } else {
        setExperimentID((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_NAME:
      return getUserName();

    case EXPERIMENT_NAME:
      return getExperimentName();

    case PROJECT_ID:
      return getProjectID();

    case EXPERIMENT_DESCRIPTION:
      return getExperimentDescription();

    case SHARE_EXPERIMENT_PUBLICLY:
      return Boolean.valueOf(isShareExperimentPublicly());

    case EXPERIMENT_ID:
      return getExperimentID();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_NAME:
      return isSetUserName();
    case EXPERIMENT_NAME:
      return isSetExperimentName();
    case PROJECT_ID:
      return isSetProjectID();
    case EXPERIMENT_DESCRIPTION:
      return isSetExperimentDescription();
    case SHARE_EXPERIMENT_PUBLICLY:
      return isSetShareExperimentPublicly();
    case EXPERIMENT_ID:
      return isSetExperimentID();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BasicMetadata)
      return this.equals((BasicMetadata)that);
    return false;
  }

  public boolean equals(BasicMetadata that) {
    if (that == null)
      return false;

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    boolean this_present_experimentName = true && this.isSetExperimentName();
    boolean that_present_experimentName = true && that.isSetExperimentName();
    if (this_present_experimentName || that_present_experimentName) {
      if (!(this_present_experimentName && that_present_experimentName))
        return false;
      if (!this.experimentName.equals(that.experimentName))
        return false;
    }

    boolean this_present_projectID = true && this.isSetProjectID();
    boolean that_present_projectID = true && that.isSetProjectID();
    if (this_present_projectID || that_present_projectID) {
      if (!(this_present_projectID && that_present_projectID))
        return false;
      if (!this.projectID.equals(that.projectID))
        return false;
    }

    boolean this_present_experimentDescription = true && this.isSetExperimentDescription();
    boolean that_present_experimentDescription = true && that.isSetExperimentDescription();
    if (this_present_experimentDescription || that_present_experimentDescription) {
      if (!(this_present_experimentDescription && that_present_experimentDescription))
        return false;
      if (!this.experimentDescription.equals(that.experimentDescription))
        return false;
    }

    boolean this_present_shareExperimentPublicly = true && this.isSetShareExperimentPublicly();
    boolean that_present_shareExperimentPublicly = true && that.isSetShareExperimentPublicly();
    if (this_present_shareExperimentPublicly || that_present_shareExperimentPublicly) {
      if (!(this_present_shareExperimentPublicly && that_present_shareExperimentPublicly))
        return false;
      if (this.shareExperimentPublicly != that.shareExperimentPublicly)
        return false;
    }

    boolean this_present_experimentID = true && this.isSetExperimentID();
    boolean that_present_experimentID = true && that.isSetExperimentID();
    if (this_present_experimentID || that_present_experimentID) {
      if (!(this_present_experimentID && that_present_experimentID))
        return false;
      if (!this.experimentID.equals(that.experimentID))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(BasicMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExperimentName()).compareTo(other.isSetExperimentName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentName, other.experimentName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetProjectID()).compareTo(other.isSetProjectID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProjectID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.projectID, other.projectID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExperimentDescription()).compareTo(other.isSetExperimentDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentDescription, other.experimentDescription);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShareExperimentPublicly()).compareTo(other.isSetShareExperimentPublicly());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShareExperimentPublicly()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shareExperimentPublicly, other.shareExperimentPublicly);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExperimentID()).compareTo(other.isSetExperimentID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExperimentID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.experimentID, other.experimentID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BasicMetadata(");
    boolean first = true;

    sb.append("userName:");
    if (this.userName == null) {
      sb.append("null");
    } else {
      sb.append(this.userName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("experimentName:");
    if (this.experimentName == null) {
      sb.append("null");
    } else {
      sb.append(this.experimentName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("projectID:");
    if (this.projectID == null) {
      sb.append("null");
    } else {
      sb.append(this.projectID);
    }
    first = false;
    if (isSetExperimentDescription()) {
      if (!first) sb.append(", ");
      sb.append("experimentDescription:");
      if (this.experimentDescription == null) {
        sb.append("null");
      } else {
        sb.append(this.experimentDescription);
      }
      first = false;
    }
    if (isSetShareExperimentPublicly()) {
      if (!first) sb.append(", ");
      sb.append("shareExperimentPublicly:");
      sb.append(this.shareExperimentPublicly);
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("experimentID:");
    if (this.experimentID == null) {
      sb.append("null");
    } else {
      sb.append(this.experimentID);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetUserName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'userName' is unset! Struct:" + toString());
    }

    if (!isSetExperimentName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'experimentName' is unset! Struct:" + toString());
    }

    if (!isSetProjectID()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'projectID' is unset! Struct:" + toString());
    }

    if (!isSetExperimentID()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'experimentID' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BasicMetadataStandardSchemeFactory implements SchemeFactory {
    public BasicMetadataStandardScheme getScheme() {
      return new BasicMetadataStandardScheme();
    }
  }

  private static class BasicMetadataStandardScheme extends StandardScheme<BasicMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BasicMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXPERIMENT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.experimentName = iprot.readString();
              struct.setExperimentNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PROJECT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.projectID = iprot.readString();
              struct.setProjectIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXPERIMENT_DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.experimentDescription = iprot.readString();
              struct.setExperimentDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SHARE_EXPERIMENT_PUBLICLY
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.shareExperimentPublicly = iprot.readBool();
              struct.setShareExperimentPubliclyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EXPERIMENT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.experimentID = iprot.readString();
              struct.setExperimentIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BasicMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userName != null) {
        oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
        oprot.writeString(struct.userName);
        oprot.writeFieldEnd();
      }
      if (struct.experimentName != null) {
        oprot.writeFieldBegin(EXPERIMENT_NAME_FIELD_DESC);
        oprot.writeString(struct.experimentName);
        oprot.writeFieldEnd();
      }
      if (struct.projectID != null) {
        oprot.writeFieldBegin(PROJECT_ID_FIELD_DESC);
        oprot.writeString(struct.projectID);
        oprot.writeFieldEnd();
      }
      if (struct.experimentDescription != null) {
        if (struct.isSetExperimentDescription()) {
          oprot.writeFieldBegin(EXPERIMENT_DESCRIPTION_FIELD_DESC);
          oprot.writeString(struct.experimentDescription);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetShareExperimentPublicly()) {
        oprot.writeFieldBegin(SHARE_EXPERIMENT_PUBLICLY_FIELD_DESC);
        oprot.writeBool(struct.shareExperimentPublicly);
        oprot.writeFieldEnd();
      }
      if (struct.experimentID != null) {
        oprot.writeFieldBegin(EXPERIMENT_ID_FIELD_DESC);
        oprot.writeString(struct.experimentID);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BasicMetadataTupleSchemeFactory implements SchemeFactory {
    public BasicMetadataTupleScheme getScheme() {
      return new BasicMetadataTupleScheme();
    }
  }

  private static class BasicMetadataTupleScheme extends TupleScheme<BasicMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BasicMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.userName);
      oprot.writeString(struct.experimentName);
      oprot.writeString(struct.projectID);
      oprot.writeString(struct.experimentID);
      BitSet optionals = new BitSet();
      if (struct.isSetExperimentDescription()) {
        optionals.set(0);
      }
      if (struct.isSetShareExperimentPublicly()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetExperimentDescription()) {
        oprot.writeString(struct.experimentDescription);
      }
      if (struct.isSetShareExperimentPublicly()) {
        oprot.writeBool(struct.shareExperimentPublicly);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BasicMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.userName = iprot.readString();
      struct.setUserNameIsSet(true);
      struct.experimentName = iprot.readString();
      struct.setExperimentNameIsSet(true);
      struct.projectID = iprot.readString();
      struct.setProjectIDIsSet(true);
      struct.experimentID = iprot.readString();
      struct.setExperimentIDIsSet(true);
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.experimentDescription = iprot.readString();
        struct.setExperimentDescriptionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.shareExperimentPublicly = iprot.readBool();
        struct.setShareExperimentPubliclyIsSet(true);
      }
    }
  }

}

