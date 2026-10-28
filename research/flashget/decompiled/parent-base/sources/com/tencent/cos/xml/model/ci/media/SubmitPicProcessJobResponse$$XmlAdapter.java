package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitPicProcessJobResponse$$XmlAdapter extends IXmlAdapter<SubmitPicProcessJobResponse> {
    private HashMap<String, ChildElementBinder<SubmitPicProcessJobResponse>> childElementBinders;

    public SubmitPicProcessJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitPicProcessJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䓪\u0001"), new ChildElementBinder<SubmitPicProcessJobResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJobResponse submitPicProcessJobResponse, String str) throws IOException, XmlPullParserException {
                submitPicProcessJobResponse.jobsDetail = (SubmitPicProcessJobResponse.SubmitPicProcessJobResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, SubmitPicProcessJobResponse.SubmitPicProcessJobResponseJobsDetail.class, ProtectedSandApp.s("䓩\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitPicProcessJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitPicProcessJobResponse submitPicProcessJobResponse = new SubmitPicProcessJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitPicProcessJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitPicProcessJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䓫\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitPicProcessJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitPicProcessJobResponse;
    }
}
