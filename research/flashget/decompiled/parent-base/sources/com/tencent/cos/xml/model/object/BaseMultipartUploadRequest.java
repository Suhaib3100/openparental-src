package com.tencent.cos.xml.model.object;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.qcloud.core.auth.STSCredentialScope;

/* loaded from: classes7.dex */
public abstract class BaseMultipartUploadRequest extends UploadRequest {
    BaseMultipartUploadRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public STSCredentialScope[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        String[] strArr = {ProtectedSandApp.s("䤡\u0001"), ProtectedSandApp.s("䤢\u0001"), ProtectedSandApp.s("䤣\u0001"), ProtectedSandApp.s("䤟\u0001"), ProtectedSandApp.s("䤠\u0001")};
        STSCredentialScope[] sTSCredentialScopeArr = new STSCredentialScope[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < 5) {
            sTSCredentialScopeArr[i5] = new STSCredentialScope(strArr[i4], cosXmlServiceConfig.getBucket(this.bucket), cosXmlServiceConfig.getRegion(), getPath(cosXmlServiceConfig));
            i4++;
            i5++;
        }
        return sTSCredentialScopeArr;
    }
}
