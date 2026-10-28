package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVideoTargetTempleteResponse$$XmlAdapter extends IXmlAdapter<PostVideoTargetTempleteResponse> {
    private HashMap<String, ChildElementBinder<PostVideoTargetTempleteResponse>> childElementBinders;

    public PostVideoTargetTempleteResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVideoTargetTempleteResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㸹\u0001"), new ChildElementBinder<PostVideoTargetTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVideoTargetTempleteResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoTargetTempleteResponse postVideoTargetTempleteResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVideoTargetTempleteResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㸺\u0001"), new ChildElementBinder<PostVideoTargetTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVideoTargetTempleteResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoTargetTempleteResponse postVideoTargetTempleteResponse, String str) throws IOException, XmlPullParserException {
                postVideoTargetTempleteResponse.template = (VideoTargetTempleteResponseTemplate) QCloudXml.fromXml(xmlPullParser, VideoTargetTempleteResponseTemplate.class, ProtectedSandApp.s("㸸\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVideoTargetTempleteResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVideoTargetTempleteResponse postVideoTargetTempleteResponse = new PostVideoTargetTempleteResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVideoTargetTempleteResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVideoTargetTempleteResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㸻\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVideoTargetTempleteResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVideoTargetTempleteResponse;
    }
}
