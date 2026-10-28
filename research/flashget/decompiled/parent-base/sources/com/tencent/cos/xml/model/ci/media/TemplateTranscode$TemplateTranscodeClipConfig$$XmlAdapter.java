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
public class TemplateTranscode$TemplateTranscodeClipConfig$$XmlAdapter extends IXmlAdapter<TemplateTranscode.TemplateTranscodeClipConfig> {
    private HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeClipConfig>> childElementBinders;

    public TemplateTranscode$TemplateTranscodeClipConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeClipConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䞺\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeClipConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeClipConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeClipConfig templateTranscodeClipConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeClipConfig.duration = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscode.TemplateTranscodeClipConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscode.TemplateTranscodeClipConfig templateTranscodeClipConfig = new TemplateTranscode.TemplateTranscodeClipConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscode.TemplateTranscodeClipConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeClipConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䞻\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeClipConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeClipConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateTranscode.TemplateTranscodeClipConfig templateTranscodeClipConfig, String str) throws IOException, XmlPullParserException {
        if (templateTranscodeClipConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䞻\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateTranscodeClipConfig.duration != null) {
            String s4 = ProtectedSandApp.s("䞺\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateTranscodeClipConfig.duration, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
