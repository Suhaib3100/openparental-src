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
public class VoiceSeparateTempleteResponseVoiceSeparate$$XmlAdapter extends IXmlAdapter<VoiceSeparateTempleteResponseVoiceSeparate> {
    private HashMap<String, ChildElementBinder<VoiceSeparateTempleteResponseVoiceSeparate>> childElementBinders;

    public VoiceSeparateTempleteResponseVoiceSeparate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VoiceSeparateTempleteResponseVoiceSeparate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䊨\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseVoiceSeparate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseVoiceSeparate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseVoiceSeparate voiceSeparateTempleteResponseVoiceSeparate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparateTempleteResponseVoiceSeparate.audioMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊩\u0001"), new ChildElementBinder<VoiceSeparateTempleteResponseVoiceSeparate>() { // from class: com.tencent.cos.xml.model.ci.common.VoiceSeparateTempleteResponseVoiceSeparate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VoiceSeparateTempleteResponseVoiceSeparate voiceSeparateTempleteResponseVoiceSeparate, String str) throws IOException, XmlPullParserException {
                voiceSeparateTempleteResponseVoiceSeparate.audioConfig = (AudioConfig) QCloudXml.fromXml(xmlPullParser, AudioConfig.class, ProtectedSandApp.s("䊧\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VoiceSeparateTempleteResponseVoiceSeparate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VoiceSeparateTempleteResponseVoiceSeparate voiceSeparateTempleteResponseVoiceSeparate = new VoiceSeparateTempleteResponseVoiceSeparate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VoiceSeparateTempleteResponseVoiceSeparate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, voiceSeparateTempleteResponseVoiceSeparate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䊪\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return voiceSeparateTempleteResponseVoiceSeparate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return voiceSeparateTempleteResponseVoiceSeparate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VoiceSeparateTempleteResponseVoiceSeparate voiceSeparateTempleteResponseVoiceSeparate, String str) throws IOException, XmlPullParserException {
        if (voiceSeparateTempleteResponseVoiceSeparate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䊪\u0001");
        }
        xmlSerializer.startTag("", str);
        if (voiceSeparateTempleteResponseVoiceSeparate.audioMode != null) {
            String s4 = ProtectedSandApp.s("䊨\u0001");
            xmlSerializer.startTag("", s4);
            a.a(voiceSeparateTempleteResponseVoiceSeparate.audioMode, xmlSerializer, "", s4);
        }
        AudioConfig audioConfig = voiceSeparateTempleteResponseVoiceSeparate.audioConfig;
        if (audioConfig != null) {
            QCloudXml.toXml(xmlSerializer, audioConfig, ProtectedSandApp.s("䊩\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
