package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetVideoAuditJobResponse$$XmlAdapter extends IXmlAdapter<GetVideoAuditJobResponse> {
    private HashMap<String, ChildElementBinder<GetVideoAuditJobResponse>> childElementBinders;

    public GetVideoAuditJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetVideoAuditJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䴍\u0001"), new ChildElementBinder<GetVideoAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse getVideoAuditJobResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getVideoAuditJobResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴎\u0001"), new ChildElementBinder<GetVideoAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse getVideoAuditJobResponse, String str) throws IOException, XmlPullParserException {
                getVideoAuditJobResponse.jobsDetail = (GetVideoAuditJobResponse.VideoAuditJobsDetail) QCloudXml.fromXml(xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail.class, ProtectedSandApp.s("䴌\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetVideoAuditJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetVideoAuditJobResponse getVideoAuditJobResponse = new GetVideoAuditJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetVideoAuditJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getVideoAuditJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䴏\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getVideoAuditJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getVideoAuditJobResponse;
    }
}
