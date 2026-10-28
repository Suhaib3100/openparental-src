package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CreateWordsGeneralizeJobResponse$$XmlAdapter extends IXmlAdapter<CreateWordsGeneralizeJobResponse> {
    private HashMap<String, ChildElementBinder<CreateWordsGeneralizeJobResponse>> childElementBinders;

    public CreateWordsGeneralizeJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CreateWordsGeneralizeJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽻\u0001"), new ChildElementBinder<CreateWordsGeneralizeJobResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.CreateWordsGeneralizeJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateWordsGeneralizeJobResponse createWordsGeneralizeJobResponse, String str) throws IOException, XmlPullParserException {
                createWordsGeneralizeJobResponse.jobsDetail = (WordsGeneralizeJobDetail) QCloudXml.fromXml(xmlPullParser, WordsGeneralizeJobDetail.class, ProtectedSandApp.s("㽺\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CreateWordsGeneralizeJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CreateWordsGeneralizeJobResponse createWordsGeneralizeJobResponse = new CreateWordsGeneralizeJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CreateWordsGeneralizeJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, createWordsGeneralizeJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㽼\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return createWordsGeneralizeJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return createWordsGeneralizeJobResponse;
    }
}
