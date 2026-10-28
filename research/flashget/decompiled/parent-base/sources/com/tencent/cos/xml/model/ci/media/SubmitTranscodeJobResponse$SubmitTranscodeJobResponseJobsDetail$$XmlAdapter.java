package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>> childElementBinders;

    public SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䖺\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖻\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖼\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖽\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖾\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖿\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.progress = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗀\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗁\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗂\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗃\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗄\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobResponseJobsDetail.input = (SubmitTranscodeJobResponse.SubmitTranscodeJobResponseInput) QCloudXml.fromXml(xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseInput.class, ProtectedSandApp.s("䖸\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗅\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobResponseJobsDetail.operation = (SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation) QCloudXml.fromXml(xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation.class, ProtectedSandApp.s("䖹\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail submitTranscodeJobResponseJobsDetail = new SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitTranscodeJobResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䗆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitTranscodeJobResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitTranscodeJobResponseJobsDetail;
    }
}
