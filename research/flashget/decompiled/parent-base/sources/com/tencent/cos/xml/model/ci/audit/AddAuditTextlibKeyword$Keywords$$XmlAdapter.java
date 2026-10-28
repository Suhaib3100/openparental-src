package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.audit.AddAuditTextlibKeyword;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AddAuditTextlibKeyword$Keywords$$XmlAdapter extends IXmlAdapter<AddAuditTextlibKeyword.Keywords> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AddAuditTextlibKeyword.Keywords keywords, String str) throws IOException, XmlPullParserException {
        if (keywords == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䁉\u0001");
        }
        xmlSerializer.startTag("", str);
        if (keywords.content != null) {
            String s4 = ProtectedSandApp.s("䁊\u0001");
            xmlSerializer.startTag("", s4);
            a.a(keywords.content, xmlSerializer, "", s4);
        }
        if (keywords.label != null) {
            String s5 = ProtectedSandApp.s("䁋\u0001");
            xmlSerializer.startTag("", s5);
            a.a(keywords.label, xmlSerializer, "", s5);
        }
        if (keywords.remark != null) {
            String s6 = ProtectedSandApp.s("䁌\u0001");
            xmlSerializer.startTag("", s6);
            a.a(keywords.remark, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
