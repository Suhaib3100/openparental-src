package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAudioAuditJobResponse$AudioSection$$XmlAdapter extends IXmlAdapter<GetAudioAuditJobResponse.AudioSection> {
    private HashMap<String, ChildElementBinder<GetAudioAuditJobResponse.AudioSection>> childElementBinders;

    public GetAudioAuditJobResponse$AudioSection$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAudioAuditJobResponse.AudioSection>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䳀\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioSection.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳁\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioSection.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳂\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                audioSection.offsetTime = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳃\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                audioSection.duration = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳄\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioSection.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳅\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioSection.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳆\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                audioSection.result = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳇\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                if (audioSection.languageResults == null) {
                    audioSection.languageResults = new ArrayList();
                }
                audioSection.languageResults.add((TextAuditScenarioInfo.Results) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.Results.class, ProtectedSandApp.s("䲾\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳈\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                audioSection.pornInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䲿\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳉\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                audioSection.terrorismInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䲺\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳊\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                audioSection.politicsInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䲻\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳋\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                audioSection.adsInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䲼\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳌\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioSection>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioSection$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioSection audioSection, String str) throws IOException, XmlPullParserException {
                audioSection.teenagerInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䲽\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAudioAuditJobResponse.AudioSection fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAudioAuditJobResponse.AudioSection audioSection = new GetAudioAuditJobResponse.AudioSection();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAudioAuditJobResponse.AudioSection> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, audioSection, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䳍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return audioSection;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return audioSection;
    }
}
