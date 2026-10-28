package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostImagesAuditJobResponse$$XmlAdapter extends IXmlAdapter<PostImagesAuditJobResponse> {
    private HashMap<String, ChildElementBinder<PostImagesAuditJobResponse>> childElementBinders;

    public PostImagesAuditJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostImagesAuditJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䷬\u0001"), new ChildElementBinder<PostImagesAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.post.PostImagesAuditJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostImagesAuditJobResponse postImagesAuditJobResponse, String str) throws IOException, XmlPullParserException {
                if (postImagesAuditJobResponse.jobsDetail == null) {
                    postImagesAuditJobResponse.jobsDetail = new ArrayList();
                }
                postImagesAuditJobResponse.jobsDetail.add((ImageAuditJobsDetail) QCloudXml.fromXml(xmlPullParser, ImageAuditJobsDetail.class, ProtectedSandApp.s("䷫\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䷭\u0001"), new ChildElementBinder<PostImagesAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.post.PostImagesAuditJobResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostImagesAuditJobResponse postImagesAuditJobResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postImagesAuditJobResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostImagesAuditJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostImagesAuditJobResponse postImagesAuditJobResponse = new PostImagesAuditJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostImagesAuditJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postImagesAuditJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䷮\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postImagesAuditJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postImagesAuditJobResponse;
    }
}
