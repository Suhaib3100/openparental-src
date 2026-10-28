package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateWatermark;
import com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter extends IXmlAdapter<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate> {
    private HashMap<String, ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>> childElementBinders;

    public TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䢕\u0001"), new ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢖\u0001"), new ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢗\u0001"), new ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢘\u0001"), new ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢙\u0001"), new ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢚\u0001"), new ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢛\u0001"), new ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢜\u0001"), new ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermarkResponse$TemplateWatermarkResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate, String str) throws IOException, XmlPullParserException {
                templateWatermarkResponseTemplate.watermark = (TemplateWatermark.Watermark) QCloudXml.fromXml(xmlPullParser, TemplateWatermark.Watermark.class, ProtectedSandApp.s("䢔\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateWatermarkResponse.TemplateWatermarkResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateWatermarkResponse.TemplateWatermarkResponseTemplate templateWatermarkResponseTemplate = new TemplateWatermarkResponse.TemplateWatermarkResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateWatermarkResponse.TemplateWatermarkResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateWatermarkResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䢝\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateWatermarkResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateWatermarkResponseTemplate;
    }
}
