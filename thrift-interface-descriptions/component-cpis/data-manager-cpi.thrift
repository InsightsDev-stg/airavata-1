/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

/*
 * Component Programming Interface definition for Apache Airavata GFac Service.
 *
*/

include "../data-models/data-manager-models/metadata_models.thrift"
include "../data-models/data-manager-models/replica_models.thrift"
include "../airavata-apis/airavata_errors.thrift"

namespace java org.apache.airavata.data.manager.cpi
namespace php Airavata.Data.Manager.Cpi

const string DM_CPI_VERSION = "0.16.0"

service DataManagerService {

  /** Query DM server to fetch the CPI version */
  string getDMServiceVersion(),

  /**
   * Query the DM server to fetch matching metadata models
  **/
  list<metadata_models.MetadataModel> searchMetadata(1: string username,2: string gatewayId,3: string searchText)
      throws(1: airavata_errors.DataManagerServiceException dme)
}