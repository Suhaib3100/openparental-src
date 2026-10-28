package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public final class PutBucketAccelerateRequest extends BucketRequest {
    private boolean enable;

    public PutBucketAccelerateRequest(String str, boolean z4) {
        super(str);
        this.enable = z4;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛍\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㛎\u0001"), null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㛏\u0001"), XmlBuilder.buildPutBucketAccelerateXML(this.enable));
    }
}
