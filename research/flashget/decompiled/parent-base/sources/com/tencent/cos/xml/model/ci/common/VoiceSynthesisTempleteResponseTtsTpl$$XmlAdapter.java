package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class VoiceSynthesisTempleteResponseTtsTpl$$XmlAdapter extends IXmlAdapter<VoiceSynthesisTempleteResponseTtsTpl> {
    private HashMap<String, ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl>> childElementBinders;

    public VoiceSynthesisTempleteResponseTtsTpl$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䊵\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTtsTpl$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTtsTpl.mode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊶\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTtsTpl$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTtsTpl.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊷\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTtsTpl$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTtsTpl.voiceType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊸\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTtsTpl$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTtsTpl.volume = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊹\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTtsTpl$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTtsTpl.speed = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊺\u0001"), new ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTtsTpl$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSynthesisTempleteResponseTtsTpl.emotion = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VoiceSynthesisTempleteResponseTtsTpl fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl = new VoiceSynthesisTempleteResponseTtsTpl();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VoiceSynthesisTempleteResponseTtsTpl> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, voiceSynthesisTempleteResponseTtsTpl, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䊻\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return voiceSynthesisTempleteResponseTtsTpl;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return voiceSynthesisTempleteResponseTtsTpl;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VoiceSynthesisTempleteResponseTtsTpl voiceSynthesisTempleteResponseTtsTpl, String str) throws IOException, XmlPullParserException {
        if (voiceSynthesisTempleteResponseTtsTpl == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䊻\u0001");
        }
        xmlSerializer.startTag("", str);
        if (voiceSynthesisTempleteResponseTtsTpl.mode != null) {
            String s4 = ProtectedSandApp.s("䊵\u0001");
            xmlSerializer.startTag("", s4);
            a.a(voiceSynthesisTempleteResponseTtsTpl.mode, xmlSerializer, "", s4);
        }
        if (voiceSynthesisTempleteResponseTtsTpl.codec != null) {
            String s5 = ProtectedSandApp.s("䊶\u0001");
            xmlSerializer.startTag("", s5);
            a.a(voiceSynthesisTempleteResponseTtsTpl.codec, xmlSerializer, "", s5);
        }
        if (voiceSynthesisTempleteResponseTtsTpl.voiceType != null) {
            String s6 = ProtectedSandApp.s("䊷\u0001");
            xmlSerializer.startTag("", s6);
            a.a(voiceSynthesisTempleteResponseTtsTpl.voiceType, xmlSerializer, "", s6);
        }
        if (voiceSynthesisTempleteResponseTtsTpl.volume != null) {
            String s7 = ProtectedSandApp.s("䊸\u0001");
            xmlSerializer.startTag("", s7);
            a.a(voiceSynthesisTempleteResponseTtsTpl.volume, xmlSerializer, "", s7);
        }
        if (voiceSynthesisTempleteResponseTtsTpl.speed != null) {
            String s10 = ProtectedSandApp.s("䊹\u0001");
            xmlSerializer.startTag("", s10);
            a.a(voiceSynthesisTempleteResponseTtsTpl.speed, xmlSerializer, "", s10);
        }
        if (voiceSynthesisTempleteResponseTtsTpl.emotion != null) {
            String s11 = ProtectedSandApp.s("䊺\u0001");
            xmlSerializer.startTag("", s11);
            a.a(voiceSynthesisTempleteResponseTtsTpl.emotion, xmlSerializer, "", s11);
        }
        xmlSerializer.endTag("", str);
    }
}
