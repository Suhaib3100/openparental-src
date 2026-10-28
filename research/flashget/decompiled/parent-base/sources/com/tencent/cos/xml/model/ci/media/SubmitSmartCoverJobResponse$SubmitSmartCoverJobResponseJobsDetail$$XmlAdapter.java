package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter extends IXmlAdapter<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>> childElementBinders;

    public SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䔫\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔬\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔭\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔮\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔯\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔰\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔱\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔲\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔳\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitSmartCoverJobResponseJobsDetail.input = (SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput) QCloudXml.fromXml(xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput.class, ProtectedSandApp.s("䔪\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔴\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                submitSmartCoverJobResponseJobsDetail.operation = (SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation) QCloudXml.fromXml(xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation.class, ProtectedSandApp.s("䔩\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail submitSmartCoverJobResponseJobsDetail = new SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSmartCoverJobResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䔵\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSmartCoverJobResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSmartCoverJobResponseJobsDetail;
    }
}
