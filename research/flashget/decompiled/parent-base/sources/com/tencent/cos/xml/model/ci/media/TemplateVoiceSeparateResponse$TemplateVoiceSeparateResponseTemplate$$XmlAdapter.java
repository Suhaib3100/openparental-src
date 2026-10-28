package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter extends IXmlAdapter<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate> {
    private HashMap<String, ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>> childElementBinders;

    public TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䡛\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡜\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡝\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡞\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡟\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡠\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡡\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡢\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate, String str) throws IOException, XmlPullParserException {
                templateVoiceSeparateResponseTemplate.voiceSeparate = (TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate) QCloudXml.fromXml(xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate.class, ProtectedSandApp.s("䡚\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate templateVoiceSeparateResponseTemplate = new TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateVoiceSeparateResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䡣\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateVoiceSeparateResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateVoiceSeparateResponseTemplate;
    }
}
