package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSoundHound;
import com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter extends IXmlAdapter<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>> childElementBinders;

    public PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㵱\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵲\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵳\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵴\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵵\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵶\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵷\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵸\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵹\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵺\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postSoundHoundResponseJobsDetail.input = (PostSoundHound.PostSoundHoundInput) QCloudXml.fromXml(xmlPullParser, PostSoundHound.PostSoundHoundInput.class, ProtectedSandApp.s("㵯\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵻\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postSoundHoundResponseJobsDetail.operation = (PostSoundHoundResponse.PostSoundHoundResponseOperation) QCloudXml.fromXml(xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseOperation.class, ProtectedSandApp.s("㵰\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSoundHoundResponse.PostSoundHoundResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSoundHoundResponse.PostSoundHoundResponseJobsDetail postSoundHoundResponseJobsDetail = new PostSoundHoundResponse.PostSoundHoundResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSoundHoundResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㵼\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSoundHoundResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSoundHoundResponseJobsDetail;
    }
}
