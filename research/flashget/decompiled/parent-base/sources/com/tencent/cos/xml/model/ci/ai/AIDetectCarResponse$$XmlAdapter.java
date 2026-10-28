package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIDetectCarResponse$$XmlAdapter extends IXmlAdapter<AIDetectCarResponse> {
    private HashMap<String, ChildElementBinder<AIDetectCarResponse>> childElementBinders;

    public AIDetectCarResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectCarResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬌\u0001"), new ChildElementBinder<AIDetectCarResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse aIDetectCarResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectCarResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬍\u0001"), new ChildElementBinder<AIDetectCarResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse aIDetectCarResponse, String str) throws IOException, XmlPullParserException {
                if (aIDetectCarResponse.carTags == null) {
                    aIDetectCarResponse.carTags = new ArrayList();
                }
                aIDetectCarResponse.carTags.add((AIDetectCarResponse.AIDetectCarResponseCarTags) QCloudXml.fromXml(xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags.class, ProtectedSandApp.s("㬋\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectCarResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectCarResponse aIDetectCarResponse = new AIDetectCarResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectCarResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectCarResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectCarResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectCarResponse;
    }
}
