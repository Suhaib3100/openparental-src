package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitConcatJobResponse$$XmlAdapter extends IXmlAdapter<SubmitConcatJobResponse> {
    private HashMap<String, ChildElementBinder<SubmitConcatJobResponse>> childElementBinders;

    public SubmitConcatJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitConcatJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䏒\u0001"), new ChildElementBinder<SubmitConcatJobResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse submitConcatJobResponse, String str) throws IOException, XmlPullParserException {
                submitConcatJobResponse.jobsDetail = (SubmitConcatJobResponse.SubmitConcatJobResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseJobsDetail.class, ProtectedSandApp.s("䏑\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitConcatJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitConcatJobResponse submitConcatJobResponse = new SubmitConcatJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitConcatJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitConcatJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䏓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitConcatJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitConcatJobResponse;
    }
}
