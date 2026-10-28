package com.tencent.cos.xml.model.ci.audit;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.audit.bean.AuditInput;
import com.tencent.cos.xml.model.tag.audit.post.PostWebPageAudit;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostWebPageAuditRequest extends BasePostAuditRequest {
    private final PostWebPageAudit postWebPageAudit;

    public PostWebPageAuditRequest(@o0 String str) {
        super(str);
        this.postWebPageAudit = new PostWebPageAudit();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        TextUtils.isEmpty(this.postWebPageAudit.input.url);
        TextUtils.isEmpty(this.postWebPageAudit.conf.detectType);
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䇆\u0001");
    }

    @Deprecated
    public void setCallback(@o0 String str) {
        this.postWebPageAudit.conf.callback = str;
    }

    public void setConfig(@o0 PostWebPageAudit.WebPageAuditConf webPageAuditConf) {
        this.postWebPageAudit.conf = webPageAuditConf;
    }

    @Deprecated
    public void setDetectType(@o0 String str) {
        this.postWebPageAudit.conf.detectType = str;
    }

    public void setInput(@o0 AuditInput auditInput) {
        this.postWebPageAudit.input = auditInput;
    }

    @Deprecated
    public void setReturnHighlightHtml(boolean z4) {
        this.postWebPageAudit.conf.returnHighlightHtml = z4;
    }

    @Deprecated
    public void setUrl(@o0 String str) {
        this.postWebPageAudit.input.url = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䇈\u0001"), QCloudXmlUtils.toXml(this.postWebPageAudit).getBytes(ProtectedSandApp.s("䇇\u0001")));
    }
}
