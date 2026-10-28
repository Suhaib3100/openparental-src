package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.tag.RefererConfiguration;
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
public class RefererConfiguration$$XmlAdapter extends IXmlAdapter<RefererConfiguration> {
    private HashMap<String, ChildElementBinder<RefererConfiguration>> childElementBinders;

    public RefererConfiguration$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RefererConfiguration>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䮬\u0001"), new ChildElementBinder<RefererConfiguration>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration refererConfiguration, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                refererConfiguration.status = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮭\u0001"), new ChildElementBinder<RefererConfiguration>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration refererConfiguration, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                refererConfiguration.refererType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮮\u0001"), new ChildElementBinder<RefererConfiguration>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration refererConfiguration, String str) throws IOException, XmlPullParserException {
                if (refererConfiguration.domainList == null) {
                    refererConfiguration.domainList = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        refererConfiguration.domainList.add((RefererConfiguration.Domain) QCloudXml.fromXml(xmlPullParser, RefererConfiguration.Domain.class, ProtectedSandApp.s("䮫\u0001")));
                    } else if (eventType == 3 && ProtectedSandApp.s("䮪\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮯\u0001"), new ChildElementBinder<RefererConfiguration>() { // from class: com.tencent.cos.xml.model.tag.RefererConfiguration$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RefererConfiguration refererConfiguration, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                refererConfiguration.emptyReferConfiguration = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RefererConfiguration fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        RefererConfiguration refererConfiguration = new RefererConfiguration();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RefererConfiguration> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, refererConfiguration, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䮰\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return refererConfiguration;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return refererConfiguration;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, RefererConfiguration refererConfiguration, String str) throws IOException, XmlPullParserException {
        if (refererConfiguration == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䮰\u0001");
        }
        xmlSerializer.startTag("", str);
        if (refererConfiguration.status != null) {
            String s4 = ProtectedSandApp.s("䮬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(refererConfiguration.status, xmlSerializer, "", s4);
        }
        if (refererConfiguration.refererType != null) {
            String s5 = ProtectedSandApp.s("䮭\u0001");
            xmlSerializer.startTag("", s5);
            a.a(refererConfiguration.refererType, xmlSerializer, "", s5);
        }
        String s6 = ProtectedSandApp.s("䮮\u0001");
        xmlSerializer.startTag("", s6);
        if (refererConfiguration.domainList != null) {
            for (int i4 = 0; i4 < refererConfiguration.domainList.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, refererConfiguration.domainList.get(i4), ProtectedSandApp.s("䮱\u0001"));
            }
        }
        xmlSerializer.endTag("", s6);
        if (refererConfiguration.emptyReferConfiguration != null) {
            String s7 = ProtectedSandApp.s("䮯\u0001");
            xmlSerializer.startTag("", s7);
            a.a(refererConfiguration.emptyReferConfiguration, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
