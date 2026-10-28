package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.DomainConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public class PutBucketDomainRequest extends BucketRequest {
    private DomainConfiguration domainConfiguration;

    public PutBucketDomainRequest(String str) {
        super(str);
        DomainConfiguration domainConfiguration = new DomainConfiguration();
        this.domainConfiguration = domainConfiguration;
        domainConfiguration.domainRules = new ArrayList();
    }

    public void addDomainRule(DomainConfiguration.DomainRule domainRule) {
        if (domainRule != null) {
            this.domainConfiguration.domainRules.add(domainRule);
        }
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (this.domainConfiguration.domainRules.size() > 0) {
            for (DomainConfiguration.DomainRule domainRule : this.domainConfiguration.domainRules) {
            }
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛓\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㛔\u0001"), null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㛕\u0001"), XmlBuilder.buildDomainConfiguration(this.domainConfiguration));
    }
}
