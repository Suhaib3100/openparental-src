package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.OpenAsrBucketResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class OpenAsrBucketResponse$OpenAsrBucketResponseAsrBucket$$XmlAdapter extends IXmlAdapter<OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket> {
    private HashMap<String, ChildElementBinder<OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket>> childElementBinders;

    public OpenAsrBucketResponse$OpenAsrBucketResponseAsrBucket$$XmlAdapter() {
        HashMap<String, ChildElementBinder<OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㳊\u0001"), new ChildElementBinder<OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket>() { // from class: com.tencent.cos.xml.model.ci.ai.OpenAsrBucketResponse$OpenAsrBucketResponseAsrBucket$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket openAsrBucketResponseAsrBucket, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                openAsrBucketResponseAsrBucket.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳋\u0001"), new ChildElementBinder<OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket>() { // from class: com.tencent.cos.xml.model.ci.ai.OpenAsrBucketResponse$OpenAsrBucketResponseAsrBucket$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket openAsrBucketResponseAsrBucket, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                openAsrBucketResponseAsrBucket.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳌\u0001"), new ChildElementBinder<OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket>() { // from class: com.tencent.cos.xml.model.ci.ai.OpenAsrBucketResponse$OpenAsrBucketResponseAsrBucket$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket openAsrBucketResponseAsrBucket, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                openAsrBucketResponseAsrBucket.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳍\u0001"), new ChildElementBinder<OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket>() { // from class: com.tencent.cos.xml.model.ci.ai.OpenAsrBucketResponse$OpenAsrBucketResponseAsrBucket$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket openAsrBucketResponseAsrBucket, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                openAsrBucketResponseAsrBucket.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket openAsrBucketResponseAsrBucket = new OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<OpenAsrBucketResponse.OpenAsrBucketResponseAsrBucket> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, openAsrBucketResponseAsrBucket, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㳎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return openAsrBucketResponseAsrBucket;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return openAsrBucketResponseAsrBucket;
    }
}
