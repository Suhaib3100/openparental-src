package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseOperation$$XmlAdapter extends IXmlAdapter<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation> {
    private HashMap<String, ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation>> childElementBinders;

    public SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䑝\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation submitExtractDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                submitExtractDigitalWatermarkJobResponseOperation.extractDigitalWatermark = (SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseExtractDigitalWatermark) QCloudXml.fromXml(xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseExtractDigitalWatermark.class, ProtectedSandApp.s("䑜\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑞\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation submitExtractDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑟\u0001"), new ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJobResponse$SubmitExtractDigitalWatermarkJobResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation submitExtractDigitalWatermarkJobResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitExtractDigitalWatermarkJobResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation submitExtractDigitalWatermarkJobResponseOperation = new SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitExtractDigitalWatermarkJobResponse.SubmitExtractDigitalWatermarkJobResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitExtractDigitalWatermarkJobResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䑠\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitExtractDigitalWatermarkJobResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitExtractDigitalWatermarkJobResponseOperation;
    }
}
