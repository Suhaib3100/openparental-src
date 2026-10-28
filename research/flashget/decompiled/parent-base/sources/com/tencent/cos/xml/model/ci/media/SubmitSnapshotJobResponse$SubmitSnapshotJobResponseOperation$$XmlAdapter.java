package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshot;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>> childElementBinders;

    public SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䕱\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation submitSnapshotJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseOperation.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕲\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation submitSnapshotJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseOperation.templateName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕳\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation submitSnapshotJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitSnapshotJobResponseOperation.snapshot = (TemplateSnapshot.TemplateSnapshotSnapshot) QCloudXml.fromXml(xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot.class, ProtectedSandApp.s("䕮\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕴\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation submitSnapshotJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitSnapshotJobResponseOperation.output = (SubmitSnapshotJob.SubmitSnapshotJobOutput) QCloudXml.fromXml(xmlPullParser, SubmitSnapshotJob.SubmitSnapshotJobOutput.class, ProtectedSandApp.s("䕯\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕵\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation submitSnapshotJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitSnapshotJobResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("䕰\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕶\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation submitSnapshotJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕷\u0001"), new ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJobResponse$SubmitSnapshotJobResponseOperation$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation submitSnapshotJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation submitSnapshotJobResponseOperation = new SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSnapshotJobResponse.SubmitSnapshotJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSnapshotJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䕸\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSnapshotJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSnapshotJobResponseOperation;
    }
}
