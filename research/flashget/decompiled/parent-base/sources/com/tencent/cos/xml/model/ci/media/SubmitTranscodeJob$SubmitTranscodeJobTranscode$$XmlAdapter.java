package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJob.SubmitTranscodeJobTranscode> {
    private HashMap<String, ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>> childElementBinders;

    public SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䖣\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobTranscode.timeInterval = (TemplateTranscode.TemplateTranscodeTimeInterval) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeTimeInterval.class, ProtectedSandApp.s("䖜\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖤\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobTranscode.container = (TemplateTranscode.TemplateTranscodeContainer) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeContainer.class, ProtectedSandApp.s("䖝\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖥\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobTranscode.video = (TemplateTranscode.TemplateTranscodeVideo) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeVideo.class, ProtectedSandApp.s("䖞\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖦\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobTranscode.audio = (TemplateTranscode.TemplateTranscodeAudio) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeAudio.class, ProtectedSandApp.s("䖟\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖧\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobTranscode.transConfig = (TemplateTranscode.TemplateTranscodeTransConfig) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig.class, ProtectedSandApp.s("䖠\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖨\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobTranscode.audioMix = (AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䖡\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖩\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobTranscode$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode, String str) throws IOException, XmlPullParserException {
                if (submitTranscodeJobTranscode.audioMixArray == null) {
                    submitTranscodeJobTranscode.audioMixArray = new ArrayList();
                }
                submitTranscodeJobTranscode.audioMixArray.add((AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䖢\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitTranscodeJob.SubmitTranscodeJobTranscode fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode = new SubmitTranscodeJob.SubmitTranscodeJobTranscode();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobTranscode> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitTranscodeJobTranscode, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䖪\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitTranscodeJobTranscode;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitTranscodeJobTranscode;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode, String str) throws IOException, XmlPullParserException {
        if (submitTranscodeJobTranscode == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䖪\u0001");
        }
        xmlSerializer.startTag("", str);
        TemplateTranscode.TemplateTranscodeTimeInterval templateTranscodeTimeInterval = submitTranscodeJobTranscode.timeInterval;
        if (templateTranscodeTimeInterval != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeTimeInterval, ProtectedSandApp.s("䖣\u0001"));
        }
        TemplateTranscode.TemplateTranscodeContainer templateTranscodeContainer = submitTranscodeJobTranscode.container;
        if (templateTranscodeContainer != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeContainer, ProtectedSandApp.s("䖤\u0001"));
        }
        TemplateTranscode.TemplateTranscodeVideo templateTranscodeVideo = submitTranscodeJobTranscode.video;
        if (templateTranscodeVideo != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeVideo, ProtectedSandApp.s("䖥\u0001"));
        }
        TemplateTranscode.TemplateTranscodeAudio templateTranscodeAudio = submitTranscodeJobTranscode.audio;
        if (templateTranscodeAudio != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeAudio, ProtectedSandApp.s("䖦\u0001"));
        }
        TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig = submitTranscodeJobTranscode.transConfig;
        if (templateTranscodeTransConfig != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeTransConfig, ProtectedSandApp.s("䖧\u0001"));
        }
        AudioMix audioMix = submitTranscodeJobTranscode.audioMix;
        String s4 = ProtectedSandApp.s("䖨\u0001");
        if (audioMix != null) {
            QCloudXml.toXml(xmlSerializer, audioMix, s4);
        }
        if (submitTranscodeJobTranscode.audioMixArray != null) {
            for (int i4 = 0; i4 < submitTranscodeJobTranscode.audioMixArray.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, submitTranscodeJobTranscode.audioMixArray.get(i4), s4);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
