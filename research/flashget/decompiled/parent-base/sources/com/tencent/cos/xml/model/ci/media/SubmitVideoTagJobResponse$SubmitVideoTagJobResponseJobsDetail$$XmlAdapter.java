package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>> childElementBinders;

    public SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䙝\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙞\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙟\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙠\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙡\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙢\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙣\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙤\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙥\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙦\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitVideoTagJobResponseJobsDetail.input = (SubmitVideoTagJobResponse.SubmitVideoTagJobResponseInput) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseInput.class, ProtectedSandApp.s("䙛\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙧\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitVideoTagJobResponseJobsDetail.operation = (SubmitVideoTagJobResponse.SubmitVideoTagJobResponseOperation) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseOperation.class, ProtectedSandApp.s("䙜\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail submitVideoTagJobResponseJobsDetail = new SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoTagJobResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䙨\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoTagJobResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoTagJobResponseJobsDetail;
    }
}
