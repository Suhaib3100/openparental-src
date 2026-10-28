package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIGameRecResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIGameRecResponse$$XmlAdapter extends IXmlAdapter<AIGameRecResponse> {
    private HashMap<String, ChildElementBinder<AIGameRecResponse>> childElementBinders;

    public AIGameRecResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIGameRecResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㭥\u0001"), new ChildElementBinder<AIGameRecResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AIGameRecResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIGameRecResponse aIGameRecResponse, String str) throws IOException, XmlPullParserException {
                aIGameRecResponse.gameLabels = (AIGameRecResponse.AIGameRecResponseGameLabels) QCloudXml.fromXml(xmlPullParser, AIGameRecResponse.AIGameRecResponseGameLabels.class, ProtectedSandApp.s("㭤\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIGameRecResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIGameRecResponse aIGameRecResponse = new AIGameRecResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIGameRecResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIGameRecResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㭦\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIGameRecResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIGameRecResponse;
    }
}
