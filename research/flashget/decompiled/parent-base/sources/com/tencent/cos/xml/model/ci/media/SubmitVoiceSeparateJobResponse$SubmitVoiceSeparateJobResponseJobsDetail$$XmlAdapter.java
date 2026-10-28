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
public class SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter extends IXmlAdapter<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>> childElementBinders;

    public SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䚺\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚻\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚼\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚽\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚾\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚿\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛀\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛁\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛂\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛃\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitVoiceSeparateJobResponseJobsDetail.input = (SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput) QCloudXml.fromXml(xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput.class, ProtectedSandApp.s("䚸\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛄\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitVoiceSeparateJobResponseJobsDetail.operation = (SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseOperation) QCloudXml.fromXml(xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseOperation.class, ProtectedSandApp.s("䚹\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail submitVoiceSeparateJobResponseJobsDetail = new SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVoiceSeparateJobResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䛅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVoiceSeparateJobResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVoiceSeparateJobResponseJobsDetail;
    }
}
