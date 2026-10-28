package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontage;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateVideoMontage$$XmlAdapter extends IXmlAdapter<TemplateVideoMontage> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateVideoMontage templateVideoMontage, String str) throws IOException, XmlPullParserException {
        if (templateVideoMontage == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䠐\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateVideoMontage.tag != null) {
            String s4 = ProtectedSandApp.s("䠑\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateVideoMontage.tag, xmlSerializer, "", s4);
        }
        if (templateVideoMontage.name != null) {
            String s5 = ProtectedSandApp.s("䠒\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateVideoMontage.name, xmlSerializer, "", s5);
        }
        if (templateVideoMontage.duration != null) {
            String s6 = ProtectedSandApp.s("䠓\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateVideoMontage.duration, xmlSerializer, "", s6);
        }
        TemplateVideoMontage.TemplateVideoMontageContainer templateVideoMontageContainer = templateVideoMontage.container;
        if (templateVideoMontageContainer != null) {
            QCloudXml.toXml(xmlSerializer, templateVideoMontageContainer, ProtectedSandApp.s("䠔\u0001"));
        }
        TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo = templateVideoMontage.video;
        if (templateVideoMontageVideo != null) {
            QCloudXml.toXml(xmlSerializer, templateVideoMontageVideo, ProtectedSandApp.s("䠕\u0001"));
        }
        TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio = templateVideoMontage.audio;
        if (templateVideoMontageAudio != null) {
            QCloudXml.toXml(xmlSerializer, templateVideoMontageAudio, ProtectedSandApp.s("䠖\u0001"));
        }
        if (templateVideoMontage.scene != null) {
            String s7 = ProtectedSandApp.s("䠗\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateVideoMontage.scene, xmlSerializer, "", s7);
        }
        AudioMix audioMix = templateVideoMontage.audioMix;
        String s10 = ProtectedSandApp.s("䠘\u0001");
        if (audioMix != null) {
            QCloudXml.toXml(xmlSerializer, audioMix, s10);
        }
        if (templateVideoMontage.audioMixArray != null) {
            for (int i4 = 0; i4 < templateVideoMontage.audioMixArray.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, templateVideoMontage.audioMixArray.get(i4), s10);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
