package com.lina.project.oops.web.entity;

public class RestError implements RestResponse
{
    private String errorCode;
    private String[] errorParams;
    //TODO 暂时先加个errorinfo 待国际化后删除
    private String errorInfo;

    public RestError(String errorCode, String[] errorParams, String errorInfo)
    {
        this.errorCode = errorCode;
        this.errorParams = errorParams;
        this.errorInfo = errorInfo;
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(String errorCode)
    {
        this.errorCode = errorCode;
    }

    public String[] getErrorParams()
    {
        return errorParams;
    }

    public void setErrorParams(String[] errorParams)
    {
        this.errorParams = errorParams;
    }

    public String getErrorInfo()
    {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo)
    {
        this.errorInfo = errorInfo;
    }
}
