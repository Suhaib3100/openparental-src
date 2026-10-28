package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.CosXmlRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class GetAIBucketRequest extends CosXmlRequest {
    public String bucketName;
    public String bucketNames;
    public int pageNumber;
    public int pageSize;
    public String regions;

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㱈\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㱉\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        String str = this.regions;
        if (str != null) {
            this.queryParameters.put(ProtectedSandApp.s("㱊\u0001"), str);
        }
        String str2 = this.bucketNames;
        if (str2 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㱋\u0001"), str2);
        }
        String str3 = this.bucketName;
        if (str3 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㱌\u0001"), str3);
        }
        this.queryParameters.put(ProtectedSandApp.s("㱍\u0001"), String.valueOf(this.pageNumber));
        this.queryParameters.put(ProtectedSandApp.s("㱎\u0001"), String.valueOf(this.pageSize));
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, ProtectedSandApp.s("㱏\u0001"));
    }
}
