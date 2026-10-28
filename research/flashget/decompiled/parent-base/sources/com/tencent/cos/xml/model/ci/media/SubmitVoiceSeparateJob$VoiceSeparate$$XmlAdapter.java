package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJob$VoiceSeparate$$XmlAdapter extends IXmlAdapter<SubmitVoiceSeparateJob.VoiceSeparate> {
    private HashMap<String, ChildElementBinder<SubmitVoiceSeparateJob.VoiceSeparate>> childElementBinders;

    public SubmitVoiceSeparateJob$VoiceSeparate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVoiceSeparateJob.VoiceSeparate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䚨\u0001"), new ChildElementBinder<SubmitVoiceSeparateJob.VoiceSeparate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob$VoiceSeparate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJob.VoiceSeparate voiceSeparate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                voiceSeparate.audioMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚩\u0001"), new ChildElementBinder<SubmitVoiceSeparateJob.VoiceSeparate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob$VoiceSeparate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJob.VoiceSeparate voiceSeparate, String str) throws IOException, XmlPullParserException {
                voiceSeparate.audioConfig = (TemplateVoiceSeparate.AudioConfig) QCloudXml.fromXml(xmlPullParser, TemplateVoiceSeparate.AudioConfig.class, ProtectedSandApp.s("䚧\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVoiceSeparateJob.VoiceSeparate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVoiceSeparateJob.VoiceSeparate voiceSeparate = new SubmitVoiceSeparateJob.VoiceSeparate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVoiceSeparateJob.VoiceSeparate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, voiceSeparate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䚪\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return voiceSeparate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return voiceSeparate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVoiceSeparateJob.VoiceSeparate voiceSeparate, String str) throws IOException, XmlPullParserException {
        if (voiceSeparate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䚪\u0001");
        }
        xmlSerializer.startTag("", str);
        if (voiceSeparate.audioMode != null) {
            String s4 = ProtectedSandApp.s("䚨\u0001");
            xmlSerializer.startTag("", s4);
            a.a(voiceSeparate.audioMode, xmlSerializer, "", s4);
        }
        TemplateVoiceSeparate.AudioConfig audioConfig = voiceSeparate.audioConfig;
        if (audioConfig != null) {
            QCloudXml.toXml(xmlSerializer, audioConfig, ProtectedSandApp.s("䚩\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
