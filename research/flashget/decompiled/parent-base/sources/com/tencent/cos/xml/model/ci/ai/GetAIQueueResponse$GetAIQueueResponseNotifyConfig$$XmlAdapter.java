package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter extends IXmlAdapter<GetAIQueueResponse.GetAIQueueResponseNotifyConfig> {
    private HashMap<String, ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>> childElementBinders;

    public GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㱬\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseNotifyConfig.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱭\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseNotifyConfig.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱮\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseNotifyConfig.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱯\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseNotifyConfig.event = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱰\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseNotifyConfig.resultFormat = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱱\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseNotifyConfig.mqMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱲\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseNotifyConfig.mqRegion = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱳\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseNotifyConfig$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseNotifyConfig.mqName = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAIQueueResponse.GetAIQueueResponseNotifyConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAIQueueResponse.GetAIQueueResponseNotifyConfig getAIQueueResponseNotifyConfig = new GetAIQueueResponse.GetAIQueueResponseNotifyConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseNotifyConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getAIQueueResponseNotifyConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㱴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getAIQueueResponseNotifyConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getAIQueueResponseNotifyConfig;
    }
}
