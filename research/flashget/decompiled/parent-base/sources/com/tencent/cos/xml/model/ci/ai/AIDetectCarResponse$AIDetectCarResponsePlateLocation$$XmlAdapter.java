package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIDetectCarResponse$AIDetectCarResponsePlateLocation$$XmlAdapter extends IXmlAdapter<AIDetectCarResponse.AIDetectCarResponsePlateLocation> {
    private HashMap<String, ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateLocation>> childElementBinders;

    public AIDetectCarResponse$AIDetectCarResponsePlateLocation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateLocation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬣\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateLocation>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponsePlateLocation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponsePlateLocation aIDetectCarResponsePlateLocation, String str) throws IOException, XmlPullParserException {
                aIDetectCarResponsePlateLocation.f71701x = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬤\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateLocation>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponsePlateLocation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponsePlateLocation aIDetectCarResponsePlateLocation, String str) throws IOException, XmlPullParserException {
                aIDetectCarResponsePlateLocation.f71702y = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectCarResponse.AIDetectCarResponsePlateLocation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectCarResponse.AIDetectCarResponsePlateLocation aIDetectCarResponsePlateLocation = new AIDetectCarResponse.AIDetectCarResponsePlateLocation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateLocation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectCarResponsePlateLocation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬥\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectCarResponsePlateLocation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectCarResponsePlateLocation;
    }
}
