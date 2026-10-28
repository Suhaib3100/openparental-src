package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.common.AudioMix;
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
public class TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter extends IXmlAdapter<TemplateConcat.TemplateConcatConcatTemplate> {
    private HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>> childElementBinders;

    public TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䜡\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
                if (templateConcatConcatTemplate.concatFragment == null) {
                    templateConcatConcatTemplate.concatFragment = new ArrayList();
                }
                templateConcatConcatTemplate.concatFragment.add((TemplateConcat.TemplateConcatConcatFragment) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatConcatFragment.class, ProtectedSandApp.s("䜚\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜢\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
                templateConcatConcatTemplate.audio = (TemplateConcat.TemplateConcatAudio) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatAudio.class, ProtectedSandApp.s("䜛\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜣\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
                templateConcatConcatTemplate.video = (TemplateConcat.TemplateConcatVideo) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatVideo.class, ProtectedSandApp.s("䜜\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜤\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
                templateConcatConcatTemplate.container = (TemplateConcat.TemplateConcatContainer) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatContainer.class, ProtectedSandApp.s("䜝\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜥\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatConcatTemplate.directConcat = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜦\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
                templateConcatConcatTemplate.sceneChangeInfo = (TemplateConcat.TemplateConcatSceneChangeInfo) QCloudXml.fromXml(xmlPullParser, TemplateConcat.TemplateConcatSceneChangeInfo.class, ProtectedSandApp.s("䜞\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜧\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
                templateConcatConcatTemplate.audioMix = (AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䜟\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜨\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatTemplate$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
                if (templateConcatConcatTemplate.audioMixArray == null) {
                    templateConcatConcatTemplate.audioMixArray = new ArrayList();
                }
                templateConcatConcatTemplate.audioMixArray.add((AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䜠\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateConcat.TemplateConcatConcatTemplate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate = new TemplateConcat.TemplateConcatConcatTemplate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateConcat.TemplateConcatConcatTemplate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateConcatConcatTemplate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䜩\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateConcatConcatTemplate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateConcatConcatTemplate;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateConcat.TemplateConcatConcatTemplate templateConcatConcatTemplate, String str) throws IOException, XmlPullParserException {
        if (templateConcatConcatTemplate == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䜩\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateConcatConcatTemplate.concatFragment != null) {
            for (int i4 = 0; i4 < templateConcatConcatTemplate.concatFragment.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, templateConcatConcatTemplate.concatFragment.get(i4), ProtectedSandApp.s("䜡\u0001"));
            }
        }
        TemplateConcat.TemplateConcatAudio templateConcatAudio = templateConcatConcatTemplate.audio;
        if (templateConcatAudio != null) {
            QCloudXml.toXml(xmlSerializer, templateConcatAudio, ProtectedSandApp.s("䜢\u0001"));
        }
        TemplateConcat.TemplateConcatVideo templateConcatVideo = templateConcatConcatTemplate.video;
        if (templateConcatVideo != null) {
            QCloudXml.toXml(xmlSerializer, templateConcatVideo, ProtectedSandApp.s("䜣\u0001"));
        }
        TemplateConcat.TemplateConcatContainer templateConcatContainer = templateConcatConcatTemplate.container;
        if (templateConcatContainer != null) {
            QCloudXml.toXml(xmlSerializer, templateConcatContainer, ProtectedSandApp.s("䜤\u0001"));
        }
        if (templateConcatConcatTemplate.directConcat != null) {
            String s4 = ProtectedSandApp.s("䜥\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateConcatConcatTemplate.directConcat, xmlSerializer, "", s4);
        }
        TemplateConcat.TemplateConcatSceneChangeInfo templateConcatSceneChangeInfo = templateConcatConcatTemplate.sceneChangeInfo;
        if (templateConcatSceneChangeInfo != null) {
            QCloudXml.toXml(xmlSerializer, templateConcatSceneChangeInfo, ProtectedSandApp.s("䜦\u0001"));
        }
        AudioMix audioMix = templateConcatConcatTemplate.audioMix;
        String s5 = ProtectedSandApp.s("䜧\u0001");
        if (audioMix != null) {
            QCloudXml.toXml(xmlSerializer, audioMix, s5);
        }
        if (templateConcatConcatTemplate.audioMixArray != null) {
            for (int i5 = 0; i5 < templateConcatConcatTemplate.audioMixArray.size(); i5++) {
                QCloudXml.toXml(xmlSerializer, templateConcatConcatTemplate.audioMixArray.get(i5), s5);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
