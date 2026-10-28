package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVideoTargetRecResponse$PostVideoTargetRecResponseVideoTargetRecResult$$XmlAdapter extends IXmlAdapter<PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult> {
    private HashMap<String, ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult>> childElementBinders;

    public PostVideoTargetRecResponse$PostVideoTargetRecResponseVideoTargetRecResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㸪\u0001"), new ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResponse$PostVideoTargetRecResponseVideoTargetRecResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult postVideoTargetRecResponseVideoTargetRecResult, String str) throws IOException, XmlPullParserException {
                if (postVideoTargetRecResponseVideoTargetRecResult.bodyRecognition == null) {
                    postVideoTargetRecResponseVideoTargetRecResult.bodyRecognition = new ArrayList();
                }
                postVideoTargetRecResponseVideoTargetRecResult.bodyRecognition.add((PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition) QCloudXml.fromXml(xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseBodyRecognition.class, ProtectedSandApp.s("㸧\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㸫\u0001"), new ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResponse$PostVideoTargetRecResponseVideoTargetRecResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult postVideoTargetRecResponseVideoTargetRecResult, String str) throws IOException, XmlPullParserException {
                if (postVideoTargetRecResponseVideoTargetRecResult.petRecognition == null) {
                    postVideoTargetRecResponseVideoTargetRecResult.petRecognition = new ArrayList();
                }
                postVideoTargetRecResponseVideoTargetRecResult.petRecognition.add((PostVideoTargetRecResponse.PostVideoTargetRecResponsePetRecognition) QCloudXml.fromXml(xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponsePetRecognition.class, ProtectedSandApp.s("㸨\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㸬\u0001"), new ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVideoTargetRecResponse$PostVideoTargetRecResponseVideoTargetRecResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult postVideoTargetRecResponseVideoTargetRecResult, String str) throws IOException, XmlPullParserException {
                if (postVideoTargetRecResponseVideoTargetRecResult.carRecognition == null) {
                    postVideoTargetRecResponseVideoTargetRecResult.carRecognition = new ArrayList();
                }
                postVideoTargetRecResponseVideoTargetRecResult.carRecognition.add((PostVideoTargetRecResponse.PostVideoTargetRecResponseCarRecognition) QCloudXml.fromXml(xmlPullParser, PostVideoTargetRecResponse.PostVideoTargetRecResponseCarRecognition.class, ProtectedSandApp.s("㸩\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult postVideoTargetRecResponseVideoTargetRecResult = new PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVideoTargetRecResponse.PostVideoTargetRecResponseVideoTargetRecResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVideoTargetRecResponseVideoTargetRecResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㸭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVideoTargetRecResponseVideoTargetRecResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVideoTargetRecResponseVideoTargetRecResult;
    }
}
