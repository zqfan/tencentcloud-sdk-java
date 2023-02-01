/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanLogsResponse extends AbstractModel{

    /**
    * 【弃用】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Products")
    @Expose
    private ScanLog [] Products;

    /**
    * 条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 扫描记录
    */
    @SerializedName("ScanLogs")
    @Expose
    private ScanLog [] ScanLogs;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 【弃用】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Products 【弃用】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScanLog [] getProducts() {
        return this.Products;
    }

    /**
     * Set 【弃用】
注意：此字段可能返回 null，表示取不到有效值。
     * @param Products 【弃用】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProducts(ScanLog [] Products) {
        this.Products = Products;
    }

    /**
     * Get 条数 
     * @return TotalCount 条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 条数
     * @param TotalCount 条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 扫描记录 
     * @return ScanLogs 扫描记录
     */
    public ScanLog [] getScanLogs() {
        return this.ScanLogs;
    }

    /**
     * Set 扫描记录
     * @param ScanLogs 扫描记录
     */
    public void setScanLogs(ScanLog [] ScanLogs) {
        this.ScanLogs = ScanLogs;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeScanLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanLogsResponse(DescribeScanLogsResponse source) {
        if (source.Products != null) {
            this.Products = new ScanLog[source.Products.length];
            for (int i = 0; i < source.Products.length; i++) {
                this.Products[i] = new ScanLog(source.Products[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ScanLogs != null) {
            this.ScanLogs = new ScanLog[source.ScanLogs.length];
            for (int i = 0; i < source.ScanLogs.length; i++) {
                this.ScanLogs[i] = new ScanLog(source.ScanLogs[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Products.", this.Products);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ScanLogs.", this.ScanLogs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
