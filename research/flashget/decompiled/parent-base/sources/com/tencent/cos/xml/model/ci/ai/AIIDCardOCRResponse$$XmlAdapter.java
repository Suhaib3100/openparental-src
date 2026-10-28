package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIIDCardOCRResponse$$XmlAdapter extends IXmlAdapter<AIIDCardOCRResponse> {
    private HashMap<String, ChildElementBinder<AIIDCardOCRResponse>> childElementBinders;

    public AIIDCardOCRResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIIDCardOCRResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㭴\u0001"), new ChildElementBinder<AIIDCardOCRResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse aIIDCardOCRResponse, String str) throws IOException, XmlPullParserException {
                aIIDCardOCRResponse.idInfo = (AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo) QCloudXml.fromXml(xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseIdInfo.class, ProtectedSandApp.s("㭲\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭵\u0001"), new ChildElementBinder<AIIDCardOCRResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIIDCardOCRResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIIDCardOCRResponse aIIDCardOCRResponse, String str) throws IOException, XmlPullParserException {
                aIIDCardOCRResponse.advancedInfo = (AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo) QCloudXml.fromXml(xmlPullParser, AIIDCardOCRResponse.AIIDCardOCRResponseAdvancedInfo.class, ProtectedSandApp.s("㭳\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIIDCardOCRResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIIDCardOCRResponse aIIDCardOCRResponse = new AIIDCardOCRResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIIDCardOCRResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIIDCardOCRResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㭶\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIIDCardOCRResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIIDCardOCRResponse;
    }
}
