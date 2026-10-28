package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PutBucketDPStateRequest extends BucketRequest {
    public PutBucketDPStateRequest(String str) {
        this(str, null);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㫎\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㫏\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("㫐\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("㫒\u0001"), "".getBytes(ProtectedSandApp.s("㫑\u0001")));
    }

    public PutBucketDPStateRequest(String str, String str2) {
        super(str);
        this.region = str2;
    }
}
