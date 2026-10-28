package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateTranscode$TemplateTranscodeDashEncrypt$$XmlAdapter extends IXmlAdapter<TemplateTranscode.TemplateTranscodeDashEncrypt> {
    private HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeDashEncrypt>> childElementBinders;

    public TemplateTranscode$TemplateTranscodeDashEncrypt$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeDashEncrypt>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䟀\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeDashEncrypt>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeDashEncrypt$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeDashEncrypt templateTranscodeDashEncrypt, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeDashEncrypt.isEncrypt = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟁\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeDashEncrypt>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeDashEncrypt$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeDashEncrypt templateTranscodeDashEncrypt, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeDashEncrypt.uriKey = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscode.TemplateTranscodeDashEncrypt fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscode.TemplateTranscodeDashEncrypt templateTranscodeDashEncrypt = new TemplateTranscode.TemplateTranscodeDashEncrypt();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscode.TemplateTranscodeDashEncrypt> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeDashEncrypt, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䟂\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeDashEncrypt;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeDashEncrypt;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateTranscode.TemplateTranscodeDashEncrypt templateTranscodeDashEncrypt, String str) throws IOException, XmlPullParserException {
        if (templateTranscodeDashEncrypt == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䟂\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateTranscodeDashEncrypt.isEncrypt != null) {
            String s4 = ProtectedSandApp.s("䟀\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateTranscodeDashEncrypt.isEncrypt, xmlSerializer, "", s4);
        }
        if (templateTranscodeDashEncrypt.uriKey != null) {
            String s5 = ProtectedSandApp.s("䟁\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateTranscodeDashEncrypt.uriKey, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
