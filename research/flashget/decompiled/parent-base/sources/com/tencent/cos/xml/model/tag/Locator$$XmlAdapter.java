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
public class Locator$$XmlAdapter extends IXmlAdapter<Locator> {
    private HashMap<String, ChildElementBinder<Locator>> childElementBinders;

    public Locator$$XmlAdapter() {
        HashMap<String, ChildElementBinder<Locator>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䬋\u0001"), new ChildElementBinder<Locator>() { // from class: com.tencent.cos.xml.model.tag.Locator$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Locator locator, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                locator.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬌\u0001"), new ChildElementBinder<Locator>() { // from class: com.tencent.cos.xml.model.tag.Locator$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Locator locator, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                locator.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬍\u0001"), new ChildElementBinder<Locator>() { // from class: com.tencent.cos.xml.model.tag.Locator$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, Locator locator, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                locator.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public Locator fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        Locator locator = new Locator();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<Locator> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, locator, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䬎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return locator;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return locator;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, Locator locator, String str) throws IOException, XmlPullParserException {
        if (locator == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䬎\u0001");
        }
        xmlSerializer.startTag("", str);
        if (locator.region != null) {
            String s4 = ProtectedSandApp.s("䬋\u0001");
            xmlSerializer.startTag("", s4);
            a.a(locator.region, xmlSerializer, "", s4);
        }
        if (locator.bucket != null) {
            String s5 = ProtectedSandApp.s("䬌\u0001");
            xmlSerializer.startTag("", s5);
            a.a(locator.bucket, xmlSerializer, "", s5);
        }
        if (locator.object != null) {
            String s6 = ProtectedSandApp.s("䬍\u0001");
            xmlSerializer.startTag("", s6);
            a.a(locator.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
