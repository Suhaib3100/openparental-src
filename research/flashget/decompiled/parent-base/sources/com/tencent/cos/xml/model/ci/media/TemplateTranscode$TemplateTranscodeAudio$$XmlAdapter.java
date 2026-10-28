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
public class TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter extends IXmlAdapter<TemplateTranscode.TemplateTranscodeAudio> {
    private HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>> childElementBinders;

    public TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䞱\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeAudio.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞲\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeAudio.samplerate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞳\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeAudio.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞴\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeAudio.channels = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞵\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeAudio.remove = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞶\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeAudio.keepTwoTracks = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞷\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeAudio.switchTrack = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞸\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeAudio$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeAudio.sampleFormat = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscode.TemplateTranscodeAudio fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio = new TemplateTranscode.TemplateTranscodeAudio();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscode.TemplateTranscodeAudio> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeAudio, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䞹\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeAudio;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeAudio;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio, String str) throws IOException, XmlPullParserException {
        if (templateTranscodeAudio == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䞹\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateTranscodeAudio.codec != null) {
            String s4 = ProtectedSandApp.s("䞱\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateTranscodeAudio.codec, xmlSerializer, "", s4);
        }
        if (templateTranscodeAudio.samplerate != null) {
            String s5 = ProtectedSandApp.s("䞲\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateTranscodeAudio.samplerate, xmlSerializer, "", s5);
        }
        if (templateTranscodeAudio.bitrate != null) {
            String s6 = ProtectedSandApp.s("䞳\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateTranscodeAudio.bitrate, xmlSerializer, "", s6);
        }
        if (templateTranscodeAudio.channels != null) {
            String s7 = ProtectedSandApp.s("䞴\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateTranscodeAudio.channels, xmlSerializer, "", s7);
        }
        if (templateTranscodeAudio.remove != null) {
            String s10 = ProtectedSandApp.s("䞵\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateTranscodeAudio.remove, xmlSerializer, "", s10);
        }
        if (templateTranscodeAudio.keepTwoTracks != null) {
            String s11 = ProtectedSandApp.s("䞶\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateTranscodeAudio.keepTwoTracks, xmlSerializer, "", s11);
        }
        if (templateTranscodeAudio.switchTrack != null) {
            String s12 = ProtectedSandApp.s("䞷\u0001");
            xmlSerializer.startTag("", s12);
            a.a(templateTranscodeAudio.switchTrack, xmlSerializer, "", s12);
        }
        if (templateTranscodeAudio.sampleFormat != null) {
            String s13 = ProtectedSandApp.s("䞸\u0001");
            xmlSerializer.startTag("", s13);
            a.a(templateTranscodeAudio.sampleFormat, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
