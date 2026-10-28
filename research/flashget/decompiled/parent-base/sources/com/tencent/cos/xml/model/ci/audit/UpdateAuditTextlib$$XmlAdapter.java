package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateAuditTextlib$$XmlAdapter extends IXmlAdapter<UpdateAuditTextlib> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateAuditTextlib updateAuditTextlib, String str) throws IOException, XmlPullParserException {
        if (updateAuditTextlib == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䇉\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateAuditTextlib.libName != null) {
            String s4 = ProtectedSandApp.s("䇊\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateAuditTextlib.libName, xmlSerializer, "", s4);
        }
        if (updateAuditTextlib.suggestion != null) {
            String s5 = ProtectedSandApp.s("䇋\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateAuditTextlib.suggestion, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
