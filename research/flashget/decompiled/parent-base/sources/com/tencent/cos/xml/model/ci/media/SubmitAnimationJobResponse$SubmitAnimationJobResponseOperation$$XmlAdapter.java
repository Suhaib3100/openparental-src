package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJob;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>> childElementBinders;

    public SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䎛\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobResponseOperation.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎜\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobResponseOperation.templateName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎝\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitAnimationJobResponseOperation.animation = (SubmitAnimationJob.SubmitAnimationJobAnimation) QCloudXml.fromXml(xmlPullParser, SubmitAnimationJob.SubmitAnimationJobAnimation.class, ProtectedSandApp.s("䎗\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎞\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitAnimationJobResponseOperation.output = (SubmitAnimationJob.SubmitAnimationJobOutput) QCloudXml.fromXml(xmlPullParser, SubmitAnimationJob.SubmitAnimationJobOutput.class, ProtectedSandApp.s("䎘\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎟\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitAnimationJobResponseOperation.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class, ProtectedSandApp.s("䎙\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎠\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitAnimationJobResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("䎚\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎡\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎢\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseOperation$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation submitAnimationJobResponseOperation = new SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitAnimationJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䎣\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitAnimationJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitAnimationJobResponseOperation;
    }
}
