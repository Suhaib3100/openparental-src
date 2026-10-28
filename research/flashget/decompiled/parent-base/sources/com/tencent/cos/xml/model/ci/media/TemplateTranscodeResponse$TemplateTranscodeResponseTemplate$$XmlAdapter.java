package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter extends IXmlAdapter<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate> {
    private HashMap<String, ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>> childElementBinders;

    public TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䟸\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟹\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟺\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟻\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟼\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟽\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟾\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟿\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate, String str) throws IOException, XmlPullParserException {
                templateTranscodeResponseTemplate.transTpl = (TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl) QCloudXml.fromXml(xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl.class, ProtectedSandApp.s("䟷\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscodeResponse.TemplateTranscodeResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscodeResponse.TemplateTranscodeResponseTemplate templateTranscodeResponseTemplate = new TemplateTranscodeResponse.TemplateTranscodeResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䠀\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeResponseTemplate;
    }
}
