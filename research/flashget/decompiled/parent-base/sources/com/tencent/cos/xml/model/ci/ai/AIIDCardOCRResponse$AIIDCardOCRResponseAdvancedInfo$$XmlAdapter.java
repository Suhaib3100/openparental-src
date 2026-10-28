package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIIDCardOCRResponse$AIIDCardOCRResponseAdvancedInfo$$XmlAdapter extends IXmlAdapter<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo> {
    private HashMap<String, ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo>> childElementBinders;

    public AIIDCardOCRResponse$AIIDCardOCRResponseAdvancedInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㭷\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseAdvancedInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo aIIDCardOCRResponseAdvancedInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseAdvancedInfo.idCard = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭸\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseAdvancedInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo aIIDCardOCRResponseAdvancedInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseAdvancedInfo.portrait = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭹\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseAdvancedInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo aIIDCardOCRResponseAdvancedInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseAdvancedInfo.quality = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭺\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseAdvancedInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo aIIDCardOCRResponseAdvancedInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseAdvancedInfo.borderCodeValue = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭻\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseAdvancedInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo aIIDCardOCRResponseAdvancedInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseAdvancedInfo.warnInfos = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo aIIDCardOCRResponseAdvancedInfo = new AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIIDCardOCRResponseAdvancedInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㭼\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIIDCardOCRResponseAdvancedInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIIDCardOCRResponseAdvancedInfo;
    }
}
