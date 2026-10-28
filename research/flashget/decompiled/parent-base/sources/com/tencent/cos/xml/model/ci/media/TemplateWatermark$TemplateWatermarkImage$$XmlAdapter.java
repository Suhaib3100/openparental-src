package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateWatermark;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateWatermark$TemplateWatermarkImage$$XmlAdapter extends IXmlAdapter<TemplateWatermark.TemplateWatermarkImage> {
    private HashMap<String, ChildElementBinder<TemplateWatermark.TemplateWatermarkImage>> childElementBinders;

    public TemplateWatermark$TemplateWatermarkImage$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateWatermark.TemplateWatermarkImage>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䡬\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkImage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkImage$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkImage templateWatermarkImage, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkImage.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡭\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkImage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkImage$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkImage templateWatermarkImage, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkImage.mode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡮\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkImage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkImage$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkImage templateWatermarkImage, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkImage.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡯\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkImage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkImage$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkImage templateWatermarkImage, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkImage.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡰\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkImage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkImage$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkImage templateWatermarkImage, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkImage.transparency = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡱\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkImage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkImage$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkImage templateWatermarkImage, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkImage.background = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateWatermark.TemplateWatermarkImage fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateWatermark.TemplateWatermarkImage templateWatermarkImage = new TemplateWatermark.TemplateWatermarkImage();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateWatermark.TemplateWatermarkImage> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateWatermarkImage, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䡲\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateWatermarkImage;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateWatermarkImage;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateWatermark.TemplateWatermarkImage templateWatermarkImage, String str) throws IOException, XmlPullParserException {
        if (templateWatermarkImage == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䡲\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateWatermarkImage.url != null) {
            String s4 = ProtectedSandApp.s("䡬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateWatermarkImage.url, xmlSerializer, "", s4);
        }
        if (templateWatermarkImage.mode != null) {
            String s5 = ProtectedSandApp.s("䡭\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateWatermarkImage.mode, xmlSerializer, "", s5);
        }
        if (templateWatermarkImage.width != null) {
            String s6 = ProtectedSandApp.s("䡮\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateWatermarkImage.width, xmlSerializer, "", s6);
        }
        if (templateWatermarkImage.height != null) {
            String s7 = ProtectedSandApp.s("䡯\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateWatermarkImage.height, xmlSerializer, "", s7);
        }
        if (templateWatermarkImage.transparency != null) {
            String s10 = ProtectedSandApp.s("䡰\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateWatermarkImage.transparency, xmlSerializer, "", s10);
        }
        if (templateWatermarkImage.background != null) {
            String s11 = ProtectedSandApp.s("䡱\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateWatermarkImage.background, xmlSerializer, "", s11);
        }
        xmlSerializer.endTag("", str);
    }
}
