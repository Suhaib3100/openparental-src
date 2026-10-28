package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter extends IXmlAdapter<TemplateTranscode.TemplateTranscodeVideo> {
    private HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>> childElementBinders;

    public TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䟚\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟛\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟜\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟝\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.fps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟞\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.remove = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟟\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.profile = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟠\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟡\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.crf = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟢\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.gop = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟣\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.preset = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟤\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.bufsize = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟥\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.maxrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟦\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.pixfmt = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟧\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.longShortMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟨\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.rotate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟩\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.roi = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟪\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.crop = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟫\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeVideo$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeVideo.interlaced = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscode.TemplateTranscodeVideo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo = new TemplateTranscode.TemplateTranscodeVideo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscode.TemplateTranscodeVideo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeVideo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䟬\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeVideo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeVideo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo, String str) throws IOException, XmlPullParserException {
        if (templateTranscodeVideo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䟬\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateTranscodeVideo.codec != null) {
            String s4 = ProtectedSandApp.s("䟚\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateTranscodeVideo.codec, xmlSerializer, "", s4);
        }
        if (templateTranscodeVideo.width != null) {
            String s5 = ProtectedSandApp.s("䟛\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateTranscodeVideo.width, xmlSerializer, "", s5);
        }
        if (templateTranscodeVideo.height != null) {
            String s6 = ProtectedSandApp.s("䟜\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateTranscodeVideo.height, xmlSerializer, "", s6);
        }
        if (templateTranscodeVideo.fps != null) {
            String s7 = ProtectedSandApp.s("䟝\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateTranscodeVideo.fps, xmlSerializer, "", s7);
        }
        if (templateTranscodeVideo.remove != null) {
            String s10 = ProtectedSandApp.s("䟞\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateTranscodeVideo.remove, xmlSerializer, "", s10);
        }
        if (templateTranscodeVideo.profile != null) {
            String s11 = ProtectedSandApp.s("䟟\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateTranscodeVideo.profile, xmlSerializer, "", s11);
        }
        if (templateTranscodeVideo.bitrate != null) {
            String s12 = ProtectedSandApp.s("䟠\u0001");
            xmlSerializer.startTag("", s12);
            a.a(templateTranscodeVideo.bitrate, xmlSerializer, "", s12);
        }
        if (templateTranscodeVideo.crf != null) {
            String s13 = ProtectedSandApp.s("䟡\u0001");
            xmlSerializer.startTag("", s13);
            a.a(templateTranscodeVideo.crf, xmlSerializer, "", s13);
        }
        if (templateTranscodeVideo.gop != null) {
            String s14 = ProtectedSandApp.s("䟢\u0001");
            xmlSerializer.startTag("", s14);
            a.a(templateTranscodeVideo.gop, xmlSerializer, "", s14);
        }
        if (templateTranscodeVideo.preset != null) {
            String s15 = ProtectedSandApp.s("䟣\u0001");
            xmlSerializer.startTag("", s15);
            a.a(templateTranscodeVideo.preset, xmlSerializer, "", s15);
        }
        if (templateTranscodeVideo.bufsize != null) {
            String s16 = ProtectedSandApp.s("䟤\u0001");
            xmlSerializer.startTag("", s16);
            a.a(templateTranscodeVideo.bufsize, xmlSerializer, "", s16);
        }
        if (templateTranscodeVideo.maxrate != null) {
            String s17 = ProtectedSandApp.s("䟥\u0001");
            xmlSerializer.startTag("", s17);
            a.a(templateTranscodeVideo.maxrate, xmlSerializer, "", s17);
        }
        if (templateTranscodeVideo.pixfmt != null) {
            String s18 = ProtectedSandApp.s("䟦\u0001");
            xmlSerializer.startTag("", s18);
            a.a(templateTranscodeVideo.pixfmt, xmlSerializer, "", s18);
        }
        if (templateTranscodeVideo.longShortMode != null) {
            String s19 = ProtectedSandApp.s("䟧\u0001");
            xmlSerializer.startTag("", s19);
            a.a(templateTranscodeVideo.longShortMode, xmlSerializer, "", s19);
        }
        if (templateTranscodeVideo.rotate != null) {
            String s20 = ProtectedSandApp.s("䟨\u0001");
            xmlSerializer.startTag("", s20);
            a.a(templateTranscodeVideo.rotate, xmlSerializer, "", s20);
        }
        if (templateTranscodeVideo.roi != null) {
            String s21 = ProtectedSandApp.s("䟩\u0001");
            xmlSerializer.startTag("", s21);
            a.a(templateTranscodeVideo.roi, xmlSerializer, "", s21);
        }
        if (templateTranscodeVideo.crop != null) {
            String s22 = ProtectedSandApp.s("䟪\u0001");
            xmlSerializer.startTag("", s22);
            a.a(templateTranscodeVideo.crop, xmlSerializer, "", s22);
        }
        if (templateTranscodeVideo.interlaced != null) {
            String s23 = ProtectedSandApp.s("䟫\u0001");
            xmlSerializer.startTag("", s23);
            a.a(templateTranscodeVideo.interlaced, xmlSerializer, "", s23);
        }
        xmlSerializer.endTag("", str);
    }
}
