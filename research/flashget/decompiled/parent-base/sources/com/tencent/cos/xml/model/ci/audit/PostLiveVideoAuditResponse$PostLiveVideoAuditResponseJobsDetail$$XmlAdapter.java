package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostLiveVideoAuditResponse$PostLiveVideoAuditResponseJobsDetail$$XmlAdapter extends IXmlAdapter<PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail>> childElementBinders;

    public PostLiveVideoAuditResponse$PostLiveVideoAuditResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䆭\u0001"), new ChildElementBinder<PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResponse$PostLiveVideoAuditResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail postLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postLiveVideoAuditResponseJobsDetail.dataId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䆮\u0001"), new ChildElementBinder<PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResponse$PostLiveVideoAuditResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail postLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postLiveVideoAuditResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䆯\u0001"), new ChildElementBinder<PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResponse$PostLiveVideoAuditResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail postLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postLiveVideoAuditResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䆰\u0001"), new ChildElementBinder<PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResponse$PostLiveVideoAuditResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail postLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postLiveVideoAuditResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail postLiveVideoAuditResponseJobsDetail = new PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postLiveVideoAuditResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䆱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postLiveVideoAuditResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postLiveVideoAuditResponseJobsDetail;
    }
}
