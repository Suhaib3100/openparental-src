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
public class TemplateWatermark$TemplateWatermarkText$$XmlAdapter extends IXmlAdapter<TemplateWatermark.TemplateWatermarkText> {
    private HashMap<String, ChildElementBinder<TemplateWatermark.TemplateWatermarkText>> childElementBinders;

    public TemplateWatermark$TemplateWatermarkText$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateWatermark.TemplateWatermarkText>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䡷\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkText>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkText$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkText templateWatermarkText, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkText.fontSize = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡸\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkText>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkText$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkText templateWatermarkText, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkText.fontType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡹\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkText>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkText$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkText templateWatermarkText, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkText.fontColor = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡺\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkText>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkText$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkText templateWatermarkText, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkText.transparency = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡻\u0001"), new ChildElementBinder<TemplateWatermark.TemplateWatermarkText>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateWatermark$TemplateWatermarkText$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateWatermark.TemplateWatermarkText templateWatermarkText, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateWatermarkText.text = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateWatermark.TemplateWatermarkText fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateWatermark.TemplateWatermarkText templateWatermarkText = new TemplateWatermark.TemplateWatermarkText();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateWatermark.TemplateWatermarkText> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateWatermarkText, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䡻\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateWatermarkText;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateWatermarkText;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateWatermark.TemplateWatermarkText templateWatermarkText, String str) throws IOException, XmlPullParserException {
        if (templateWatermarkText == null) {
            return;
        }
        String s4 = ProtectedSandApp.s("䡻\u0001");
        if (str == null) {
            str = s4;
        }
        xmlSerializer.startTag("", str);
        if (templateWatermarkText.fontSize != null) {
            String s5 = ProtectedSandApp.s("䡷\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateWatermarkText.fontSize, xmlSerializer, "", s5);
        }
        if (templateWatermarkText.fontType != null) {
            String s6 = ProtectedSandApp.s("䡸\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateWatermarkText.fontType, xmlSerializer, "", s6);
        }
        if (templateWatermarkText.fontColor != null) {
            String s7 = ProtectedSandApp.s("䡹\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateWatermarkText.fontColor, xmlSerializer, "", s7);
        }
        if (templateWatermarkText.transparency != null) {
            String s10 = ProtectedSandApp.s("䡺\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateWatermarkText.transparency, xmlSerializer, "", s10);
        }
        if (templateWatermarkText.text != null) {
            xmlSerializer.startTag("", s4);
            a.a(templateWatermarkText.text, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
