package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.DescribeBucket;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class OpenBucketAiResponse$$XmlAdapter extends IXmlAdapter<OpenBucketAiResponse> {
    private HashMap<String, ChildElementBinder<OpenBucketAiResponse>> childElementBinders;

    public OpenBucketAiResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<OpenBucketAiResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㾂\u0001"), new ChildElementBinder<OpenBucketAiResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.OpenBucketAiResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, OpenBucketAiResponse openBucketAiResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                openBucketAiResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾃\u0001"), new ChildElementBinder<OpenBucketAiResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.OpenBucketAiResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, OpenBucketAiResponse openBucketAiResponse, String str) throws IOException, XmlPullParserException {
                openBucketAiResponse.aiBucket = (DescribeBucket) QCloudXml.fromXml(xmlPullParser, DescribeBucket.class, ProtectedSandApp.s("㾁\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public OpenBucketAiResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        OpenBucketAiResponse openBucketAiResponse = new OpenBucketAiResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<OpenBucketAiResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, openBucketAiResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㾄\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return openBucketAiResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return openBucketAiResponse;
    }
}
