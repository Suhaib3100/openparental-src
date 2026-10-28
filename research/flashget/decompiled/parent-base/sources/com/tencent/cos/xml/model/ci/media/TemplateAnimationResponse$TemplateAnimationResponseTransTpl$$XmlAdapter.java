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
public class TemplateAnimationResponse$TemplateAnimationResponseTransTpl$$XmlAdapter extends IXmlAdapter<TemplateAnimationResponse.TemplateAnimationResponseTransTpl> {
    private HashMap<String, ChildElementBinder<TemplateAnimationResponse.TemplateAnimationResponseTransTpl>> childElementBinders;

    public TemplateAnimationResponse$TemplateAnimationResponseTransTpl$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateAnimationResponse.TemplateAnimationResponseTransTpl>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䛺\u0001"), new ChildElementBinder<TemplateAnimationResponse.TemplateAnimationResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$TemplateAnimationResponseTransTpl$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse.TemplateAnimationResponseTransTpl templateAnimationResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateAnimationResponseTransTpl.video = (TemplateAnimationResponse.TransTplVideo) QCloudXml.fromXml(xmlPullParser, TemplateAnimationResponse.TransTplVideo.class, ProtectedSandApp.s("䛷\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛻\u0001"), new ChildElementBinder<TemplateAnimationResponse.TemplateAnimationResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$TemplateAnimationResponseTransTpl$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse.TemplateAnimationResponseTransTpl templateAnimationResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateAnimationResponseTransTpl.container = (TemplateAnimationResponse.TransTplContainer) QCloudXml.fromXml(xmlPullParser, TemplateAnimationResponse.TransTplContainer.class, ProtectedSandApp.s("䛸\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛼\u0001"), new ChildElementBinder<TemplateAnimationResponse.TemplateAnimationResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$TemplateAnimationResponseTransTpl$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse.TemplateAnimationResponseTransTpl templateAnimationResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateAnimationResponseTransTpl.timeInterval = (TemplateAnimationResponse.TransTplTimeInterval) QCloudXml.fromXml(xmlPullParser, TemplateAnimationResponse.TransTplTimeInterval.class, ProtectedSandApp.s("䛹\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateAnimationResponse.TemplateAnimationResponseTransTpl fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateAnimationResponse.TemplateAnimationResponseTransTpl templateAnimationResponseTransTpl = new TemplateAnimationResponse.TemplateAnimationResponseTransTpl();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateAnimationResponse.TemplateAnimationResponseTransTpl> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateAnimationResponseTransTpl, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䛽\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateAnimationResponseTransTpl;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateAnimationResponseTransTpl;
    }
}
