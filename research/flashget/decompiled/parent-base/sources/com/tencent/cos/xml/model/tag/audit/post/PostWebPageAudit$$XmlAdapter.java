package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.bean.AuditInput;
import com.tencent.cos.xml.model.tag.audit.post.PostWebPageAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostWebPageAudit$$XmlAdapter extends IXmlAdapter<PostWebPageAudit> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostWebPageAudit postWebPageAudit, String str) throws IOException, XmlPullParserException {
        if (postWebPageAudit == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("丗\u0001");
        }
        xmlSerializer.startTag("", str);
        AuditInput auditInput = postWebPageAudit.input;
        if (auditInput != null) {
            QCloudXml.toXml(xmlSerializer, auditInput, ProtectedSandApp.s("丘\u0001"));
        }
        PostWebPageAudit.WebPageAuditConf webPageAuditConf = postWebPageAudit.conf;
        if (webPageAuditConf != null) {
            QCloudXml.toXml(xmlSerializer, webPageAuditConf, ProtectedSandApp.s("丙\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
