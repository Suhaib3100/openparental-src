package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.post.PostTextAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostTextAudit$TextAuditConf$$XmlAdapter extends IXmlAdapter<PostTextAudit.TextAuditConf> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTextAudit.TextAuditConf textAuditConf, String str) throws IOException, XmlPullParserException {
        if (textAuditConf == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷲\u0001");
        }
        xmlSerializer.startTag("", str);
        if (textAuditConf.callbackVersion != null) {
            String s4 = ProtectedSandApp.s("䷳\u0001");
            xmlSerializer.startTag("", s4);
            a.a(textAuditConf.callbackVersion, xmlSerializer, "", s4);
        }
        if (textAuditConf.detectType != null) {
            String s5 = ProtectedSandApp.s("䷴\u0001");
            xmlSerializer.startTag("", s5);
            a.a(textAuditConf.detectType, xmlSerializer, "", s5);
        }
        String s6 = ProtectedSandApp.s("䷵\u0001");
        xmlSerializer.startTag("", s6);
        c.a(textAuditConf.async, xmlSerializer, "", s6);
        if (textAuditConf.callback != null) {
            String s7 = ProtectedSandApp.s("䷶\u0001");
            xmlSerializer.startTag("", s7);
            a.a(textAuditConf.callback, xmlSerializer, "", s7);
        }
        if (textAuditConf.callbackType != 0) {
            String s10 = ProtectedSandApp.s("䷷\u0001");
            xmlSerializer.startTag("", s10);
            c.a(textAuditConf.callbackType, xmlSerializer, "", s10);
        }
        if (textAuditConf.bizType != null) {
            String s11 = ProtectedSandApp.s("䷸\u0001");
            xmlSerializer.startTag("", s11);
            a.a(textAuditConf.bizType, xmlSerializer, "", s11);
        }
        AuditConf.Freeze freeze = textAuditConf.freeze;
        if (freeze != null) {
            QCloudXml.toXml(xmlSerializer, freeze, ProtectedSandApp.s("䷹\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
