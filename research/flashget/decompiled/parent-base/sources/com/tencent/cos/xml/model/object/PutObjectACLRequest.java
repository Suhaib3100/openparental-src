package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.COSACL;
import com.tencent.cos.xml.model.tag.ACLAccount;
import com.tencent.cos.xml.model.tag.AccessControlPolicy;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public final class PutObjectACLRequest extends ObjectRequest {
    private AccessControlPolicy accessControlPolicy;

    public PutObjectACLRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䦗\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䦘\u0001"), null);
        return super.getQueryString();
    }

    public void setAccessControlPolicy(AccessControlPolicy accessControlPolicy) {
        this.accessControlPolicy = accessControlPolicy;
    }

    public void setXCOSACL(COSACL cosacl) {
        if (cosacl != null) {
            addHeader(ProtectedSandApp.s("䦙\u0001"), cosacl.getAcl());
        }
    }

    public void setXCOSGrantRead(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䦚\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantReadACP(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䦛\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䦜\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSGrantWriteACP(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䦝\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSReadFullControl(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䦞\u0001"), aCLAccount.getAccount());
        }
    }

    public void setXCOSReadWrite(ACLAccount aCLAccount) {
        if (aCLAccount != null) {
            addHeader(ProtectedSandApp.s("䦞\u0001"), aCLAccount.getAccount());
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        AccessControlPolicy accessControlPolicy = this.accessControlPolicy;
        return accessControlPolicy == null ? RequestBodySerializer.bytes(null, new byte[0]) : RequestBodySerializer.string(ProtectedSandApp.s("䦟\u0001"), XmlBuilder.buildAccessControlPolicyXML(accessControlPolicy));
    }

    public void setXCOSACL(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("䦙\u0001"), str);
        }
    }
}
