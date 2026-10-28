package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostNoiseReductionTempleteResponse$$XmlAdapter extends IXmlAdapter<PostNoiseReductionTempleteResponse> {
    private HashMap<String, ChildElementBinder<PostNoiseReductionTempleteResponse>> childElementBinders;

    public PostNoiseReductionTempleteResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostNoiseReductionTempleteResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㴖\u0001"), new ChildElementBinder<PostNoiseReductionTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionTempleteResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionTempleteResponse postNoiseReductionTempleteResponse, String str) throws IOException, XmlPullParserException {
                postNoiseReductionTempleteResponse.template = (NoiseReductionTempleteResponseTemplate) QCloudXml.fromXml(xmlPullParser, NoiseReductionTempleteResponseTemplate.class, ProtectedSandApp.s("㴕\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴗\u0001"), new ChildElementBinder<PostNoiseReductionTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionTempleteResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionTempleteResponse postNoiseReductionTempleteResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionTempleteResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostNoiseReductionTempleteResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostNoiseReductionTempleteResponse postNoiseReductionTempleteResponse = new PostNoiseReductionTempleteResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostNoiseReductionTempleteResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postNoiseReductionTempleteResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㴘\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postNoiseReductionTempleteResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postNoiseReductionTempleteResponse;
    }
}
