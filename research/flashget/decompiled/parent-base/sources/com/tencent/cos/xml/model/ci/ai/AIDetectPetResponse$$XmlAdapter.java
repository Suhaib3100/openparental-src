package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIDetectPetResponse$$XmlAdapter extends IXmlAdapter<AIDetectPetResponse> {
    private HashMap<String, ChildElementBinder<AIDetectPetResponse>> childElementBinders;

    public AIDetectPetResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectPetResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬼\u0001"), new ChildElementBinder<AIDetectPetResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectPetResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectPetResponse aIDetectPetResponse, String str) throws IOException, XmlPullParserException {
                if (aIDetectPetResponse.resultInfo == null) {
                    aIDetectPetResponse.resultInfo = new ArrayList();
                }
                aIDetectPetResponse.resultInfo.add((AIDetectPetResponse.AIDetectPetResponseResultInfo) QCloudXml.fromXml(xmlPullParser, AIDetectPetResponse.AIDetectPetResponseResultInfo.class, ProtectedSandApp.s("㬻\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectPetResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectPetResponse aIDetectPetResponse = new AIDetectPetResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectPetResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectPetResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬽\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectPetResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectPetResponse;
    }
}
