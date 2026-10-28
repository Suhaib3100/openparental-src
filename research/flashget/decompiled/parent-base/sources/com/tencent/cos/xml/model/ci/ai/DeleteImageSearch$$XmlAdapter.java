package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class DeleteImageSearch$$XmlAdapter extends IXmlAdapter<DeleteImageSearch> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, DeleteImageSearch deleteImageSearch, String str) throws IOException, XmlPullParserException {
        if (deleteImageSearch == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㰤\u0001");
        }
        xmlSerializer.startTag("", str);
        if (deleteImageSearch.entityId != null) {
            String s4 = ProtectedSandApp.s("㰥\u0001");
            xmlSerializer.startTag("", s4);
            a.a(deleteImageSearch.entityId, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
