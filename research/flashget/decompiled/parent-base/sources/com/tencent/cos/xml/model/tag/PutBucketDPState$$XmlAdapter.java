package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PutBucketDPState$$XmlAdapter extends IXmlAdapter<PutBucketDPState> {
    private HashMap<String, ChildElementBinder<PutBucketDPState>> childElementBinders;

    public PutBucketDPState$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PutBucketDPState>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䭔\u0001"), new ChildElementBinder<PutBucketDPState>() { // from class: com.tencent.cos.xml.model.tag.PutBucketDPState$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PutBucketDPState putBucketDPState, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                putBucketDPState.RequestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭕\u0001"), new ChildElementBinder<PutBucketDPState>() { // from class: com.tencent.cos.xml.model.tag.PutBucketDPState$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PutBucketDPState putBucketDPState, String str) throws IOException, XmlPullParserException {
                putBucketDPState.DocBucket = (BucketDocumentPreviewState) QCloudXml.fromXml(xmlPullParser, BucketDocumentPreviewState.class, ProtectedSandApp.s("䭓\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PutBucketDPState fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PutBucketDPState putBucketDPState = new PutBucketDPState();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PutBucketDPState> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, putBucketDPState, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䭖\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return putBucketDPState;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return putBucketDPState;
    }
}
