package com.tencent.cos.xml.exception;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudServiceException;

/* loaded from: classes6.dex */
public class CosXmlServiceException extends QCloudServiceException {
    private static final long serialVersionUID = 1;
    private String host;
    private String httpMsg;

    public CosXmlServiceException(String str, String str2) {
        super(null);
        this.httpMsg = str;
        this.host = str2;
    }

    public String getHost() {
        return this.host;
    }

    public String getHttpMessage() {
        return this.httpMsg;
    }

    @Override // com.tencent.qcloud.core.common.QCloudServiceException, java.lang.Throwable
    public String getMessage() {
        return getErrorMessage() + ProtectedSandApp.s("㘸\u0001") + getServiceName() + ProtectedSandApp.s("㘹\u0001") + getStatusCode() + ProtectedSandApp.s("㘺\u0001") + this.httpMsg + ProtectedSandApp.s("㘻\u0001") + getErrorCode() + ProtectedSandApp.s("㘼\u0001") + getRequestId() + ProtectedSandApp.s("㘽\u0001");
    }

    @Override // java.lang.Throwable
    public String toString() {
        return ProtectedSandApp.s("㘾\u0001") + getMessage() + '}';
    }

    public CosXmlServiceException(String str, Exception exc) {
        super(str, exc);
    }

    public CosXmlServiceException(QCloudServiceException qCloudServiceException) {
        super(null);
        setErrorCode(qCloudServiceException.getErrorCode());
        setErrorMessage(qCloudServiceException.getErrorMessage());
        setRequestId(qCloudServiceException.getRequestId());
        setServiceName(qCloudServiceException.getServiceName());
        setStatusCode(qCloudServiceException.getStatusCode());
    }
}
