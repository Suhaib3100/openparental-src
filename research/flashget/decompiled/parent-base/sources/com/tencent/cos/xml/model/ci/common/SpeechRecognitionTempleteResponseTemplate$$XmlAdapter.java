package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SpeechRecognitionTempleteResponseTemplate$$XmlAdapter extends IXmlAdapter<SpeechRecognitionTempleteResponseTemplate> {
    private HashMap<String, ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>> childElementBinders;

    public SpeechRecognitionTempleteResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䊆\u0001"), new ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionTempleteResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊇\u0001"), new ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionTempleteResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊈\u0001"), new ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionTempleteResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊉\u0001"), new ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionTempleteResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊊\u0001"), new ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionTempleteResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊋\u0001"), new ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionTempleteResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊌\u0001"), new ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionTempleteResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊍\u0001"), new ChildElementBinder<SpeechRecognitionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                speechRecognitionTempleteResponseTemplate.speechRecognition = (SpeechRecognition) QCloudXml.fromXml(xmlPullParser, SpeechRecognition.class, ProtectedSandApp.s("䊅\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechRecognitionTempleteResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate = new SpeechRecognitionTempleteResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechRecognitionTempleteResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, speechRecognitionTempleteResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䊎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return speechRecognitionTempleteResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return speechRecognitionTempleteResponseTemplate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SpeechRecognitionTempleteResponseTemplate speechRecognitionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
        if (speechRecognitionTempleteResponseTemplate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䊎\u0001");
        }
        xmlSerializer.startTag("", str);
        if (speechRecognitionTempleteResponseTemplate.templateId != null) {
            String s4 = ProtectedSandApp.s("䊆\u0001");
            xmlSerializer.startTag("", s4);
            a.a(speechRecognitionTempleteResponseTemplate.templateId, xmlSerializer, "", s4);
        }
        if (speechRecognitionTempleteResponseTemplate.name != null) {
            String s5 = ProtectedSandApp.s("䊇\u0001");
            xmlSerializer.startTag("", s5);
            a.a(speechRecognitionTempleteResponseTemplate.name, xmlSerializer, "", s5);
        }
        if (speechRecognitionTempleteResponseTemplate.bucketId != null) {
            String s6 = ProtectedSandApp.s("䊈\u0001");
            xmlSerializer.startTag("", s6);
            a.a(speechRecognitionTempleteResponseTemplate.bucketId, xmlSerializer, "", s6);
        }
        if (speechRecognitionTempleteResponseTemplate.category != null) {
            String s7 = ProtectedSandApp.s("䊉\u0001");
            xmlSerializer.startTag("", s7);
            a.a(speechRecognitionTempleteResponseTemplate.category, xmlSerializer, "", s7);
        }
        if (speechRecognitionTempleteResponseTemplate.tag != null) {
            String s10 = ProtectedSandApp.s("䊊\u0001");
            xmlSerializer.startTag("", s10);
            a.a(speechRecognitionTempleteResponseTemplate.tag, xmlSerializer, "", s10);
        }
        if (speechRecognitionTempleteResponseTemplate.updateTime != null) {
            String s11 = ProtectedSandApp.s("䊋\u0001");
            xmlSerializer.startTag("", s11);
            a.a(speechRecognitionTempleteResponseTemplate.updateTime, xmlSerializer, "", s11);
        }
        if (speechRecognitionTempleteResponseTemplate.createTime != null) {
            String s12 = ProtectedSandApp.s("䊌\u0001");
            xmlSerializer.startTag("", s12);
            a.a(speechRecognitionTempleteResponseTemplate.createTime, xmlSerializer, "", s12);
        }
        SpeechRecognition speechRecognition = speechRecognitionTempleteResponseTemplate.speechRecognition;
        if (speechRecognition != null) {
            QCloudXml.toXml(xmlSerializer, speechRecognition, ProtectedSandApp.s("䊍\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
