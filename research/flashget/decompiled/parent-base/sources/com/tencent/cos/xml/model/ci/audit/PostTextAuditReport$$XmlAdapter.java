package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostTextAuditReport$$XmlAdapter extends IXmlAdapter<PostTextAuditReport> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTextAuditReport postTextAuditReport, String str) throws IOException, XmlPullParserException {
        if (postTextAuditReport == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䆲\u0001");
        }
        xmlSerializer.startTag("", str);
        String s4 = ProtectedSandApp.s("䆳\u0001");
        xmlSerializer.startTag("", s4);
        c.a(postTextAuditReport.contentType, xmlSerializer, "", s4);
        if (postTextAuditReport.text != null) {
            String s5 = ProtectedSandApp.s("䆴\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postTextAuditReport.text, xmlSerializer, "", s5);
        }
        if (postTextAuditReport.label != null) {
            String s6 = ProtectedSandApp.s("䆵\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postTextAuditReport.label, xmlSerializer, "", s6);
        }
        if (postTextAuditReport.suggestedLabel != null) {
            String s7 = ProtectedSandApp.s("䆶\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postTextAuditReport.suggestedLabel, xmlSerializer, "", s7);
        }
        if (postTextAuditReport.jobId != null) {
            String s10 = ProtectedSandApp.s("䆷\u0001");
            xmlSerializer.startTag("", s10);
            a.a(postTextAuditReport.jobId, xmlSerializer, "", s10);
        }
        if (postTextAuditReport.moderationTime != null) {
            String s11 = ProtectedSandApp.s("䆸\u0001");
            xmlSerializer.startTag("", s11);
            a.a(postTextAuditReport.moderationTime, xmlSerializer, "", s11);
        }
        xmlSerializer.endTag("", str);
    }
}
