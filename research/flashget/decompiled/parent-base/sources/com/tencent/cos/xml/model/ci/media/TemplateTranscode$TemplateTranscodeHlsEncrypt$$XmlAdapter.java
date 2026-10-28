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
public class TemplateTranscode$TemplateTranscodeHlsEncrypt$$XmlAdapter extends IXmlAdapter<TemplateTranscode.TemplateTranscodeHlsEncrypt> {
    private HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeHlsEncrypt>> childElementBinders;

    public TemplateTranscode$TemplateTranscodeHlsEncrypt$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeHlsEncrypt>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䟃\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeHlsEncrypt>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeHlsEncrypt$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeHlsEncrypt templateTranscodeHlsEncrypt, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeHlsEncrypt.isHlsEncrypt = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟄\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeHlsEncrypt>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeHlsEncrypt$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeHlsEncrypt templateTranscodeHlsEncrypt, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeHlsEncrypt.uriKey = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscode.TemplateTranscodeHlsEncrypt fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscode.TemplateTranscodeHlsEncrypt templateTranscodeHlsEncrypt = new TemplateTranscode.TemplateTranscodeHlsEncrypt();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscode.TemplateTranscodeHlsEncrypt> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeHlsEncrypt, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䟅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeHlsEncrypt;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeHlsEncrypt;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateTranscode.TemplateTranscodeHlsEncrypt templateTranscodeHlsEncrypt, String str) throws IOException, XmlPullParserException {
        if (templateTranscodeHlsEncrypt == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䟅\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateTranscodeHlsEncrypt.isHlsEncrypt != null) {
            String s4 = ProtectedSandApp.s("䟃\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateTranscodeHlsEncrypt.isHlsEncrypt, xmlSerializer, "", s4);
        }
        if (templateTranscodeHlsEncrypt.uriKey != null) {
            String s5 = ProtectedSandApp.s("䟄\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateTranscodeHlsEncrypt.uriKey, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
