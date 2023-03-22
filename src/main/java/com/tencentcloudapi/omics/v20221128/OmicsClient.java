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
package com.tencentcloudapi.omics.v20221128;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.omics.v20221128.models.*;

public class OmicsClient extends AbstractClient{
    private static String endpoint = "omics.tencentcloudapi.com";
    private static String service = "omics";
    private static String version = "2022-11-28";

    public OmicsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OmicsClient(Credential credential, String region, ClientProfile profile) {
        super(OmicsClient.endpoint, OmicsClient.version, credential, region, profile);
    }

    /**
     *查询任务批次列表。
     * @param req DescribeRunGroupsRequest
     * @return DescribeRunGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunGroupsResponse DescribeRunGroups(DescribeRunGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRunGroupsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRunGroupsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRunGroups");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务列表。
     * @param req DescribeRunsRequest
     * @return DescribeRunsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRunsResponse DescribeRuns(DescribeRunsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRunsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRunsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuns");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询作业详情。
     * @param req GetRunCallsRequest
     * @return GetRunCallsResponse
     * @throws TencentCloudSDKException
     */
    public GetRunCallsResponse GetRunCalls(GetRunCallsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRunCallsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRunCallsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRunCalls");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询任务详情。
     * @param req GetRunStatusRequest
     * @return GetRunStatusResponse
     * @throws TencentCloudSDKException
     */
    public GetRunStatusResponse GetRunStatus(GetRunStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetRunStatusResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetRunStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetRunStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *导入表格文件。
     * @param req ImportTableFileRequest
     * @return ImportTableFileResponse
     * @throws TencentCloudSDKException
     */
    public ImportTableFileResponse ImportTableFile(ImportTableFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImportTableFileResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ImportTableFileResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ImportTableFile");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *运行应用。
     * @param req RunApplicationRequest
     * @return RunApplicationResponse
     * @throws TencentCloudSDKException
     */
    public RunApplicationResponse RunApplication(RunApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RunApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RunApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RunApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
