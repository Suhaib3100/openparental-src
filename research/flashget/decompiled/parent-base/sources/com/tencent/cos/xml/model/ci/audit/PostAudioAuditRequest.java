package com.tencent.cos.xml.model.ci.audit;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.audit.bean.AuditInput;
import com.tencent.cos.xml.model.tag.audit.post.PostAudioAudit;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostAudioAuditRequest extends BasePostAuditRequest {
    private final PostAudioAudit postAudioAudit;

    public PostAudioAuditRequest(@o0 String str) {
        super(str);
        this.postAudioAudit = new PostAudioAudit();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postAudioAudit.input.object)) {
            TextUtils.isEmpty(this.postAudioAudit.input.url);
        }
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䅱\u0001");
    }

    @Deprecated
    public void setBizType(@o0 String str) {
        this.postAudioAudit.conf.bizType = str;
    }

    @Deprecated
    public void setCallback(@o0 String str) {
        this.postAudioAudit.conf.callback = str;
    }

    @Deprecated
    public void setCallbackVersion(@o0 String str) {
        this.postAudioAudit.conf.callbackVersion = str;
    }

    public void setConfig(@o0 PostAudioAudit.AudioAuditConf audioAuditConf) {
        this.postAudioAudit.conf = audioAuditConf;
    }

    @Deprecated
    public void setDataId(@o0 String str) {
        this.postAudioAudit.input.dataId = str;
    }

    @Deprecated
    public void setDetectType(@o0 String str) {
        this.postAudioAudit.conf.detectType = str;
    }

    public void setInput(@o0 AuditInput auditInput) {
        this.postAudioAudit.input = auditInput;
    }

    @Deprecated
    public void setObject(@o0 String str) {
        this.postAudioAudit.input.object = str;
    }

    @Deprecated
    public void setUrl(@o0 String str) {
        this.postAudioAudit.input.url = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䅳\u0001"), QCloudXmlUtils.toXml(this.postAudioAudit).getBytes(ProtectedSandApp.s("䅲\u0001")));
    }
}
