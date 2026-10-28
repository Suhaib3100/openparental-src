package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontage;
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
public class SubmitVideoMontageJob$SubmitVideoMontageJobVideoMontage$$XmlAdapter extends IXmlAdapter<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage> {
    private HashMap<String, ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage>> childElementBinders;

    public SubmitVideoMontageJob$SubmitVideoMontageJobVideoMontage$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䗷\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobVideoMontage$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage, String str) throws IOException, XmlPullParserException {
                submitVideoMontageJobVideoMontage.container = (TemplateVideoMontage.TemplateVideoMontageContainer) QCloudXml.fromXml(xmlPullParser, TemplateVideoMontage.TemplateVideoMontageContainer.class, ProtectedSandApp.s("䗱\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗸\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobVideoMontage$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage, String str) throws IOException, XmlPullParserException {
                submitVideoMontageJobVideoMontage.video = (TemplateVideoMontage.TemplateVideoMontageVideo) QCloudXml.fromXml(xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo.class, ProtectedSandApp.s("䗲\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗹\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobVideoMontage$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage, String str) throws IOException, XmlPullParserException {
                submitVideoMontageJobVideoMontage.audio = (TemplateVideoMontage.TemplateVideoMontageAudio) QCloudXml.fromXml(xmlPullParser, TemplateVideoMontage.TemplateVideoMontageAudio.class, ProtectedSandApp.s("䗳\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗺\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobVideoMontage$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage, String str) throws IOException, XmlPullParserException {
                submitVideoMontageJobVideoMontage.transConfig = (TemplateTranscode.TemplateTranscodeTransConfig) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig.class, ProtectedSandApp.s("䗴\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗻\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobVideoMontage$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage, String str) throws IOException, XmlPullParserException {
                submitVideoMontageJobVideoMontage.audioMix = (AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䗵\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗼\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobVideoMontage$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage, String str) throws IOException, XmlPullParserException {
                if (submitVideoMontageJobVideoMontage.audioMixArray == null) {
                    submitVideoMontageJobVideoMontage.audioMixArray = new ArrayList();
                }
                submitVideoMontageJobVideoMontage.audioMixArray.add((AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䗶\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage = new SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoMontageJobVideoMontage, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䗽\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoMontageJobVideoMontage;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoMontageJobVideoMontage;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage, String str) throws IOException, XmlPullParserException {
        if (submitVideoMontageJobVideoMontage == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䗽\u0001");
        }
        xmlSerializer.startTag("", str);
        TemplateVideoMontage.TemplateVideoMontageContainer templateVideoMontageContainer = submitVideoMontageJobVideoMontage.container;
        if (templateVideoMontageContainer != null) {
            QCloudXml.toXml(xmlSerializer, templateVideoMontageContainer, ProtectedSandApp.s("䗷\u0001"));
        }
        TemplateVideoMontage.TemplateVideoMontageVideo templateVideoMontageVideo = submitVideoMontageJobVideoMontage.video;
        if (templateVideoMontageVideo != null) {
            QCloudXml.toXml(xmlSerializer, templateVideoMontageVideo, ProtectedSandApp.s("䗸\u0001"));
        }
        TemplateVideoMontage.TemplateVideoMontageAudio templateVideoMontageAudio = submitVideoMontageJobVideoMontage.audio;
        if (templateVideoMontageAudio != null) {
            QCloudXml.toXml(xmlSerializer, templateVideoMontageAudio, ProtectedSandApp.s("䗹\u0001"));
        }
        TemplateTranscode.TemplateTranscodeTransConfig templateTranscodeTransConfig = submitVideoMontageJobVideoMontage.transConfig;
        if (templateTranscodeTransConfig != null) {
            QCloudXml.toXml(xmlSerializer, templateTranscodeTransConfig, ProtectedSandApp.s("䗺\u0001"));
        }
        AudioMix audioMix = submitVideoMontageJobVideoMontage.audioMix;
        String s4 = ProtectedSandApp.s("䗻\u0001");
        if (audioMix != null) {
            QCloudXml.toXml(xmlSerializer, audioMix, s4);
        }
        if (submitVideoMontageJobVideoMontage.audioMixArray != null) {
            for (int i4 = 0; i4 < submitVideoMontageJobVideoMontage.audioMixArray.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, submitVideoMontageJobVideoMontage.audioMixArray.get(i4), s4);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
