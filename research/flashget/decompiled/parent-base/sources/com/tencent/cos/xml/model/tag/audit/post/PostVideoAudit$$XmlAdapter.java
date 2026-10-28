package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.post.PostVideoAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVideoAudit$$XmlAdapter extends IXmlAdapter<PostVideoAudit> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoAudit postVideoAudit, String str) throws IOException, XmlPullParserException {
        if (postVideoAudit == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("一\u0001");
        }
        xmlSerializer.startTag("", str);
        PostVideoAudit.VideoAuditInput videoAuditInput = postVideoAudit.input;
        if (videoAuditInput != null) {
            QCloudXml.toXml(xmlSerializer, videoAuditInput, ProtectedSandApp.s("丁\u0001"));
        }
        PostVideoAudit.VideoAuditConf videoAuditConf = postVideoAudit.conf;
        if (videoAuditConf != null) {
            QCloudXml.toXml(xmlSerializer, videoAuditConf, ProtectedSandApp.s("丂\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
