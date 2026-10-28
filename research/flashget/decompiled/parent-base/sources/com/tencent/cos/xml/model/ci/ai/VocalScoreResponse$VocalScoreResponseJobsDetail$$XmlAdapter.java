package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScore;
import com.tencent.cos.xml.model.ci.ai.VocalScoreResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter extends IXmlAdapter<VocalScoreResponse.VocalScoreResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>> childElementBinders;

    public VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽊\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽋\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽌\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽍\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽎\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽏\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽐\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽑\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽒\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽓\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseJobsDetail.input = (VocalScore.VocalScoreInput) QCloudXml.fromXml(xmlPullParser, VocalScore.VocalScoreInput.class, ProtectedSandApp.s("㽈\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽔\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseJobsDetail.operation = (VocalScoreResponse.VocalScoreResponseOperation) QCloudXml.fromXml(xmlPullParser, VocalScoreResponse.VocalScoreResponseOperation.class, ProtectedSandApp.s("㽉\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VocalScoreResponse.VocalScoreResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VocalScoreResponse.VocalScoreResponseJobsDetail vocalScoreResponseJobsDetail = new VocalScoreResponse.VocalScoreResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VocalScoreResponse.VocalScoreResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, vocalScoreResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㽕\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return vocalScoreResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return vocalScoreResponseJobsDetail;
    }
}
