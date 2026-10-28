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
public class DigitalWatermark$$XmlAdapter extends IXmlAdapter<DigitalWatermark> {
    private HashMap<String, ChildElementBinder<DigitalWatermark>> childElementBinders;

    public DigitalWatermark$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DigitalWatermark>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䇸\u0001"), new ChildElementBinder<DigitalWatermark>() { // from class: com.tencent.cos.xml.model.ci.common.DigitalWatermark$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DigitalWatermark digitalWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                digitalWatermark.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇹\u0001"), new ChildElementBinder<DigitalWatermark>() { // from class: com.tencent.cos.xml.model.ci.common.DigitalWatermark$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DigitalWatermark digitalWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                digitalWatermark.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇺\u0001"), new ChildElementBinder<DigitalWatermark>() { // from class: com.tencent.cos.xml.model.ci.common.DigitalWatermark$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DigitalWatermark digitalWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                digitalWatermark.version = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇻\u0001"), new ChildElementBinder<DigitalWatermark>() { // from class: com.tencent.cos.xml.model.ci.common.DigitalWatermark$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DigitalWatermark digitalWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                digitalWatermark.ignoreError = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇼\u0001"), new ChildElementBinder<DigitalWatermark>() { // from class: com.tencent.cos.xml.model.ci.common.DigitalWatermark$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DigitalWatermark digitalWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                digitalWatermark.state = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DigitalWatermark fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DigitalWatermark digitalWatermark = new DigitalWatermark();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DigitalWatermark> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, digitalWatermark, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䇽\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return digitalWatermark;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return digitalWatermark;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, DigitalWatermark digitalWatermark, String str) throws IOException, XmlPullParserException {
        if (digitalWatermark == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䇽\u0001");
        }
        xmlSerializer.startTag("", str);
        if (digitalWatermark.message != null) {
            String s4 = ProtectedSandApp.s("䇸\u0001");
            xmlSerializer.startTag("", s4);
            a.a(digitalWatermark.message, xmlSerializer, "", s4);
        }
        if (digitalWatermark.type != null) {
            String s5 = ProtectedSandApp.s("䇹\u0001");
            xmlSerializer.startTag("", s5);
            a.a(digitalWatermark.type, xmlSerializer, "", s5);
        }
        if (digitalWatermark.version != null) {
            String s6 = ProtectedSandApp.s("䇺\u0001");
            xmlSerializer.startTag("", s6);
            a.a(digitalWatermark.version, xmlSerializer, "", s6);
        }
        if (digitalWatermark.ignoreError != null) {
            String s7 = ProtectedSandApp.s("䇻\u0001");
            xmlSerializer.startTag("", s7);
            a.a(digitalWatermark.ignoreError, xmlSerializer, "", s7);
        }
        if (digitalWatermark.state != null) {
            String s10 = ProtectedSandApp.s("䇼\u0001");
            xmlSerializer.startTag("", s10);
            a.a(digitalWatermark.state, xmlSerializer, "", s10);
        }
        xmlSerializer.endTag("", str);
    }
}
