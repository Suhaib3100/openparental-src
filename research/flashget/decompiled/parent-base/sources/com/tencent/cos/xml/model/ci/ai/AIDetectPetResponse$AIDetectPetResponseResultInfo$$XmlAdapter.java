package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIDetectPetResponse$AIDetectPetResponseResultInfo$$XmlAdapter extends IXmlAdapter<AIDetectPetResponse.AIDetectPetResponseResultInfo> {
    private HashMap<String, ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseResultInfo>> childElementBinders;

    public AIDetectPetResponse$AIDetectPetResponseResultInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseResultInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㭄\u0001"), new ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseResultInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse$AIDetectPetResponseResultInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectPetResponse.AIDetectPetResponseResultInfo aIDetectPetResponseResultInfo, String str) throws IOException, XmlPullParserException {
                aIDetectPetResponseResultInfo.score = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭅\u0001"), new ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseResultInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse$AIDetectPetResponseResultInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectPetResponse.AIDetectPetResponseResultInfo aIDetectPetResponseResultInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectPetResponseResultInfo.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭆\u0001"), new ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseResultInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse$AIDetectPetResponseResultInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectPetResponse.AIDetectPetResponseResultInfo aIDetectPetResponseResultInfo, String str) throws IOException, XmlPullParserException {
                aIDetectPetResponseResultInfo.location = (AIDetectPetResponse.AIDetectPetResponseLocation) QCloudXml.fromXml(xmlPullParser, AIDetectPetResponse.AIDetectPetResponseLocation.class, ProtectedSandApp.s("㭃\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectPetResponse.AIDetectPetResponseResultInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectPetResponse.AIDetectPetResponseResultInfo aIDetectPetResponseResultInfo = new AIDetectPetResponse.AIDetectPetResponseResultInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectPetResponse.AIDetectPetResponseResultInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectPetResponseResultInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㭇\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectPetResponseResultInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectPetResponseResultInfo;
    }
}
