package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class VideoTargetTempleteResponseTemplate$$XmlAdapter extends IXmlAdapter<VideoTargetTempleteResponseTemplate> {
    private HashMap<String, ChildElementBinder<VideoTargetTempleteResponseTemplate>> childElementBinders;

    public VideoTargetTempleteResponseTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VideoTargetTempleteResponseTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䊔\u0001"), new ChildElementBinder<VideoTargetTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetTempleteResponseTemplate.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊕\u0001"), new ChildElementBinder<VideoTargetTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetTempleteResponseTemplate.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊖\u0001"), new ChildElementBinder<VideoTargetTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetTempleteResponseTemplate.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊗\u0001"), new ChildElementBinder<VideoTargetTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetTempleteResponseTemplate.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊘\u0001"), new ChildElementBinder<VideoTargetTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetTempleteResponseTemplate.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊙\u0001"), new ChildElementBinder<VideoTargetTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetTempleteResponseTemplate.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊚\u0001"), new ChildElementBinder<VideoTargetTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetTempleteResponseTemplate.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊛\u0001"), new ChildElementBinder<VideoTargetTempleteResponseTemplate>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
                videoTargetTempleteResponseTemplate.videoTargetRec = (VideoTargetRec) QCloudXml.fromXml(xmlPullParser, VideoTargetRec.class, ProtectedSandApp.s("䊓\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VideoTargetTempleteResponseTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate = new VideoTargetTempleteResponseTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VideoTargetTempleteResponseTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, videoTargetTempleteResponseTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䊜\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return videoTargetTempleteResponseTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return videoTargetTempleteResponseTemplate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VideoTargetTempleteResponseTemplate videoTargetTempleteResponseTemplate, String str) throws IOException, XmlPullParserException {
        if (videoTargetTempleteResponseTemplate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䊜\u0001");
        }
        xmlSerializer.startTag("", str);
        if (videoTargetTempleteResponseTemplate.templateId != null) {
            String s4 = ProtectedSandApp.s("䊔\u0001");
            xmlSerializer.startTag("", s4);
            a.a(videoTargetTempleteResponseTemplate.templateId, xmlSerializer, "", s4);
        }
        if (videoTargetTempleteResponseTemplate.name != null) {
            String s5 = ProtectedSandApp.s("䊕\u0001");
            xmlSerializer.startTag("", s5);
            a.a(videoTargetTempleteResponseTemplate.name, xmlSerializer, "", s5);
        }
        if (videoTargetTempleteResponseTemplate.bucketId != null) {
            String s6 = ProtectedSandApp.s("䊖\u0001");
            xmlSerializer.startTag("", s6);
            a.a(videoTargetTempleteResponseTemplate.bucketId, xmlSerializer, "", s6);
        }
        if (videoTargetTempleteResponseTemplate.category != null) {
            String s7 = ProtectedSandApp.s("䊗\u0001");
            xmlSerializer.startTag("", s7);
            a.a(videoTargetTempleteResponseTemplate.category, xmlSerializer, "", s7);
        }
        if (videoTargetTempleteResponseTemplate.tag != null) {
            String s10 = ProtectedSandApp.s("䊘\u0001");
            xmlSerializer.startTag("", s10);
            a.a(videoTargetTempleteResponseTemplate.tag, xmlSerializer, "", s10);
        }
        if (videoTargetTempleteResponseTemplate.updateTime != null) {
            String s11 = ProtectedSandApp.s("䊙\u0001");
            xmlSerializer.startTag("", s11);
            a.a(videoTargetTempleteResponseTemplate.updateTime, xmlSerializer, "", s11);
        }
        if (videoTargetTempleteResponseTemplate.createTime != null) {
            String s12 = ProtectedSandApp.s("䊚\u0001");
            xmlSerializer.startTag("", s12);
            a.a(videoTargetTempleteResponseTemplate.createTime, xmlSerializer, "", s12);
        }
        VideoTargetRec videoTargetRec = videoTargetTempleteResponseTemplate.videoTargetRec;
        if (videoTargetRec != null) {
            QCloudXml.toXml(xmlSerializer, videoTargetRec, ProtectedSandApp.s("䊛\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
