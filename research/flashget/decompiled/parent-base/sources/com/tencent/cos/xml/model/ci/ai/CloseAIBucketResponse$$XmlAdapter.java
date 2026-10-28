package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CloseAIBucketResponse$$XmlAdapter extends IXmlAdapter<CloseAIBucketResponse> {
    private HashMap<String, ChildElementBinder<CloseAIBucketResponse>> childElementBinders;

    public CloseAIBucketResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CloseAIBucketResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㰌\u0001"), new ChildElementBinder<CloseAIBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.CloseAIBucketResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CloseAIBucketResponse closeAIBucketResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                closeAIBucketResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㰍\u0001"), new ChildElementBinder<CloseAIBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.CloseAIBucketResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CloseAIBucketResponse closeAIBucketResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                closeAIBucketResponse.bucketName = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CloseAIBucketResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CloseAIBucketResponse closeAIBucketResponse = new CloseAIBucketResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CloseAIBucketResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, closeAIBucketResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㰎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return closeAIBucketResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return closeAIBucketResponse;
    }
}
