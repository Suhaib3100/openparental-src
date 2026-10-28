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
public class AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter extends IXmlAdapter<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo> {
    private HashMap<String, ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>> childElementBinders;

    public AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㭽\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseIdInfo.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭾\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseIdInfo.sex = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭿\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseIdInfo.nation = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮀\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseIdInfo.birth = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮁\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseIdInfo.address = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮂\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseIdInfo.idNum = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮃\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseIdInfo.authority = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮄\u0001"), new ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$AIIDCardOCRResponseIdInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIIDCardOCRResponseIdInfo.validDate = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo aIIDCardOCRResponseIdInfo = new AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIIDCardOCRResponseIdInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㮅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIIDCardOCRResponseIdInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIIDCardOCRResponseIdInfo;
    }
}
