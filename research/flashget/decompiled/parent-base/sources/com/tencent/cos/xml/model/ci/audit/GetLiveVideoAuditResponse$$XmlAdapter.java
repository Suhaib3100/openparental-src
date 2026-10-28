package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetLiveVideoAuditResponse$$XmlAdapter extends IXmlAdapter<GetLiveVideoAuditResponse> {
    private HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse>> childElementBinders;

    public GetLiveVideoAuditResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䃟\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse getLiveVideoAuditResponse, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponse.jobsDetail = (GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail.class, ProtectedSandApp.s("䃞\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䃠\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse getLiveVideoAuditResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetLiveVideoAuditResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetLiveVideoAuditResponse getLiveVideoAuditResponse = new GetLiveVideoAuditResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetLiveVideoAuditResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getLiveVideoAuditResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䃡\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getLiveVideoAuditResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getLiveVideoAuditResponse;
    }
}
