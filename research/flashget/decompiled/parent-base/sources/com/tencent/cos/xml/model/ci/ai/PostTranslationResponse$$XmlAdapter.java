package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostTranslationResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostTranslationResponse$$XmlAdapter extends IXmlAdapter<PostTranslationResponse> {
    private HashMap<String, ChildElementBinder<PostTranslationResponse>> childElementBinders;

    public PostTranslationResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostTranslationResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㶼\u0001"), new ChildElementBinder<PostTranslationResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse postTranslationResponse, String str) throws IOException, XmlPullParserException {
                if (postTranslationResponse.jobsDetail == null) {
                    postTranslationResponse.jobsDetail = new ArrayList();
                }
                postTranslationResponse.jobsDetail.add((PostTranslationResponse.PostTranslationResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, PostTranslationResponse.PostTranslationResponseJobsDetail.class, ProtectedSandApp.s("㶻\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostTranslationResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostTranslationResponse postTranslationResponse = new PostTranslationResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostTranslationResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postTranslationResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㶽\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postTranslationResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postTranslationResponse;
    }
}
