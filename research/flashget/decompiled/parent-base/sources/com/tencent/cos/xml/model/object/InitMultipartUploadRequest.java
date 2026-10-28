package com.tencent.cos.xml.model.object;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.COSACL;
import com.tencent.cos.xml.common.COSStorageClass;
import com.tencent.cos.xml.crypto.ObjectMetadata;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.ACLAccount;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public final class InitMultipartUploadRequest extends BaseMultipartUploadRequest {
    private ObjectMetadata metadata;

    public InitMultipartUploadRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        ObjectMetadata objectMetadata = this.metadata;
        if (objectMetadata != null) {
            Map<String, Object> rawMetadata = objectMetadata.getRawMetadata();
            Map<String, String> userMetadata = this.metadata.getUserMetadata();
            for (Map.Entry<String, Object> entry : rawMetadata.entrySet()) {
                addHeader(entry.getKey(), entry.getValue().toString());
            }
            for (Map.Entry<String, String> entry2 : userMetadata.entrySet()) {
                addHeader(entry2.getKey(), entry2.getValue());
            }
        }
    }

    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䥶\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䥷\u0001"), null);
        return this.queryParameters;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() {
        return RequestBodySerializer.bytes(getContentType(), new byte[0]);
    }

    public void setCacheControl(@o0 String str) {
        addHeader(ProtectedSandApp.s("䥸\u0001"), str);
    }

    public void setContentDisposition(@o0 String str) {
        addHeader(ProtectedSandApp.s("䥹\u0001"), str);
    }

    public void setContentEncoding(@o0 String str) {
        addHeader(ProtectedSandApp.s("䥺\u0001"), str);
    }

    public void setExpires(@o0 String str) {
        addHeader(ProtectedSandApp.s("䥻\u0001"), str);
    }

    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }

    public void setStroageClass(COSStorageClass cOSStorageClass) {
        addHeader(ProtectedSandApp.s("䥼\u0001"), cOSStorageClass.getStorageClass());
    }

    public void setXCOSACL(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䥽\u0001"), str);
        }
    }

    public void setXCOSGrantRead(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䥾\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䥿\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSMeta(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        addHeader(str, str2);
    }

    public void setXCOSReadWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䦀\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSACL(COSACL cosacl) {
        if (cosacl != null) {
            addHeader(ProtectedSandApp.s("䥽\u0001"), cosacl.getAcl());
        }
    }
}
