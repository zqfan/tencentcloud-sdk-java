package com.tencentcloudapi.hcm.v20181106;
public enum HcmErrorCode {
    // 计费次数统计失败。
     FAILEDOPERATION_CHARGECOUNTERROR("FailedOperation.ChargeCountError"),
     
    // 引擎识别失败。
     INTERNALERROR_ENGINERESULTERROR("InternalError.EngineResultError"),
     
    // 初始化参数错误。
     INTERNALERROR_INITIALPARAMETERERROR("InternalError.InitialParameterError"),
     
    // 服务器内部错误。
     INTERNALERROR_SERVERINTERNALERROR("InternalError.ServerInternalError"),
     
    // 无法找到图像，请确认Image参数与Url参数无误。
     INVALIDPARAMETERVALUE_CANNOTFINDIMAGEERROR("InvalidParameterValue.CannotFindImageError"),
     
    // 评估之前没有初始化或已过期。
     INVALIDPARAMETERVALUE_CANNOTFINDSESSION("InvalidParameterValue.CannotFindSession"),
     
    // Image参数为空，请重新填写。
     INVALIDPARAMETERVALUE_EMPTYIMAGEERROR("InvalidParameterValue.EmptyImageError"),
     
    // 必填参数为空，请核实传入参数。
     INVALIDPARAMETERVALUE_EMPTYINPUTERROR("InvalidParameterValue.EmptyInputError"),
     
    // 超过图片大小限制，请裁剪后再评估。
     INVALIDPARAMETERVALUE_EXCEEDDOWNLOADIMAGESIZEERROR("InvalidParameterValue.ExceedDownloadImageSizeError"),
     
    // 图像解码错误，请重新核实图像信息。
     INVALIDPARAMETERVALUE_FAILDECODEERROR("InvalidParameterValue.FailDecodeError"),
     
    // 图片下载失败，请核实图像下载地址。
     INVALIDPARAMETERVALUE_FAILDOWNLOADIMAGEERROR("InvalidParameterValue.FailDownloadImageError"),
     
    // 算式信息获取失败，请核实图像内容。
     INVALIDPARAMETERVALUE_FAILRECOGNIZEERROR("InvalidParameterValue.FailRecognizeError"),
     
    // 输入的图片为非速算图片，请核实图片中存在手写数学公式，且背景没有太多干扰。
     INVALIDPARAMETERVALUE_INVALIDIMAGEERROR("InvalidParameterValue.InvalidImageError"),
     
    // 无法找到用户，请确认已在控制台开通服务并使用了正确的HCMAPPID。
     RESOURCENOTFOUND_CANNOTFINDUSER("ResourceNotFound.CannotFindUser");
     
    private String value;
    private HcmErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

