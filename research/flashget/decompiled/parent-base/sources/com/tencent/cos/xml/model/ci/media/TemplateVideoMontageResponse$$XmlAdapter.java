package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateVideoMontageResponse$$XmlAdapter extends IXmlAdapter<TemplateVideoMontageResponse> {
    private HashMap<String, ChildElementBinder<TemplateVideoMontageResponse>> childElementBinders;

    public TemplateVideoMontageResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVideoMontageResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䠰\u0001"), new ChildElementBinder<TemplateVideoMontageResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse templateVideoMontageResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponse.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠱\u0001"), new ChildElementBinder<TemplateVideoMontageResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse templateVideoMontageResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponse.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠲\u0001"), new ChildElementBinder<TemplateVideoMontageResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse templateVideoMontageResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponse.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠳\u0001"), new ChildElementBinder<TemplateVideoMontageResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse templateVideoMontageResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponse.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠴\u0001"), new ChildElementBinder<TemplateVideoMontageResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse templateVideoMontageResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponse.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠵\u0001"), new ChildElementBinder<TemplateVideoMontageResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse templateVideoMontageResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponse.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠶\u0001"), new ChildElementBinder<TemplateVideoMontageResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse templateVideoMontageResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponse.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠷\u0001"), new ChildElementBinder<TemplateVideoMontageResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse templateVideoMontageResponse, String str) throws IOException, XmlPullParserException {
                templateVideoMontageResponse.videoMontage = (TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage) QCloudXml.fromXml(xmlPullParser, TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage.class, ProtectedSandApp.s("䠯\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVideoMontageResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVideoMontageResponse templateVideoMontageResponse = new TemplateVideoMontageResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVideoMontageResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateVideoMontageResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䠸\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateVideoMontageResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateVideoMontageResponse;
    }
}
