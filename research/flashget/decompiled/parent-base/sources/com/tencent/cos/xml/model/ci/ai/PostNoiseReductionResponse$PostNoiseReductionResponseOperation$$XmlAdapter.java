package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReduction;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse;
import com.tencent.cos.xml.model.ci.common.NoiseReduction;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PostNoiseReductionResponse$PostNoiseReductionResponseOperation$$XmlAdapter extends IXmlAdapter<PostNoiseReductionResponse.PostNoiseReductionResponseOperation> {
    private HashMap<String, ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation>> childElementBinders;

    public PostNoiseReductionResponse$PostNoiseReductionResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㴄\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseOperation postNoiseReductionResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseOperation.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴅\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseOperation postNoiseReductionResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseOperation.templateName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴆\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseOperation postNoiseReductionResponseOperation, String str) throws IOException, XmlPullParserException {
                postNoiseReductionResponseOperation.noiseReduction = (NoiseReduction) QCloudXml.fromXml(xmlPullParser, NoiseReduction.class, ProtectedSandApp.s("㴂\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴇\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseOperation postNoiseReductionResponseOperation, String str) throws IOException, XmlPullParserException {
                postNoiseReductionResponseOperation.output = (PostNoiseReduction.PostNoiseReductionOutput) QCloudXml.fromXml(xmlPullParser, PostNoiseReduction.PostNoiseReductionOutput.class, ProtectedSandApp.s("㴃\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴈\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseOperation postNoiseReductionResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴉\u0001"), new ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReductionResponse$PostNoiseReductionResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReductionResponse.PostNoiseReductionResponseOperation postNoiseReductionResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostNoiseReductionResponse.PostNoiseReductionResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostNoiseReductionResponse.PostNoiseReductionResponseOperation postNoiseReductionResponseOperation = new PostNoiseReductionResponse.PostNoiseReductionResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostNoiseReductionResponse.PostNoiseReductionResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postNoiseReductionResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㴊\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postNoiseReductionResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postNoiseReductionResponseOperation;
    }
}
