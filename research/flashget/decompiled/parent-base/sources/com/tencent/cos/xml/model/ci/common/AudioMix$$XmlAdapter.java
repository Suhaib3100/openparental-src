package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AudioMix$$XmlAdapter extends IXmlAdapter<AudioMix> {
    private HashMap<String, ChildElementBinder<AudioMix>> childElementBinders;

    public AudioMix$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AudioMix>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䇦\u0001"), new ChildElementBinder<AudioMix>() { // from class: com.tencent.cos.xml.model.ci.common.AudioMix$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AudioMix audioMix, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioMix.audioSource = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇧\u0001"), new ChildElementBinder<AudioMix>() { // from class: com.tencent.cos.xml.model.ci.common.AudioMix$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AudioMix audioMix, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioMix.mixMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇨\u0001"), new ChildElementBinder<AudioMix>() { // from class: com.tencent.cos.xml.model.ci.common.AudioMix$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AudioMix audioMix, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioMix.replace = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇩\u0001"), new ChildElementBinder<AudioMix>() { // from class: com.tencent.cos.xml.model.ci.common.AudioMix$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AudioMix audioMix, String str) throws IOException, XmlPullParserException {
                audioMix.effectConfig = (EffectConfig) QCloudXml.fromXml(xmlPullParser, EffectConfig.class, ProtectedSandApp.s("䇥\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AudioMix fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AudioMix audioMix = new AudioMix();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AudioMix> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, audioMix, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䇪\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return audioMix;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return audioMix;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AudioMix audioMix, String str) throws IOException, XmlPullParserException {
        if (audioMix == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䇪\u0001");
        }
        xmlSerializer.startTag("", str);
        if (audioMix.audioSource != null) {
            String s4 = ProtectedSandApp.s("䇦\u0001");
            xmlSerializer.startTag("", s4);
            a.a(audioMix.audioSource, xmlSerializer, "", s4);
        }
        if (audioMix.mixMode != null) {
            String s5 = ProtectedSandApp.s("䇧\u0001");
            xmlSerializer.startTag("", s5);
            a.a(audioMix.mixMode, xmlSerializer, "", s5);
        }
        if (audioMix.replace != null) {
            String s6 = ProtectedSandApp.s("䇨\u0001");
            xmlSerializer.startTag("", s6);
            a.a(audioMix.replace, xmlSerializer, "", s6);
        }
        EffectConfig effectConfig = audioMix.effectConfig;
        if (effectConfig != null) {
            QCloudXml.toXml(xmlSerializer, effectConfig, ProtectedSandApp.s("䇩\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
