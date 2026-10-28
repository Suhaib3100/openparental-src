package com.tencent.cos.xml.model.ci.audit;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.audit.post.PostTextAudit;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostTextAuditRequest extends BasePostAuditRequest {
    protected final PostTextAudit postTextAudit;

    public PostTextAuditRequest(@o0 String str) {
        super(str);
        this.postTextAudit = new PostTextAudit();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postTextAudit.input.object) && TextUtils.isEmpty(this.postTextAudit.input.url)) {
            TextUtils.isEmpty(this.postTextAudit.input.content);
        }
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䇀\u0001");
    }

    @Deprecated
    public void setBizType(@o0 String str) {
        this.postTextAudit.conf.bizType = str;
    }

    @Deprecated
    public void setCallback(@o0 String str) {
        this.postTextAudit.conf.callback = str;
    }

    @Deprecated
    public void setCallbackVersion(@o0 String str) {
        this.postTextAudit.conf.callbackVersion = str;
    }

    public void setConfig(@o0 PostTextAudit.TextAuditConf textAuditConf) {
        this.postTextAudit.conf = textAuditConf;
    }

    @Deprecated
    public void setContent(@o0 String str) {
        this.postTextAudit.input.content = str;
    }

    @Deprecated
    public void setDataId(@o0 String str) {
        this.postTextAudit.input.dataId = str;
    }

    @Deprecated
    public void setDetectType(@o0 String str) {
        this.postTextAudit.conf.detectType = str;
    }

    public void setInput(@o0 PostTextAudit.TextAuditInput textAuditInput) {
        this.postTextAudit.input = textAuditInput;
    }

    @Deprecated
    public void setObject(@o0 String str) {
        this.postTextAudit.input.object = str;
    }

    @Deprecated
    public void setUrl(@o0 String str) {
        this.postTextAudit.input.url = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䇂\u0001"), QCloudXmlUtils.toXml(this.postTextAudit).getBytes(ProtectedSandApp.s("䇁\u0001")));
    }
}
