package com.tencent.cos.xml.model.ci.audit;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.post.PostDocumentAudit;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostDocumentAuditRequest extends BasePostAuditRequest {
    private final PostDocumentAudit postDocumentAudit;

    public PostDocumentAuditRequest(@o0 String str) {
        super(str);
        this.postDocumentAudit = new PostDocumentAudit();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postDocumentAudit.input.object)) {
            TextUtils.isEmpty(this.postDocumentAudit.input.url);
        }
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䅴\u0001");
    }

    @Deprecated
    public void setBizType(@o0 String str) {
        this.postDocumentAudit.conf.bizType = str;
    }

    @Deprecated
    public void setCallback(@o0 String str) {
        this.postDocumentAudit.conf.callback = str;
    }

    public void setConfig(@o0 AuditConf auditConf) {
        this.postDocumentAudit.conf = auditConf;
    }

    @Deprecated
    public void setDataId(@o0 String str) {
        this.postDocumentAudit.input.dataId = str;
    }

    @Deprecated
    public void setDetectType(@o0 String str) {
        this.postDocumentAudit.conf.detectType = str;
    }

    public void setInput(@o0 PostDocumentAudit.DocumentAuditInput documentAuditInput) {
        this.postDocumentAudit.input = documentAuditInput;
    }

    @Deprecated
    public void setObject(@o0 String str) {
        this.postDocumentAudit.input.object = str;
    }

    @Deprecated
    public void setType(@o0 String str) {
        this.postDocumentAudit.input.type = str;
    }

    @Deprecated
    public void setUrl(@o0 String str) {
        this.postDocumentAudit.input.url = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䅶\u0001"), QCloudXmlUtils.toXml(this.postDocumentAudit).getBytes(ProtectedSandApp.s("䅵\u0001")));
    }
}
