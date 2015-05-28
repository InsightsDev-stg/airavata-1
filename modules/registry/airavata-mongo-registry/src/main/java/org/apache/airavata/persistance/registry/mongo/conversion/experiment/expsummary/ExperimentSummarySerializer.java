/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
*/
package org.apache.airavata.persistance.registry.mongo.conversion.experiment.expsummary;

import org.apache.airavata.model.workspace.experiment.ExperimentSummary;
import org.apache.airavata.persistance.registry.mongo.conversion.AbstractThriftSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExperimentSummarySerializer extends
        AbstractThriftSerializer<ExperimentSummary._Fields, ExperimentSummary> {
    private final static Logger logger = LoggerFactory.getLogger(ExperimentSummarySerializer.class);

    @Override
    protected ExperimentSummary._Fields[] getFieldValues() {
        return ExperimentSummary._Fields.values();
    }

    @Override
    protected Class<ExperimentSummary> getThriftClass() {
        return null;
    }
}