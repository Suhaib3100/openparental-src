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
public class VoiceSeparateTempleteResponseTemplate$$XmlAdapter extends IXmlAdapter<VoiceSeparateTempleteResponseTemplate> {
    private HashMap<String, ChildElementBinder<VoiceSeparateTempleteResponseTemplate>> childElementBinders;

    public VoiceSeparateTempleteResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VoiceSeparateTempleteResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䊞\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparateTempleteResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊟\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparateTempleteResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊠\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparateTempleteResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊡\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparateTempleteResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊢\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparateTempleteResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊣\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparateTempleteResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊤\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparateTempleteResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊥\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                voiceSeparateTempleteResponseTemplate.voiceSeparate = (VoiceSeparateTempleteResponseVoiceSeparate) QCloudXml.fromXml(xmlPullParser, VoiceSeparateTempleteResponseVoiceSeparate.class, ProtectedSandApp.s("䊝\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VoiceSeparateTempleteResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate = new VoiceSeparateTempleteResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VoiceSeparateTempleteResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, voiceSeparateTempleteResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䊦\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return voiceSeparateTempleteResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return voiceSeparateTempleteResponseTemplate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VoiceSeparateTempleteResponseTemplate voiceSeparateTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
        if (voiceSeparateTempleteResponseTemplate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䊦\u0001");
        }
        xmlSerializer.startTag("", str);
        if (voiceSeparateTempleteResponseTemplate.templateId != null) {
            String s4 = ProtectedSandApp.s("䊞\u0001");
            xmlSerializer.startTag("", s4);
            a.a(voiceSeparateTempleteResponseTemplate.templateId, xmlSerializer, "", s4);
        }
        if (voiceSeparateTempleteResponseTemplate.name != null) {
            String s5 = ProtectedSandApp.s("䊟\u0001");
            xmlSerializer.startTag("", s5);
            a.a(voiceSeparateTempleteResponseTemplate.name, xmlSerializer, "", s5);
        }
        if (voiceSeparateTempleteResponseTemplate.bucketId != null) {
            String s6 = ProtectedSandApp.s("䊠\u0001");
            xmlSerializer.startTag("", s6);
            a.a(voiceSeparateTempleteResponseTemplate.bucketId, xmlSerializer, "", s6);
        }
        if (voiceSeparateTempleteResponseTemplate.category != null) {
            String s7 = ProtectedSandApp.s("䊡\u0001");
            xmlSerializer.startTag("", s7);
            a.a(voiceSeparateTempleteResponseTemplate.category, xmlSerializer, "", s7);
        }
        if (voiceSeparateTempleteResponseTemplate.tag != null) {
            String s10 = ProtectedSandApp.s("䊢\u0001");
            xmlSerializer.startTag("", s10);
            a.a(voiceSeparateTempleteResponseTemplate.tag, xmlSerializer, "", s10);
        }
        if (voiceSeparateTempleteResponseTemplate.updateTime != null) {
            String s11 = ProtectedSandApp.s("䊣\u0001");
            xmlSerializer.startTag("", s11);
            a.a(voiceSeparateTempleteResponseTemplate.updateTime, xmlSerializer, "", s11);
        }
        if (voiceSeparateTempleteResponseTemplate.createTime != null) {
            String s12 = ProtectedSandApp.s("䊤\u0001");
            xmlSerializer.startTag("", s12);
            a.a(voiceSeparateTempleteResponseTemplate.createTime, xmlSerializer, "", s12);
        }
        VoiceSeparateTempleteResponseVoiceSeparate voiceSeparateTempleteResponseVoiceSeparate = voiceSeparateTempleteResponseTemplate.voiceSeparate;
        if (voiceSeparateTempleteResponseVoiceSeparate != null) {
            QCloudXml.toXml(xmlSerializer, voiceSeparateTempleteResponseVoiceSeparate, ProtectedSandApp.s("䊥\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
