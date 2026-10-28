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
public class SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>> childElementBinders;

    public SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䒸\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒹\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒺\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒻\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒼\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒽\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒾\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒿\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓀\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓁\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitMediaSegmentJobResponseJobsDetail.input = (SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput) QCloudXml.fromXml(xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput.class, ProtectedSandApp.s("䒶\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓂\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitMediaSegmentJobResponseJobsDetail.operation = (SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation) QCloudXml.fromXml(xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation.class, ProtectedSandApp.s("䒷\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail submitMediaSegmentJobResponseJobsDetail = new SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaSegmentJobResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䓃\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaSegmentJobResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaSegmentJobResponseJobsDetail;
    }
}
