package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostImageAuditReport$$XmlAdapter extends IXmlAdapter<PostImageAuditReport> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostImageAuditReport postImageAuditReport, String str) throws IOException, XmlPullParserException {
        if (postImageAuditReport == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䅷\u0001");
        }
        xmlSerializer.startTag("", str);
        String s4 = ProtectedSandApp.s("䅸\u0001");
        xmlSerializer.startTag("", s4);
        c.a(postImageAuditReport.contentType, xmlSerializer, "", s4);
        if (postImageAuditReport.url != null) {
            String s5 = ProtectedSandApp.s("䅹\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postImageAuditReport.url, xmlSerializer, "", s5);
        }
        if (postImageAuditReport.label != null) {
            String s6 = ProtectedSandApp.s("䅺\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postImageAuditReport.label, xmlSerializer, "", s6);
        }
        if (postImageAuditReport.suggestedLabel != null) {
            String s7 = ProtectedSandApp.s("䅻\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postImageAuditReport.suggestedLabel, xmlSerializer, "", s7);
        }
        if (postImageAuditReport.jobId != null) {
            String s10 = ProtectedSandApp.s("䅼\u0001");
            xmlSerializer.startTag("", s10);
            a.a(postImageAuditReport.jobId, xmlSerializer, "", s10);
        }
        if (postImageAuditReport.moderationTime != null) {
            String s11 = ProtectedSandApp.s("䅽\u0001");
            xmlSerializer.startTag("", s11);
            a.a(postImageAuditReport.moderationTime, xmlSerializer, "", s11);
        }
        xmlSerializer.endTag("", str);
    }
}
