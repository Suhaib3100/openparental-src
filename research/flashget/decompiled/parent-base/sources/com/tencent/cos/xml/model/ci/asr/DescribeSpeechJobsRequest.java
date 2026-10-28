package com.tencent.cos.xml.model.ci.asr;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;

/* loaded from: classes7.dex */
public final class DescribeSpeechJobsRequest extends BucketRequest {
    public DescribeSpeechJobsRequest(String str) {
        super(str);
        this.queryParameters.put(ProtectedSandApp.s("㿂\u0001"), ProtectedSandApp.s("㿃\u0001"));
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㿄\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㿅\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("㿆\u0001"));
    }

    public void setEndCreationTime(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㿇\u0001"), str);
    }

    public void setNextToken(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㿈\u0001"), str);
    }

    public void setOrderByTime(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㿉\u0001"), str);
    }

    public void setQueueId(@o0 String str) {
        this.queryParameters.put(ProtectedSandApp.s("㿊\u0001"), str);
    }

    public void setSize(int i4) {
        this.queryParameters.put(ProtectedSandApp.s("㿋\u0001"), String.valueOf(i4));
    }

    public void setStartCreationTime(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㿌\u0001"), str);
    }

    public void setStates(String str) {
        this.queryParameters.put(ProtectedSandApp.s("㿍\u0001"), str);
    }

    public DescribeSpeechJobsRequest(String str, String str2) {
        this(str);
        this.region = str2;
    }
}
