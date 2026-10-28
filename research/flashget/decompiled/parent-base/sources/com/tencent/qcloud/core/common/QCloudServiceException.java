package com.tencent.qcloud.core.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class QCloudServiceException extends Exception {
    private static final long serialVersionUID = 1;
    private String errorCode;
    private String errorMessage;
    private String requestId;
    private String serviceName;
    private int statusCode;
    public static final String ERR0R_REQUEST_TIME_TOO_SKEWED = ProtectedSandApp.s("大\u0001");
    public static final String ERR0R_REQUEST_IS_EXPIRED = ProtectedSandApp.s("夨\u0001");

    public QCloudServiceException(String str) {
        super(str);
        this.errorMessage = str;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return getErrorMessage() + ProtectedSandApp.s("夢\u0001") + getServiceName() + ProtectedSandApp.s("夣\u0001") + getStatusCode() + ProtectedSandApp.s("夤\u0001") + getErrorCode() + ProtectedSandApp.s("夥\u0001") + getRequestId() + ProtectedSandApp.s("夦\u0001");
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public QCloudServiceException setErrorCode(String str) {
        this.errorCode = str;
        return this;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public void setStatusCode(int i4) {
        this.statusCode = i4;
    }

    public QCloudServiceException(String str, Exception exc) {
        super(null, exc);
        this.errorMessage = str;
    }
}
