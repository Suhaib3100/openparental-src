package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateWatermark;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateWatermark$Watermark$$XmlAdapter extends IXmlAdapter<TemplateWatermark.Watermark> {
    private HashMap<String, ChildElementBinder<TemplateWatermark.Watermark>> childElementBinders;

    public TemplateWatermark$Watermark$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateWatermark.Watermark>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䡿\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                watermark.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢀\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                watermark.pos = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢁\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                watermark.locMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢂\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                watermark.dx = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢃\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                watermark.dy = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢄\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                watermark.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢅\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                watermark.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢆\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                watermark.slideConfig = (TemplateWatermark.TemplateWatermarkSlideConfig) QCloudXml.fromXml(xmlPullParser, TemplateWatermark.TemplateWatermarkSlideConfig.class, ProtectedSandApp.s("䡽\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢇\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                watermark.image = (TemplateWatermark.TemplateWatermarkImage) QCloudXml.fromXml(xmlPullParser, TemplateWatermark.TemplateWatermarkImage.class, ProtectedSandApp.s("䡾\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢈\u0001"), new ChildElementBinder<TemplateWatermark.Watermark>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$Watermark$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
                watermark.text = (TemplateWatermark.TemplateWatermarkText) QCloudXml.fromXml(xmlPullParser, TemplateWatermark.TemplateWatermarkText.class, ProtectedSandApp.s("䡼\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateWatermark.Watermark fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateWatermark.Watermark watermark = new TemplateWatermark.Watermark();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateWatermark.Watermark> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, watermark, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䢉\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return watermark;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return watermark;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateWatermark.Watermark watermark, String str) throws IOException, XmlPullParserException {
        if (watermark == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䢉\u0001");
        }
        xmlSerializer.startTag("", str);
        if (watermark.type != null) {
            String s4 = ProtectedSandApp.s("䡿\u0001");
            xmlSerializer.startTag("", s4);
            a.a(watermark.type, xmlSerializer, "", s4);
        }
        if (watermark.pos != null) {
            String s5 = ProtectedSandApp.s("䢀\u0001");
            xmlSerializer.startTag("", s5);
            a.a(watermark.pos, xmlSerializer, "", s5);
        }
        if (watermark.locMode != null) {
            String s6 = ProtectedSandApp.s("䢁\u0001");
            xmlSerializer.startTag("", s6);
            a.a(watermark.locMode, xmlSerializer, "", s6);
        }
        if (watermark.dx != null) {
            String s7 = ProtectedSandApp.s("䢂\u0001");
            xmlSerializer.startTag("", s7);
            a.a(watermark.dx, xmlSerializer, "", s7);
        }
        if (watermark.dy != null) {
            String s10 = ProtectedSandApp.s("䢃\u0001");
            xmlSerializer.startTag("", s10);
            a.a(watermark.dy, xmlSerializer, "", s10);
        }
        if (watermark.startTime != null) {
            String s11 = ProtectedSandApp.s("䢄\u0001");
            xmlSerializer.startTag("", s11);
            a.a(watermark.startTime, xmlSerializer, "", s11);
        }
        if (watermark.endTime != null) {
            String s12 = ProtectedSandApp.s("䢅\u0001");
            xmlSerializer.startTag("", s12);
            a.a(watermark.endTime, xmlSerializer, "", s12);
        }
        TemplateWatermark.TemplateWatermarkSlideConfig templateWatermarkSlideConfig = watermark.slideConfig;
        if (templateWatermarkSlideConfig != null) {
            QCloudXml.toXml(xmlSerializer, templateWatermarkSlideConfig, ProtectedSandApp.s("䢆\u0001"));
        }
        TemplateWatermark.TemplateWatermarkImage templateWatermarkImage = watermark.image;
        if (templateWatermarkImage != null) {
            QCloudXml.toXml(xmlSerializer, templateWatermarkImage, ProtectedSandApp.s("䢇\u0001"));
        }
        TemplateWatermark.TemplateWatermarkText templateWatermarkText = watermark.text;
        if (templateWatermarkText != null) {
            QCloudXml.toXml(xmlSerializer, templateWatermarkText, ProtectedSandApp.s("䢈\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
