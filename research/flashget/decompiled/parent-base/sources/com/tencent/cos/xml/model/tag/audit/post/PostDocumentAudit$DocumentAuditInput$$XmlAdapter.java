package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.post.PostDocumentAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostDocumentAudit$DocumentAuditInput$$XmlAdapter extends IXmlAdapter<PostDocumentAudit.DocumentAuditInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostDocumentAudit.DocumentAuditInput documentAuditInput, String str) throws IOException, XmlPullParserException {
        if (documentAuditInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷘\u0001");
        }
        xmlSerializer.startTag("", str);
        if (documentAuditInput.type != null) {
            String s4 = ProtectedSandApp.s("䷙\u0001");
            xmlSerializer.startTag("", s4);
            a.a(documentAuditInput.type, xmlSerializer, "", s4);
        }
        if (documentAuditInput.object != null) {
            String s5 = ProtectedSandApp.s("䷚\u0001");
            xmlSerializer.startTag("", s5);
            a.a(documentAuditInput.object, xmlSerializer, "", s5);
        }
        if (documentAuditInput.url != null) {
            String s6 = ProtectedSandApp.s("䷛\u0001");
            xmlSerializer.startTag("", s6);
            a.a(documentAuditInput.url, xmlSerializer, "", s6);
        }
        if (documentAuditInput.dataId != null) {
            String s7 = ProtectedSandApp.s("䷜\u0001");
            xmlSerializer.startTag("", s7);
            a.a(documentAuditInput.dataId, xmlSerializer, "", s7);
        }
        AuditUserInfo auditUserInfo = documentAuditInput.userInfo;
        if (auditUserInfo != null) {
            QCloudXml.toXml(xmlSerializer, auditUserInfo, ProtectedSandApp.s("䷝\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
