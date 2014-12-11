/**
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
#include "applicationInterfaceModel_types.h"

#include <algorithm>

namespace apache { namespace airavata { namespace model { namespace appcatalog { namespace appinterface {

int _kDataTypeValues[] = {
  DataType::STRING,
  DataType::INTEGER,
  DataType::FLOAT,
  DataType::URI,
  DataType::STDOUT,
  DataType::STDERR
};
const char* _kDataTypeNames[] = {
  "STRING",
  "INTEGER",
  "FLOAT",
  "URI",
  "STDOUT",
  "STDERR"
};
const std::map<int, const char*> _DataType_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(6, _kDataTypeValues, _kDataTypeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));

int _kValidityTypeValues[] = {
  ValidityType::REQUIRED,
  ValidityType::OPTIONAL
};
const char* _kValidityTypeNames[] = {
  "REQUIRED",
  "OPTIONAL"
};
const std::map<int, const char*> _ValidityType_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(2, _kValidityTypeValues, _kValidityTypeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));

int _kCommandLineTypeValues[] = {
  CommandLineType::INCLUSIVE,
  CommandLineType::EXCLUSIVE
};
const char* _kCommandLineTypeNames[] = {
  "INCLUSIVE",
  "EXCLUSIVE"
};
const std::map<int, const char*> _CommandLineType_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(2, _kCommandLineTypeValues, _kCommandLineTypeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));

int _kInputMetadataTypeValues[] = {
  InputMetadataType::MEMORY,
  InputMetadataType::CPU
};
const char* _kInputMetadataTypeNames[] = {
  "MEMORY",
  "CPU"
};
const std::map<int, const char*> _InputMetadataType_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(2, _kInputMetadataTypeValues, _kInputMetadataTypeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));

const char* InputDataObjectType::ascii_fingerprint = "95DCCA621F7BE3FA34349CC6A45329DA";
const uint8_t InputDataObjectType::binary_fingerprint[16] = {0x95,0xDC,0xCA,0x62,0x1F,0x7B,0xE3,0xFA,0x34,0x34,0x9C,0xC6,0xA4,0x53,0x29,0xDA};

uint32_t InputDataObjectType::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_name = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->name);
          isset_name = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->value);
          this->__isset.value = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast0;
          xfer += iprot->readI32(ecast0);
          this->type = (DataType::type)ecast0;
          this->__isset.type = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationArgument);
          this->__isset.applicationArgument = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->standardInput);
          this->__isset.standardInput = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->userFriendlyDescription);
          this->__isset.userFriendlyDescription = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 7:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->metaData);
          this->__isset.metaData = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 8:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          xfer += iprot->readI32(this->inputOrder);
          this->__isset.inputOrder = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 9:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast1;
          xfer += iprot->readI32(ecast1);
          this->inputValid = (ValidityType::type)ecast1;
          this->__isset.inputValid = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 10:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast2;
          xfer += iprot->readI32(ecast2);
          this->addedToCommandLine = (CommandLineType::type)ecast2;
          this->__isset.addedToCommandLine = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 11:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->dataStaged);
          this->__isset.dataStaged = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_name)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t InputDataObjectType::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  xfer += oprot->writeStructBegin("InputDataObjectType");

  xfer += oprot->writeFieldBegin("name", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->name);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.value) {
    xfer += oprot->writeFieldBegin("value", ::apache::thrift::protocol::T_STRING, 2);
    xfer += oprot->writeString(this->value);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.type) {
    xfer += oprot->writeFieldBegin("type", ::apache::thrift::protocol::T_I32, 3);
    xfer += oprot->writeI32((int32_t)this->type);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationArgument) {
    xfer += oprot->writeFieldBegin("applicationArgument", ::apache::thrift::protocol::T_STRING, 4);
    xfer += oprot->writeString(this->applicationArgument);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.standardInput) {
    xfer += oprot->writeFieldBegin("standardInput", ::apache::thrift::protocol::T_BOOL, 5);
    xfer += oprot->writeBool(this->standardInput);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.userFriendlyDescription) {
    xfer += oprot->writeFieldBegin("userFriendlyDescription", ::apache::thrift::protocol::T_STRING, 6);
    xfer += oprot->writeString(this->userFriendlyDescription);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.metaData) {
    xfer += oprot->writeFieldBegin("metaData", ::apache::thrift::protocol::T_STRING, 7);
    xfer += oprot->writeString(this->metaData);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.inputOrder) {
    xfer += oprot->writeFieldBegin("inputOrder", ::apache::thrift::protocol::T_I32, 8);
    xfer += oprot->writeI32(this->inputOrder);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.inputValid) {
    xfer += oprot->writeFieldBegin("inputValid", ::apache::thrift::protocol::T_I32, 9);
    xfer += oprot->writeI32((int32_t)this->inputValid);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.addedToCommandLine) {
    xfer += oprot->writeFieldBegin("addedToCommandLine", ::apache::thrift::protocol::T_I32, 10);
    xfer += oprot->writeI32((int32_t)this->addedToCommandLine);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.dataStaged) {
    xfer += oprot->writeFieldBegin("dataStaged", ::apache::thrift::protocol::T_BOOL, 11);
    xfer += oprot->writeBool(this->dataStaged);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(InputDataObjectType &a, InputDataObjectType &b) {
  using ::std::swap;
  swap(a.name, b.name);
  swap(a.value, b.value);
  swap(a.type, b.type);
  swap(a.applicationArgument, b.applicationArgument);
  swap(a.standardInput, b.standardInput);
  swap(a.userFriendlyDescription, b.userFriendlyDescription);
  swap(a.metaData, b.metaData);
  swap(a.inputOrder, b.inputOrder);
  swap(a.inputValid, b.inputValid);
  swap(a.addedToCommandLine, b.addedToCommandLine);
  swap(a.dataStaged, b.dataStaged);
  swap(a.__isset, b.__isset);
}

const char* OutputDataObjectType::ascii_fingerprint = "9B8C3AEA43A2028DF0CEF51E90706E3A";
const uint8_t OutputDataObjectType::binary_fingerprint[16] = {0x9B,0x8C,0x3A,0xEA,0x43,0xA2,0x02,0x8D,0xF0,0xCE,0xF5,0x1E,0x90,0x70,0x6E,0x3A};

uint32_t OutputDataObjectType::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_name = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->name);
          isset_name = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->value);
          this->__isset.value = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast3;
          xfer += iprot->readI32(ecast3);
          this->type = (DataType::type)ecast3;
          this->__isset.type = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast4;
          xfer += iprot->readI32(ecast4);
          this->validityType = (ValidityType::type)ecast4;
          this->__isset.validityType = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_BOOL) {
          xfer += iprot->readBool(this->dataMovement);
          this->__isset.dataMovement = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->dataNameLocation);
          this->__isset.dataNameLocation = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_name)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t OutputDataObjectType::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  xfer += oprot->writeStructBegin("OutputDataObjectType");

  xfer += oprot->writeFieldBegin("name", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->name);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.value) {
    xfer += oprot->writeFieldBegin("value", ::apache::thrift::protocol::T_STRING, 2);
    xfer += oprot->writeString(this->value);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.type) {
    xfer += oprot->writeFieldBegin("type", ::apache::thrift::protocol::T_I32, 3);
    xfer += oprot->writeI32((int32_t)this->type);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.validityType) {
    xfer += oprot->writeFieldBegin("validityType", ::apache::thrift::protocol::T_I32, 4);
    xfer += oprot->writeI32((int32_t)this->validityType);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.dataMovement) {
    xfer += oprot->writeFieldBegin("dataMovement", ::apache::thrift::protocol::T_BOOL, 5);
    xfer += oprot->writeBool(this->dataMovement);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.dataNameLocation) {
    xfer += oprot->writeFieldBegin("dataNameLocation", ::apache::thrift::protocol::T_STRING, 6);
    xfer += oprot->writeString(this->dataNameLocation);
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(OutputDataObjectType &a, OutputDataObjectType &b) {
  using ::std::swap;
  swap(a.name, b.name);
  swap(a.value, b.value);
  swap(a.type, b.type);
  swap(a.validityType, b.validityType);
  swap(a.dataMovement, b.dataMovement);
  swap(a.dataNameLocation, b.dataNameLocation);
  swap(a.__isset, b.__isset);
}

const char* ApplicationInterfaceDescription::ascii_fingerprint = "CE1749A2DE50827990C3136E0CE4B60D";
const uint8_t ApplicationInterfaceDescription::binary_fingerprint[16] = {0xCE,0x17,0x49,0xA2,0xDE,0x50,0x82,0x79,0x90,0xC3,0x13,0x6E,0x0C,0xE4,0xB6,0x0D};

uint32_t ApplicationInterfaceDescription::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;

  bool isset_applicationInterfaceId = false;
  bool isset_applicationName = false;

  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationInterfaceId);
          isset_applicationInterfaceId = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationName);
          isset_applicationName = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 3:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->applicationDescription);
          this->__isset.applicationDescription = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 4:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->applicationModules.clear();
            uint32_t _size5;
            ::apache::thrift::protocol::TType _etype8;
            xfer += iprot->readListBegin(_etype8, _size5);
            this->applicationModules.resize(_size5);
            uint32_t _i9;
            for (_i9 = 0; _i9 < _size5; ++_i9)
            {
              xfer += iprot->readString(this->applicationModules[_i9]);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.applicationModules = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 5:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->applicationInputs.clear();
            uint32_t _size10;
            ::apache::thrift::protocol::TType _etype13;
            xfer += iprot->readListBegin(_etype13, _size10);
            this->applicationInputs.resize(_size10);
            uint32_t _i14;
            for (_i14 = 0; _i14 < _size10; ++_i14)
            {
              xfer += this->applicationInputs[_i14].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.applicationInputs = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 6:
        if (ftype == ::apache::thrift::protocol::T_LIST) {
          {
            this->applicationOutputs.clear();
            uint32_t _size15;
            ::apache::thrift::protocol::TType _etype18;
            xfer += iprot->readListBegin(_etype18, _size15);
            this->applicationOutputs.resize(_size15);
            uint32_t _i19;
            for (_i19 = 0; _i19 < _size15; ++_i19)
            {
              xfer += this->applicationOutputs[_i19].read(iprot);
            }
            xfer += iprot->readListEnd();
          }
          this->__isset.applicationOutputs = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  if (!isset_applicationInterfaceId)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  if (!isset_applicationName)
    throw TProtocolException(TProtocolException::INVALID_DATA);
  return xfer;
}

uint32_t ApplicationInterfaceDescription::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  xfer += oprot->writeStructBegin("ApplicationInterfaceDescription");

  xfer += oprot->writeFieldBegin("applicationInterfaceId", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->applicationInterfaceId);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("applicationName", ::apache::thrift::protocol::T_STRING, 2);
  xfer += oprot->writeString(this->applicationName);
  xfer += oprot->writeFieldEnd();

  if (this->__isset.applicationDescription) {
    xfer += oprot->writeFieldBegin("applicationDescription", ::apache::thrift::protocol::T_STRING, 3);
    xfer += oprot->writeString(this->applicationDescription);
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationModules) {
    xfer += oprot->writeFieldBegin("applicationModules", ::apache::thrift::protocol::T_LIST, 4);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRING, static_cast<uint32_t>(this->applicationModules.size()));
      std::vector<std::string> ::const_iterator _iter20;
      for (_iter20 = this->applicationModules.begin(); _iter20 != this->applicationModules.end(); ++_iter20)
      {
        xfer += oprot->writeString((*_iter20));
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationInputs) {
    xfer += oprot->writeFieldBegin("applicationInputs", ::apache::thrift::protocol::T_LIST, 5);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->applicationInputs.size()));
      std::vector<InputDataObjectType> ::const_iterator _iter21;
      for (_iter21 = this->applicationInputs.begin(); _iter21 != this->applicationInputs.end(); ++_iter21)
      {
        xfer += (*_iter21).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  if (this->__isset.applicationOutputs) {
    xfer += oprot->writeFieldBegin("applicationOutputs", ::apache::thrift::protocol::T_LIST, 6);
    {
      xfer += oprot->writeListBegin(::apache::thrift::protocol::T_STRUCT, static_cast<uint32_t>(this->applicationOutputs.size()));
      std::vector<OutputDataObjectType> ::const_iterator _iter22;
      for (_iter22 = this->applicationOutputs.begin(); _iter22 != this->applicationOutputs.end(); ++_iter22)
      {
        xfer += (*_iter22).write(oprot);
      }
      xfer += oprot->writeListEnd();
    }
    xfer += oprot->writeFieldEnd();
  }
  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(ApplicationInterfaceDescription &a, ApplicationInterfaceDescription &b) {
  using ::std::swap;
  swap(a.applicationInterfaceId, b.applicationInterfaceId);
  swap(a.applicationName, b.applicationName);
  swap(a.applicationDescription, b.applicationDescription);
  swap(a.applicationModules, b.applicationModules);
  swap(a.applicationInputs, b.applicationInputs);
  swap(a.applicationOutputs, b.applicationOutputs);
  swap(a.__isset, b.__isset);
}

}}}}} // namespace
