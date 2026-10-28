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
public class TemplateTranscode$TemplateTranscodeTimeInterval$$XmlAdapter extends IXmlAdapter<TemplateTranscode.TemplateTranscodeTimeInterval> {
    private HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeTimeInterval>> childElementBinders;

    public TemplateTranscode$TemplateTranscodeTimeInterval$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscode.TemplateTranscodeTimeInterval>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䟆\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTimeInterval>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTimeInterval$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTimeInterval templateTranscodeTimeInterval, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTimeInterval.start = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䟇\u0001"), new ChildElementBinder<TemplateTranscode.TemplateTranscodeTimeInterval>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscode$TemplateTranscodeTimeInterval$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscode.TemplateTranscodeTimeInterval templateTranscodeTimeInterval, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateTranscodeTimeInterval.duration = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscode.TemplateTranscodeTimeInterval fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscode.TemplateTranscodeTimeInterval templateTranscodeTimeInterval = new TemplateTranscode.TemplateTranscodeTimeInterval();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscode.TemplateTranscodeTimeInterval> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeTimeInterval, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䟈\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeTimeInterval;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeTimeInterval;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateTranscode.TemplateTranscodeTimeInterval templateTranscodeTimeInterval, String str) throws IOException, XmlPullParserException {
        if (templateTranscodeTimeInterval == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䟈\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateTranscodeTimeInterval.start != null) {
            String s4 = ProtectedSandApp.s("䟆\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateTranscodeTimeInterval.start, xmlSerializer, "", s4);
        }
        if (templateTranscodeTimeInterval.duration != null) {
            String s5 = ProtectedSandApp.s("䟇\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateTranscodeTimeInterval.duration, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
