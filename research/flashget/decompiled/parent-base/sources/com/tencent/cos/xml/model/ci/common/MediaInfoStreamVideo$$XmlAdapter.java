package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class MediaInfoStreamVideo$$XmlAdapter extends IXmlAdapter<MediaInfoStreamVideo> {
    private HashMap<String, ChildElementBinder<MediaInfoStreamVideo>> childElementBinders;

    public MediaInfoStreamVideo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfoStreamVideo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䈲\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.index = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈳\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.codecName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈴\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.codecLongName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈵\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.codecTimeBase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈶\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.codecTagString = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈷\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.codecTag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈸\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.colorPrimaries = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈹\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.colorRange = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈺\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.colorTransfer = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈻\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.profile = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈼\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈽\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈾\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.hasBFrame = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈿\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.refFrames = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉀\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.sar = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉁\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.dar = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉂\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.pixFormat = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉃\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.fieldOrder = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉄\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.level = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉅\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.20
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.fps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉆\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.21
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.avgFps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉇\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.22
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.timebase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉈\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.23
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉉\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.24
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.duration = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉊\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.25
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉋\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.26
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.numFrames = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉌\u0001"), new ChildElementBinder<MediaInfoStreamVideo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamVideo$$XmlAdapter.27
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamVideo.language = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfoStreamVideo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfoStreamVideo mediaInfoStreamVideo = new MediaInfoStreamVideo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfoStreamVideo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaInfoStreamVideo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䉍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaInfoStreamVideo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfoStreamVideo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfoStreamVideo mediaInfoStreamVideo, String str) throws IOException, XmlPullParserException {
        if (mediaInfoStreamVideo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䉍\u0001");
        }
        xmlSerializer.startTag("", str);
        if (mediaInfoStreamVideo.index != null) {
            String s4 = ProtectedSandApp.s("䈲\u0001");
            xmlSerializer.startTag("", s4);
            a.a(mediaInfoStreamVideo.index, xmlSerializer, "", s4);
        }
        if (mediaInfoStreamVideo.codecName != null) {
            String s5 = ProtectedSandApp.s("䈳\u0001");
            xmlSerializer.startTag("", s5);
            a.a(mediaInfoStreamVideo.codecName, xmlSerializer, "", s5);
        }
        if (mediaInfoStreamVideo.codecLongName != null) {
            String s6 = ProtectedSandApp.s("䈴\u0001");
            xmlSerializer.startTag("", s6);
            a.a(mediaInfoStreamVideo.codecLongName, xmlSerializer, "", s6);
        }
        if (mediaInfoStreamVideo.codecTimeBase != null) {
            String s7 = ProtectedSandApp.s("䈵\u0001");
            xmlSerializer.startTag("", s7);
            a.a(mediaInfoStreamVideo.codecTimeBase, xmlSerializer, "", s7);
        }
        if (mediaInfoStreamVideo.codecTagString != null) {
            String s10 = ProtectedSandApp.s("䈶\u0001");
            xmlSerializer.startTag("", s10);
            a.a(mediaInfoStreamVideo.codecTagString, xmlSerializer, "", s10);
        }
        if (mediaInfoStreamVideo.codecTag != null) {
            String s11 = ProtectedSandApp.s("䈷\u0001");
            xmlSerializer.startTag("", s11);
            a.a(mediaInfoStreamVideo.codecTag, xmlSerializer, "", s11);
        }
        if (mediaInfoStreamVideo.colorPrimaries != null) {
            String s12 = ProtectedSandApp.s("䈸\u0001");
            xmlSerializer.startTag("", s12);
            a.a(mediaInfoStreamVideo.colorPrimaries, xmlSerializer, "", s12);
        }
        if (mediaInfoStreamVideo.colorRange != null) {
            String s13 = ProtectedSandApp.s("䈹\u0001");
            xmlSerializer.startTag("", s13);
            a.a(mediaInfoStreamVideo.colorRange, xmlSerializer, "", s13);
        }
        if (mediaInfoStreamVideo.colorTransfer != null) {
            String s14 = ProtectedSandApp.s("䈺\u0001");
            xmlSerializer.startTag("", s14);
            a.a(mediaInfoStreamVideo.colorTransfer, xmlSerializer, "", s14);
        }
        if (mediaInfoStreamVideo.profile != null) {
            String s15 = ProtectedSandApp.s("䈻\u0001");
            xmlSerializer.startTag("", s15);
            a.a(mediaInfoStreamVideo.profile, xmlSerializer, "", s15);
        }
        if (mediaInfoStreamVideo.height != null) {
            String s16 = ProtectedSandApp.s("䈼\u0001");
            xmlSerializer.startTag("", s16);
            a.a(mediaInfoStreamVideo.height, xmlSerializer, "", s16);
        }
        if (mediaInfoStreamVideo.width != null) {
            String s17 = ProtectedSandApp.s("䈽\u0001");
            xmlSerializer.startTag("", s17);
            a.a(mediaInfoStreamVideo.width, xmlSerializer, "", s17);
        }
        if (mediaInfoStreamVideo.hasBFrame != null) {
            String s18 = ProtectedSandApp.s("䈾\u0001");
            xmlSerializer.startTag("", s18);
            a.a(mediaInfoStreamVideo.hasBFrame, xmlSerializer, "", s18);
        }
        if (mediaInfoStreamVideo.refFrames != null) {
            String s19 = ProtectedSandApp.s("䈿\u0001");
            xmlSerializer.startTag("", s19);
            a.a(mediaInfoStreamVideo.refFrames, xmlSerializer, "", s19);
        }
        if (mediaInfoStreamVideo.sar != null) {
            String s20 = ProtectedSandApp.s("䉀\u0001");
            xmlSerializer.startTag("", s20);
            a.a(mediaInfoStreamVideo.sar, xmlSerializer, "", s20);
        }
        if (mediaInfoStreamVideo.dar != null) {
            String s21 = ProtectedSandApp.s("䉁\u0001");
            xmlSerializer.startTag("", s21);
            a.a(mediaInfoStreamVideo.dar, xmlSerializer, "", s21);
        }
        if (mediaInfoStreamVideo.pixFormat != null) {
            String s22 = ProtectedSandApp.s("䉂\u0001");
            xmlSerializer.startTag("", s22);
            a.a(mediaInfoStreamVideo.pixFormat, xmlSerializer, "", s22);
        }
        if (mediaInfoStreamVideo.fieldOrder != null) {
            String s23 = ProtectedSandApp.s("䉃\u0001");
            xmlSerializer.startTag("", s23);
            a.a(mediaInfoStreamVideo.fieldOrder, xmlSerializer, "", s23);
        }
        if (mediaInfoStreamVideo.level != null) {
            String s24 = ProtectedSandApp.s("䉄\u0001");
            xmlSerializer.startTag("", s24);
            a.a(mediaInfoStreamVideo.level, xmlSerializer, "", s24);
        }
        if (mediaInfoStreamVideo.fps != null) {
            String s25 = ProtectedSandApp.s("䉅\u0001");
            xmlSerializer.startTag("", s25);
            a.a(mediaInfoStreamVideo.fps, xmlSerializer, "", s25);
        }
        if (mediaInfoStreamVideo.avgFps != null) {
            String s26 = ProtectedSandApp.s("䉆\u0001");
            xmlSerializer.startTag("", s26);
            a.a(mediaInfoStreamVideo.avgFps, xmlSerializer, "", s26);
        }
        if (mediaInfoStreamVideo.timebase != null) {
            xmlSerializer.startTag("", ProtectedSandApp.s("䉇\u0001"));
            a.a(mediaInfoStreamVideo.timebase, xmlSerializer, "", ProtectedSandApp.s("䉇\u0001"));
        }
        if (mediaInfoStreamVideo.startTime != null) {
            xmlSerializer.startTag("", ProtectedSandApp.s("䉈\u0001"));
            a.a(mediaInfoStreamVideo.startTime, xmlSerializer, "", ProtectedSandApp.s("䉈\u0001"));
        }
        if (mediaInfoStreamVideo.duration != null) {
            xmlSerializer.startTag("", ProtectedSandApp.s("䉉\u0001"));
            a.a(mediaInfoStreamVideo.duration, xmlSerializer, "", ProtectedSandApp.s("䉉\u0001"));
        }
        if (mediaInfoStreamVideo.bitrate != null) {
            xmlSerializer.startTag("", ProtectedSandApp.s("䉊\u0001"));
            a.a(mediaInfoStreamVideo.bitrate, xmlSerializer, "", ProtectedSandApp.s("䉊\u0001"));
        }
        if (mediaInfoStreamVideo.numFrames != null) {
            xmlSerializer.startTag("", ProtectedSandApp.s("䉋\u0001"));
            a.a(mediaInfoStreamVideo.numFrames, xmlSerializer, "", ProtectedSandApp.s("䉋\u0001"));
        }
        if (mediaInfoStreamVideo.language != null) {
            xmlSerializer.startTag("", ProtectedSandApp.s("䉌\u0001"));
            a.a(mediaInfoStreamVideo.language, xmlSerializer, "", ProtectedSandApp.s("䉌\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
