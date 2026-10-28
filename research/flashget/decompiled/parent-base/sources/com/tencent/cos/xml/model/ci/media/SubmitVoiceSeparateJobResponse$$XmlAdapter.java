package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJobResponse$$XmlAdapter extends IXmlAdapter<SubmitVoiceSeparateJobResponse> {
    private HashMap<String, ChildElementBinder<SubmitVoiceSeparateJobResponse>> childElementBinders;

    public SubmitVoiceSeparateJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVoiceSeparateJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䚲\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse submitVoiceSeparateJobResponse, String str) throws IOException, XmlPullParserException {
                submitVoiceSeparateJobResponse.jobsDetail = (SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail.class, ProtectedSandApp.s("䚱\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVoiceSeparateJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVoiceSeparateJobResponse submitVoiceSeparateJobResponse = new SubmitVoiceSeparateJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVoiceSeparateJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVoiceSeparateJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䚳\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVoiceSeparateJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVoiceSeparateJobResponse;
    }
}
