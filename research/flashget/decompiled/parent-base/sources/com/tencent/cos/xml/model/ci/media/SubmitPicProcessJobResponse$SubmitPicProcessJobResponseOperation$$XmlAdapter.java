package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.PicProcess;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse;
import com.tencent.cos.xml.model.tag.pic.PicUploadResult;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitPicProcessJobResponse$SubmitPicProcessJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation>> childElementBinders;

    public SubmitPicProcessJobResponse$SubmitPicProcessJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䔁\u0001"), new ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse$SubmitPicProcessJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation submitPicProcessJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitPicProcessJobResponseOperation.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔂\u0001"), new ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse$SubmitPicProcessJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation submitPicProcessJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitPicProcessJobResponseOperation.templateName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔃\u0001"), new ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse$SubmitPicProcessJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation submitPicProcessJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitPicProcessJobResponseOperation.picProcess = (PicProcess) QCloudXml.fromXml(xmlPullParser, PicProcess.class, ProtectedSandApp.s("䓾\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔄\u0001"), new ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse$SubmitPicProcessJobResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation submitPicProcessJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitPicProcessJobResponseOperation.output = (SubmitPicProcessJob.SubmitPicProcessJobOutput) QCloudXml.fromXml(xmlPullParser, SubmitPicProcessJob.SubmitPicProcessJobOutput.class, ProtectedSandApp.s("䓿\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔅\u0001"), new ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse$SubmitPicProcessJobResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation submitPicProcessJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitPicProcessJobResponseOperation.picProcessResult = (PicUploadResult) QCloudXml.fromXml(xmlPullParser, PicUploadResult.class, ProtectedSandApp.s("䔀\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔆\u0001"), new ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJobResponse$SubmitPicProcessJobResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation submitPicProcessJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitPicProcessJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation submitPicProcessJobResponseOperation = new SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitPicProcessJobResponse.SubmitPicProcessJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitPicProcessJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䔇\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitPicProcessJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitPicProcessJobResponseOperation;
    }
}
