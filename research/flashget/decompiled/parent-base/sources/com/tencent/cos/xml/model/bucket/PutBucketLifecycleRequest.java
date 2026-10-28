package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.LifecycleConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public final class PutBucketLifecycleRequest extends BucketRequest {
    private LifecycleConfiguration lifecycleConfiguration;

    public PutBucketLifecycleRequest(String str) {
        super(str);
        LifecycleConfiguration lifecycleConfiguration = new LifecycleConfiguration();
        this.lifecycleConfiguration = lifecycleConfiguration;
        lifecycleConfiguration.rules = new ArrayList();
    }

    public LifecycleConfiguration getLifecycleConfiguration() {
        return this.lifecycleConfiguration;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛣\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㛤\u0001"), null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setRuleList(List<LifecycleConfiguration.Rule> list) {
        if (list != null) {
            this.lifecycleConfiguration.rules.addAll(list);
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㛥\u0001"), XmlBuilder.buildLifecycleConfigurationXML(this.lifecycleConfiguration));
    }

    public void setRuleList(LifecycleConfiguration.Rule rule) {
        if (rule != null) {
            this.lifecycleConfiguration.rules.add(rule);
        }
    }
}
