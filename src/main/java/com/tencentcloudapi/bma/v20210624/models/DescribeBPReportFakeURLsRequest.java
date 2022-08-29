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
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBPReportFakeURLsRequest extends AbstractModel{

    /**
    * xxx
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * xxx
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * xxx
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
     * Get xxx 
     * @return Filters xxx
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set xxx
     * @param Filters xxx
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get xxx 
     * @return PageSize xxx
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set xxx
     * @param PageSize xxx
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get xxx 
     * @return PageNumber xxx
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set xxx
     * @param PageNumber xxx
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    public DescribeBPReportFakeURLsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBPReportFakeURLsRequest(DescribeBPReportFakeURLsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);

    }
}
