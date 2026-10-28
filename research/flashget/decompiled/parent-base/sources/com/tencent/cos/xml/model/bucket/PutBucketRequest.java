package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.COSACL;
import com.tencent.cos.xml.model.tag.ACLAccount;
import com.tencent.cos.xml.model.tag.CreateBucketConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import okhttp3.e0;
import okhttp3.x;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public final class PutBucketRequest extends BucketRequest {
    private CreateBucketConfiguration createBucketConfiguration;

    public PutBucketRequest(String str) {
        super(str);
        this.createBucketConfiguration = null;
    }

    public void enableMAZ(boolean z4) {
        if (z4) {
            this.createBucketConfiguration = new CreateBucketConfiguration();
        } else {
            this.createBucketConfiguration = null;
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛸\u0001");
    }

    public void setXCOSACL(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㛹\u0001"), str);
        }
    }

    public void setXCOSGrantRead(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("㛺\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("㛻\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSReadWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("㛼\u0001"), aCLAccount.getAccount());
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        CreateBucketConfiguration createBucketConfiguration = this.createBucketConfiguration;
        return createBucketConfiguration != null ? RequestBodySerializer.string(ProtectedSandApp.s("㛽\u0001"), XmlBuilder.buildCreateBucketConfiguration(createBucketConfiguration)) : RequestBodySerializer.wrap(e0.create((x) null, new byte[0]));
    }

    public void setXCOSACL(COSACL cosacl) {
        if (cosacl != null) {
            addHeader(ProtectedSandApp.s("㛹\u0001"), cosacl.getAcl());
        }
    }

    public void setXCOSGrantRead(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㛺\u0001"), str);
        }
    }

    public void setXCOSGrantWrite(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㛻\u0001"), str);
        }
    }

    public void setXCOSReadWrite(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㛼\u0001"), str);
        }
    }
}
