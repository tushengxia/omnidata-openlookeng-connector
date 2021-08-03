/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.prestosql.plugin.hive.metastore;

import io.airlift.configuration.Config;

import javax.validation.constraints.NotNull;

public class MetastoreConfig
{
    private String metastoreType = "thrift";
    private String metastoreClientFactoryImp = "";
    private String thriftMetastoreImp = "";

    @NotNull
    public String getMetastoreType()
    {
        return metastoreType;
    }

    @Config("hive.metastore")
    public MetastoreConfig setMetastoreType(String metastoreType)
    {
        this.metastoreType = metastoreType;
        return this;
    }

    public String getMetastoreClientFactoryImp()
    {
        return metastoreClientFactoryImp;
    }

    @Config("hive.metastore.client-factory-imp")
    public MetastoreConfig setMetastoreClientFactoryImp(String metastoreClientFactoryImp)
    {
        this.metastoreClientFactoryImp = metastoreClientFactoryImp;
        return this;
    }

    public String getThriftMetastoreImp()
    {
        return thriftMetastoreImp;
    }

    @Config("hive.metastore.thrift-imp")
    public MetastoreConfig setThriftMetastoreImp(String thriftMetastoreImp)
    {
        this.thriftMetastoreImp = thriftMetastoreImp;
        return this;
    }
}
