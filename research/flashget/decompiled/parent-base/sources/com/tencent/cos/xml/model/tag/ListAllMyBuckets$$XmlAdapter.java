package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.ListAllMyBuckets;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class ListAllMyBuckets$$XmlAdapter extends IXmlAdapter<ListAllMyBuckets> {
    private HashMap<String, ChildElementBinder<ListAllMyBuckets>> childElementBinders;

    public ListAllMyBuckets$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ListAllMyBuckets>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䪌\u0001"), new ChildElementBinder<ListAllMyBuckets>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets listAllMyBuckets, String str) throws IOException, XmlPullParserException {
                listAllMyBuckets.owner = (ListAllMyBuckets.Owner) QCloudXml.fromXml(xmlPullParser, ListAllMyBuckets.Owner.class, ProtectedSandApp.s("䪉\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䪍\u0001"), new ChildElementBinder<ListAllMyBuckets>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets listAllMyBuckets, String str) throws IOException, XmlPullParserException {
                if (listAllMyBuckets.buckets == null) {
                    listAllMyBuckets.buckets = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        listAllMyBuckets.buckets.add((ListAllMyBuckets.Bucket) QCloudXml.fromXml(xmlPullParser, ListAllMyBuckets.Bucket.class, ProtectedSandApp.s("䪋\u0001")));
                    } else if (eventType == 3 && ProtectedSandApp.s("䪊\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ListAllMyBuckets fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        ListAllMyBuckets listAllMyBuckets = new ListAllMyBuckets();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ListAllMyBuckets> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, listAllMyBuckets, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䪎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return listAllMyBuckets;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return listAllMyBuckets;
    }
}
