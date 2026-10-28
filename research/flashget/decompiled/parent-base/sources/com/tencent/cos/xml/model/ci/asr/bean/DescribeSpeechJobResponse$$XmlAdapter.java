package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DescribeSpeechJobResponse$$XmlAdapter extends IXmlAdapter<DescribeSpeechJobResponse> {
    private HashMap<String, ChildElementBinder<DescribeSpeechJobResponse>> childElementBinders;

    public DescribeSpeechJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeSpeechJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㿭\u0001"), new ChildElementBinder<DescribeSpeechJobResponse>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.DescribeSpeechJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeSpeechJobResponse describeSpeechJobResponse, String str) throws IOException, XmlPullParserException {
                describeSpeechJobResponse.jobsDetail = (SpeechJobsDetail) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.class, ProtectedSandApp.s("㿬\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿮\u0001"), new ChildElementBinder<DescribeSpeechJobResponse>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.DescribeSpeechJobResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeSpeechJobResponse describeSpeechJobResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeSpeechJobResponse.nonExistJobIds = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeSpeechJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DescribeSpeechJobResponse describeSpeechJobResponse = new DescribeSpeechJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeSpeechJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, describeSpeechJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㿯\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return describeSpeechJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return describeSpeechJobResponse;
    }
}
