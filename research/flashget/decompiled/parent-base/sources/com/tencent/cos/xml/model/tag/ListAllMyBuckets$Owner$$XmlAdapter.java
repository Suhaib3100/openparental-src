package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.ListAllMyBuckets;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class ListAllMyBuckets$Owner$$XmlAdapter extends IXmlAdapter<ListAllMyBuckets.Owner> {
    private HashMap<String, ChildElementBinder<ListAllMyBuckets.Owner>> childElementBinders;

    public ListAllMyBuckets$Owner$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ListAllMyBuckets.Owner>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䪘\u0001"), new ChildElementBinder<ListAllMyBuckets.Owner>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$Owner$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets.Owner owner, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                owner.f71727id = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䪙\u0001"), new ChildElementBinder<ListAllMyBuckets.Owner>() { // from class: com.tencent.cos.xml.model.tag.ListAllMyBuckets$Owner$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ListAllMyBuckets.Owner owner, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                owner.disPlayName = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ListAllMyBuckets.Owner fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        ListAllMyBuckets.Owner owner = new ListAllMyBuckets.Owner();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ListAllMyBuckets.Owner> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, owner, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䪚\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return owner;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return owner;
    }
}
