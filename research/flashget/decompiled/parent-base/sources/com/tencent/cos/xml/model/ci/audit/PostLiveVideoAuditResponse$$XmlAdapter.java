package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostLiveVideoAuditResponse$$XmlAdapter extends IXmlAdapter<PostLiveVideoAuditResponse> {
    private HashMap<String, ChildElementBinder<PostLiveVideoAuditResponse>> childElementBinders;

    public PostLiveVideoAuditResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostLiveVideoAuditResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䆪\u0001"), new ChildElementBinder<PostLiveVideoAuditResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostLiveVideoAuditResponse postLiveVideoAuditResponse, String str) throws IOException, XmlPullParserException {
                postLiveVideoAuditResponse.jobsDetail = (PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, PostLiveVideoAuditResponse.PostLiveVideoAuditResponseJobsDetail.class, ProtectedSandApp.s("䆩\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䆫\u0001"), new ChildElementBinder<PostLiveVideoAuditResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.PostLiveVideoAuditResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostLiveVideoAuditResponse postLiveVideoAuditResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postLiveVideoAuditResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostLiveVideoAuditResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostLiveVideoAuditResponse postLiveVideoAuditResponse = new PostLiveVideoAuditResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostLiveVideoAuditResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postLiveVideoAuditResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䆬\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postLiveVideoAuditResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postLiveVideoAuditResponse;
    }
}
