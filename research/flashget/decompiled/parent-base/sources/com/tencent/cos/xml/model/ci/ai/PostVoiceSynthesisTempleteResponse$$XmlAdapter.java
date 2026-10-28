package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVoiceSynthesisTempleteResponse$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesisTempleteResponse> {
    private HashMap<String, ChildElementBinder<PostVoiceSynthesisTempleteResponse>> childElementBinders;

    public PostVoiceSynthesisTempleteResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVoiceSynthesisTempleteResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㺌\u0001"), new ChildElementBinder<PostVoiceSynthesisTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisTempleteResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisTempleteResponse postVoiceSynthesisTempleteResponse, String str) throws IOException, XmlPullParserException {
                postVoiceSynthesisTempleteResponse.template = (VoiceSynthesisTempleteResponseTemplate) QCloudXml.fromXml(xmlPullParser, VoiceSynthesisTempleteResponseTemplate.class, ProtectedSandApp.s("㺋\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㺍\u0001"), new ChildElementBinder<PostVoiceSynthesisTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisTempleteResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisTempleteResponse postVoiceSynthesisTempleteResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTempleteResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVoiceSynthesisTempleteResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVoiceSynthesisTempleteResponse postVoiceSynthesisTempleteResponse = new PostVoiceSynthesisTempleteResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVoiceSynthesisTempleteResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVoiceSynthesisTempleteResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㺎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVoiceSynthesisTempleteResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVoiceSynthesisTempleteResponse;
    }
}
