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

package org.apache.carbondata.core.indexstore;

import java.io.Serializable;

import org.apache.carbondata.core.metadata.schema.table.CarbonTable;

/**
 * Class holds reference to TableBlockIndexUniqueIdentifier and carbonTable related info
 * This is just a wrapper passed between methods like a context, This object must never be cached.
 *
 */
public class TableBlockIndexUniqueIdentifierWrapper implements Serializable {

  private static final long serialVersionUID = 1L;

  // holds the reference to tableBlockIndexUniqueIdentifier
  private TableBlockIndexUniqueIdentifier tableBlockIndexUniqueIdentifier;

  // holds the reference to CarbonTable
  private CarbonTable carbonTable;

  public TableBlockIndexUniqueIdentifierWrapper(
      TableBlockIndexUniqueIdentifier tableBlockIndexUniqueIdentifier, CarbonTable carbonTable) {
    this.tableBlockIndexUniqueIdentifier = tableBlockIndexUniqueIdentifier;
    this.carbonTable = carbonTable;
  }

  public TableBlockIndexUniqueIdentifier getTableBlockIndexUniqueIdentifier() {
    return tableBlockIndexUniqueIdentifier;
  }

  public CarbonTable getCarbonTable() {
    return carbonTable;
  }
}
