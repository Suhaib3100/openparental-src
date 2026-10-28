package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateConcat;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateConcat$TemplateConcatVideo$$XmlAdapter extends IXmlAdapter<TemplateConcat.TemplateConcatVideo> {
    private HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatVideo>> childElementBinders;

    public TemplateConcat$TemplateConcatVideo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatVideo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䜯\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatVideo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatVideo.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜰\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatVideo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatVideo.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜱\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatVideo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatVideo.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜲\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatVideo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatVideo.fps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜳\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatVideo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatVideo.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜴\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatVideo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatVideo.crf = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜵\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatVideo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatVideo.remove = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜶\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatVideo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatVideo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatVideo.rotate = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateConcat.TemplateConcatVideo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateConcat.TemplateConcatVideo templateConcatVideo = new TemplateConcat.TemplateConcatVideo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateConcat.TemplateConcatVideo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateConcatVideo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䜷\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateConcatVideo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateConcatVideo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateConcat.TemplateConcatVideo templateConcatVideo, String str) throws IOException, XmlPullParserException {
        if (templateConcatVideo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䜷\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateConcatVideo.codec != null) {
            String s4 = ProtectedSandApp.s("䜯\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateConcatVideo.codec, xmlSerializer, "", s4);
        }
        if (templateConcatVideo.width != null) {
            String s5 = ProtectedSandApp.s("䜰\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateConcatVideo.width, xmlSerializer, "", s5);
        }
        if (templateConcatVideo.height != null) {
            String s6 = ProtectedSandApp.s("䜱\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateConcatVideo.height, xmlSerializer, "", s6);
        }
        if (templateConcatVideo.fps != null) {
            String s7 = ProtectedSandApp.s("䜲\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateConcatVideo.fps, xmlSerializer, "", s7);
        }
        if (templateConcatVideo.bitrate != null) {
            String s10 = ProtectedSandApp.s("䜳\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateConcatVideo.bitrate, xmlSerializer, "", s10);
        }
        if (templateConcatVideo.crf != null) {
            String s11 = ProtectedSandApp.s("䜴\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateConcatVideo.crf, xmlSerializer, "", s11);
        }
        if (templateConcatVideo.remove != null) {
            String s12 = ProtectedSandApp.s("䜵\u0001");
            xmlSerializer.startTag("", s12);
            a.a(templateConcatVideo.remove, xmlSerializer, "", s12);
        }
        if (templateConcatVideo.rotate != null) {
            String s13 = ProtectedSandApp.s("䜶\u0001");
            xmlSerializer.startTag("", s13);
            a.a(templateConcatVideo.rotate, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
