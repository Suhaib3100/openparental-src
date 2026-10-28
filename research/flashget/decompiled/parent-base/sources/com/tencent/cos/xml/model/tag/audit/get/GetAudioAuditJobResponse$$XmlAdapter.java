package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAudioAuditJobResponse$$XmlAdapter extends IXmlAdapter<GetAudioAuditJobResponse> {
    private HashMap<String, ChildElementBinder<GetAudioAuditJobResponse>> childElementBinders;

    public GetAudioAuditJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAudioAuditJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䲑\u0001"), new ChildElementBinder<GetAudioAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse getAudioAuditJobResponse, String str) throws IOException, XmlPullParserException {
                getAudioAuditJobResponse.jobsDetail = (GetAudioAuditJobResponse.AudioAuditJobsDetail) QCloudXml.fromXml(xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail.class, ProtectedSandApp.s("䲐\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲒\u0001"), new ChildElementBinder<GetAudioAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse getAudioAuditJobResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAudioAuditJobResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAudioAuditJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAudioAuditJobResponse getAudioAuditJobResponse = new GetAudioAuditJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAudioAuditJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getAudioAuditJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䲓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getAudioAuditJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getAudioAuditJobResponse;
    }
}
