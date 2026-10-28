package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.Tagging;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class Tagging$$XmlAdapter extends IXmlAdapter<Tagging> {
    private HashMap<String, ChildElementBinder<Tagging>> childElementBinders;

    public Tagging$$XmlAdapter() {
        HashMap<String, ChildElementBinder<Tagging>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䯏\u0001"), new ChildElementBinder<Tagging>() { // from class: com.tencent.cos.xml.model.tag.Tagging$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Tagging tagging, String str) throws IOException, XmlPullParserException {
                tagging.tagSet = (Tagging.TagSet) QCloudXml.fromXml(xmlPullParser, Tagging.TagSet.class, ProtectedSandApp.s("䯎\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public Tagging fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        Tagging tagging = new Tagging();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<Tagging> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, tagging, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䯐\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return tagging;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return tagging;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, Tagging tagging, String str) throws IOException, XmlPullParserException {
        if (tagging == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䯐\u0001");
        }
        xmlSerializer.startTag("", str);
        Tagging.TagSet tagSet = tagging.tagSet;
        if (tagSet != null) {
            QCloudXml.toXml(xmlSerializer, tagSet, ProtectedSandApp.s("䯏\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
