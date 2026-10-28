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
public class VoiceSynthesisTempleteResponseTemplate$$XmlAdapter extends IXmlAdapter<VoiceSynthesisTempleteResponseTemplate> {
    private HashMap<String, ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>> childElementBinders;

    public VoiceSynthesisTempleteResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䊬\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊭\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊮\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊯\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊰\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊱\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊲\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊳\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                voiceSynthesisTempleteResponseTemplate.ttsTpl = (VoiceSynthesisTempleteResponseTtsTpl) QCloudXml.fromXml(xmlPullParser, VoiceSynthesisTempleteResponseTtsTpl.class, ProtectedSandApp.s("䊫\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VoiceSynthesisTempleteResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate = new VoiceSynthesisTempleteResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VoiceSynthesisTempleteResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, voiceSynthesisTempleteResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䊴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return voiceSynthesisTempleteResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return voiceSynthesisTempleteResponseTemplate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VoiceSynthesisTempleteResponseTemplate voiceSynthesisTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
        if (voiceSynthesisTempleteResponseTemplate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䊴\u0001");
        }
        xmlSerializer.startTag("", str);
        if (voiceSynthesisTempleteResponseTemplate.templateId != null) {
            String s4 = ProtectedSandApp.s("䊬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(voiceSynthesisTempleteResponseTemplate.templateId, xmlSerializer, "", s4);
        }
        if (voiceSynthesisTempleteResponseTemplate.name != null) {
            String s5 = ProtectedSandApp.s("䊭\u0001");
            xmlSerializer.startTag("", s5);
            a.a(voiceSynthesisTempleteResponseTemplate.name, xmlSerializer, "", s5);
        }
        if (voiceSynthesisTempleteResponseTemplate.bucketId != null) {
            String s6 = ProtectedSandApp.s("䊮\u0001");
            xmlSerializer.startTag("", s6);
            a.a(voiceSynthesisTempleteResponseTemplate.bucketId, xmlSerializer, "", s6);
        }
        if (voiceSynthesisTempleteResponseTemplate.category != null) {
            String s7 = ProtectedSandApp.s("䊯\u0001");
            xmlSerializer.startTag("", s7);
            a.a(voiceSynthesisTempleteResponseTemplate.category, xmlSerializer, "", s7);
        }
        if (voiceSynthesisTempleteResponseTemplate.tag != null) {
            String s10 = ProtectedSandApp.s("䊰\u0001");
            xmlSerializer.startTag("", s10);
            a.a(voiceSynthesisTempleteResponseTemplate.tag, xmlSerializer, "", s10);
        }
        if (voiceSynthesisTempleteResponseTemplate.updateTime != null) {
            String s11 = ProtectedSandApp.s("䊱\u0001");
            xmlSerializer.startTag("", s11);
            a.a(voiceSynthesisTempleteResponseTemplate.updateTime, xmlSerializer, "", s11);
        }
        if (voiceSynthesisTempleteResponseTemplate.createTime != null) {
            String s12 = ProtectedSandApp.s("䊲\u0001");
            xmlSerializer.startTag("", s12);
            a.a(voiceSynthesisTempleteResponseTemplate.createTime, xmlSerializer, "", s12);
        }
        VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl = voiceSynthesisTempleteResponseTemplate.ttsTpl;
        if (voiceSynthesisTempleteResponseTtsTpl != null) {
            QCloudXml.toXml(xmlSerializer, voiceSynthesisTempleteResponseTtsTpl, ProtectedSandApp.s("䊳\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
