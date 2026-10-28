package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AddImageSearch$$XmlAdapter extends IXmlAdapter<AddImageSearch> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AddImageSearch addImageSearch, String str) throws IOException, XmlPullParserException {
        if (addImageSearch == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㮬\u0001");
        }
        xmlSerializer.startTag("", str);
        if (addImageSearch.entityId != null) {
            String s4 = ProtectedSandApp.s("㮭\u0001");
            xmlSerializer.startTag("", s4);
            a.a(addImageSearch.entityId, xmlSerializer, "", s4);
        }
        if (addImageSearch.customContent != null) {
            String s5 = ProtectedSandApp.s("㮮\u0001");
            xmlSerializer.startTag("", s5);
            a.a(addImageSearch.customContent, xmlSerializer, "", s5);
        }
        if (addImageSearch.tags != null) {
            String s6 = ProtectedSandApp.s("㮯\u0001");
            xmlSerializer.startTag("", s6);
            a.a(addImageSearch.tags, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
