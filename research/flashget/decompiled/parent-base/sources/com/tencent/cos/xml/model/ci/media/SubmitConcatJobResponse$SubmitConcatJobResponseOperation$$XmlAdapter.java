package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJob;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitConcatJobResponse.SubmitConcatJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>> childElementBinders;

    public SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䏪\u0001"), new ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobResponseOperation.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏫\u0001"), new ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobResponseOperation.templateName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏬\u0001"), new ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitConcatJobResponseOperation.concatTemplate = (SubmitConcatJob.SubmitConcatJobConcatTemplate) QCloudXml.fromXml(xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatTemplate.class, ProtectedSandApp.s("䏦\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏭\u0001"), new ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitConcatJobResponseOperation.output = (SubmitConcatJob.SubmitConcatJobOutput) QCloudXml.fromXml(xmlPullParser, SubmitConcatJob.SubmitConcatJobOutput.class, ProtectedSandApp.s("䏧\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏮\u0001"), new ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitConcatJobResponseOperation.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class, ProtectedSandApp.s("䏨\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏯\u0001"), new ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitConcatJobResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("䏩\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏰\u0001"), new ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏱\u0001"), new ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJobResponse$SubmitConcatJobResponseOperation$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitConcatJobResponse.SubmitConcatJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitConcatJobResponse.SubmitConcatJobResponseOperation submitConcatJobResponseOperation = new SubmitConcatJobResponse.SubmitConcatJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitConcatJobResponse.SubmitConcatJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitConcatJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䏲\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitConcatJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitConcatJobResponseOperation;
    }
}
