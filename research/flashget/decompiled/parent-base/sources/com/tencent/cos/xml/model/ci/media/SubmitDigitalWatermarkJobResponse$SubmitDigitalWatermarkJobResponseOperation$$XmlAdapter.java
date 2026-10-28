package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.DigitalWatermark;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobResponse;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitDigitalWatermarkJobResponse$SubmitDigitalWatermarkJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation>> childElementBinders;

    public SubmitDigitalWatermarkJobResponse$SubmitDigitalWatermarkJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䐤\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobResponse$SubmitDigitalWatermarkJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation submitDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitDigitalWatermarkJobResponseOperation.output = (SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput) QCloudXml.fromXml(xmlPullParser, SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput.class, ProtectedSandApp.s("䐠\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䐥\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobResponse$SubmitDigitalWatermarkJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation submitDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitDigitalWatermarkJobResponseOperation.digitalWatermark = (DigitalWatermark) QCloudXml.fromXml(xmlPullParser, DigitalWatermark.class, ProtectedSandApp.s("䐡\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䐦\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobResponse$SubmitDigitalWatermarkJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation submitDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitDigitalWatermarkJobResponseOperation.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class, ProtectedSandApp.s("䐢\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䐧\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobResponse$SubmitDigitalWatermarkJobResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation submitDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitDigitalWatermarkJobResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("䐣\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䐨\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobResponse$SubmitDigitalWatermarkJobResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation submitDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitDigitalWatermarkJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䐩\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJobResponse$SubmitDigitalWatermarkJobResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation submitDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitDigitalWatermarkJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation submitDigitalWatermarkJobResponseOperation = new SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitDigitalWatermarkJobResponse.SubmitDigitalWatermarkJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitDigitalWatermarkJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䐪\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitDigitalWatermarkJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitDigitalWatermarkJobResponseOperation;
    }
}
