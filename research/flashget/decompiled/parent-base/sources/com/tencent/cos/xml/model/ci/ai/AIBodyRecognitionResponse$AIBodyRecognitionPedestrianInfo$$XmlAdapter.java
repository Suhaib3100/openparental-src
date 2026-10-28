package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIBodyRecognitionResponse$AIBodyRecognitionPedestrianInfo$$XmlAdapter extends IXmlAdapter<AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo> {
    private HashMap<String, ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo>> childElementBinders;

    public AIBodyRecognitionResponse$AIBodyRecognitionPedestrianInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬃\u0001"), new ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResponse$AIBodyRecognitionPedestrianInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo aIBodyRecognitionPedestrianInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIBodyRecognitionPedestrianInfo.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬄\u0001"), new ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResponse$AIBodyRecognitionPedestrianInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo aIBodyRecognitionPedestrianInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIBodyRecognitionPedestrianInfo.score = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬅\u0001"), new ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResponse$AIBodyRecognitionPedestrianInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo aIBodyRecognitionPedestrianInfo, String str) throws IOException, XmlPullParserException {
                if (aIBodyRecognitionPedestrianInfo.location == null) {
                    aIBodyRecognitionPedestrianInfo.location = new ArrayList();
                }
                aIBodyRecognitionPedestrianInfo.location.add((AIBodyRecognitionResponse.AIBodyRecognitionLocation) QCloudXml.fromXml(xmlPullParser, AIBodyRecognitionResponse.AIBodyRecognitionLocation.class, ProtectedSandApp.s("㬂\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo aIBodyRecognitionPedestrianInfo = new AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIBodyRecognitionPedestrianInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIBodyRecognitionPedestrianInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIBodyRecognitionPedestrianInfo;
    }
}
