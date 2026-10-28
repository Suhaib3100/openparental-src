package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIDetectFaceResponse$$XmlAdapter extends IXmlAdapter<AIDetectFaceResponse> {
    private HashMap<String, ChildElementBinder<AIDetectFaceResponse>> childElementBinders;

    public AIDetectFaceResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectFaceResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬬\u0001"), new ChildElementBinder<AIDetectFaceResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse aIDetectFaceResponse, String str) throws IOException, XmlPullParserException {
                aIDetectFaceResponse.imageWidth = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬭\u0001"), new ChildElementBinder<AIDetectFaceResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse aIDetectFaceResponse, String str) throws IOException, XmlPullParserException {
                aIDetectFaceResponse.imageHeight = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬮\u0001"), new ChildElementBinder<AIDetectFaceResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse aIDetectFaceResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectFaceResponse.faceModelVersion = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬯\u0001"), new ChildElementBinder<AIDetectFaceResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse aIDetectFaceResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectFaceResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬰\u0001"), new ChildElementBinder<AIDetectFaceResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectFaceResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectFaceResponse aIDetectFaceResponse, String str) throws IOException, XmlPullParserException {
                aIDetectFaceResponse.faceInfos = (AIDetectFaceResponse.AIDetectFaceResponseFaceInfos) QCloudXml.fromXml(xmlPullParser, AIDetectFaceResponse.AIDetectFaceResponseFaceInfos.class, ProtectedSandApp.s("㬫\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectFaceResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectFaceResponse aIDetectFaceResponse = new AIDetectFaceResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectFaceResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectFaceResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectFaceResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectFaceResponse;
    }
}
