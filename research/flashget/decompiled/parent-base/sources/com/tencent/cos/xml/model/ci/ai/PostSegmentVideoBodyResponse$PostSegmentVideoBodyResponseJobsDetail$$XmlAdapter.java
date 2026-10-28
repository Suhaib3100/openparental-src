package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter extends IXmlAdapter<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>> childElementBinders;

    public PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㵂\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵃\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵄\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵅\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵆\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵇\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵈\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵉\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵊\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵋\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postSegmentVideoBodyResponseJobsDetail.input = (PostSegmentVideoBody.PostSegmentVideoBodyInput) QCloudXml.fromXml(xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodyInput.class, ProtectedSandApp.s("㵀\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵌\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postSegmentVideoBodyResponseJobsDetail.operation = (PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation) QCloudXml.fromXml(xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation.class, ProtectedSandApp.s("㵁\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail postSegmentVideoBodyResponseJobsDetail = new PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSegmentVideoBodyResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㵍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSegmentVideoBodyResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSegmentVideoBodyResponseJobsDetail;
    }
}
