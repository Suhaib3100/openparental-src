package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIDetectPetResponse$AIDetectPetResponseLocation$$XmlAdapter extends IXmlAdapter<AIDetectPetResponse.AIDetectPetResponseLocation> {
    private HashMap<String, ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseLocation>> childElementBinders;

    public AIDetectPetResponse$AIDetectPetResponseLocation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseLocation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬾\u0001"), new ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseLocation>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse$AIDetectPetResponseLocation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectPetResponse.AIDetectPetResponseLocation aIDetectPetResponseLocation, String str) throws IOException, XmlPullParserException {
                aIDetectPetResponseLocation.f71705x = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬿\u0001"), new ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseLocation>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse$AIDetectPetResponseLocation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectPetResponse.AIDetectPetResponseLocation aIDetectPetResponseLocation, String str) throws IOException, XmlPullParserException {
                aIDetectPetResponseLocation.f71706y = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭀\u0001"), new ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseLocation>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse$AIDetectPetResponseLocation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectPetResponse.AIDetectPetResponseLocation aIDetectPetResponseLocation, String str) throws IOException, XmlPullParserException {
                aIDetectPetResponseLocation.height = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭁\u0001"), new ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseLocation>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse$AIDetectPetResponseLocation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectPetResponse.AIDetectPetResponseLocation aIDetectPetResponseLocation, String str) throws IOException, XmlPullParserException {
                aIDetectPetResponseLocation.width = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectPetResponse.AIDetectPetResponseLocation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectPetResponse.AIDetectPetResponseLocation aIDetectPetResponseLocation = new AIDetectPetResponse.AIDetectPetResponseLocation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseLocation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectPetResponseLocation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㭂\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectPetResponseLocation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectPetResponseLocation;
    }
}
