package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioMix;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontage;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter extends IXmlAdapter<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage> {
    private HashMap<String, ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>> childElementBinders;

    public TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䠾\u0001"), new ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage templateVideoMontageResponseVideoMontage, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponseVideoMontage.duration = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䠿\u0001"), new ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage templateVideoMontageResponseVideoMontage, String str) throws IOException, XmlPullParserException {
                templateVideoMontageResponseVideoMontage.container = (TemplateVideoMontage.TemplateVideoMontageContainer) QCloudXml.fromXml(xmlPullParser, TemplateVideoMontage.TemplateVideoMontageContainer.class, ProtectedSandApp.s("䠹\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡀\u0001"), new ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage templateVideoMontageResponseVideoMontage, String str) throws IOException, XmlPullParserException {
                templateVideoMontageResponseVideoMontage.video = (TemplateVideoMontage.TemplateVideoMontageVideo) QCloudXml.fromXml(xmlPullParser, TemplateVideoMontage.TemplateVideoMontageVideo.class, ProtectedSandApp.s("䠺\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡁\u0001"), new ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage templateVideoMontageResponseVideoMontage, String str) throws IOException, XmlPullParserException {
                templateVideoMontageResponseVideoMontage.audio = (TemplateVideoMontage.TemplateVideoMontageAudio) QCloudXml.fromXml(xmlPullParser, TemplateVideoMontage.TemplateVideoMontageAudio.class, ProtectedSandApp.s("䠻\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡂\u0001"), new ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage templateVideoMontageResponseVideoMontage, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageResponseVideoMontage.scene = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡃\u0001"), new ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage templateVideoMontageResponseVideoMontage, String str) throws IOException, XmlPullParserException {
                templateVideoMontageResponseVideoMontage.audioMix = (AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䠼\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡄\u0001"), new ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontageResponse$TemplateVideoMontageResponseVideoMontage$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage templateVideoMontageResponseVideoMontage, String str) throws IOException, XmlPullParserException {
                if (templateVideoMontageResponseVideoMontage.audioMixArray == null) {
                    templateVideoMontageResponseVideoMontage.audioMixArray = new ArrayList();
                }
                templateVideoMontageResponseVideoMontage.audioMixArray.add((AudioMix) QCloudXml.fromXml(xmlPullParser, AudioMix.class, ProtectedSandApp.s("䠽\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage templateVideoMontageResponseVideoMontage = new TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVideoMontageResponse.TemplateVideoMontageResponseVideoMontage> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateVideoMontageResponseVideoMontage, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䡅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateVideoMontageResponseVideoMontage;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateVideoMontageResponseVideoMontage;
    }
}
