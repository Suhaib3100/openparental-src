package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitMediaSegmentJobResponse$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJobResponse> {
    private HashMap<String, ChildElementBinder<SubmitMediaSegmentJobResponse>> childElementBinders;

    public SubmitMediaSegmentJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaSegmentJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䒰\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse submitMediaSegmentJobResponse, String str) throws IOException, XmlPullParserException {
                submitMediaSegmentJobResponse.jobsDetail = (SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail.class, ProtectedSandApp.s("䒯\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaSegmentJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaSegmentJobResponse submitMediaSegmentJobResponse = new SubmitMediaSegmentJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaSegmentJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaSegmentJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䒱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaSegmentJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaSegmentJobResponse;
    }
}
