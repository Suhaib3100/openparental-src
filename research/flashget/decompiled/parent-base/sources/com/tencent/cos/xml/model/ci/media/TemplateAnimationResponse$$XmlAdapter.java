package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateAnimationResponse$$XmlAdapter extends IXmlAdapter<TemplateAnimationResponse> {
    private HashMap<String, ChildElementBinder<TemplateAnimationResponse>> childElementBinders;

    public TemplateAnimationResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateAnimationResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䛮\u0001"), new ChildElementBinder<TemplateAnimationResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse templateAnimationResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationResponse.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛯\u0001"), new ChildElementBinder<TemplateAnimationResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse templateAnimationResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationResponse.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛰\u0001"), new ChildElementBinder<TemplateAnimationResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse templateAnimationResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationResponse.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛱\u0001"), new ChildElementBinder<TemplateAnimationResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse templateAnimationResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationResponse.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛲\u0001"), new ChildElementBinder<TemplateAnimationResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse templateAnimationResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationResponse.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛳\u0001"), new ChildElementBinder<TemplateAnimationResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse templateAnimationResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationResponse.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛴\u0001"), new ChildElementBinder<TemplateAnimationResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse templateAnimationResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationResponse.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛵\u0001"), new ChildElementBinder<TemplateAnimationResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse templateAnimationResponse, String str) throws IOException, XmlPullParserException {
                templateAnimationResponse.transTpl = (TemplateAnimationResponse.TemplateAnimationResponseTransTpl) QCloudXml.fromXml(xmlPullParser, TemplateAnimationResponse.TemplateAnimationResponseTransTpl.class, ProtectedSandApp.s("䛭\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateAnimationResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateAnimationResponse templateAnimationResponse = new TemplateAnimationResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateAnimationResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateAnimationResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䛶\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateAnimationResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateAnimationResponse;
    }
}
