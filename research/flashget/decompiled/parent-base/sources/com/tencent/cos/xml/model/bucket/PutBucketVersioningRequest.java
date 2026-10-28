package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.VersioningConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public class PutBucketVersioningRequest extends BucketRequest {
    private VersioningConfiguration versioningConfiguration;

    public PutBucketVersioningRequest(String str) {
        super(str);
        this.versioningConfiguration = new VersioningConfiguration();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㜁\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㜂\u0001"), null);
        return super.getQueryString();
    }

    public void setEnableVersion(boolean z4) {
        if (z4) {
            this.versioningConfiguration.status = ProtectedSandApp.s("㜃\u0001");
        } else {
            this.versioningConfiguration.status = ProtectedSandApp.s("㜄\u0001");
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㜅\u0001"), XmlBuilder.buildVersioningConfiguration(this.versioningConfiguration));
    }
}
