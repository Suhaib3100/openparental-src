package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWebPageAuditJobResponse$$XmlAdapter extends IXmlAdapter<GetWebPageAuditJobResponse> {
    private HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse>> childElementBinders;

    public GetWebPageAuditJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䵈\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse getWebPageAuditJobResponse, String str) throws IOException, XmlPullParserException {
                getWebPageAuditJobResponse.jobsDetail = (GetWebPageAuditJobResponse.WebPageAuditJobsDetail) QCloudXml.fromXml(xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail.class, ProtectedSandApp.s("䵇\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵉\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse getWebPageAuditJobResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWebPageAuditJobResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWebPageAuditJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWebPageAuditJobResponse getWebPageAuditJobResponse = new GetWebPageAuditJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWebPageAuditJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWebPageAuditJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䵊\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWebPageAuditJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWebPageAuditJobResponse;
    }
}
