package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJob;
import com.tencent.cos.xml.model.ci.media.TemplateConcat;
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
public class SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter extends IXmlAdapter<SubmitConcatJob.SubmitConcatJobConcatTemplate> {
    private HashMap<String, ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>> childElementBinders;

    public SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䎷\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
                if (submitConcatJobConcatTemplate.concatFragment == null) {
                    submitConcatJobConcatTemplate.concatFragment = new ArrayList();
                }
                submitConcatJobConcatTemplate.concatFragment.add((SubmitConcatJob.SubmitConcatJobConcatFragment) QCloudXml.fromXml(xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatFragment.class, ProtectedSandApp.s("䎱\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎸\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
                submitConcatJobConcatTemplate.audio = (TemplateConcat.TemplateConcatAudio) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatAudio.class, ProtectedSandApp.s("䎲\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎹\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
                submitConcatJobConcatTemplate.video = (TemplateConcat.TemplateConcatVideo) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatVideo.class, ProtectedSandApp.s("䎳\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎺\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
                submitConcatJobConcatTemplate.container = (TemplateConcat.TemplateConcatContainer) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatContainer.class, ProtectedSandApp.s("䎴\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎻\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
                submitConcatJobConcatTemplate.audioMix = (AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䎵\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎼\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
                if (submitConcatJobConcatTemplate.audioMixArray == null) {
                    submitConcatJobConcatTemplate.audioMixArray = new ArrayList();
                }
                submitConcatJobConcatTemplate.audioMixArray.add((AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䎶\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎽\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobConcatTemplate.index = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎾\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobConcatTemplate.directConcat = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitConcatJob.SubmitConcatJobConcatTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate = new SubmitConcatJob.SubmitConcatJobConcatTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitConcatJobConcatTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䎿\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitConcatJobConcatTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitConcatJobConcatTemplate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate, String str) throws IOException, XmlPullParserException {
        if (submitConcatJobConcatTemplate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䎿\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitConcatJobConcatTemplate.concatFragment != null) {
            for (int i4 = 0; i4 < submitConcatJobConcatTemplate.concatFragment.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, submitConcatJobConcatTemplate.concatFragment.get(i4), ProtectedSandApp.s("䎷\u0001"));
            }
        }
        TemplateConcat.TemplateConcatAudio templateConcatAudio = submitConcatJobConcatTemplate.audio;
        if (templateConcatAudio != null) {
            QCloudXml.toXml(xmlSerializer, templateConcatAudio, ProtectedSandApp.s("䎸\u0001"));
        }
        TemplateConcat.TemplateConcatVideo templateConcatVideo = submitConcatJobConcatTemplate.video;
        if (templateConcatVideo != null) {
            QCloudXml.toXml(xmlSerializer, templateConcatVideo, ProtectedSandApp.s("䎹\u0001"));
        }
        TemplateConcat.TemplateConcatContainer templateConcatContainer = submitConcatJobConcatTemplate.container;
        if (templateConcatContainer != null) {
            QCloudXml.toXml(xmlSerializer, templateConcatContainer, ProtectedSandApp.s("䎺\u0001"));
        }
        AudioMix audioMix = submitConcatJobConcatTemplate.audioMix;
        String s4 = ProtectedSandApp.s("䎻\u0001");
        if (audioMix != null) {
            QCloudXml.toXml(xmlSerializer, audioMix, s4);
        }
        if (submitConcatJobConcatTemplate.audioMixArray != null) {
            for (int i5 = 0; i5 < submitConcatJobConcatTemplate.audioMixArray.size(); i5++) {
                QCloudXml.toXml(xmlSerializer, submitConcatJobConcatTemplate.audioMixArray.get(i5), s4);
            }
        }
        if (submitConcatJobConcatTemplate.index != null) {
            String s5 = ProtectedSandApp.s("䎽\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitConcatJobConcatTemplate.index, xmlSerializer, "", s5);
        }
        if (submitConcatJobConcatTemplate.directConcat != null) {
            String s6 = ProtectedSandApp.s("䎾\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitConcatJobConcatTemplate.directConcat, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
