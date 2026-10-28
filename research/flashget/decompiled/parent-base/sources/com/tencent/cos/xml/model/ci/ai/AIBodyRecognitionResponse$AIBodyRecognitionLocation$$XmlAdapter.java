package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIBodyRecognitionResponse$AIBodyRecognitionLocation$$XmlAdapter extends IXmlAdapter<AIBodyRecognitionResponse.AIBodyRecognitionLocation> {
    private HashMap<String, ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionLocation>> childElementBinders;

    public AIBodyRecognitionResponse$AIBodyRecognitionLocation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionLocation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬀\u0001"), new ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionLocation>() { // from class: com.tencent.cos.xml.model.ci.ai.AIBodyRecognitionResponse$AIBodyRecognitionLocation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIBodyRecognitionResponse.AIBodyRecognitionLocation aIBodyRecognitionLocation, String str) throws IOException, XmlPullParserException {
                if (aIBodyRecognitionLocation.point == null) {
                    aIBodyRecognitionLocation.point = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        aIBodyRecognitionLocation.point.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("㫿\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIBodyRecognitionResponse.AIBodyRecognitionLocation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIBodyRecognitionResponse.AIBodyRecognitionLocation aIBodyRecognitionLocation = new AIBodyRecognitionResponse.AIBodyRecognitionLocation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIBodyRecognitionResponse.AIBodyRecognitionLocation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIBodyRecognitionLocation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬁\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIBodyRecognitionLocation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIBodyRecognitionLocation;
    }
}
