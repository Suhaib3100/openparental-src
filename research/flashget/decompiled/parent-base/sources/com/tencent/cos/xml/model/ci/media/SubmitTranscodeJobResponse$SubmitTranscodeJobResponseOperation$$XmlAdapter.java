package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.DigitalWatermark;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse;
import com.tencent.cos.xml.model.ci.media.TemplateWatermark;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>> childElementBinders;

    public SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䗏\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseOperation.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗐\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseOperation.templateName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗑\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobResponseOperation.transcode = (SubmitTranscodeJob.SubmitTranscodeJobTranscode) QCloudXml.fromXml(xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobTranscode.class, ProtectedSandApp.s("䗈\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗒\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                if (submitTranscodeJobResponseOperation.watermark == null) {
                    submitTranscodeJobResponseOperation.watermark = new ArrayList();
                }
                submitTranscodeJobResponseOperation.watermark.add((TemplateWatermark.Watermark) QCloudXml.fromXml(xmlPullParser, TemplateWatermark.Watermark.class, ProtectedSandApp.s("䗉\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗓\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobResponseOperation.removeWatermark = (SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark) QCloudXml.fromXml(xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark.class, ProtectedSandApp.s("䗊\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗔\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                if (submitTranscodeJobResponseOperation.watermarkTemplateId == null) {
                    submitTranscodeJobResponseOperation.watermarkTemplateId = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        submitTranscodeJobResponseOperation.watermarkTemplateId.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䗋\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗕\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobResponseOperation.output = (SubmitTranscodeJob.SubmitTranscodeJobOutput) QCloudXml.fromXml(xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobOutput.class, ProtectedSandApp.s("䗌\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗖\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobResponseOperation.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class, ProtectedSandApp.s("䗍\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗗\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("䗎\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗘\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitTranscodeJobResponseOperation.digitalWatermark = (DigitalWatermark) QCloudXml.fromXml(xmlPullParser, DigitalWatermark.class, ProtectedSandApp.s("䗇\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗙\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗚\u0001"), new ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJobResponse$SubmitTranscodeJobResponseOperation$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation submitTranscodeJobResponseOperation = new SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitTranscodeJobResponse.SubmitTranscodeJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitTranscodeJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䗛\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitTranscodeJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitTranscodeJobResponseOperation;
    }
}
