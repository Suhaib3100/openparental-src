package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.DescribeBucket;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DescribeSpeechBucketsResponse$$XmlAdapter extends IXmlAdapter<DescribeSpeechBucketsResponse> {
    private HashMap<String, ChildElementBinder<DescribeSpeechBucketsResponse>> childElementBinders;

    public DescribeSpeechBucketsResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeSpeechBucketsResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㿦\u0001"), new ChildElementBinder<DescribeSpeechBucketsResponse>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.DescribeSpeechBucketsResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeSpeechBucketsResponse describeSpeechBucketsResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeSpeechBucketsResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿧\u0001"), new ChildElementBinder<DescribeSpeechBucketsResponse>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.DescribeSpeechBucketsResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeSpeechBucketsResponse describeSpeechBucketsResponse, String str) throws IOException, XmlPullParserException {
                describeSpeechBucketsResponse.totalCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿨\u0001"), new ChildElementBinder<DescribeSpeechBucketsResponse>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.DescribeSpeechBucketsResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeSpeechBucketsResponse describeSpeechBucketsResponse, String str) throws IOException, XmlPullParserException {
                describeSpeechBucketsResponse.pageNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿩\u0001"), new ChildElementBinder<DescribeSpeechBucketsResponse>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.DescribeSpeechBucketsResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeSpeechBucketsResponse describeSpeechBucketsResponse, String str) throws IOException, XmlPullParserException {
                describeSpeechBucketsResponse.pageSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿪\u0001"), new ChildElementBinder<DescribeSpeechBucketsResponse>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.DescribeSpeechBucketsResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeSpeechBucketsResponse describeSpeechBucketsResponse, String str) throws IOException, XmlPullParserException {
                if (describeSpeechBucketsResponse.asrBucketList == null) {
                    describeSpeechBucketsResponse.asrBucketList = new ArrayList();
                }
                describeSpeechBucketsResponse.asrBucketList.add((DescribeBucket) QCloudXml.fromXml(xmlPullParser, DescribeBucket.class, ProtectedSandApp.s("㿥\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeSpeechBucketsResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DescribeSpeechBucketsResponse describeSpeechBucketsResponse = new DescribeSpeechBucketsResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeSpeechBucketsResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, describeSpeechBucketsResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㿫\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return describeSpeechBucketsResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return describeSpeechBucketsResponse;
    }
}
