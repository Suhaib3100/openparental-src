package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AuditConf$Freeze$$XmlAdapter extends IXmlAdapter<AuditConf.Freeze> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditConf.Freeze freeze, String str) throws IOException, XmlPullParserException {
        if (freeze == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䯣\u0001");
        }
        xmlSerializer.startTag("", str);
        String s4 = ProtectedSandApp.s("䯤\u0001");
        xmlSerializer.startTag("", s4);
        c.a(freeze.pornScore, xmlSerializer, "", s4);
        String s5 = ProtectedSandApp.s("䯥\u0001");
        xmlSerializer.startTag("", s5);
        c.a(freeze.adsScore, xmlSerializer, "", s5);
        String s6 = ProtectedSandApp.s("䯦\u0001");
        xmlSerializer.startTag("", s6);
        c.a(freeze.illegalScore, xmlSerializer, "", s6);
        String s7 = ProtectedSandApp.s("䯧\u0001");
        xmlSerializer.startTag("", s7);
        c.a(freeze.abuseScore, xmlSerializer, "", s7);
        xmlSerializer.endTag("", str);
    }
}
