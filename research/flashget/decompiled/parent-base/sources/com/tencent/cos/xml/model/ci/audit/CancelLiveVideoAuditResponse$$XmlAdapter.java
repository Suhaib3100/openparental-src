package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.CancelLiveVideoAuditResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CancelLiveVideoAuditResponse$$XmlAdapter extends IXmlAdapter<CancelLiveVideoAuditResponse> {
    private HashMap<String, ChildElementBinder<CancelLiveVideoAuditResponse>> childElementBinders;

    public CancelLiveVideoAuditResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CancelLiveVideoAuditResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䁣\u0001"), new ChildElementBinder<CancelLiveVideoAuditResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.CancelLiveVideoAuditResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CancelLiveVideoAuditResponse cancelLiveVideoAuditResponse, String str) throws IOException, XmlPullParserException {
                cancelLiveVideoAuditResponse.jobsDetail = (CancelLiveVideoAuditResponse.CancelLiveVideoAuditResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, CancelLiveVideoAuditResponse.CancelLiveVideoAuditResponseJobsDetail.class, ProtectedSandApp.s("䁢\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䁤\u0001"), new ChildElementBinder<CancelLiveVideoAuditResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.CancelLiveVideoAuditResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CancelLiveVideoAuditResponse cancelLiveVideoAuditResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                cancelLiveVideoAuditResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CancelLiveVideoAuditResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CancelLiveVideoAuditResponse cancelLiveVideoAuditResponse = new CancelLiveVideoAuditResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CancelLiveVideoAuditResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, cancelLiveVideoAuditResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䁥\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return cancelLiveVideoAuditResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return cancelLiveVideoAuditResponse;
    }
}
