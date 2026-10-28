package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.Tagging;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class Tagging$TagSet$$XmlAdapter extends IXmlAdapter<Tagging.TagSet> {
    private HashMap<String, ChildElementBinder<Tagging.TagSet>> childElementBinders;

    public Tagging$TagSet$$XmlAdapter() {
        HashMap<String, ChildElementBinder<Tagging.TagSet>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䯕\u0001"), new ChildElementBinder<Tagging.TagSet>() { // from class: com.tencent.cos.xml.model.tag.Tagging$TagSet$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Tagging.TagSet tagSet, String str) throws IOException, XmlPullParserException {
                if (tagSet.tag == null) {
                    tagSet.tag = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    String s4 = ProtectedSandApp.s("䯔\u0001");
                    if (eventType == 2) {
                        tagSet.tag.add((Tagging.Tag) QCloudXml.fromXml(xmlPullParser, Tagging.Tag.class, s4));
                    } else if (eventType == 3 && s4.equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public Tagging.TagSet fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        Tagging.TagSet tagSet = new Tagging.TagSet();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<Tagging.TagSet> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, tagSet, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䯖\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return tagSet;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return tagSet;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, Tagging.TagSet tagSet, String str) throws IOException, XmlPullParserException {
        if (tagSet == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䯖\u0001");
        }
        xmlSerializer.startTag("", str);
        if (tagSet.tag != null) {
            for (int i4 = 0; i4 < tagSet.tag.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, tagSet.tag.get(i4), ProtectedSandApp.s("䯕\u0001"));
            }
        }
        xmlSerializer.endTag("", str);
    }
}
