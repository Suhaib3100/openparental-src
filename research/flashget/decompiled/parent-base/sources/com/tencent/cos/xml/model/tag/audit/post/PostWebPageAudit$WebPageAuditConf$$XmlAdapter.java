package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.post.PostWebPageAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostWebPageAudit$WebPageAuditConf$$XmlAdapter extends IXmlAdapter<PostWebPageAudit.WebPageAuditConf> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostWebPageAudit.WebPageAuditConf webPageAuditConf, String str) throws IOException, XmlPullParserException {
        if (webPageAuditConf == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("业\u0001");
        }
        xmlSerializer.startTag("", str);
        String s4 = ProtectedSandApp.s("丛\u0001");
        xmlSerializer.startTag("", s4);
        xmlSerializer.text(String.valueOf(webPageAuditConf.returnHighlightHtml));
        xmlSerializer.endTag("", s4);
        if (webPageAuditConf.detectType != null) {
            String s5 = ProtectedSandApp.s("东\u0001");
            xmlSerializer.startTag("", s5);
            a.a(webPageAuditConf.detectType, xmlSerializer, "", s5);
        }
        String s6 = ProtectedSandApp.s("丝\u0001");
        xmlSerializer.startTag("", s6);
        c.a(webPageAuditConf.async, xmlSerializer, "", s6);
        if (webPageAuditConf.callback != null) {
            String s7 = ProtectedSandApp.s("丞\u0001");
            xmlSerializer.startTag("", s7);
            a.a(webPageAuditConf.callback, xmlSerializer, "", s7);
        }
        if (webPageAuditConf.callbackType != 0) {
            String s10 = ProtectedSandApp.s("丟\u0001");
            xmlSerializer.startTag("", s10);
            c.a(webPageAuditConf.callbackType, xmlSerializer, "", s10);
        }
        if (webPageAuditConf.bizType != null) {
            String s11 = ProtectedSandApp.s("丠\u0001");
            xmlSerializer.startTag("", s11);
            a.a(webPageAuditConf.bizType, xmlSerializer, "", s11);
        }
        AuditConf.Freeze freeze = webPageAuditConf.freeze;
        if (freeze != null) {
            QCloudXml.toXml(xmlSerializer, freeze, ProtectedSandApp.s("両\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
