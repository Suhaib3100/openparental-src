package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVideoTargetRecResponse$PostVideoTargetRecResponseBodyRecognition$$XmlAdapter extends IXmlAdapter<PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition> {
    private HashMap<String, ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition>> childElementBinders;

    public PostVideoTargetRecResponse$PostVideoTargetRecResponseBodyRecognition$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㷵\u0001"), new ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResponse$PostVideoTargetRecResponseBodyRecognition$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition postVideoTargetRecResponseBodyRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVideoTargetRecResponseBodyRecognition.time = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷶\u0001"), new ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResponse$PostVideoTargetRecResponseBodyRecognition$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition postVideoTargetRecResponseBodyRecognition, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVideoTargetRecResponseBodyRecognition.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷷\u0001"), new ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResponse$PostVideoTargetRecResponseBodyRecognition$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition postVideoTargetRecResponseBodyRecognition, String str) throws IOException, XmlPullParserException {
                postVideoTargetRecResponseBodyRecognition.bodyInfo = (PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyInfo) QCloudXml.fromXml(xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyInfo.class, ProtectedSandApp.s("㷴\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition postVideoTargetRecResponseBodyRecognition = new PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVideoTargetRecResponseBodyRecognition, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㷸\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVideoTargetRecResponseBodyRecognition;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVideoTargetRecResponseBodyRecognition;
    }
}
