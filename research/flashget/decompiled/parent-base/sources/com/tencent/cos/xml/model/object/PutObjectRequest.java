package com.tencent.cos.xml.model.object;

import android.net.Uri;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.COSACL;
import com.tencent.cos.xml.common.COSStorageClass;
import com.tencent.cos.xml.crypto.ObjectMetadata;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.ACLAccount;
import com.tencent.cos.xml.model.tag.pic.PicOperations;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;

/* loaded from: classes7.dex */
public class PutObjectRequest extends BasePutObjectRequest implements TransferRequest {
    private ObjectMetadata metadata;

    protected PutObjectRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.object.BasePutObjectRequest, com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
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

    public void setCacheControl(@o0 String str) {
        addHeader(ProtectedSandApp.s("㪇\u0001"), str);
    }

    public void setContentDisposition(@o0 String str) {
        addHeader(ProtectedSandApp.s("㪈\u0001"), str);
    }

    public void setContentEncodeing(@o0 String str) {
        addHeader(ProtectedSandApp.s("㪉\u0001"), str);
    }

    public void setExpires(@o0 String str) {
        addHeader(ProtectedSandApp.s("㪊\u0001"), str);
    }

    public void setMetadata(ObjectMetadata objectMetadata) {
        this.metadata = objectMetadata;
    }

    public void setPicOperations(@o0 PicOperations picOperations) {
        addHeader(ProtectedSandApp.s("㪋\u0001"), picOperations.toJsonStr());
    }

    public void setStroageClass(COSStorageClass cOSStorageClass) {
        addHeader(ProtectedSandApp.s("㪌\u0001"), cOSStorageClass.getStorageClass());
    }

    public void setXCOSACL(COSACL cosacl) {
        if (cosacl != null) {
            addHeader(ProtectedSandApp.s("㪍\u0001"), cosacl.getAcl());
        }
    }

    public void setXCOSGrantRead(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("㪎\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("㪏\u0001"), aCLAccount.getAccount());
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
            addHeader(ProtectedSandApp.s("㪐\u0001"), aCLAccount.getAccount());
        }
    }

    public PutObjectRequest(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public void setXCOSACL(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㪍\u0001"), str);
        }
    }

    public PutObjectRequest(String str, String str2, Uri uri) {
        super(str, str2, uri);
    }

    public PutObjectRequest(String str, String str2, byte[] bArr) {
        super(str, str2, bArr);
    }

    public PutObjectRequest(String str, String str2, StringBuilder sb) {
        super(str, str2, sb);
    }

    public PutObjectRequest(String str, String str2, InputStream inputStream) {
        super(str, str2, inputStream);
    }

    public PutObjectRequest(String str, String str2, URL url) {
        super(str, str2, url);
    }
}
