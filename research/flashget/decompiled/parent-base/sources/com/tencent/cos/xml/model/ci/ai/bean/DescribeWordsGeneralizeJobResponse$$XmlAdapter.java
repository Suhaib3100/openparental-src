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
public class DescribeWordsGeneralizeJobResponse$$XmlAdapter extends IXmlAdapter<DescribeWordsGeneralizeJobResponse> {
    private HashMap<String, ChildElementBinder<DescribeWordsGeneralizeJobResponse>> childElementBinders;

    public DescribeWordsGeneralizeJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeWordsGeneralizeJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽾\u0001"), new ChildElementBinder<DescribeWordsGeneralizeJobResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.DescribeWordsGeneralizeJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeWordsGeneralizeJobResponse describeWordsGeneralizeJobResponse, String str) throws IOException, XmlPullParserException {
                describeWordsGeneralizeJobResponse.jobsDetail = (WordsGeneralizeJobDetail) QCloudXml.fromXml(xmlPullParser, WordsGeneralizeJobDetail.class, ProtectedSandApp.s("㽽\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽿\u0001"), new ChildElementBinder<DescribeWordsGeneralizeJobResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.DescribeWordsGeneralizeJobResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeWordsGeneralizeJobResponse describeWordsGeneralizeJobResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeWordsGeneralizeJobResponse.nonExistJobIds = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeWordsGeneralizeJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DescribeWordsGeneralizeJobResponse describeWordsGeneralizeJobResponse = new DescribeWordsGeneralizeJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeWordsGeneralizeJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, describeWordsGeneralizeJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㾀\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return describeWordsGeneralizeJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return describeWordsGeneralizeJobResponse;
    }
}
