package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation>> childElementBinders;

    public SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䔸\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation submitSmartCoverJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseOperation.smartCover = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔹\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation submitSmartCoverJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitSmartCoverJobResponseOperation.output = (SubmitSmartCoverJob.SubmitSmartCoverJobOutput) QCloudXml.fromXml(xmlPullParser, SubmitSmartCoverJob.SubmitSmartCoverJobOutput.class, ProtectedSandApp.s("䔶\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔺\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation submitSmartCoverJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitSmartCoverJobResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("䔷\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔻\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation submitSmartCoverJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔼\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation submitSmartCoverJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation submitSmartCoverJobResponseOperation = new SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSmartCoverJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䔽\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSmartCoverJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSmartCoverJobResponseOperation;
    }
}
