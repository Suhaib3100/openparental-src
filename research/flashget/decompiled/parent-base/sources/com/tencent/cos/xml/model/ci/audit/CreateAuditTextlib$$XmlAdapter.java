package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateAuditTextlib$$XmlAdapter extends IXmlAdapter<CreateAuditTextlib> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateAuditTextlib createAuditTextlib, String str) throws IOException, XmlPullParserException {
        if (createAuditTextlib == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䁪\u0001");
        }
        xmlSerializer.startTag("", str);
        if (createAuditTextlib.libName != null) {
            String s4 = ProtectedSandApp.s("䁫\u0001");
            xmlSerializer.startTag("", s4);
            a.a(createAuditTextlib.libName, xmlSerializer, "", s4);
        }
        if (createAuditTextlib.suggestion != null) {
            String s5 = ProtectedSandApp.s("䁬\u0001");
            xmlSerializer.startTag("", s5);
            a.a(createAuditTextlib.suggestion, xmlSerializer, "", s5);
        }
        if (createAuditTextlib.matchType != null) {
            String s6 = ProtectedSandApp.s("䁭\u0001");
            xmlSerializer.startTag("", s6);
            a.a(createAuditTextlib.matchType, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
