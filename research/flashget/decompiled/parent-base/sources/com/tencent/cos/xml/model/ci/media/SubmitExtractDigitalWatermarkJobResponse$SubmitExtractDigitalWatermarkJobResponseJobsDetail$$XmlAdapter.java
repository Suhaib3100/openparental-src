package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter extends IXmlAdapter<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>> childElementBinders;

    public SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䑑\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑒\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑓\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑔\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑕\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑖\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑗\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑘\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑙\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitExtractDigitalWatermarkJobResponseJobsDetail.input = (SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseInput) QCloudXml.fromXml(xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseInput.class, ProtectedSandApp.s("䑐\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑚\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitExtractDigitalWatermarkJobResponseJobsDetail.operation = (SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation) QCloudXml.fromXml(xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation.class, ProtectedSandApp.s("䑏\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail submitExtractDigitalWatermarkJobResponseJobsDetail = new SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitExtractDigitalWatermarkJobResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䑛\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitExtractDigitalWatermarkJobResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitExtractDigitalWatermarkJobResponseJobsDetail;
    }
}
