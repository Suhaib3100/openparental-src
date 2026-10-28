package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontage;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter extends IXmlAdapter<TemplateVideoMontage.TemplateVideoMontageVideo> {
    private HashMap<String, ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>> childElementBinders;

    public TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䠡\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageVideo.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠢\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageVideo.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠣\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageVideo.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠤\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageVideo.fps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠥\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageVideo.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠦\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageVideo.crf = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠧\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageVideo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageVideo.rotate = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVideoMontage.TemplateVideoMontageVideo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo = new TemplateVideoMontage.TemplateVideoMontageVideo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageVideo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateVideoMontageVideo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䠨\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateVideoMontageVideo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateVideoMontageVideo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo, String str) throws IOException, XmlPullParserException {
        if (templateVideoMontageVideo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䠨\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateVideoMontageVideo.codec != null) {
            String s4 = ProtectedSandApp.s("䠡\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateVideoMontageVideo.codec, xmlSerializer, "", s4);
        }
        if (templateVideoMontageVideo.width != null) {
            String s5 = ProtectedSandApp.s("䠢\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateVideoMontageVideo.width, xmlSerializer, "", s5);
        }
        if (templateVideoMontageVideo.height != null) {
            String s6 = ProtectedSandApp.s("䠣\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateVideoMontageVideo.height, xmlSerializer, "", s6);
        }
        if (templateVideoMontageVideo.fps != null) {
            String s7 = ProtectedSandApp.s("䠤\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateVideoMontageVideo.fps, xmlSerializer, "", s7);
        }
        if (templateVideoMontageVideo.bitrate != null) {
            String s10 = ProtectedSandApp.s("䠥\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateVideoMontageVideo.bitrate, xmlSerializer, "", s10);
        }
        if (templateVideoMontageVideo.crf != null) {
            String s11 = ProtectedSandApp.s("䠦\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateVideoMontageVideo.crf, xmlSerializer, "", s11);
        }
        if (templateVideoMontageVideo.rotate != null) {
            String s12 = ProtectedSandApp.s("䠧\u0001");
            xmlSerializer.startTag("", s12);
            a.a(templateVideoMontageVideo.rotate, xmlSerializer, "", s12);
        }
        xmlSerializer.endTag("", str);
    }
}
