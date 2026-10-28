package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetActionSequenceResponse$$XmlAdapter extends IXmlAdapter<GetActionSequenceResponse> {
    private HashMap<String, ChildElementBinder<GetActionSequenceResponse>> childElementBinders;

    public GetActionSequenceResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetActionSequenceResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㲄\u0001"), new ChildElementBinder<GetActionSequenceResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetActionSequenceResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetActionSequenceResponse getActionSequenceResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getActionSequenceResponse.actionSequence = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetActionSequenceResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetActionSequenceResponse getActionSequenceResponse = new GetActionSequenceResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetActionSequenceResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getActionSequenceResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㲅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getActionSequenceResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getActionSequenceResponse;
    }
}
