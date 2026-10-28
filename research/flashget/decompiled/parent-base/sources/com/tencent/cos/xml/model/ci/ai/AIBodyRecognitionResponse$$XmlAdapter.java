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
public class AIBodyRecognitionResponse$$XmlAdapter extends IXmlAdapter<AIBodyRecognitionResponse> {
    private HashMap<String, ChildElementBinder<AIBodyRecognitionResponse>> childElementBinders;

    public AIBodyRecognitionResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIBodyRecognitionResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㫼\u0001"), new ChildElementBinder<AIBodyRecognitionResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIBodyRecognitionResponse aIBodyRecognitionResponse, String str) throws IOException, XmlPullParserException {
                aIBodyRecognitionResponse.status = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㫽\u0001"), new ChildElementBinder<AIBodyRecognitionResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIBodyRecognitionResponse aIBodyRecognitionResponse, String str) throws IOException, XmlPullParserException {
                if (aIBodyRecognitionResponse.pedestrianInfo == null) {
                    aIBodyRecognitionResponse.pedestrianInfo = new ArrayList();
                }
                aIBodyRecognitionResponse.pedestrianInfo.add((AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo) QCloudXml.fromXml(xmlPullParser, AIBodyRecognitionResponse.AIBodyRecognitionPedestrianInfo.class, ProtectedSandApp.s("㫻\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIBodyRecognitionResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIBodyRecognitionResponse aIBodyRecognitionResponse = new AIBodyRecognitionResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIBodyRecognitionResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIBodyRecognitionResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㫾\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIBodyRecognitionResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIBodyRecognitionResponse;
    }
}
