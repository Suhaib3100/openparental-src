package com.tencent.cos.xml.model.ci.ai;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class GetAIQueueRequest extends BucketRequest {
    public int pageNumber;
    public int pageSize;
    public String queueIds;
    public String state;

    public GetAIQueueRequest(@o0 String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㱜\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㱝\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        String str = this.queueIds;
        if (str != null) {
            this.queryParameters.put(ProtectedSandApp.s("㱞\u0001"), str);
        }
        String str2 = this.state;
        if (str2 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㱟\u0001"), str2);
        }
        this.queryParameters.put(ProtectedSandApp.s("㱠\u0001"), String.valueOf(this.pageNumber));
        this.queryParameters.put(ProtectedSandApp.s("㱡\u0001"), String.valueOf(this.pageSize));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("㱢\u0001"));
    }
}
