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
public class MediaInfoFormat$$XmlAdapter extends IXmlAdapter<MediaInfoFormat> {
    private HashMap<String, ChildElementBinder<MediaInfoFormat>> childElementBinders;

    public MediaInfoFormat$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfoFormat>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䈌\u0001"), new ChildElementBinder<MediaInfoFormat>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoFormat$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoFormat.numStream = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈍\u0001"), new ChildElementBinder<MediaInfoFormat>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoFormat$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoFormat.numProgram = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈎\u0001"), new ChildElementBinder<MediaInfoFormat>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoFormat$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoFormat.formatName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈏\u0001"), new ChildElementBinder<MediaInfoFormat>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoFormat$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoFormat.formatLongName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈐\u0001"), new ChildElementBinder<MediaInfoFormat>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoFormat$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoFormat.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈑\u0001"), new ChildElementBinder<MediaInfoFormat>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoFormat$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoFormat.duration = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈒\u0001"), new ChildElementBinder<MediaInfoFormat>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoFormat$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoFormat.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈓\u0001"), new ChildElementBinder<MediaInfoFormat>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoFormat$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoFormat.size = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfoFormat fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfoFormat mediaInfoFormat = new MediaInfoFormat();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfoFormat> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaInfoFormat, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䈔\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaInfoFormat;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfoFormat;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfoFormat mediaInfoFormat, String str) throws IOException, XmlPullParserException {
        if (mediaInfoFormat == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䈔\u0001");
        }
        xmlSerializer.startTag("", str);
        if (mediaInfoFormat.numStream != null) {
            String s4 = ProtectedSandApp.s("䈌\u0001");
            xmlSerializer.startTag("", s4);
            a.a(mediaInfoFormat.numStream, xmlSerializer, "", s4);
        }
        if (mediaInfoFormat.numProgram != null) {
            String s5 = ProtectedSandApp.s("䈍\u0001");
            xmlSerializer.startTag("", s5);
            a.a(mediaInfoFormat.numProgram, xmlSerializer, "", s5);
        }
        if (mediaInfoFormat.formatName != null) {
            String s6 = ProtectedSandApp.s("䈎\u0001");
            xmlSerializer.startTag("", s6);
            a.a(mediaInfoFormat.formatName, xmlSerializer, "", s6);
        }
        if (mediaInfoFormat.formatLongName != null) {
            String s7 = ProtectedSandApp.s("䈏\u0001");
            xmlSerializer.startTag("", s7);
            a.a(mediaInfoFormat.formatLongName, xmlSerializer, "", s7);
        }
        if (mediaInfoFormat.startTime != null) {
            String s10 = ProtectedSandApp.s("䈐\u0001");
            xmlSerializer.startTag("", s10);
            a.a(mediaInfoFormat.startTime, xmlSerializer, "", s10);
        }
        if (mediaInfoFormat.duration != null) {
            String s11 = ProtectedSandApp.s("䈑\u0001");
            xmlSerializer.startTag("", s11);
            a.a(mediaInfoFormat.duration, xmlSerializer, "", s11);
        }
        if (mediaInfoFormat.bitrate != null) {
            String s12 = ProtectedSandApp.s("䈒\u0001");
            xmlSerializer.startTag("", s12);
            a.a(mediaInfoFormat.bitrate, xmlSerializer, "", s12);
        }
        if (mediaInfoFormat.size != null) {
            String s13 = ProtectedSandApp.s("䈓\u0001");
            xmlSerializer.startTag("", s13);
            a.a(mediaInfoFormat.size, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
