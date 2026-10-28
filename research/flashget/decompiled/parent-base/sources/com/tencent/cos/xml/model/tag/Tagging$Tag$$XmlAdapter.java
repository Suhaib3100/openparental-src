package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.tag.Tagging;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class Tagging$Tag$$XmlAdapter extends IXmlAdapter<Tagging.Tag> {
    private HashMap<String, ChildElementBinder<Tagging.Tag>> childElementBinders;

    public Tagging$Tag$$XmlAdapter() {
        HashMap<String, ChildElementBinder<Tagging.Tag>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䯑\u0001"), new ChildElementBinder<Tagging.Tag>() { // from class: com.tencent.cos.xml.model.tag.Tagging$Tag$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Tagging.Tag tag, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                tag.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯒\u0001"), new ChildElementBinder<Tagging.Tag>() { // from class: com.tencent.cos.xml.model.tag.Tagging$Tag$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Tagging.Tag tag, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                tag.value = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public Tagging.Tag fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        Tagging.Tag tag = new Tagging.Tag();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<Tagging.Tag> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, tag, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䯓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return tag;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return tag;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, Tagging.Tag tag, String str) throws IOException, XmlPullParserException {
        if (tag == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䯓\u0001");
        }
        xmlSerializer.startTag("", str);
        if (tag.key != null) {
            String s4 = ProtectedSandApp.s("䯑\u0001");
            xmlSerializer.startTag("", s4);
            a.a(tag.key, xmlSerializer, "", s4);
        }
        if (tag.value != null) {
            String s5 = ProtectedSandApp.s("䯒\u0001");
            xmlSerializer.startTag("", s5);
            a.a(tag.value, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
