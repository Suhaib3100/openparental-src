package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostTranslation;
import com.tencent.cos.xml.model.ci.ai.PostTranslationResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter extends IXmlAdapter<PostTranslationResponse.PostTranslationResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>> childElementBinders;

    public PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㷂\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷃\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷄\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷅\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷆\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷇\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷈\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷉\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷊\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷋\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postTranslationResponseJobsDetail.input = (PostTranslation.PostTranslationInput) QCloudXml.fromXml(xmlPullParser, PostTranslation.PostTranslationInput.class, ProtectedSandApp.s("㷀\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷌\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postTranslationResponseJobsDetail.operation = (PostTranslationResponse.PostTranslationResponseOperation) QCloudXml.fromXml(xmlPullParser, PostTranslationResponse.PostTranslationResponseOperation.class, ProtectedSandApp.s("㷁\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostTranslationResponse.PostTranslationResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostTranslationResponse.PostTranslationResponseJobsDetail postTranslationResponseJobsDetail = new PostTranslationResponse.PostTranslationResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostTranslationResponse.PostTranslationResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postTranslationResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㷍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postTranslationResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postTranslationResponseJobsDetail;
    }
}
