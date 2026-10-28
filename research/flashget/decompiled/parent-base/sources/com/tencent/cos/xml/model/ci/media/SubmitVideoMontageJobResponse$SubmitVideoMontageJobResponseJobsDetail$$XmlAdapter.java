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
public class SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter extends IXmlAdapter<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>> childElementBinders;

    public SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䘍\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘎\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘏\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘐\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘑\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘒\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘓\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘔\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘕\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘖\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitVideoMontageJobResponseJobsDetail.input = (SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput) QCloudXml.fromXml(xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput.class, ProtectedSandApp.s("䘋\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘗\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitVideoMontageJobResponseJobsDetail.operation = (SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseOperation) QCloudXml.fromXml(xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseOperation.class, ProtectedSandApp.s("䘌\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail submitVideoMontageJobResponseJobsDetail = new SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoMontageJobResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䘘\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoMontageJobResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoMontageJobResponseJobsDetail;
    }
}
