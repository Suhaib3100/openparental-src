package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.RefererConfiguration;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class RefererConfiguration$Domain$$XmlAdapter extends IXmlAdapter<RefererConfiguration.Domain> {
    private HashMap<String, ChildElementBinder<RefererConfiguration.Domain>> childElementBinders;

    public RefererConfiguration$Domain$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RefererConfiguration.Domain>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䮲\u0001"), new ChildElementBinder<RefererConfiguration.Domain>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$Domain$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration.Domain domain, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                domain.domain = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RefererConfiguration.Domain fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        RefererConfiguration.Domain domain = new RefererConfiguration.Domain();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RefererConfiguration.Domain> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, domain, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䮲\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return domain;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return domain;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RefererConfiguration.Domain domain, String str) throws IOException, XmlPullParserException {
        if (domain == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䮲\u0001");
        }
        xmlSerializer.startTag("", str);
        String str2 = domain.domain;
        if (str2 != null) {
            xmlSerializer.text(String.valueOf(str2));
        }
        xmlSerializer.endTag("", str);
    }
}
