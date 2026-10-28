package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJob;
import com.tencent.cos.xml.model.ci.media.TemplateAnimation;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitAnimationJob$SubmitAnimationJobAnimation$$XmlAdapter extends IXmlAdapter<SubmitAnimationJob.SubmitAnimationJobAnimation> {
    private HashMap<String, ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobAnimation>> childElementBinders;

    public SubmitAnimationJob$SubmitAnimationJobAnimation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobAnimation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䍬\u0001"), new ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobAnimation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJob$SubmitAnimationJobAnimation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJob.SubmitAnimationJobAnimation submitAnimationJobAnimation, String str) throws IOException, XmlPullParserException {
                submitAnimationJobAnimation.container = (TemplateAnimation.TemplateAnimationContainer) QCloudXml.fromXml(xmlPullParser, TemplateAnimation.TemplateAnimationContainer.class, ProtectedSandApp.s("䍩\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍭\u0001"), new ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobAnimation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJob$SubmitAnimationJobAnimation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJob.SubmitAnimationJobAnimation submitAnimationJobAnimation, String str) throws IOException, XmlPullParserException {
                submitAnimationJobAnimation.video = (TemplateAnimation.TemplateAnimationVideo) QCloudXml.fromXml(xmlPullParser, TemplateAnimation.TemplateAnimationVideo.class, ProtectedSandApp.s("䍪\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍮\u0001"), new ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobAnimation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJob$SubmitAnimationJobAnimation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJob.SubmitAnimationJobAnimation submitAnimationJobAnimation, String str) throws IOException, XmlPullParserException {
                submitAnimationJobAnimation.timeInterval = (TemplateAnimation.TemplateAnimationTimeInterval) QCloudXml.fromXml(xmlPullParser, TemplateAnimation.TemplateAnimationTimeInterval.class, ProtectedSandApp.s("䍫\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitAnimationJob.SubmitAnimationJobAnimation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitAnimationJob.SubmitAnimationJobAnimation submitAnimationJobAnimation = new SubmitAnimationJob.SubmitAnimationJobAnimation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobAnimation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitAnimationJobAnimation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䍯\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitAnimationJobAnimation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitAnimationJobAnimation;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitAnimationJob.SubmitAnimationJobAnimation submitAnimationJobAnimation, String str) throws IOException, XmlPullParserException {
        if (submitAnimationJobAnimation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䍯\u0001");
        }
        xmlSerializer.startTag("", str);
        TemplateAnimation.TemplateAnimationContainer templateAnimationContainer = submitAnimationJobAnimation.container;
        if (templateAnimationContainer != null) {
            QCloudXml.toXml(xmlSerializer, templateAnimationContainer, ProtectedSandApp.s("䍬\u0001"));
        }
        TemplateAnimation.TemplateAnimationVideo templateAnimationVideo = submitAnimationJobAnimation.video;
        if (templateAnimationVideo != null) {
            QCloudXml.toXml(xmlSerializer, templateAnimationVideo, ProtectedSandApp.s("䍭\u0001"));
        }
        TemplateAnimation.TemplateAnimationTimeInterval templateAnimationTimeInterval = submitAnimationJobAnimation.timeInterval;
        if (templateAnimationTimeInterval != null) {
            QCloudXml.toXml(xmlSerializer, templateAnimationTimeInterval, ProtectedSandApp.s("䍮\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
