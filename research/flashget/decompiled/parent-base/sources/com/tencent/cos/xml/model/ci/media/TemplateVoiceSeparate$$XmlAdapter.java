package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateVoiceSeparate$$XmlAdapter extends IXmlAdapter<TemplateVoiceSeparate> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateVoiceSeparate templateVoiceSeparate, String str) throws IOException, XmlPullParserException {
        if (templateVoiceSeparate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䡆\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateVoiceSeparate.tag != null) {
            String s4 = ProtectedSandApp.s("䡇\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateVoiceSeparate.tag, xmlSerializer, "", s4);
        }
        if (templateVoiceSeparate.name != null) {
            String s5 = ProtectedSandApp.s("䡈\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateVoiceSeparate.name, xmlSerializer, "", s5);
        }
        if (templateVoiceSeparate.audioMode != null) {
            String s6 = ProtectedSandApp.s("䡉\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateVoiceSeparate.audioMode, xmlSerializer, "", s6);
        }
        TemplateVoiceSeparate.AudioConfig audioConfig = templateVoiceSeparate.audioConfig;
        if (audioConfig != null) {
            QCloudXml.toXml(xmlSerializer, audioConfig, ProtectedSandApp.s("䡊\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
