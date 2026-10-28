package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class OptionObjectRequest extends ObjectRequest {
    private String accessControlHeaders;
    private String accessControlMethod;
    private String origin;

    public OptionObjectRequest(String str, String str2, String str3, String str4) {
        super(str, str2);
        this.origin = str3;
        this.accessControlMethod = str4;
        setOrigin(str3);
        setAccessControlMethod(str4);
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (this.origin == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䦈\u0001"));
        }
        if (this.accessControlMethod == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䦇\u0001"));
        }
    }

    public String getAccessControlHeaders() {
        return this.accessControlHeaders;
    }

    public String getAccessControlMethod() {
        return this.accessControlMethod;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䦉\u0001");
    }

    public String getOrigin() {
        return this.origin;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return null;
    }

    public void setAccessControlHeaders(String str) {
        this.accessControlHeaders = str;
        if (str != null) {
            addHeader(ProtectedSandApp.s("䦊\u0001"), str);
        }
    }

    public void setAccessControlMethod(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            this.accessControlMethod = upperCase;
            addHeader(ProtectedSandApp.s("䦋\u0001"), upperCase);
        }
    }

    public void setOrigin(String str) {
        this.origin = str;
        if (str != null) {
            addHeader(ProtectedSandApp.s("䦌\u0001"), str);
        }
    }
}
