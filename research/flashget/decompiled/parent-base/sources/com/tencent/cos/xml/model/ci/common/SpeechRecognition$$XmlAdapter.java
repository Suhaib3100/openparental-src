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
public class SpeechRecognition$$XmlAdapter extends IXmlAdapter<SpeechRecognition> {
    private HashMap<String, ChildElementBinder<SpeechRecognition>> childElementBinders;

    public SpeechRecognition$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechRecognition>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䉵\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.flashAsr = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉶\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.engineModelType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉷\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.channelNum = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉸\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.resTextFormat = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉹\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.filterDirty = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉺\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.filterModal = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉻\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.convertNumMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉼\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.speakerDiarization = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉽\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.speakerNumber = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉾\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.filterPunc = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉿\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.outputFileType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊀\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊁\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.firstChannelOnly = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊂\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.wordInfo = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊃\u0001"), new ChildElementBinder<SpeechRecognition>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognition$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognition speechRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognition.sentenceMaxLength = xmlPullParser.getText();
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
                if ((str == null ? ProtectedSandApp.s("䊄\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
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
            str = ProtectedSandApp.s("䊄\u0001");
        }
        xmlSerializer.startTag("", str);
        if (speechRecognition.flashAsr != null) {
            String s4 = ProtectedSandApp.s("䉵\u0001");
            xmlSerializer.startTag("", s4);
            a.a(speechRecognition.flashAsr, xmlSerializer, "", s4);
        }
        if (speechRecognition.engineModelType != null) {
            String s5 = ProtectedSandApp.s("䉶\u0001");
            xmlSerializer.startTag("", s5);
            a.a(speechRecognition.engineModelType, xmlSerializer, "", s5);
        }
        if (speechRecognition.channelNum != null) {
            String s6 = ProtectedSandApp.s("䉷\u0001");
            xmlSerializer.startTag("", s6);
            a.a(speechRecognition.channelNum, xmlSerializer, "", s6);
        }
        if (speechRecognition.resTextFormat != null) {
            String s7 = ProtectedSandApp.s("䉸\u0001");
            xmlSerializer.startTag("", s7);
            a.a(speechRecognition.resTextFormat, xmlSerializer, "", s7);
        }
        if (speechRecognition.filterDirty != null) {
            String s10 = ProtectedSandApp.s("䉹\u0001");
            xmlSerializer.startTag("", s10);
            a.a(speechRecognition.filterDirty, xmlSerializer, "", s10);
        }
        if (speechRecognition.filterModal != null) {
            String s11 = ProtectedSandApp.s("䉺\u0001");
            xmlSerializer.startTag("", s11);
            a.a(speechRecognition.filterModal, xmlSerializer, "", s11);
        }
        if (speechRecognition.convertNumMode != null) {
            String s12 = ProtectedSandApp.s("䉻\u0001");
            xmlSerializer.startTag("", s12);
            a.a(speechRecognition.convertNumMode, xmlSerializer, "", s12);
        }
        if (speechRecognition.speakerDiarization != null) {
            String s13 = ProtectedSandApp.s("䉼\u0001");
            xmlSerializer.startTag("", s13);
            a.a(speechRecognition.speakerDiarization, xmlSerializer, "", s13);
        }
        if (speechRecognition.speakerNumber != null) {
            String s14 = ProtectedSandApp.s("䉽\u0001");
            xmlSerializer.startTag("", s14);
            a.a(speechRecognition.speakerNumber, xmlSerializer, "", s14);
        }
        if (speechRecognition.filterPunc != null) {
            String s15 = ProtectedSandApp.s("䉾\u0001");
            xmlSerializer.startTag("", s15);
            a.a(speechRecognition.filterPunc, xmlSerializer, "", s15);
        }
        if (speechRecognition.outputFileType != null) {
            String s16 = ProtectedSandApp.s("䉿\u0001");
            xmlSerializer.startTag("", s16);
            a.a(speechRecognition.outputFileType, xmlSerializer, "", s16);
        }
        if (speechRecognition.format != null) {
            String s17 = ProtectedSandApp.s("䊀\u0001");
            xmlSerializer.startTag("", s17);
            a.a(speechRecognition.format, xmlSerializer, "", s17);
        }
        if (speechRecognition.firstChannelOnly != null) {
            String s18 = ProtectedSandApp.s("䊁\u0001");
            xmlSerializer.startTag("", s18);
            a.a(speechRecognition.firstChannelOnly, xmlSerializer, "", s18);
        }
        if (speechRecognition.wordInfo != null) {
            String s19 = ProtectedSandApp.s("䊂\u0001");
            xmlSerializer.startTag("", s19);
            a.a(speechRecognition.wordInfo, xmlSerializer, "", s19);
        }
        if (speechRecognition.sentenceMaxLength != null) {
            String s20 = ProtectedSandApp.s("䊃\u0001");
            xmlSerializer.startTag("", s20);
            a.a(speechRecognition.sentenceMaxLength, xmlSerializer, "", s20);
        }
        xmlSerializer.endTag("", str);
    }
}
