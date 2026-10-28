package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>> childElementBinders;

    public PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㹢\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹣\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹤\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹥\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹦\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹧\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹨\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹩\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹪\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹫\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                postVoiceSynthesisResponseJobsDetail.operation = (PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation) QCloudXml.fromXml(xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation.class, ProtectedSandApp.s("㹡\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail postVoiceSynthesisResponseJobsDetail = new PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVoiceSynthesisResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㹬\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVoiceSynthesisResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVoiceSynthesisResponseJobsDetail;
    }
}
