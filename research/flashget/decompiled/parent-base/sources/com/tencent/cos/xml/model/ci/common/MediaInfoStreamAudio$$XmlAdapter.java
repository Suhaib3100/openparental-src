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
public class MediaInfoStreamAudio$$XmlAdapter extends IXmlAdapter<MediaInfoStreamAudio> {
    private HashMap<String, ChildElementBinder<MediaInfoStreamAudio>> childElementBinders;

    public MediaInfoStreamAudio$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfoStreamAudio>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䈟\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.index = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈠\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.codecName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈡\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.codecLongName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈢\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.codecTimeBase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈣\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.codecTagString = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈤\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.codecTag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈥\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.sampleFmt = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈦\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.sampleRate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈧\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.channel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈨\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.channelLayout = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈩\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.timebase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈪\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈫\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.duration = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈬\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈭\u0001"), new ChildElementBinder<MediaInfoStreamAudio>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamAudio$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamAudio.language = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfoStreamAudio fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfoStreamAudio mediaInfoStreamAudio = new MediaInfoStreamAudio();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfoStreamAudio> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaInfoStreamAudio, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䈮\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaInfoStreamAudio;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfoStreamAudio;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfoStreamAudio mediaInfoStreamAudio, String str) throws IOException, XmlPullParserException {
        if (mediaInfoStreamAudio == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䈮\u0001");
        }
        xmlSerializer.startTag("", str);
        if (mediaInfoStreamAudio.index != null) {
            String s4 = ProtectedSandApp.s("䈟\u0001");
            xmlSerializer.startTag("", s4);
            a.a(mediaInfoStreamAudio.index, xmlSerializer, "", s4);
        }
        if (mediaInfoStreamAudio.codecName != null) {
            String s5 = ProtectedSandApp.s("䈠\u0001");
            xmlSerializer.startTag("", s5);
            a.a(mediaInfoStreamAudio.codecName, xmlSerializer, "", s5);
        }
        if (mediaInfoStreamAudio.codecLongName != null) {
            String s6 = ProtectedSandApp.s("䈡\u0001");
            xmlSerializer.startTag("", s6);
            a.a(mediaInfoStreamAudio.codecLongName, xmlSerializer, "", s6);
        }
        if (mediaInfoStreamAudio.codecTimeBase != null) {
            String s7 = ProtectedSandApp.s("䈢\u0001");
            xmlSerializer.startTag("", s7);
            a.a(mediaInfoStreamAudio.codecTimeBase, xmlSerializer, "", s7);
        }
        if (mediaInfoStreamAudio.codecTagString != null) {
            String s10 = ProtectedSandApp.s("䈣\u0001");
            xmlSerializer.startTag("", s10);
            a.a(mediaInfoStreamAudio.codecTagString, xmlSerializer, "", s10);
        }
        if (mediaInfoStreamAudio.codecTag != null) {
            String s11 = ProtectedSandApp.s("䈤\u0001");
            xmlSerializer.startTag("", s11);
            a.a(mediaInfoStreamAudio.codecTag, xmlSerializer, "", s11);
        }
        if (mediaInfoStreamAudio.sampleFmt != null) {
            String s12 = ProtectedSandApp.s("䈥\u0001");
            xmlSerializer.startTag("", s12);
            a.a(mediaInfoStreamAudio.sampleFmt, xmlSerializer, "", s12);
        }
        if (mediaInfoStreamAudio.sampleRate != null) {
            String s13 = ProtectedSandApp.s("䈦\u0001");
            xmlSerializer.startTag("", s13);
            a.a(mediaInfoStreamAudio.sampleRate, xmlSerializer, "", s13);
        }
        if (mediaInfoStreamAudio.channel != null) {
            String s14 = ProtectedSandApp.s("䈧\u0001");
            xmlSerializer.startTag("", s14);
            a.a(mediaInfoStreamAudio.channel, xmlSerializer, "", s14);
        }
        if (mediaInfoStreamAudio.channelLayout != null) {
            String s15 = ProtectedSandApp.s("䈨\u0001");
            xmlSerializer.startTag("", s15);
            a.a(mediaInfoStreamAudio.channelLayout, xmlSerializer, "", s15);
        }
        if (mediaInfoStreamAudio.timebase != null) {
            String s16 = ProtectedSandApp.s("䈩\u0001");
            xmlSerializer.startTag("", s16);
            a.a(mediaInfoStreamAudio.timebase, xmlSerializer, "", s16);
        }
        if (mediaInfoStreamAudio.startTime != null) {
            String s17 = ProtectedSandApp.s("䈪\u0001");
            xmlSerializer.startTag("", s17);
            a.a(mediaInfoStreamAudio.startTime, xmlSerializer, "", s17);
        }
        if (mediaInfoStreamAudio.duration != null) {
            String s18 = ProtectedSandApp.s("䈫\u0001");
            xmlSerializer.startTag("", s18);
            a.a(mediaInfoStreamAudio.duration, xmlSerializer, "", s18);
        }
        if (mediaInfoStreamAudio.bitrate != null) {
            String s19 = ProtectedSandApp.s("䈬\u0001");
            xmlSerializer.startTag("", s19);
            a.a(mediaInfoStreamAudio.bitrate, xmlSerializer, "", s19);
        }
        if (mediaInfoStreamAudio.language != null) {
            String s20 = ProtectedSandApp.s("䈭\u0001");
            xmlSerializer.startTag("", s20);
            a.a(mediaInfoStreamAudio.language, xmlSerializer, "", s20);
        }
        xmlSerializer.endTag("", str);
    }
}
