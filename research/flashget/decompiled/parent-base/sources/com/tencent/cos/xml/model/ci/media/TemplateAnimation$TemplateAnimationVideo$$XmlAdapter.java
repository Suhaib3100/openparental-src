package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateAnimation;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateAnimation$TemplateAnimationVideo$$XmlAdapter extends IXmlAdapter<TemplateAnimation.TemplateAnimationVideo> {
    private HashMap<String, ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>> childElementBinders;

    public TemplateAnimation$TemplateAnimationVideo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䛞\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationVideo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationVideo.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛟\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationVideo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationVideo.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛠\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationVideo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationVideo.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛡\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationVideo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationVideo.fps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛢\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationVideo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationVideo.animateOnlyKeepKeyFrame = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛣\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationVideo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationVideo.animateTimeIntervalOfFrame = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛤\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationVideo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationVideo.animateFramesPerSecond = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛥\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationVideo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationVideo.quality = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateAnimation.TemplateAnimationVideo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateAnimation.TemplateAnimationVideo templateAnimationVideo = new TemplateAnimation.TemplateAnimationVideo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateAnimation.TemplateAnimationVideo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateAnimationVideo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䛦\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateAnimationVideo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateAnimationVideo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateAnimation.TemplateAnimationVideo templateAnimationVideo, String str) throws IOException, XmlPullParserException {
        if (templateAnimationVideo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䛦\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateAnimationVideo.codec != null) {
            String s4 = ProtectedSandApp.s("䛞\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateAnimationVideo.codec, xmlSerializer, "", s4);
        }
        if (templateAnimationVideo.width != null) {
            String s5 = ProtectedSandApp.s("䛟\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateAnimationVideo.width, xmlSerializer, "", s5);
        }
        if (templateAnimationVideo.height != null) {
            String s6 = ProtectedSandApp.s("䛠\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateAnimationVideo.height, xmlSerializer, "", s6);
        }
        if (templateAnimationVideo.fps != null) {
            String s7 = ProtectedSandApp.s("䛡\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateAnimationVideo.fps, xmlSerializer, "", s7);
        }
        if (templateAnimationVideo.animateOnlyKeepKeyFrame != null) {
            String s10 = ProtectedSandApp.s("䛢\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateAnimationVideo.animateOnlyKeepKeyFrame, xmlSerializer, "", s10);
        }
        if (templateAnimationVideo.animateTimeIntervalOfFrame != null) {
            String s11 = ProtectedSandApp.s("䛣\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateAnimationVideo.animateTimeIntervalOfFrame, xmlSerializer, "", s11);
        }
        if (templateAnimationVideo.animateFramesPerSecond != null) {
            String s12 = ProtectedSandApp.s("䛤\u0001");
            xmlSerializer.startTag("", s12);
            a.a(templateAnimationVideo.animateFramesPerSecond, xmlSerializer, "", s12);
        }
        if (templateAnimationVideo.quality != null) {
            String s13 = ProtectedSandApp.s("䛥\u0001");
            xmlSerializer.startTag("", s13);
            a.a(templateAnimationVideo.quality, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
