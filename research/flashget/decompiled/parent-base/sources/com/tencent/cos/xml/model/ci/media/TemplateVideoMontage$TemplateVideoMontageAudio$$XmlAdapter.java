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
public class TemplateVideoMontage$TemplateVideoMontageAudio$$XmlAdapter extends IXmlAdapter<TemplateVideoMontage.TemplateVideoMontageAudio> {
    private HashMap<String, ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageAudio>> childElementBinders;

    public TemplateVideoMontage$TemplateVideoMontageAudio$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageAudio>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䠙\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageAudio$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageAudio.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠚\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageAudio$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageAudio.samplerate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠛\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageAudio$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageAudio.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠜\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageAudio$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageAudio.channels = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠝\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageAudio$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageAudio.remove = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVideoMontage.TemplateVideoMontageAudio fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio = new TemplateVideoMontage.TemplateVideoMontageAudio();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageAudio> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateVideoMontageAudio, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䠞\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateVideoMontageAudio;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateVideoMontageAudio;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio, String str) throws IOException, XmlPullParserException {
        if (templateVideoMontageAudio == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䠞\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateVideoMontageAudio.codec != null) {
            String s4 = ProtectedSandApp.s("䠙\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateVideoMontageAudio.codec, xmlSerializer, "", s4);
        }
        if (templateVideoMontageAudio.samplerate != null) {
            String s5 = ProtectedSandApp.s("䠚\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateVideoMontageAudio.samplerate, xmlSerializer, "", s5);
        }
        if (templateVideoMontageAudio.bitrate != null) {
            String s6 = ProtectedSandApp.s("䠛\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateVideoMontageAudio.bitrate, xmlSerializer, "", s6);
        }
        if (templateVideoMontageAudio.channels != null) {
            String s7 = ProtectedSandApp.s("䠜\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateVideoMontageAudio.channels, xmlSerializer, "", s7);
        }
        if (templateVideoMontageAudio.remove != null) {
            String s10 = ProtectedSandApp.s("䠝\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateVideoMontageAudio.remove, xmlSerializer, "", s10);
        }
        xmlSerializer.endTag("", str);
    }
}
