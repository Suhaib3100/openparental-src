package com.tencent.cos.xml.model.ci.audit;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.post.PostImagesAudit;
import com.tencent.cos.xml.utils.QCloudXmlUtils;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostImagesAuditRequest extends BasePostAuditRequest {
    private final PostImagesAudit postImagesAudit;

    public PostImagesAuditRequest(@o0 String str) {
        super(str);
        this.postImagesAudit = new PostImagesAudit();
    }

    public void addImage(@o0 PostImagesAudit.ImagesAuditInput imagesAuditInput) {
        this.postImagesAudit.input.add(imagesAuditInput);
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        super.checkParameters();
        List<PostImagesAudit.ImagesAuditInput> list = this.postImagesAudit.input;
        if (list != null) {
            list.size();
        }
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return ProtectedSandApp.s("䆅\u0001");
    }

    @Deprecated
    public void setAsync(int i4) {
        this.postImagesAudit.conf.async = i4;
    }

    @Deprecated
    public void setBizType(@o0 String str) {
        this.postImagesAudit.conf.bizType = str;
    }

    @Deprecated
    public void setCallback(@o0 String str) {
        this.postImagesAudit.conf.callback = str;
    }

    public void setConfig(@o0 AuditConf auditConf) {
        this.postImagesAudit.conf = auditConf;
    }

    @Deprecated
    public void setDetectType(@o0 String str) {
        this.postImagesAudit.conf.detectType = str;
    }

    @Deprecated
    public void setFreeze(@o0 AuditConf.Freeze freeze) {
        this.postImagesAudit.conf.freeze = freeze;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException, CosXmlClientException {
        return RequestBodySerializer.bytes(ProtectedSandApp.s("䆇\u0001"), QCloudXmlUtils.toXml(this.postImagesAudit).getBytes(ProtectedSandApp.s("䆆\u0001")));
    }
}
