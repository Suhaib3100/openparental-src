package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class ImageSearchBucket$$XmlAdapter extends IXmlAdapter<ImageSearchBucket> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, ImageSearchBucket imageSearchBucket, String str) throws IOException, XmlPullParserException {
        if (imageSearchBucket == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㲭\u0001");
        }
        xmlSerializer.startTag("", str);
        String s4 = ProtectedSandApp.s("㲮\u0001");
        xmlSerializer.startTag("", s4);
        c.a(imageSearchBucket.maxCapacity, xmlSerializer, "", s4);
        String s5 = ProtectedSandApp.s("㲯\u0001");
        xmlSerializer.startTag("", s5);
        c.a(imageSearchBucket.maxQps, xmlSerializer, "", s5);
        xmlSerializer.endTag("", str);
    }
}
