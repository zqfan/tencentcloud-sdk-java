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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaRecognitionInfo extends AbstractModel{

    /**
    * 帧标签识别
    */
    @SerializedName("FrameTagRec")
    @Expose
    private FrameTagRec FrameTagRec;

    /**
    * 语音字幕识别
    */
    @SerializedName("SubtitleRec")
    @Expose
    private SubtitleRec SubtitleRec;

    /**
     * Get 帧标签识别 
     * @return FrameTagRec 帧标签识别
     */
    public FrameTagRec getFrameTagRec() {
        return this.FrameTagRec;
    }

    /**
     * Set 帧标签识别
     * @param FrameTagRec 帧标签识别
     */
    public void setFrameTagRec(FrameTagRec FrameTagRec) {
        this.FrameTagRec = FrameTagRec;
    }

    /**
     * Get 语音字幕识别 
     * @return SubtitleRec 语音字幕识别
     */
    public SubtitleRec getSubtitleRec() {
        return this.SubtitleRec;
    }

    /**
     * Set 语音字幕识别
     * @param SubtitleRec 语音字幕识别
     */
    public void setSubtitleRec(SubtitleRec SubtitleRec) {
        this.SubtitleRec = SubtitleRec;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FrameTagRec.", this.FrameTagRec);
        this.setParamObj(map, prefix + "SubtitleRec.", this.SubtitleRec);

    }
}

