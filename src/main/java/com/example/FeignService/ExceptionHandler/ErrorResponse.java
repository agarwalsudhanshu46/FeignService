package com.example.FeignService.ExceptionHandler;

public class ErrorResponse {

    private String errorMessage;
    private int errorCode;
    private String appName;
    private String path;

    public ErrorResponse() {
    }

    public ErrorResponse(String errorMessage, int errorCode, String appName, String path) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
        this.appName = appName;
        this.path = path;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getPath() {
        return path;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
