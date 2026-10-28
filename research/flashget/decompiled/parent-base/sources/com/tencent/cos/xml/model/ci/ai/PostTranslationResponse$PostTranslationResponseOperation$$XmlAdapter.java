package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostTranslation;
import com.tencent.cos.xml.model.ci.ai.PostTranslationResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostTranslationResponse$PostTranslationResponseOperation$$XmlAdapter extends IXmlAdapter<PostTranslationResponse.PostTranslationResponseOperation> {
    private HashMap<String, ChildElementBinder<PostTranslationResponse.PostTranslationResponseOperation>> childElementBinders;

    public PostTranslationResponse$PostTranslationResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostTranslationResponse.PostTranslationResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㷑\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseOperation postTranslationResponseOperation, String str) throws IOException, XmlPullParserException {
                postTranslationResponseOperation.translation = (PostTranslation.PostTranslationTranslation) QCloudXml.fromXml(xmlPullParser, PostTranslation.PostTranslationTranslation.class, ProtectedSandApp.s("㷎\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷒\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseOperation postTranslationResponseOperation, String str) throws IOException, XmlPullParserException {
                postTranslationResponseOperation.output = (PostTranslation.PostTranslationOutput) QCloudXml.fromXml(xmlPullParser, PostTranslation.PostTranslationOutput.class, ProtectedSandApp.s("㷏\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷓\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseOperation postTranslationResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷔\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseOperation postTranslationResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㷕\u0001"), new ChildElementBinder<PostTranslationResponse.PostTranslationResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslationResponse$PostTranslationResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslationResponse.PostTranslationResponseOperation postTranslationResponseOperation, String str) throws IOException, XmlPullParserException {
                postTranslationResponseOperation.aITranslateResult = (PostTranslationResponse.PostTranslationResponseAITranslateResult) QCloudXml.fromXml(xmlPullParser, PostTranslationResponse.PostTranslationResponseAITranslateResult.class, ProtectedSandApp.s("㷐\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostTranslationResponse.PostTranslationResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostTranslationResponse.PostTranslationResponseOperation postTranslationResponseOperation = new PostTranslationResponse.PostTranslationResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostTranslationResponse.PostTranslationResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postTranslationResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㷖\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postTranslationResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postTranslationResponseOperation;
    }
}
