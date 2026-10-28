package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse;
import com.tencent.cos.xml.model.ci.common.MediaInfo;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation> {
    private HashMap<String, ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>> childElementBinders;

    public PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㹲\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseOperation.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹳\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseOperation.templateName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹴\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                postVoiceSynthesisResponseOperation.ttsTpl = (PostVoiceSynthesis.PostVoiceSynthesisTtsTpl) QCloudXml.fromXml(xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsTpl.class, ProtectedSandApp.s("㹭\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹵\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                postVoiceSynthesisResponseOperation.ttsConfig = (PostVoiceSynthesis.PostVoiceSynthesisTtsConfig) QCloudXml.fromXml(xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsConfig.class, ProtectedSandApp.s("㹮\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹶\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                postVoiceSynthesisResponseOperation.output = (PostVoiceSynthesis.PostVoiceSynthesisOutput) QCloudXml.fromXml(xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisOutput.class, ProtectedSandApp.s("㹯\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹷\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                postVoiceSynthesisResponseOperation.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class, ProtectedSandApp.s("㹰\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹸\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                postVoiceSynthesisResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("㹱\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹹\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹺\u0001"), new ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesisResponse$PostVoiceSynthesisResponseOperation$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation postVoiceSynthesisResponseOperation = new PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVoiceSynthesisResponse.PostVoiceSynthesisResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVoiceSynthesisResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㹻\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVoiceSynthesisResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVoiceSynthesisResponseOperation;
    }
}
