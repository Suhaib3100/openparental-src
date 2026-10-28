package com.tencent.cos.xml.model.ci.audit;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;

/* loaded from: classes7.dex */
public class GetWebPageAuditRequest extends GetAuditRequest {
    public GetWebPageAuditRequest(String str, @o0 String str2) {
        super(str, str2);
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䅰\u0001") + this.jobId;
    }
}
