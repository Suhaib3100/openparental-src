package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SpeechRecognition$$XmlAdapter extends IXmlAdapter<SpeechRecognition> {
    private HashMap<String, ChildElementBinder<SpeechRecognition>> childElementBinders;

    public SpeechRecognition$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechRecognition>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䀸\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.engineModelType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀹\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.channelNum = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀺\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.resTextFormat = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀻\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.filterDirty = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀼\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.filterModal = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀽\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.convertNumMode = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀾\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.speakerDiarization = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀿\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.speakerNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䁀\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.filterPunc = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䁁\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.outputFileType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䁂\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.flashAsr = Boolean.parseBoolean(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䁃\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䁄\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.firstChannelOnly = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䁅\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechRecognition$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                speechRecognition.wordInfo = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechRecognition fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechRecognition speechRecognition = new SpeechRecognition();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechRecognition> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, speechRecognition, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䁆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return speechRecognition;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return speechRecognition;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
        if (speechRecognition == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䁆\u0001");
        }
        xmlSerializer.startTag("", str);
        if (speechRecognition.engineModelType != null) {
            String s4 = ProtectedSandApp.s("䀸\u0001");
            xmlSerializer.startTag("", s4);
            com.tencent.cos.xml.model.ci.ai.a.a(speechRecognition.engineModelType, xmlSerializer, "", s4);
        }
        String s5 = ProtectedSandApp.s("䀹\u0001");
        xmlSerializer.startTag("", s5);
        c.a(speechRecognition.channelNum, xmlSerializer, "", s5);
        String s6 = ProtectedSandApp.s("䀺\u0001");
        xmlSerializer.startTag("", s6);
        c.a(speechRecognition.resTextFormat, xmlSerializer, "", s6);
        String s7 = ProtectedSandApp.s("䀻\u0001");
        xmlSerializer.startTag("", s7);
        c.a(speechRecognition.filterDirty, xmlSerializer, "", s7);
        String s10 = ProtectedSandApp.s("䀼\u0001");
        xmlSerializer.startTag("", s10);
        c.a(speechRecognition.filterModal, xmlSerializer, "", s10);
        String s11 = ProtectedSandApp.s("䀽\u0001");
        xmlSerializer.startTag("", s11);
        c.a(speechRecognition.convertNumMode, xmlSerializer, "", s11);
        String s12 = ProtectedSandApp.s("䀾\u0001");
        xmlSerializer.startTag("", s12);
        c.a(speechRecognition.speakerDiarization, xmlSerializer, "", s12);
        String s13 = ProtectedSandApp.s("䀿\u0001");
        xmlSerializer.startTag("", s13);
        c.a(speechRecognition.speakerNumber, xmlSerializer, "", s13);
        String s14 = ProtectedSandApp.s("䁀\u0001");
        xmlSerializer.startTag("", s14);
        c.a(speechRecognition.filterPunc, xmlSerializer, "", s14);
        if (speechRecognition.outputFileType != null) {
            String s15 = ProtectedSandApp.s("䁁\u0001");
            xmlSerializer.startTag("", s15);
            com.tencent.cos.xml.model.ci.ai.a.a(speechRecognition.outputFileType, xmlSerializer, "", s15);
        }
        String s16 = ProtectedSandApp.s("䁂\u0001");
        xmlSerializer.startTag("", s16);
        xmlSerializer.text(String.valueOf(speechRecognition.flashAsr));
        xmlSerializer.endTag("", s16);
        if (speechRecognition.format != null) {
            String s17 = ProtectedSandApp.s("䁃\u0001");
            xmlSerializer.startTag("", s17);
            com.tencent.cos.xml.model.ci.ai.a.a(speechRecognition.format, xmlSerializer, "", s17);
        }
        String s18 = ProtectedSandApp.s("䁄\u0001");
        xmlSerializer.startTag("", s18);
        c.a(speechRecognition.firstChannelOnly, xmlSerializer, "", s18);
        String s19 = ProtectedSandApp.s("䁅\u0001");
        xmlSerializer.startTag("", s19);
        c.a(speechRecognition.wordInfo, xmlSerializer, "", s19);
        xmlSerializer.endTag("", str);
    }
}
