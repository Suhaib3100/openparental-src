package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResponse;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation>> childElementBinders;

    public SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䒊\u0001"), new ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation submitMediaInfoJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitMediaInfoJobResponseOperation.mediaInfo = (MediaInfo) QCloudXml.fromXml(xmlPullParser, MediaInfo.class, ProtectedSandApp.s("䒉\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒋\u0001"), new ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation submitMediaInfoJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaInfoJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒌\u0001"), new ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation submitMediaInfoJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaInfoJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation submitMediaInfoJobResponseOperation = new SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaInfoJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䒍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaInfoJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaInfoJobResponseOperation;
    }
}
