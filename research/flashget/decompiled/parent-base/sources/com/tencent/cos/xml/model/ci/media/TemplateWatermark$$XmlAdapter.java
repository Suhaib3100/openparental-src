package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateWatermark;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateWatermark$$XmlAdapter extends IXmlAdapter<TemplateWatermark> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateWatermark templateWatermark, String str) throws IOException, XmlPullParserException {
        if (templateWatermark == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䡨\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateWatermark.tag != null) {
            String s4 = ProtectedSandApp.s("䡩\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateWatermark.tag, xmlSerializer, "", s4);
        }
        if (templateWatermark.name != null) {
            String s5 = ProtectedSandApp.s("䡪\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateWatermark.name, xmlSerializer, "", s5);
        }
        TemplateWatermark.Watermark watermark = templateWatermark.watermark;
        if (watermark != null) {
            QCloudXml.toXml(xmlSerializer, watermark, ProtectedSandApp.s("䡫\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
