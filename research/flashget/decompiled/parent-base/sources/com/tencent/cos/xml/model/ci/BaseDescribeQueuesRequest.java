package com.tencent.cos.xml.model.ci;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public abstract class BaseDescribeQueuesRequest extends BucketRequest {
    public BaseDescribeQueuesRequest(String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㨝\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("㨞\u0001"));
    }

    public void setPageNumber(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㨟\u0001"), String.valueOf(i4));
    }

    public void setPageSize(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㨠\u0001"), String.valueOf(i4));
    }

    public void setQueueIds(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㨡\u0001"), str);
    }

    public void setState(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㨢\u0001"), str);
    }

    public BaseDescribeQueuesRequest(String str, String str2) {
        super(str);
        this.region = str2;
    }
}
