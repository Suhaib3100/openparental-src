package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.post.PostTextAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostTextAudit$TextAuditInput$$XmlAdapter extends IXmlAdapter<PostTextAudit.TextAuditInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTextAudit.TextAuditInput textAuditInput, String str) throws IOException, XmlPullParserException {
        if (textAuditInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷺\u0001");
        }
        xmlSerializer.startTag("", str);
        if (textAuditInput.content != null) {
            String s4 = ProtectedSandApp.s("䷻\u0001");
            xmlSerializer.startTag("", s4);
            a.a(textAuditInput.content, xmlSerializer, "", s4);
        }
        if (textAuditInput.object != null) {
            String s5 = ProtectedSandApp.s("䷼\u0001");
            xmlSerializer.startTag("", s5);
            a.a(textAuditInput.object, xmlSerializer, "", s5);
        }
        if (textAuditInput.url != null) {
            String s6 = ProtectedSandApp.s("䷽\u0001");
            xmlSerializer.startTag("", s6);
            a.a(textAuditInput.url, xmlSerializer, "", s6);
        }
        if (textAuditInput.dataId != null) {
            String s7 = ProtectedSandApp.s("䷾\u0001");
            xmlSerializer.startTag("", s7);
            a.a(textAuditInput.dataId, xmlSerializer, "", s7);
        }
        AuditUserInfo auditUserInfo = textAuditInput.userInfo;
        if (auditUserInfo != null) {
            QCloudXml.toXml(xmlSerializer, auditUserInfo, ProtectedSandApp.s("䷿\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
