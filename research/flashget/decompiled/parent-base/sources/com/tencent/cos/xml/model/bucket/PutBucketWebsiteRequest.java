package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.WebsiteConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public class PutBucketWebsiteRequest extends BucketRequest {
    private WebsiteConfiguration websiteConfiguration;

    public PutBucketWebsiteRequest(String str) {
        super(str);
        this.websiteConfiguration = new WebsiteConfiguration();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㜆\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㜇\u0001"), null);
        return super.getQueryString();
    }

    public void setErrorDocument(String str) {
        if (str != null) {
            WebsiteConfiguration websiteConfiguration = this.websiteConfiguration;
            if (websiteConfiguration.errorDocument == null) {
                websiteConfiguration.errorDocument = new WebsiteConfiguration.ErrorDocument();
            }
            this.websiteConfiguration.errorDocument.key = str;
        }
    }

    public void setIndexDocument(String str) {
        if (str != null) {
            WebsiteConfiguration websiteConfiguration = this.websiteConfiguration;
            if (websiteConfiguration.indexDocument == null) {
                websiteConfiguration.indexDocument = new WebsiteConfiguration.IndexDocument();
            }
            this.websiteConfiguration.indexDocument.suffix = str;
        }
    }

    public void setRedirectAllRequestTo(String str) {
        if (str != null) {
            WebsiteConfiguration websiteConfiguration = this.websiteConfiguration;
            if (websiteConfiguration.redirectAllRequestTo == null) {
                websiteConfiguration.redirectAllRequestTo = new WebsiteConfiguration.RedirectAllRequestTo();
            }
            this.websiteConfiguration.redirectAllRequestTo.protocol = str;
        }
    }

    public void setRoutingRules(List<WebsiteConfiguration.RoutingRule> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        WebsiteConfiguration websiteConfiguration = this.websiteConfiguration;
        if (websiteConfiguration.routingRules == null) {
            websiteConfiguration.routingRules = new ArrayList();
        }
        Iterator<WebsiteConfiguration.RoutingRule> it = list.iterator();
        while (it.hasNext()) {
            this.websiteConfiguration.routingRules.add(it.next());
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㜈\u0001"), XmlBuilder.buildWebsiteConfiguration(this.websiteConfiguration));
    }
}
