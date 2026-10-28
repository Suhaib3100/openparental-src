package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostNoiseReductionResponse$PostNoiseReductionResponseInput$$XmlAdapter extends IXmlAdapter<PostNoiseReductionResponse.PostNoiseReductionResponseInput> {
    private HashMap<String, ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseInput>> childElementBinders;

    public PostNoiseReductionResponse$PostNoiseReductionResponseInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㳱\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseInput postNoiseReductionResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳲\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseInput postNoiseReductionResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseInput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳳\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseInput postNoiseReductionResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostNoiseReductionResponse.PostNoiseReductionResponseInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostNoiseReductionResponse.PostNoiseReductionResponseInput postNoiseReductionResponseInput = new PostNoiseReductionResponse.PostNoiseReductionResponseInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postNoiseReductionResponseInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㳴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postNoiseReductionResponseInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postNoiseReductionResponseInput;
    }
}
