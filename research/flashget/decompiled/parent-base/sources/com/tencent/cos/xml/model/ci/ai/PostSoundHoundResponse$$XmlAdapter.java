package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostSoundHoundResponse$$XmlAdapter extends IXmlAdapter<PostSoundHoundResponse> {
    private HashMap<String, ChildElementBinder<PostSoundHoundResponse>> childElementBinders;

    public PostSoundHoundResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSoundHoundResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㵭\u0001"), new ChildElementBinder<PostSoundHoundResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse postSoundHoundResponse, String str) throws IOException, XmlPullParserException {
                if (postSoundHoundResponse.jobsDetail == null) {
                    postSoundHoundResponse.jobsDetail = new ArrayList();
                }
                postSoundHoundResponse.jobsDetail.add((PostSoundHoundResponse.PostSoundHoundResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseJobsDetail.class, ProtectedSandApp.s("㵬\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSoundHoundResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSoundHoundResponse postSoundHoundResponse = new PostSoundHoundResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSoundHoundResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSoundHoundResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㵮\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSoundHoundResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSoundHoundResponse;
    }
}
