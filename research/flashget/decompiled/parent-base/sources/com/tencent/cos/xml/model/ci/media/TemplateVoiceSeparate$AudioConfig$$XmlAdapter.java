package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateVoiceSeparate$AudioConfig$$XmlAdapter extends IXmlAdapter<TemplateVoiceSeparate.AudioConfig> {
    private HashMap<String, ChildElementBinder<TemplateVoiceSeparate.AudioConfig>> childElementBinders;

    public TemplateVoiceSeparate$AudioConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVoiceSeparate.AudioConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䡋\u0001"), new ChildElementBinder<TemplateVoiceSeparate.AudioConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate$AudioConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparate.AudioConfig audioConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioConfig.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡌\u0001"), new ChildElementBinder<TemplateVoiceSeparate.AudioConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate$AudioConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparate.AudioConfig audioConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioConfig.samplerate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡍\u0001"), new ChildElementBinder<TemplateVoiceSeparate.AudioConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate$AudioConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparate.AudioConfig audioConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioConfig.bitrate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡎\u0001"), new ChildElementBinder<TemplateVoiceSeparate.AudioConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate$AudioConfig$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparate.AudioConfig audioConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioConfig.channels = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVoiceSeparate.AudioConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVoiceSeparate.AudioConfig audioConfig = new TemplateVoiceSeparate.AudioConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVoiceSeparate.AudioConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, audioConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䡏\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return audioConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return audioConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateVoiceSeparate.AudioConfig audioConfig, String str) throws IOException, XmlPullParserException {
        if (audioConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䡏\u0001");
        }
        xmlSerializer.startTag("", str);
        if (audioConfig.codec != null) {
            String s4 = ProtectedSandApp.s("䡋\u0001");
            xmlSerializer.startTag("", s4);
            a.a(audioConfig.codec, xmlSerializer, "", s4);
        }
        if (audioConfig.samplerate != null) {
            String s5 = ProtectedSandApp.s("䡌\u0001");
            xmlSerializer.startTag("", s5);
            a.a(audioConfig.samplerate, xmlSerializer, "", s5);
        }
        if (audioConfig.bitrate != null) {
            String s6 = ProtectedSandApp.s("䡍\u0001");
            xmlSerializer.startTag("", s6);
            a.a(audioConfig.bitrate, xmlSerializer, "", s6);
        }
        if (audioConfig.channels != null) {
            String s7 = ProtectedSandApp.s("䡎\u0001");
            xmlSerializer.startTag("", s7);
            a.a(audioConfig.channels, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
