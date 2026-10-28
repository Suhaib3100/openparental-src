package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.audit.GetStrategyListResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetStrategyListResponse$$XmlAdapter extends IXmlAdapter<GetStrategyListResponse> {
    private HashMap<String, ChildElementBinder<GetStrategyListResponse>> childElementBinders;

    public GetStrategyListResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetStrategyListResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䅤\u0001"), new ChildElementBinder<GetStrategyListResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyListResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyListResponse getStrategyListResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getStrategyListResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅥\u0001"), new ChildElementBinder<GetStrategyListResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyListResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyListResponse getStrategyListResponse, String str) throws IOException, XmlPullParserException {
                getStrategyListResponse.totalCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅦\u0001"), new ChildElementBinder<GetStrategyListResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyListResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyListResponse getStrategyListResponse, String str) throws IOException, XmlPullParserException {
                if (getStrategyListResponse.strategies == null) {
                    getStrategyListResponse.strategies = new ArrayList();
                }
                getStrategyListResponse.strategies.add((GetStrategyListResponse.Strategies) QCloudXml.fromXml(xmlPullParser, GetStrategyListResponse.Strategies.class, ProtectedSandApp.s("䅣\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetStrategyListResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetStrategyListResponse getStrategyListResponse = new GetStrategyListResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetStrategyListResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getStrategyListResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䅧\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getStrategyListResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getStrategyListResponse;
    }
}
