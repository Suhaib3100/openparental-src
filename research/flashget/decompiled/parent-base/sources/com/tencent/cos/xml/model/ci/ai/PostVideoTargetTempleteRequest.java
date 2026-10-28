package com.tencent.cos.xml.model.ci.ai;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVideoTargetTempleteRequest extends BucketRequest {
    private PostVideoTargetTemplete postVideoTargetTemplete;

    public PostVideoTargetTempleteRequest(@o0 String str) {
        super(str);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㸳\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㸴\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("㸵\u0001"));
    }

    public void setPostVideoTargetTemplete(@o0 PostVideoTargetTemplete postVideoTargetTemplete) {
        this.postVideoTargetTemplete = postVideoTargetTemplete;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("㸷\u0001"), QCloudXmlUtils.toXml(this.postVideoTargetTemplete).getBytes(ProtectedSandApp.s("㸶\u0001")));
    }
}
