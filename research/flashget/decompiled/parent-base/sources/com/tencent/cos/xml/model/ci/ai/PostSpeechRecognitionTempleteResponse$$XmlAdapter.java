package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostSpeechRecognitionTempleteResponse$$XmlAdapter extends IXmlAdapter<PostSpeechRecognitionTempleteResponse> {
    private HashMap<String, ChildElementBinder<PostSpeechRecognitionTempleteResponse>> childElementBinders;

    public PostSpeechRecognitionTempleteResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSpeechRecognitionTempleteResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㶔\u0001"), new ChildElementBinder<PostSpeechRecognitionTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSpeechRecognitionTempleteResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSpeechRecognitionTempleteResponse postSpeechRecognitionTempleteResponse, String str) throws IOException, XmlPullParserException {
                postSpeechRecognitionTempleteResponse.template = (SpeechRecognitionTempleteResponseTemplate) QCloudXml.fromXml(xmlPullParser, SpeechRecognitionTempleteResponseTemplate.class, ProtectedSandApp.s("㶓\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㶕\u0001"), new ChildElementBinder<PostSpeechRecognitionTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSpeechRecognitionTempleteResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSpeechRecognitionTempleteResponse postSpeechRecognitionTempleteResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSpeechRecognitionTempleteResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSpeechRecognitionTempleteResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSpeechRecognitionTempleteResponse postSpeechRecognitionTempleteResponse = new PostSpeechRecognitionTempleteResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSpeechRecognitionTempleteResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSpeechRecognitionTempleteResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㶖\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSpeechRecognitionTempleteResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSpeechRecognitionTempleteResponse;
    }
}
