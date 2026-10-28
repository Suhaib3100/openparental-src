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
public class CallBackMqConfig$$XmlAdapter extends IXmlAdapter<CallBackMqConfig> {
    private HashMap<String, ChildElementBinder<CallBackMqConfig>> childElementBinders;

    public CallBackMqConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CallBackMqConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䧮\u0001"), new ChildElementBinder<CallBackMqConfig>() { // from class: com.tencent.cos.xml.model.tag.CallBackMqConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CallBackMqConfig callBackMqConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                callBackMqConfig.mqRegion = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䧯\u0001"), new ChildElementBinder<CallBackMqConfig>() { // from class: com.tencent.cos.xml.model.tag.CallBackMqConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CallBackMqConfig callBackMqConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                callBackMqConfig.mqMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䧰\u0001"), new ChildElementBinder<CallBackMqConfig>() { // from class: com.tencent.cos.xml.model.tag.CallBackMqConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CallBackMqConfig callBackMqConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                callBackMqConfig.mqName = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CallBackMqConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CallBackMqConfig callBackMqConfig = new CallBackMqConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CallBackMqConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, callBackMqConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䧱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return callBackMqConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return callBackMqConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CallBackMqConfig callBackMqConfig, String str) throws IOException, XmlPullParserException {
        if (callBackMqConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䧱\u0001");
        }
        xmlSerializer.startTag("", str);
        if (callBackMqConfig.mqRegion != null) {
            String s4 = ProtectedSandApp.s("䧮\u0001");
            xmlSerializer.startTag("", s4);
            a.a(callBackMqConfig.mqRegion, xmlSerializer, "", s4);
        }
        if (callBackMqConfig.mqMode != null) {
            String s5 = ProtectedSandApp.s("䧯\u0001");
            xmlSerializer.startTag("", s5);
            a.a(callBackMqConfig.mqMode, xmlSerializer, "", s5);
        }
        if (callBackMqConfig.mqName != null) {
            String s6 = ProtectedSandApp.s("䧰\u0001");
            xmlSerializer.startTag("", s6);
            a.a(callBackMqConfig.mqName, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
