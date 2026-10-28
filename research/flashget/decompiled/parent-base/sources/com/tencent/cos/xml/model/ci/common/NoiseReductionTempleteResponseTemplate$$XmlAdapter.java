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
public class NoiseReductionTempleteResponseTemplate$$XmlAdapter extends IXmlAdapter<NoiseReductionTempleteResponseTemplate> {
    private HashMap<String, ChildElementBinder<NoiseReductionTempleteResponseTemplate>> childElementBinders;

    public NoiseReductionTempleteResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<NoiseReductionTempleteResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䉠\u0001"), new ChildElementBinder<NoiseReductionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReductionTempleteResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉡\u0001"), new ChildElementBinder<NoiseReductionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReductionTempleteResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉢\u0001"), new ChildElementBinder<NoiseReductionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReductionTempleteResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉣\u0001"), new ChildElementBinder<NoiseReductionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReductionTempleteResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉤\u0001"), new ChildElementBinder<NoiseReductionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReductionTempleteResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉥\u0001"), new ChildElementBinder<NoiseReductionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReductionTempleteResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉦\u0001"), new ChildElementBinder<NoiseReductionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReductionTempleteResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉧\u0001"), new ChildElementBinder<NoiseReductionTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                noiseReductionTempleteResponseTemplate.noiseReduction = (NoiseReduction) QCloudXml.fromXml(xmlPullParser, NoiseReduction.class, ProtectedSandApp.s("䉟\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public NoiseReductionTempleteResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate = new NoiseReductionTempleteResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<NoiseReductionTempleteResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, noiseReductionTempleteResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䉨\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return noiseReductionTempleteResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return noiseReductionTempleteResponseTemplate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, NoiseReductionTempleteResponseTemplate noiseReductionTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
        if (noiseReductionTempleteResponseTemplate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䉨\u0001");
        }
        xmlSerializer.startTag("", str);
        if (noiseReductionTempleteResponseTemplate.templateId != null) {
            String s4 = ProtectedSandApp.s("䉠\u0001");
            xmlSerializer.startTag("", s4);
            a.a(noiseReductionTempleteResponseTemplate.templateId, xmlSerializer, "", s4);
        }
        if (noiseReductionTempleteResponseTemplate.name != null) {
            String s5 = ProtectedSandApp.s("䉡\u0001");
            xmlSerializer.startTag("", s5);
            a.a(noiseReductionTempleteResponseTemplate.name, xmlSerializer, "", s5);
        }
        if (noiseReductionTempleteResponseTemplate.bucketId != null) {
            String s6 = ProtectedSandApp.s("䉢\u0001");
            xmlSerializer.startTag("", s6);
            a.a(noiseReductionTempleteResponseTemplate.bucketId, xmlSerializer, "", s6);
        }
        if (noiseReductionTempleteResponseTemplate.category != null) {
            String s7 = ProtectedSandApp.s("䉣\u0001");
            xmlSerializer.startTag("", s7);
            a.a(noiseReductionTempleteResponseTemplate.category, xmlSerializer, "", s7);
        }
        if (noiseReductionTempleteResponseTemplate.tag != null) {
            String s10 = ProtectedSandApp.s("䉤\u0001");
            xmlSerializer.startTag("", s10);
            a.a(noiseReductionTempleteResponseTemplate.tag, xmlSerializer, "", s10);
        }
        if (noiseReductionTempleteResponseTemplate.updateTime != null) {
            String s11 = ProtectedSandApp.s("䉥\u0001");
            xmlSerializer.startTag("", s11);
            a.a(noiseReductionTempleteResponseTemplate.updateTime, xmlSerializer, "", s11);
        }
        if (noiseReductionTempleteResponseTemplate.createTime != null) {
            String s12 = ProtectedSandApp.s("䉦\u0001");
            xmlSerializer.startTag("", s12);
            a.a(noiseReductionTempleteResponseTemplate.createTime, xmlSerializer, "", s12);
        }
        NoiseReduction noiseReduction = noiseReductionTempleteResponseTemplate.noiseReduction;
        if (noiseReduction != null) {
            QCloudXml.toXml(xmlSerializer, noiseReduction, ProtectedSandApp.s("䉧\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
