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
public class TemplateConcat$TemplateConcatAudio$$XmlAdapter extends IXmlAdapter<TemplateConcat.TemplateConcatAudio> {
    private HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatAudio>> childElementBinders;

    public TemplateConcat$TemplateConcatAudio$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatAudio>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䜐\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatAudio$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatAudio templateConcatAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatAudio.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜑\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatAudio$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatAudio templateConcatAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatAudio.samplerate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜒\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatAudio$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatAudio templateConcatAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatAudio.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜓\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatAudio>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatAudio$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatAudio templateConcatAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatAudio.channels = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateConcat.TemplateConcatAudio fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateConcat.TemplateConcatAudio templateConcatAudio = new TemplateConcat.TemplateConcatAudio();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateConcat.TemplateConcatAudio> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateConcatAudio, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䜔\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateConcatAudio;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateConcatAudio;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateConcat.TemplateConcatAudio templateConcatAudio, String str) throws IOException, XmlPullParserException {
        if (templateConcatAudio == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䜔\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateConcatAudio.codec != null) {
            String s4 = ProtectedSandApp.s("䜐\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateConcatAudio.codec, xmlSerializer, "", s4);
        }
        if (templateConcatAudio.samplerate != null) {
            String s5 = ProtectedSandApp.s("䜑\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateConcatAudio.samplerate, xmlSerializer, "", s5);
        }
        if (templateConcatAudio.bitrate != null) {
            String s6 = ProtectedSandApp.s("䜒\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateConcatAudio.bitrate, xmlSerializer, "", s6);
        }
        if (templateConcatAudio.channels != null) {
            String s7 = ProtectedSandApp.s("䜓\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateConcatAudio.channels, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
