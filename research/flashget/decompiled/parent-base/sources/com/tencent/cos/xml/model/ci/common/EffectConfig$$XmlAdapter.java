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
public class EffectConfig$$XmlAdapter extends IXmlAdapter<EffectConfig> {
    private HashMap<String, ChildElementBinder<EffectConfig>> childElementBinders;

    public EffectConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<EffectConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䈀\u0001"), new ChildElementBinder<EffectConfig>() { // from class: com.tencent.cos.xml.model.ci.common.EffectConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, EffectConfig effectConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                effectConfig.enableStartFadein = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈁\u0001"), new ChildElementBinder<EffectConfig>() { // from class: com.tencent.cos.xml.model.ci.common.EffectConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, EffectConfig effectConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                effectConfig.startFadeinTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈂\u0001"), new ChildElementBinder<EffectConfig>() { // from class: com.tencent.cos.xml.model.ci.common.EffectConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, EffectConfig effectConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                effectConfig.enableEndFadeout = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈃\u0001"), new ChildElementBinder<EffectConfig>() { // from class: com.tencent.cos.xml.model.ci.common.EffectConfig$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, EffectConfig effectConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                effectConfig.endFadeoutTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈄\u0001"), new ChildElementBinder<EffectConfig>() { // from class: com.tencent.cos.xml.model.ci.common.EffectConfig$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, EffectConfig effectConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                effectConfig.enableBgmFade = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈅\u0001"), new ChildElementBinder<EffectConfig>() { // from class: com.tencent.cos.xml.model.ci.common.EffectConfig$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, EffectConfig effectConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                effectConfig.bgmFadeTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public EffectConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        EffectConfig effectConfig = new EffectConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<EffectConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, effectConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䈆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return effectConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return effectConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, EffectConfig effectConfig, String str) throws IOException, XmlPullParserException {
        if (effectConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䈆\u0001");
        }
        xmlSerializer.startTag("", str);
        if (effectConfig.enableStartFadein != null) {
            String s4 = ProtectedSandApp.s("䈀\u0001");
            xmlSerializer.startTag("", s4);
            a.a(effectConfig.enableStartFadein, xmlSerializer, "", s4);
        }
        if (effectConfig.startFadeinTime != null) {
            String s5 = ProtectedSandApp.s("䈁\u0001");
            xmlSerializer.startTag("", s5);
            a.a(effectConfig.startFadeinTime, xmlSerializer, "", s5);
        }
        if (effectConfig.enableEndFadeout != null) {
            String s6 = ProtectedSandApp.s("䈂\u0001");
            xmlSerializer.startTag("", s6);
            a.a(effectConfig.enableEndFadeout, xmlSerializer, "", s6);
        }
        if (effectConfig.endFadeoutTime != null) {
            String s7 = ProtectedSandApp.s("䈃\u0001");
            xmlSerializer.startTag("", s7);
            a.a(effectConfig.endFadeoutTime, xmlSerializer, "", s7);
        }
        if (effectConfig.enableBgmFade != null) {
            String s10 = ProtectedSandApp.s("䈄\u0001");
            xmlSerializer.startTag("", s10);
            a.a(effectConfig.enableBgmFade, xmlSerializer, "", s10);
        }
        if (effectConfig.bgmFadeTime != null) {
            String s11 = ProtectedSandApp.s("䈅\u0001");
            xmlSerializer.startTag("", s11);
            a.a(effectConfig.bgmFadeTime, xmlSerializer, "", s11);
        }
        xmlSerializer.endTag("", str);
    }
}
