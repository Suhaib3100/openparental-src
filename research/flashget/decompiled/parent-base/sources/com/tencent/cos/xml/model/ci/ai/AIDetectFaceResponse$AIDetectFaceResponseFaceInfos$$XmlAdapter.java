package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIDetectFaceResponse$AIDetectFaceResponseFaceInfos$$XmlAdapter extends IXmlAdapter<AIDetectFaceResponse.AIDetectFaceResponseFaceInfos> {
    private HashMap<String, ChildElementBinder<AIDetectFaceResponse.AIDetectFaceResponseFaceInfos>> childElementBinders;

    public AIDetectFaceResponse$AIDetectFaceResponseFaceInfos$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectFaceResponse.AIDetectFaceResponseFaceInfos>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬲\u0001"), new ChildElementBinder<AIDetectFaceResponse.AIDetectFaceResponseFaceInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$AIDetectFaceResponseFaceInfos$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse.AIDetectFaceResponseFaceInfos aIDetectFaceResponseFaceInfos, String str) throws IOException, XmlPullParserException {
                aIDetectFaceResponseFaceInfos.f71703x = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬳\u0001"), new ChildElementBinder<AIDetectFaceResponse.AIDetectFaceResponseFaceInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$AIDetectFaceResponseFaceInfos$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse.AIDetectFaceResponseFaceInfos aIDetectFaceResponseFaceInfos, String str) throws IOException, XmlPullParserException {
                aIDetectFaceResponseFaceInfos.f71704y = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬴\u0001"), new ChildElementBinder<AIDetectFaceResponse.AIDetectFaceResponseFaceInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$AIDetectFaceResponseFaceInfos$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse.AIDetectFaceResponseFaceInfos aIDetectFaceResponseFaceInfos, String str) throws IOException, XmlPullParserException {
                aIDetectFaceResponseFaceInfos.width = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬵\u0001"), new ChildElementBinder<AIDetectFaceResponse.AIDetectFaceResponseFaceInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$AIDetectFaceResponseFaceInfos$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse.AIDetectFaceResponseFaceInfos aIDetectFaceResponseFaceInfos, String str) throws IOException, XmlPullParserException {
                aIDetectFaceResponseFaceInfos.height = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectFaceResponse.AIDetectFaceResponseFaceInfos fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectFaceResponse.AIDetectFaceResponseFaceInfos aIDetectFaceResponseFaceInfos = new AIDetectFaceResponse.AIDetectFaceResponseFaceInfos();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectFaceResponse.AIDetectFaceResponseFaceInfos> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectFaceResponseFaceInfos, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬶\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectFaceResponseFaceInfos;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectFaceResponseFaceInfos;
    }
}
