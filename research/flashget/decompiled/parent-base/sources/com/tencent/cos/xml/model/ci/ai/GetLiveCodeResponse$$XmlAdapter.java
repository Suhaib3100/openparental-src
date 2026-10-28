package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetLiveCodeResponse$$XmlAdapter extends IXmlAdapter<GetLiveCodeResponse> {
    private HashMap<String, ChildElementBinder<GetLiveCodeResponse>> childElementBinders;

    public GetLiveCodeResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetLiveCodeResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㲊\u0001"), new ChildElementBinder<GetLiveCodeResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetLiveCodeResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveCodeResponse getLiveCodeResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveCodeResponse.liveCode = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetLiveCodeResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetLiveCodeResponse getLiveCodeResponse = new GetLiveCodeResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetLiveCodeResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getLiveCodeResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㲋\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getLiveCodeResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getLiveCodeResponse;
    }
}
