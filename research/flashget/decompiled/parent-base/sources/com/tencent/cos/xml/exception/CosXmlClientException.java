package com.tencent.cos.xml.exception;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.qcloud.core.common.QCloudClientException;

/* loaded from: classes6.dex */
public class CosXmlClientException extends QCloudClientException {
    private static final long serialVersionUID = 1;
    public final int errorCode;

    public CosXmlClientException(ClientErrorCode clientErrorCode) {
        this(clientErrorCode.getCode(), clientErrorCode.getErrorMsg());
    }

    public static CosXmlClientException internalException(String str) {
        return new CosXmlClientException(ClientErrorCode.INTERNAL_ERROR.getCode(), str);
    }

    public static CosXmlClientException manualCancelException() {
        return new CosXmlClientException(ClientErrorCode.USER_CANCELLED);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return ProtectedSandApp.s("㘶\u0001") + this.errorCode + ProtectedSandApp.s("㘷\u0001") + getMessage() + '}';
    }

    public CosXmlClientException(int i4, String str) {
        super(str);
        this.errorCode = i4;
    }

    public CosXmlClientException(int i4, String str, Throwable th) {
        super(str, th);
        this.errorCode = i4;
    }

    public CosXmlClientException(int i4, Throwable th) {
        super(th);
        this.errorCode = i4;
    }
}
