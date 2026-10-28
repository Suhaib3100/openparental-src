package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.post.PostDocumentAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostDocumentAudit$$XmlAdapter extends IXmlAdapter<PostDocumentAudit> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostDocumentAudit postDocumentAudit, String str) throws IOException, XmlPullParserException {
        if (postDocumentAudit == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷕\u0001");
        }
        xmlSerializer.startTag("", str);
        PostDocumentAudit.DocumentAuditInput documentAuditInput = postDocumentAudit.input;
        if (documentAuditInput != null) {
            QCloudXml.toXml(xmlSerializer, documentAuditInput, ProtectedSandApp.s("䷖\u0001"));
        }
        AuditConf auditConf = postDocumentAudit.conf;
        if (auditConf != null) {
            QCloudXml.toXml(xmlSerializer, auditConf, ProtectedSandApp.s("䷗\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
