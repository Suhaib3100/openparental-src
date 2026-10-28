package com.tencent.cos.xml.model.ci.audit;

import android.text.TextUtils;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.audit.post.PostVideoAudit;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVideoAuditRequest extends BasePostAuditRequest {
    private final PostVideoAudit postVideoAudit;

    public PostVideoAuditRequest(@o0 String str) {
        super(str);
        this.postVideoAudit = new PostVideoAudit();
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        if (TextUtils.isEmpty(this.postVideoAudit.input.object)) {
            TextUtils.isEmpty(this.postVideoAudit.input.url);
        }
        int i4 = this.postVideoAudit.conf.snapshot.count;
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䇃\u0001");
    }

    @Deprecated
    public void setBizType(@o0 String str) {
        this.postVideoAudit.conf.bizType = str;
    }

    @Deprecated
    public void setCallback(@o0 String str) {
        this.postVideoAudit.conf.callback = str;
    }

    @Deprecated
    public void setCallbackVersion(@o0 String str) {
        this.postVideoAudit.conf.callbackVersion = str;
    }

    public void setConfig(@o0 PostVideoAudit.VideoAuditConf videoAuditConf) {
        this.postVideoAudit.conf = videoAuditConf;
    }

    @Deprecated
    public void setCount(int i4) {
        this.postVideoAudit.conf.snapshot.count = i4;
    }

    @Deprecated
    public void setDataId(@o0 String str) {
        this.postVideoAudit.input.dataId = str;
    }

    @Deprecated
    public void setDetectContent(int i4) {
        this.postVideoAudit.conf.detectContent = i4;
    }

    @Deprecated
    public void setDetectType(@o0 String str) {
        this.postVideoAudit.conf.detectType = str;
    }

    public void setInput(@o0 PostVideoAudit.VideoAuditInput videoAuditInput) {
        this.postVideoAudit.input = videoAuditInput;
    }

    @Deprecated
    public void setMode(@o0 String str) {
        this.postVideoAudit.conf.snapshot.mode = str;
    }

    @Deprecated
    public void setObject(@o0 String str) {
        this.postVideoAudit.input.object = str;
    }

    @Deprecated
    public void setTimeInterval(float f4) {
        this.postVideoAudit.conf.snapshot.timeInterval = f4;
    }

    @Deprecated
    public void setUrl(@o0 String str) {
        this.postVideoAudit.input.url = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䇅\u0001"), QCloudXmlUtils.toXml(this.postVideoAudit).getBytes(ProtectedSandApp.s("䇄\u0001")));
    }
}
