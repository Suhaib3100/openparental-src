package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateSmartCover;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateSmartCoverResponse$$XmlAdapter extends IXmlAdapter<TemplateSmartCoverResponse> {
    private HashMap<String, ChildElementBinder<TemplateSmartCoverResponse>> childElementBinders;

    public TemplateSmartCoverResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateSmartCoverResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䝵\u0001"), new ChildElementBinder<TemplateSmartCoverResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCoverResponse templateSmartCoverResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverResponse.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝶\u0001"), new ChildElementBinder<TemplateSmartCoverResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCoverResponse templateSmartCoverResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverResponse.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝷\u0001"), new ChildElementBinder<TemplateSmartCoverResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCoverResponse templateSmartCoverResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverResponse.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝸\u0001"), new ChildElementBinder<TemplateSmartCoverResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCoverResponse templateSmartCoverResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverResponse.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝹\u0001"), new ChildElementBinder<TemplateSmartCoverResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCoverResponse templateSmartCoverResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverResponse.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝺\u0001"), new ChildElementBinder<TemplateSmartCoverResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResponse$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCoverResponse templateSmartCoverResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverResponse.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝻\u0001"), new ChildElementBinder<TemplateSmartCoverResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResponse$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCoverResponse templateSmartCoverResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverResponse.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝼\u0001"), new ChildElementBinder<TemplateSmartCoverResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCoverResponse$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCoverResponse templateSmartCoverResponse, String str) throws IOException, XmlPullParserException {
                templateSmartCoverResponse.smartCover = (TemplateSmartCover.TemplateSmartCoverSmartCover) QCloudXml.fromXml(xmlPullParser, TemplateSmartCover.TemplateSmartCoverSmartCover.class, ProtectedSandApp.s("䝴\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateSmartCoverResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateSmartCoverResponse templateSmartCoverResponse = new TemplateSmartCoverResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateSmartCoverResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateSmartCoverResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䝽\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateSmartCoverResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateSmartCoverResponse;
    }
}
