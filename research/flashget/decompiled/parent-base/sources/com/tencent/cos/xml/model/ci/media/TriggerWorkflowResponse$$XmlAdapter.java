package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TriggerWorkflowResponse$$XmlAdapter extends IXmlAdapter<TriggerWorkflowResponse> {
    private HashMap<String, ChildElementBinder<TriggerWorkflowResponse>> childElementBinders;

    public TriggerWorkflowResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TriggerWorkflowResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䢤\u0001"), new ChildElementBinder<TriggerWorkflowResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TriggerWorkflowResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TriggerWorkflowResponse triggerWorkflowResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                triggerWorkflowResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢥\u0001"), new ChildElementBinder<TriggerWorkflowResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TriggerWorkflowResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TriggerWorkflowResponse triggerWorkflowResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                triggerWorkflowResponse.instanceId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TriggerWorkflowResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TriggerWorkflowResponse triggerWorkflowResponse = new TriggerWorkflowResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TriggerWorkflowResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, triggerWorkflowResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䢦\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return triggerWorkflowResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return triggerWorkflowResponse;
    }
}
