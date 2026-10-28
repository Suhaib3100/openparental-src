package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostSegmentVideoBodyResponse$$XmlAdapter extends IXmlAdapter<PostSegmentVideoBodyResponse> {
    private HashMap<String, ChildElementBinder<PostSegmentVideoBodyResponse>> childElementBinders;

    public PostSegmentVideoBodyResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSegmentVideoBodyResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㴾\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse postSegmentVideoBodyResponse, String str) throws IOException, XmlPullParserException {
                if (postSegmentVideoBodyResponse.jobsDetail == null) {
                    postSegmentVideoBodyResponse.jobsDetail = new ArrayList();
                }
                postSegmentVideoBodyResponse.jobsDetail.add((PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseJobsDetail.class, ProtectedSandApp.s("㴽\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSegmentVideoBodyResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSegmentVideoBodyResponse postSegmentVideoBodyResponse = new PostSegmentVideoBodyResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSegmentVideoBodyResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSegmentVideoBodyResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㴿\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSegmentVideoBodyResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSegmentVideoBodyResponse;
    }
}
