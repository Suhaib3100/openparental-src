package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateTranscode$$XmlAdapter extends IXmlAdapter<TemplateTranscode> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateTranscode templateTranscode, String str) throws IOException, XmlPullParserException {
        if (templateTranscode == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䞨\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateTranscode.tag != null) {
            String s4 = ProtectedSandApp.s("䞩\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateTranscode.tag, xmlSerializer, "", s4);
        }
        if (templateTranscode.name != null) {
            String s5 = ProtectedSandApp.s("䞪\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateTranscode.name, xmlSerializer, "", s5);
        }
        TemplateTranscode.TemplateTranscodeContainer templateTranscodeContainer = templateTranscode.container;
        if (templateTranscodeContainer != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeContainer, ProtectedSandApp.s("䞫\u0001"));
        }
        TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo = templateTranscode.video;
        if (templateTranscodeVideo != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeVideo, ProtectedSandApp.s("䞬\u0001"));
        }
        TemplateTranscode.TemplateTranscodeTimeInterval templateTranscodeTimeInterval = templateTranscode.timeInterval;
        if (templateTranscodeTimeInterval != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeTimeInterval, ProtectedSandApp.s("䞭\u0001"));
        }
        TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio = templateTranscode.audio;
        if (templateTranscodeAudio != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeAudio, ProtectedSandApp.s("䞮\u0001"));
        }
        TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig = templateTranscode.transConfig;
        if (templateTranscodeTransConfig != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeTransConfig, ProtectedSandApp.s("䞯\u0001"));
        }
        AudioMix audioMix = templateTranscode.audioMix;
        String s6 = ProtectedSandApp.s("䞰\u0001");
        if (audioMix != null) {
            QCloudXml.toXml(xmlSerializer, audioMix, s6);
        }
        if (templateTranscode.audioMixArray != null) {
            for (int i4 = 0; i4 < templateTranscode.audioMixArray.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, templateTranscode.audioMixArray.get(i4), s6);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
