package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.IntelligentTieringConfiguration;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.Map;

/* loaded from: classes6.dex */
public class PutBucketIntelligentTieringRequest extends BucketRequest {
    private IntelligentTieringConfiguration configuration;
    public static final String STATUS_SUSPEND = ProtectedSandApp.s("㛙\u0001");
    public static final String STATUS_ENABLED = ProtectedSandApp.s("㛚\u0001");

    public PutBucketIntelligentTieringRequest(String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛖\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㛗\u0001"), null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("㛘\u0001"), QCloudXmlUtils.toXml(this.configuration).getBytes(), 0L, r0.length());
    }

    public void setConfiguration(IntelligentTieringConfiguration intelligentTieringConfiguration) {
        this.configuration = intelligentTieringConfiguration;
    }
}
