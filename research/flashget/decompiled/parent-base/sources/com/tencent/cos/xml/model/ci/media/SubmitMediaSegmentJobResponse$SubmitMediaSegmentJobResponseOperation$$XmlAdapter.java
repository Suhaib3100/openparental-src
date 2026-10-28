package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.MediaResult;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation>> childElementBinders;

    public SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䓈\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation submitMediaSegmentJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitMediaSegmentJobResponseOperation.segment = (SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment) QCloudXml.fromXml(xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment.class, ProtectedSandApp.s("䓄\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓉\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation submitMediaSegmentJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitMediaSegmentJobResponseOperation.output = (SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput) QCloudXml.fromXml(xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput.class, ProtectedSandApp.s("䓅\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓊\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation submitMediaSegmentJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitMediaSegmentJobResponseOperation.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class, ProtectedSandApp.s("䓆\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓋\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation submitMediaSegmentJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitMediaSegmentJobResponseOperation.mediaResult = (MediaResult) QCloudXml.fromXml(xmlPullParser, MediaResult.class, ProtectedSandApp.s("䓇\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓌\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation submitMediaSegmentJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓍\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation submitMediaSegmentJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation submitMediaSegmentJobResponseOperation = new SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaSegmentJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䓎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaSegmentJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaSegmentJobResponseOperation;
    }
}
