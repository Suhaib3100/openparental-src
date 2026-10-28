package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitSnapshotJobResponse$$XmlAdapter extends IXmlAdapter<SubmitSnapshotJobResponse> {
    private HashMap<String, ChildElementBinder<SubmitSnapshotJobResponse>> childElementBinders;

    public SubmitSnapshotJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSnapshotJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䕚\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse submitSnapshotJobResponse, String str) throws IOException, XmlPullParserException {
                submitSnapshotJobResponse.jobsDetail = (SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail.class, ProtectedSandApp.s("䕙\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSnapshotJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSnapshotJobResponse submitSnapshotJobResponse = new SubmitSnapshotJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSnapshotJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSnapshotJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䕛\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSnapshotJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSnapshotJobResponse;
    }
}
