package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AuditInput$$XmlAdapter extends IXmlAdapter<AuditInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditInput auditInput, String str) throws IOException, XmlPullParserException {
        if (auditInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䯯\u0001");
        }
        xmlSerializer.startTag("", str);
        if (auditInput.object != null) {
            String s4 = ProtectedSandApp.s("䯰\u0001");
            xmlSerializer.startTag("", s4);
            a.a(auditInput.object, xmlSerializer, "", s4);
        }
        if (auditInput.url != null) {
            String s5 = ProtectedSandApp.s("䯱\u0001");
            xmlSerializer.startTag("", s5);
            a.a(auditInput.url, xmlSerializer, "", s5);
        }
        if (auditInput.dataId != null) {
            String s6 = ProtectedSandApp.s("䯲\u0001");
            xmlSerializer.startTag("", s6);
            a.a(auditInput.dataId, xmlSerializer, "", s6);
        }
        AuditUserInfo auditUserInfo = auditInput.userInfo;
        if (auditUserInfo != null) {
            QCloudXml.toXml(xmlSerializer, auditUserInfo, ProtectedSandApp.s("䯳\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
