package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class BucketDocumentPreviewState$$XmlAdapter extends IXmlAdapter<BucketDocumentPreviewState> {
    private HashMap<String, ChildElementBinder<BucketDocumentPreviewState>> childElementBinders;

    public BucketDocumentPreviewState$$XmlAdapter() {
        HashMap<String, ChildElementBinder<BucketDocumentPreviewState>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䧗\u0001"), new ChildElementBinder<BucketDocumentPreviewState>() { // from class: com.tencent.cos.xml.model.tag.BucketDocumentPreviewState$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BucketDocumentPreviewState bucketDocumentPreviewState, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                bucketDocumentPreviewState.Name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䧘\u0001"), new ChildElementBinder<BucketDocumentPreviewState>() { // from class: com.tencent.cos.xml.model.tag.BucketDocumentPreviewState$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BucketDocumentPreviewState bucketDocumentPreviewState, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                bucketDocumentPreviewState.CreateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䧙\u0001"), new ChildElementBinder<BucketDocumentPreviewState>() { // from class: com.tencent.cos.xml.model.tag.BucketDocumentPreviewState$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BucketDocumentPreviewState bucketDocumentPreviewState, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                bucketDocumentPreviewState.Region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䧚\u0001"), new ChildElementBinder<BucketDocumentPreviewState>() { // from class: com.tencent.cos.xml.model.tag.BucketDocumentPreviewState$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BucketDocumentPreviewState bucketDocumentPreviewState, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                bucketDocumentPreviewState.BucketId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public BucketDocumentPreviewState fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        BucketDocumentPreviewState bucketDocumentPreviewState = new BucketDocumentPreviewState();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<BucketDocumentPreviewState> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, bucketDocumentPreviewState, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䧛\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return bucketDocumentPreviewState;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return bucketDocumentPreviewState;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, BucketDocumentPreviewState bucketDocumentPreviewState, String str) throws IOException, XmlPullParserException {
        if (bucketDocumentPreviewState == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䧛\u0001");
        }
        xmlSerializer.startTag("", str);
        if (bucketDocumentPreviewState.Name != null) {
            String s4 = ProtectedSandApp.s("䧗\u0001");
            xmlSerializer.startTag("", s4);
            a.a(bucketDocumentPreviewState.Name, xmlSerializer, "", s4);
        }
        if (bucketDocumentPreviewState.CreateTime != null) {
            String s5 = ProtectedSandApp.s("䧘\u0001");
            xmlSerializer.startTag("", s5);
            a.a(bucketDocumentPreviewState.CreateTime, xmlSerializer, "", s5);
        }
        if (bucketDocumentPreviewState.Region != null) {
            String s6 = ProtectedSandApp.s("䧙\u0001");
            xmlSerializer.startTag("", s6);
            a.a(bucketDocumentPreviewState.Region, xmlSerializer, "", s6);
        }
        if (bucketDocumentPreviewState.BucketId != null) {
            String s7 = ProtectedSandApp.s("䧚\u0001");
            xmlSerializer.startTag("", s7);
            a.a(bucketDocumentPreviewState.BucketId, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
