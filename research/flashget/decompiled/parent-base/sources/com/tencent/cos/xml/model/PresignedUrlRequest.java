package com.tencent.cos.xml.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.qcloud.core.auth.STSCredentialScope;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes6.dex */
public class PresignedUrlRequest extends CosXmlRequest {
    private String cosPath;
    private String requestMethod = ProtectedSandApp.s("㙈\u0001");

    public PresignedUrlRequest(String str, String str2) {
        this.bucket = str;
        this.cosPath = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        String str = this.bucket;
        if (str == null || str.length() < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("㙊\u0001"));
        }
        String str2 = this.cosPath;
        if (str2 == null || str2.length() < 1) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("㙉\u0001"));
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return this.requestMethod;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getUrlPath(this.bucket, this.cosPath);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        if (this.requestMethod.equals(ProtectedSandApp.s("㙋\u0001"))) {
            return RequestBodySerializer.bytes(null, new byte[0]);
        }
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public STSCredentialScope[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        return new STSCredentialScope(ProtectedSandApp.s("㙏\u0001").concat(ProtectedSandApp.s("㙌\u0001").equals(this.requestMethod) ? ProtectedSandApp.s("㙍\u0001") : ProtectedSandApp.s("㙎\u0001")), cosXmlServiceConfig.getBucket(this.bucket), cosXmlServiceConfig.getRegion(), getPath(cosXmlServiceConfig)).toArray();
    }

    public void setCosPath(String str) {
        if (str != null) {
            String s4 = ProtectedSandApp.s("㙐\u0001");
            if (str.startsWith(s4)) {
                this.cosPath = str;
            } else {
                this.cosPath = s4.concat(str);
            }
        }
    }

    public void setRequestMethod(String str) {
        this.requestMethod = str;
    }
}
