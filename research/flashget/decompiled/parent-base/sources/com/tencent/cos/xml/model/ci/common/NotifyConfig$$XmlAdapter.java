package com.tencent.cos.xml.model.ci.common;

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
public class NotifyConfig$$XmlAdapter extends IXmlAdapter<NotifyConfig> {
    private HashMap<String, ChildElementBinder<NotifyConfig>> childElementBinders;

    public NotifyConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<NotifyConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䉩\u0001"), new ChildElementBinder<NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.common.NotifyConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉪\u0001"), new ChildElementBinder<NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.common.NotifyConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.event = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉫\u0001"), new ChildElementBinder<NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.common.NotifyConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.resultFormat = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉬\u0001"), new ChildElementBinder<NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.common.NotifyConfig$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉭\u0001"), new ChildElementBinder<NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.common.NotifyConfig$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉮\u0001"), new ChildElementBinder<NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.common.NotifyConfig$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.mqMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉯\u0001"), new ChildElementBinder<NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.common.NotifyConfig$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.mqRegion = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉰\u0001"), new ChildElementBinder<NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.common.NotifyConfig$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.mqName = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public NotifyConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        NotifyConfig notifyConfig = new NotifyConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<NotifyConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, notifyConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䉱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return notifyConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return notifyConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
        if (notifyConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䉱\u0001");
        }
        xmlSerializer.startTag("", str);
        if (notifyConfig.state != null) {
            String s4 = ProtectedSandApp.s("䉩\u0001");
            xmlSerializer.startTag("", s4);
            a.a(notifyConfig.state, xmlSerializer, "", s4);
        }
        if (notifyConfig.event != null) {
            String s5 = ProtectedSandApp.s("䉪\u0001");
            xmlSerializer.startTag("", s5);
            a.a(notifyConfig.event, xmlSerializer, "", s5);
        }
        if (notifyConfig.resultFormat != null) {
            String s6 = ProtectedSandApp.s("䉫\u0001");
            xmlSerializer.startTag("", s6);
            a.a(notifyConfig.resultFormat, xmlSerializer, "", s6);
        }
        if (notifyConfig.type != null) {
            String s7 = ProtectedSandApp.s("䉬\u0001");
            xmlSerializer.startTag("", s7);
            a.a(notifyConfig.type, xmlSerializer, "", s7);
        }
        if (notifyConfig.url != null) {
            String s10 = ProtectedSandApp.s("䉭\u0001");
            xmlSerializer.startTag("", s10);
            a.a(notifyConfig.url, xmlSerializer, "", s10);
        }
        if (notifyConfig.mqMode != null) {
            String s11 = ProtectedSandApp.s("䉮\u0001");
            xmlSerializer.startTag("", s11);
            a.a(notifyConfig.mqMode, xmlSerializer, "", s11);
        }
        if (notifyConfig.mqRegion != null) {
            String s12 = ProtectedSandApp.s("䉯\u0001");
            xmlSerializer.startTag("", s12);
            a.a(notifyConfig.mqRegion, xmlSerializer, "", s12);
        }
        if (notifyConfig.mqName != null) {
            String s13 = ProtectedSandApp.s("䉰\u0001");
            xmlSerializer.startTag("", s13);
            a.a(notifyConfig.mqName, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
