package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitVideoMontageJobResponse$$XmlAdapter extends IXmlAdapter<SubmitVideoMontageJobResponse> {
    private HashMap<String, ChildElementBinder<SubmitVideoMontageJobResponse>> childElementBinders;

    public SubmitVideoMontageJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoMontageJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䘅\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse submitVideoMontageJobResponse, String str) throws IOException, XmlPullParserException {
                submitVideoMontageJobResponse.jobsDetail = (SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail.class, ProtectedSandApp.s("䘄\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoMontageJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoMontageJobResponse submitVideoMontageJobResponse = new SubmitVideoMontageJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoMontageJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoMontageJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䘆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoMontageJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoMontageJobResponse;
    }
}
