package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAudioAuditJobResponse$AudioAuditScenarioInfo$$XmlAdapter extends IXmlAdapter<GetAudioAuditJobResponse.AudioAuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<GetAudioAuditJobResponse.AudioAuditScenarioInfo>> childElementBinders;

    public GetAudioAuditJobResponse$AudioAuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAudioAuditJobResponse.AudioAuditScenarioInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䲴\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo audioAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                audioAuditScenarioInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲵\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo audioAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                audioAuditScenarioInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲶\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditScenarioInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo audioAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditScenarioInfo.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲷\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditScenarioInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo audioAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditScenarioInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲸\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditScenarioInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo audioAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditScenarioInfo.subLabel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAudioAuditJobResponse.AudioAuditScenarioInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAudioAuditJobResponse.AudioAuditScenarioInfo audioAuditScenarioInfo = new GetAudioAuditJobResponse.AudioAuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAudioAuditJobResponse.AudioAuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, audioAuditScenarioInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䲹\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return audioAuditScenarioInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return audioAuditScenarioInfo;
    }
}
