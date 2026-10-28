package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse;
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
public class PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseOperation$$XmlAdapter extends IXmlAdapter<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation> {
    private HashMap<String, ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation>> childElementBinders;

    public PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㵒\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation postSegmentVideoBodyResponseOperation, String str) throws IOException, XmlPullParserException {
                postSegmentVideoBodyResponseOperation.segmentVideoBody = (PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody) QCloudXml.fromXml(xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody.class, ProtectedSandApp.s("㵎\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵓\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation postSegmentVideoBodyResponseOperation, String str) throws IOException, XmlPullParserException {
                postSegmentVideoBodyResponseOperation.output = (PostSegmentVideoBody.PostSegmentVideoBodyOutput) QCloudXml.fromXml(xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodyOutput.class, ProtectedSandApp.s("㵏\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵔\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation postSegmentVideoBodyResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵕\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation postSegmentVideoBodyResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵖\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation postSegmentVideoBodyResponseOperation, String str) throws IOException, XmlPullParserException {
                postSegmentVideoBodyResponseOperation.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class, ProtectedSandApp.s("㵐\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㵗\u0001"), new ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBodyResponse$PostSegmentVideoBodyResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation postSegmentVideoBodyResponseOperation, String str) throws IOException, XmlPullParserException {
                postSegmentVideoBodyResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("㵑\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation postSegmentVideoBodyResponseOperation = new PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSegmentVideoBodyResponse.PostSegmentVideoBodyResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSegmentVideoBodyResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㵘\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSegmentVideoBodyResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSegmentVideoBodyResponseOperation;
    }
}
