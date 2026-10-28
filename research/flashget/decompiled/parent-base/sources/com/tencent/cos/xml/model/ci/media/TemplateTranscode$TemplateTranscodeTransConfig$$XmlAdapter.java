package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter extends IXmlAdapter<TemplateTranscode.TemplateTranscodeTransConfig> {
    private HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>> childElementBinders;

    public TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䟋\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.adjDarMethod = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟌\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.isCheckReso = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟍\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.resoAdjMethod = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟎\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.isCheckVideoBitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟏\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.videoBitrateAdjMethod = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟐\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.isCheckAudioBitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟑\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.audioBitrateAdjMethod = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟒\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.isCheckVideoFps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟓\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.videoFpsAdjMethod = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟔\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.deleteMetadata = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟕\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.isHdr2Sdr = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟖\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTransConfig.transcodeIndex = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟗\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                templateTranscodeTransConfig.hlsEncrypt = (TemplateTranscode.TemplateTranscodeHlsEncrypt) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeHlsEncrypt.class, ProtectedSandApp.s("䟉\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟘\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTransConfig$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
                templateTranscodeTransConfig.dashEncrypt = (TemplateTranscode.TemplateTranscodeDashEncrypt) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeDashEncrypt.class, ProtectedSandApp.s("䟊\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscode.TemplateTranscodeTransConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig = new TemplateTranscode.TemplateTranscodeTransConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscode.TemplateTranscodeTransConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeTransConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䟙\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeTransConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeTransConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig, String str) throws IOException, XmlPullParserException {
        if (templateTranscodeTransConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䟙\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateTranscodeTransConfig.adjDarMethod != null) {
            String s4 = ProtectedSandApp.s("䟋\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateTranscodeTransConfig.adjDarMethod, xmlSerializer, "", s4);
        }
        if (templateTranscodeTransConfig.isCheckReso != null) {
            String s5 = ProtectedSandApp.s("䟌\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateTranscodeTransConfig.isCheckReso, xmlSerializer, "", s5);
        }
        if (templateTranscodeTransConfig.resoAdjMethod != null) {
            String s6 = ProtectedSandApp.s("䟍\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateTranscodeTransConfig.resoAdjMethod, xmlSerializer, "", s6);
        }
        if (templateTranscodeTransConfig.isCheckVideoBitrate != null) {
            String s7 = ProtectedSandApp.s("䟎\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateTranscodeTransConfig.isCheckVideoBitrate, xmlSerializer, "", s7);
        }
        if (templateTranscodeTransConfig.videoBitrateAdjMethod != null) {
            String s10 = ProtectedSandApp.s("䟏\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateTranscodeTransConfig.videoBitrateAdjMethod, xmlSerializer, "", s10);
        }
        if (templateTranscodeTransConfig.isCheckAudioBitrate != null) {
            String s11 = ProtectedSandApp.s("䟐\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateTranscodeTransConfig.isCheckAudioBitrate, xmlSerializer, "", s11);
        }
        if (templateTranscodeTransConfig.audioBitrateAdjMethod != null) {
            String s12 = ProtectedSandApp.s("䟑\u0001");
            xmlSerializer.startTag("", s12);
            a.a(templateTranscodeTransConfig.audioBitrateAdjMethod, xmlSerializer, "", s12);
        }
        if (templateTranscodeTransConfig.isCheckVideoFps != null) {
            String s13 = ProtectedSandApp.s("䟒\u0001");
            xmlSerializer.startTag("", s13);
            a.a(templateTranscodeTransConfig.isCheckVideoFps, xmlSerializer, "", s13);
        }
        if (templateTranscodeTransConfig.videoFpsAdjMethod != null) {
            String s14 = ProtectedSandApp.s("䟓\u0001");
            xmlSerializer.startTag("", s14);
            a.a(templateTranscodeTransConfig.videoFpsAdjMethod, xmlSerializer, "", s14);
        }
        if (templateTranscodeTransConfig.deleteMetadata != null) {
            String s15 = ProtectedSandApp.s("䟔\u0001");
            xmlSerializer.startTag("", s15);
            a.a(templateTranscodeTransConfig.deleteMetadata, xmlSerializer, "", s15);
        }
        if (templateTranscodeTransConfig.isHdr2Sdr != null) {
            String s16 = ProtectedSandApp.s("䟕\u0001");
            xmlSerializer.startTag("", s16);
            a.a(templateTranscodeTransConfig.isHdr2Sdr, xmlSerializer, "", s16);
        }
        if (templateTranscodeTransConfig.transcodeIndex != null) {
            String s17 = ProtectedSandApp.s("䟖\u0001");
            xmlSerializer.startTag("", s17);
            a.a(templateTranscodeTransConfig.transcodeIndex, xmlSerializer, "", s17);
        }
        TemplateTranscode.TemplateTranscodeHlsEncrypt templateTranscodeHlsEncrypt = templateTranscodeTransConfig.hlsEncrypt;
        if (templateTranscodeHlsEncrypt != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeHlsEncrypt, ProtectedSandApp.s("䟗\u0001"));
        }
        TemplateTranscode.TemplateTranscodeDashEncrypt templateTranscodeDashEncrypt = templateTranscodeTransConfig.dashEncrypt;
        if (templateTranscodeDashEncrypt != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeDashEncrypt, ProtectedSandApp.s("䟘\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
