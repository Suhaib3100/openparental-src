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
public class UpdateNoiseReductionTempleteRequest extends BucketRequest {
    protected final String templateId;
    private UpdateNoiseReductionTemplete updateNoiseReductionTemplete;

    public UpdateNoiseReductionTempleteRequest(@o0 String str, @o0 String str2) {
        super(str);
        this.templateId = str2;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㻤\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("㻥\u0001") + this.templateId;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getRequestHost(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getRequestHost(this.region, this.bucket, ProtectedSandApp.s("㻦\u0001"));
    }

    public void setUpdateNoiseReductionTemplete(@o0 UpdateNoiseReductionTemplete updateNoiseReductionTemplete) {
        this.updateNoiseReductionTemplete = updateNoiseReductionTemplete;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("㻨\u0001"), QCloudXmlUtils.toXml(this.updateNoiseReductionTemplete).getBytes(ProtectedSandApp.s("㻧\u0001")));
    }
}
