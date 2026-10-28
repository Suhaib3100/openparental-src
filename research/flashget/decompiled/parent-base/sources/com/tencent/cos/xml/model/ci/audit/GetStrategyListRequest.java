package com.tencent.cos.xml.model.ci.audit;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes7.dex */
public class GetStrategyListRequest extends BucketRequest {
    public int limit;
    public int offset;
    public String service;

    public GetStrategyListRequest(@o0 String str) {
        super(str);
        this.offset = -1;
        this.limit = -1;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䅝\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䅞\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        if (!TextUtils.isEmpty(this.service)) {
            this.queryParameters.put(ProtectedSandApp.s("䅟\u0001"), this.service);
        }
        int i4 = this.offset;
        if (i4 != -1) {
            this.queryParameters.put(ProtectedSandApp.s("䅠\u0001"), String.valueOf(i4));
        }
        int i5 = this.limit;
        if (i5 != -1) {
            this.queryParameters.put(ProtectedSandApp.s("䅡\u0001"), String.valueOf(i5));
        }
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("䅢\u0001"));
    }
}
