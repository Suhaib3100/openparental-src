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
public class CreateSpeechJobsResponse$$XmlAdapter extends IXmlAdapter<CreateSpeechJobsResponse> {
    private HashMap<String, ChildElementBinder<CreateSpeechJobsResponse>> childElementBinders;

    public CreateSpeechJobsResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CreateSpeechJobsResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㿣\u0001"), new ChildElementBinder<CreateSpeechJobsResponse>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.CreateSpeechJobsResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateSpeechJobsResponse createSpeechJobsResponse, String str) throws IOException, XmlPullParserException {
                createSpeechJobsResponse.jobsDetail = (SpeechJobsDetail) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.class, ProtectedSandApp.s("㿢\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CreateSpeechJobsResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CreateSpeechJobsResponse createSpeechJobsResponse = new CreateSpeechJobsResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CreateSpeechJobsResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, createSpeechJobsResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㿤\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return createSpeechJobsResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return createSpeechJobsResponse;
    }
}
