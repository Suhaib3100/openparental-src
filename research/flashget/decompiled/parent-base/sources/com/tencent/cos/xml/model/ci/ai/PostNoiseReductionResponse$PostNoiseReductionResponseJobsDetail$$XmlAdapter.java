package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter extends IXmlAdapter<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>> childElementBinders;

    public PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㳷\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳸\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳹\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳺\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳻\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳼\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳽\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳾\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳿\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postNoiseReductionResponseJobsDetail.input = (PostNoiseReductionResponse.PostNoiseReductionResponseInput) QCloudXml.fromXml(xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseInput.class, ProtectedSandApp.s("㳶\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴀\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postNoiseReductionResponseJobsDetail.operation = (PostNoiseReductionResponse.PostNoiseReductionResponseOperation) QCloudXml.fromXml(xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseOperation.class, ProtectedSandApp.s("㳵\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail postNoiseReductionResponseJobsDetail = new PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postNoiseReductionResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㴁\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postNoiseReductionResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postNoiseReductionResponseJobsDetail;
    }
}
