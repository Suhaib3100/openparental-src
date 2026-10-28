package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVoiceSynthesisResponse$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesisResponse> {
    private HashMap<String, ChildElementBinder<PostVoiceSynthesisResponse>> childElementBinders;

    public PostVoiceSynthesisResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVoiceSynthesisResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㹟\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse postVoiceSynthesisResponse, String str) throws IOException, XmlPullParserException {
                if (postVoiceSynthesisResponse.jobsDetail == null) {
                    postVoiceSynthesisResponse.jobsDetail = new ArrayList();
                }
                postVoiceSynthesisResponse.jobsDetail.add((PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseJobsDetail.class, ProtectedSandApp.s("㹞\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVoiceSynthesisResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVoiceSynthesisResponse postVoiceSynthesisResponse = new PostVoiceSynthesisResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVoiceSynthesisResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVoiceSynthesisResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㹠\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVoiceSynthesisResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVoiceSynthesisResponse;
    }
}
