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
public class SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter extends IXmlAdapter<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>> childElementBinders;

    public SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䕢\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕣\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕤\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕥\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕦\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕧\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕨\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕩\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕪\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕫\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitSnapshotJobResponseJobsDetail.input = (SubmitSnapshotJobResponse.SubmitSnapshotJobResponseInput) QCloudXml.fromXml(xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseInput.class, ProtectedSandApp.s("䕠\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕬\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitSnapshotJobResponseJobsDetail.operation = (SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation) QCloudXml.fromXml(xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation.class, ProtectedSandApp.s("䕡\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail submitSnapshotJobResponseJobsDetail = new SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSnapshotJobResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䕭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSnapshotJobResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSnapshotJobResponseJobsDetail;
    }
}
