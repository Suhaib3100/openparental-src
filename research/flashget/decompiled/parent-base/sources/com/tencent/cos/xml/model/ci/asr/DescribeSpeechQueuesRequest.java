package com.tencent.cos.xml.model.ci.asr;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.model.ci.BaseDescribeQueuesRequest;

/* loaded from: classes7.dex */
public final class DescribeSpeechQueuesRequest extends BaseDescribeQueuesRequest {
    public DescribeSpeechQueuesRequest(String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㿎\u0001");
    }

    public DescribeSpeechQueuesRequest(String str, String str2) {
        super(str, str2);
    }
}
