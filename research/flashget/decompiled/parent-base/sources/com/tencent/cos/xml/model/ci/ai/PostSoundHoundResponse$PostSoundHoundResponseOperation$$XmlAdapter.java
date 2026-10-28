package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostSoundHoundResponse$PostSoundHoundResponseOperation$$XmlAdapter extends IXmlAdapter<PostSoundHoundResponse.PostSoundHoundResponseOperation> {
    private HashMap<String, ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseOperation>> childElementBinders;

    public PostSoundHoundResponse$PostSoundHoundResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㵾\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseOperation postSoundHoundResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵿\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseOperation postSoundHoundResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㶀\u0001"), new ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHoundResponse$PostSoundHoundResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseOperation postSoundHoundResponseOperation, String str) throws IOException, XmlPullParserException {
                postSoundHoundResponseOperation.soundHoundResult = (PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult) QCloudXml.fromXml(xmlPullParser, PostSoundHoundResponse.PostSoundHoundResponseSoundHoundResult.class, ProtectedSandApp.s("㵽\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSoundHoundResponse.PostSoundHoundResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSoundHoundResponse.PostSoundHoundResponseOperation postSoundHoundResponseOperation = new PostSoundHoundResponse.PostSoundHoundResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSoundHoundResponse.PostSoundHoundResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSoundHoundResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㶁\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSoundHoundResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSoundHoundResponseOperation;
    }
}
