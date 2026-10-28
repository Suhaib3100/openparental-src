package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.UpdateMediaQueue;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter extends IXmlAdapter<UpdateMediaQueue.UpdateMediaQueueNotifyConfig> {
    private HashMap<String, ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>> childElementBinders;

    public UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䢫\u0001"), new ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueNotifyConfig.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢬\u0001"), new ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueNotifyConfig.event = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢭\u0001"), new ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueNotifyConfig.resultFormat = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢮\u0001"), new ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueNotifyConfig.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢯\u0001"), new ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueNotifyConfig.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢰\u0001"), new ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueNotifyConfig.mqMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢱\u0001"), new ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueNotifyConfig.mqRegion = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢲\u0001"), new ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueue$UpdateMediaQueueNotifyConfig$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueNotifyConfig.mqName = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateMediaQueue.UpdateMediaQueueNotifyConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig = new UpdateMediaQueue.UpdateMediaQueueNotifyConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateMediaQueue.UpdateMediaQueueNotifyConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateMediaQueueNotifyConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䢳\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateMediaQueueNotifyConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateMediaQueueNotifyConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig, String str) throws IOException, XmlPullParserException {
        if (updateMediaQueueNotifyConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䢳\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateMediaQueueNotifyConfig.state != null) {
            String s4 = ProtectedSandApp.s("䢫\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateMediaQueueNotifyConfig.state, xmlSerializer, "", s4);
        }
        if (updateMediaQueueNotifyConfig.event != null) {
            String s5 = ProtectedSandApp.s("䢬\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateMediaQueueNotifyConfig.event, xmlSerializer, "", s5);
        }
        if (updateMediaQueueNotifyConfig.resultFormat != null) {
            String s6 = ProtectedSandApp.s("䢭\u0001");
            xmlSerializer.startTag("", s6);
            a.a(updateMediaQueueNotifyConfig.resultFormat, xmlSerializer, "", s6);
        }
        if (updateMediaQueueNotifyConfig.type != null) {
            String s7 = ProtectedSandApp.s("䢮\u0001");
            xmlSerializer.startTag("", s7);
            a.a(updateMediaQueueNotifyConfig.type, xmlSerializer, "", s7);
        }
        if (updateMediaQueueNotifyConfig.url != null) {
            String s10 = ProtectedSandApp.s("䢯\u0001");
            xmlSerializer.startTag("", s10);
            a.a(updateMediaQueueNotifyConfig.url, xmlSerializer, "", s10);
        }
        if (updateMediaQueueNotifyConfig.mqMode != null) {
            String s11 = ProtectedSandApp.s("䢰\u0001");
            xmlSerializer.startTag("", s11);
            a.a(updateMediaQueueNotifyConfig.mqMode, xmlSerializer, "", s11);
        }
        if (updateMediaQueueNotifyConfig.mqRegion != null) {
            String s12 = ProtectedSandApp.s("䢱\u0001");
            xmlSerializer.startTag("", s12);
            a.a(updateMediaQueueNotifyConfig.mqRegion, xmlSerializer, "", s12);
        }
        if (updateMediaQueueNotifyConfig.mqName != null) {
            String s13 = ProtectedSandApp.s("䢲\u0001");
            xmlSerializer.startTag("", s13);
            a.a(updateMediaQueueNotifyConfig.mqName, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
