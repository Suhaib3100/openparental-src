package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIFaceEffectResponse$$XmlAdapter extends IXmlAdapter<AIFaceEffectResponse> {
    private HashMap<String, ChildElementBinder<AIFaceEffectResponse>> childElementBinders;

    public AIFaceEffectResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIFaceEffectResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㭜\u0001"), new ChildElementBinder<AIFaceEffectResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIFaceEffectResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIFaceEffectResponse aIFaceEffectResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIFaceEffectResponse.resultImage = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㭝\u0001"), new ChildElementBinder<AIFaceEffectResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIFaceEffectResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIFaceEffectResponse aIFaceEffectResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIFaceEffectResponse.resultMask = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIFaceEffectResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIFaceEffectResponse aIFaceEffectResponse = new AIFaceEffectResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIFaceEffectResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIFaceEffectResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㭞\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIFaceEffectResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIFaceEffectResponse;
    }
}
