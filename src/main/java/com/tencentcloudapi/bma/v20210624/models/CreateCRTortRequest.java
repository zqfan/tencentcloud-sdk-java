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

public class CreateCRTortRequest extends AbstractModel{

    /**
    * xx
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * xx
    */
    @SerializedName("TortURL")
    @Expose
    private String TortURL;

    /**
    * xx
    */
    @SerializedName("TortPlat")
    @Expose
    private String TortPlat;

    /**
    * xx
    */
    @SerializedName("TortTitle")
    @Expose
    private String TortTitle;

    /**
     * Get xx 
     * @return WorkId xx
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set xx
     * @param WorkId xx
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get xx 
     * @return TortURL xx
     */
    public String getTortURL() {
        return this.TortURL;
    }

    /**
     * Set xx
     * @param TortURL xx
     */
    public void setTortURL(String TortURL) {
        this.TortURL = TortURL;
    }

    /**
     * Get xx 
     * @return TortPlat xx
     */
    public String getTortPlat() {
        return this.TortPlat;
    }

    /**
     * Set xx
     * @param TortPlat xx
     */
    public void setTortPlat(String TortPlat) {
        this.TortPlat = TortPlat;
    }

    /**
     * Get xx 
     * @return TortTitle xx
     */
    public String getTortTitle() {
        return this.TortTitle;
    }

    /**
     * Set xx
     * @param TortTitle xx
     */
    public void setTortTitle(String TortTitle) {
        this.TortTitle = TortTitle;
    }

    public CreateCRTortRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRTortRequest(CreateCRTortRequest source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.TortURL != null) {
            this.TortURL = new String(source.TortURL);
        }
        if (source.TortPlat != null) {
            this.TortPlat = new String(source.TortPlat);
        }
        if (source.TortTitle != null) {
            this.TortTitle = new String(source.TortTitle);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "TortURL", this.TortURL);
        this.setParamSimple(map, prefix + "TortPlat", this.TortPlat);
        this.setParamSimple(map, prefix + "TortTitle", this.TortTitle);

    }
}
