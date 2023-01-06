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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyParamItem extends AbstractModel{

    /**
    * 参数名
    */
    @SerializedName("ParamName")
    @Expose
    private String ParamName;

    /**
    * 参数当前值
    */
    @SerializedName("CurrentValue")
    @Expose
    private String CurrentValue;

    /**
    * 参数旧值（只在出参时有用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OldValue")
    @Expose
    private String OldValue;

    /**
     * Get 参数名 
     * @return ParamName 参数名
     */
    public String getParamName() {
        return this.ParamName;
    }

    /**
     * Set 参数名
     * @param ParamName 参数名
     */
    public void setParamName(String ParamName) {
        this.ParamName = ParamName;
    }

    /**
     * Get 参数当前值 
     * @return CurrentValue 参数当前值
     */
    public String getCurrentValue() {
        return this.CurrentValue;
    }

    /**
     * Set 参数当前值
     * @param CurrentValue 参数当前值
     */
    public void setCurrentValue(String CurrentValue) {
        this.CurrentValue = CurrentValue;
    }

    /**
     * Get 参数旧值（只在出参时有用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OldValue 参数旧值（只在出参时有用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOldValue() {
        return this.OldValue;
    }

    /**
     * Set 参数旧值（只在出参时有用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OldValue 参数旧值（只在出参时有用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    public ModifyParamItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyParamItem(ModifyParamItem source) {
        if (source.ParamName != null) {
            this.ParamName = new String(source.ParamName);
        }
        if (source.CurrentValue != null) {
            this.CurrentValue = new String(source.CurrentValue);
        }
        if (source.OldValue != null) {
            this.OldValue = new String(source.OldValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParamName", this.ParamName);
        this.setParamSimple(map, prefix + "CurrentValue", this.CurrentValue);
        this.setParamSimple(map, prefix + "OldValue", this.OldValue);

    }
}
