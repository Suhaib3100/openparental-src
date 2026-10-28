package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitSmartCoverJobResponse$$XmlAdapter extends IXmlAdapter<SubmitSmartCoverJobResponse> {
    private HashMap<String, ChildElementBinder<SubmitSmartCoverJobResponse>> childElementBinders;

    public SubmitSmartCoverJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSmartCoverJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䔣\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse submitSmartCoverJobResponse, String str) throws IOException, XmlPullParserException {
                submitSmartCoverJobResponse.jobsDetail = (SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail.class, ProtectedSandApp.s("䔢\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSmartCoverJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSmartCoverJobResponse submitSmartCoverJobResponse = new SubmitSmartCoverJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSmartCoverJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSmartCoverJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䔤\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSmartCoverJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSmartCoverJobResponse;
    }
}
