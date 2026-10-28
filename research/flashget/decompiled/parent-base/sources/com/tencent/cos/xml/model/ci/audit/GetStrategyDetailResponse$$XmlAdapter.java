package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetStrategyDetailResponse$$XmlAdapter extends IXmlAdapter<GetStrategyDetailResponse> {
    private HashMap<String, ChildElementBinder<GetStrategyDetailResponse>> childElementBinders;

    public GetStrategyDetailResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetStrategyDetailResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䅒\u0001"), new ChildElementBinder<GetStrategyDetailResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyDetailResponse getStrategyDetailResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getStrategyDetailResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅓\u0001"), new ChildElementBinder<GetStrategyDetailResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyDetailResponse getStrategyDetailResponse, String str) throws IOException, XmlPullParserException {
                getStrategyDetailResponse.strategy = (GetStrategyDetailResponse.Strategy) QCloudXml.fromXml(xmlPullParser, GetStrategyDetailResponse.Strategy.class, ProtectedSandApp.s("䅑\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetStrategyDetailResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetStrategyDetailResponse getStrategyDetailResponse = new GetStrategyDetailResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetStrategyDetailResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getStrategyDetailResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䅔\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getStrategyDetailResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getStrategyDetailResponse;
    }
}
