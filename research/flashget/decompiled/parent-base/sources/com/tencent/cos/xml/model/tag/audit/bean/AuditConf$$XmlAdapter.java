package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AuditConf$$XmlAdapter extends IXmlAdapter<AuditConf> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditConf auditConf, String str) throws IOException, XmlPullParserException {
        if (auditConf == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䯜\u0001");
        }
        xmlSerializer.startTag("", str);
        if (auditConf.detectType != null) {
            String s4 = ProtectedSandApp.s("䯝\u0001");
            xmlSerializer.startTag("", s4);
            a.a(auditConf.detectType, xmlSerializer, "", s4);
        }
        String s5 = ProtectedSandApp.s("䯞\u0001");
        xmlSerializer.startTag("", s5);
        c.a(auditConf.async, xmlSerializer, "", s5);
        if (auditConf.callback != null) {
            String s6 = ProtectedSandApp.s("䯟\u0001");
            xmlSerializer.startTag("", s6);
            a.a(auditConf.callback, xmlSerializer, "", s6);
        }
        if (auditConf.callbackType != 0) {
            String s7 = ProtectedSandApp.s("䯠\u0001");
            xmlSerializer.startTag("", s7);
            c.a(auditConf.callbackType, xmlSerializer, "", s7);
        }
        if (auditConf.bizType != null) {
            String s10 = ProtectedSandApp.s("䯡\u0001");
            xmlSerializer.startTag("", s10);
            a.a(auditConf.bizType, xmlSerializer, "", s10);
        }
        AuditConf.Freeze freeze = auditConf.freeze;
        if (freeze != null) {
            QCloudXml.toXml(xmlSerializer, freeze, ProtectedSandApp.s("䯢\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
