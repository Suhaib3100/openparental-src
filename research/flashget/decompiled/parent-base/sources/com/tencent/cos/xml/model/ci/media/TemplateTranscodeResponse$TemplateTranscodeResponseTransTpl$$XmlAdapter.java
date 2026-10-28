package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.TemplateTranscode;
import com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter extends IXmlAdapter<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl> {
    private HashMap<String, ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>> childElementBinders;

    public TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䠈\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl templateTranscodeResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateTranscodeResponseTransTpl.timeInterval = (TemplateTranscode.TemplateTranscodeTimeInterval) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeTimeInterval.class, ProtectedSandApp.s("䠁\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠉\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl templateTranscodeResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateTranscodeResponseTransTpl.container = (TemplateTranscode.TemplateTranscodeContainer) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeContainer.class, ProtectedSandApp.s("䠂\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠊\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl templateTranscodeResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateTranscodeResponseTransTpl.video = (TemplateTranscode.TemplateTranscodeVideo) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeVideo.class, ProtectedSandApp.s("䠃\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠋\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl templateTranscodeResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateTranscodeResponseTransTpl.audio = (TemplateTranscode.TemplateTranscodeAudio) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeAudio.class, ProtectedSandApp.s("䠄\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠌\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl templateTranscodeResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateTranscodeResponseTransTpl.transConfig = (TemplateTranscode.TemplateTranscodeTransConfig) QCloudXml.fromXml(xmlPullParser, TemplateTranscode.TemplateTranscodeTransConfig.class, ProtectedSandApp.s("䠅\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠍\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl templateTranscodeResponseTransTpl, String str) throws IOException, XmlPullParserException {
                templateTranscodeResponseTransTpl.audioMix = (AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䠆\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠎\u0001"), new ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateTranscodeResponse$TemplateTranscodeResponseTransTpl$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl templateTranscodeResponseTransTpl, String str) throws IOException, XmlPullParserException {
                if (templateTranscodeResponseTransTpl.audioMixArray == null) {
                    templateTranscodeResponseTransTpl.audioMixArray = new ArrayList();
                }
                templateTranscodeResponseTransTpl.audioMixArray.add((AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䠇\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl templateTranscodeResponseTransTpl = new TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateTranscodeResponse.TemplateTranscodeResponseTransTpl> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateTranscodeResponseTransTpl, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䠏\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateTranscodeResponseTransTpl;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateTranscodeResponseTransTpl;
    }
}
