package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CloseAsrBucketResponse$$XmlAdapter extends IXmlAdapter<CloseAsrBucketResponse> {
    private HashMap<String, ChildElementBinder<CloseAsrBucketResponse>> childElementBinders;

    public CloseAsrBucketResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CloseAsrBucketResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㰒\u0001"), new ChildElementBinder<CloseAsrBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.CloseAsrBucketResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CloseAsrBucketResponse closeAsrBucketResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                closeAsrBucketResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㰓\u0001"), new ChildElementBinder<CloseAsrBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.CloseAsrBucketResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CloseAsrBucketResponse closeAsrBucketResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                closeAsrBucketResponse.bucketName = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CloseAsrBucketResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CloseAsrBucketResponse closeAsrBucketResponse = new CloseAsrBucketResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CloseAsrBucketResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, closeAsrBucketResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㰔\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return closeAsrBucketResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return closeAsrBucketResponse;
    }
}
