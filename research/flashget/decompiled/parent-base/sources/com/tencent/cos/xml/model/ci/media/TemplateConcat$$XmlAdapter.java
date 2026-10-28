package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateConcat;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateConcat$$XmlAdapter extends IXmlAdapter<TemplateConcat> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateConcat templateConcat, String str) throws IOException, XmlPullParserException {
        if (templateConcat == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䜌\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateConcat.tag != null) {
            String s4 = ProtectedSandApp.s("䜍\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateConcat.tag, xmlSerializer, "", s4);
        }
        if (templateConcat.name != null) {
            String s5 = ProtectedSandApp.s("䜎\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateConcat.name, xmlSerializer, "", s5);
        }
        TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate = templateConcat.concatTemplate;
        if (templateConcatConcatTemplate != null) {
            QCloudXml.toXml(xmlSerializer, templateConcatConcatTemplate, ProtectedSandApp.s("䜏\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
