package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateConcat;
import com.tencent.cos.xml.model.ci.media.TemplateConcatResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter extends IXmlAdapter<TemplateConcatResponse.TemplateConcatResponseTemplate> {
    private HashMap<String, ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>> childElementBinders;

    public TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䝃\u0001"), new ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝄\u0001"), new ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝅\u0001"), new ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝆\u0001"), new ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝇\u0001"), new ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝈\u0001"), new ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝉\u0001"), new ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝊\u0001"), new ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$TemplateConcatResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate, String str) throws IOException, XmlPullParserException {
                templateConcatResponseTemplate.concatTemplate = (TemplateConcat.TemplateConcatConcatTemplate) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate.class, ProtectedSandApp.s("䝂\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateConcatResponse.TemplateConcatResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateConcatResponse.TemplateConcatResponseTemplate templateConcatResponseTemplate = new TemplateConcatResponse.TemplateConcatResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateConcatResponse.TemplateConcatResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateConcatResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䝋\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateConcatResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateConcatResponseTemplate;
    }
}
