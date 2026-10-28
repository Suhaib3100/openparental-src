package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class BaseDescribeQueuesResponse$NotifyConfig$$XmlAdapter extends IXmlAdapter<BaseDescribeQueuesResponse.NotifyConfig> {
    private HashMap<String, ChildElementBinder<BaseDescribeQueuesResponse.NotifyConfig>> childElementBinders;

    public BaseDescribeQueuesResponse$NotifyConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<BaseDescribeQueuesResponse.NotifyConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㨮\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$NotifyConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨯\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$NotifyConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨰\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$NotifyConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨱\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$NotifyConfig$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.event = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨲\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.NotifyConfig>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$NotifyConfig$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.NotifyConfig notifyConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                notifyConfig.resultFormat = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public BaseDescribeQueuesResponse.NotifyConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        BaseDescribeQueuesResponse.NotifyConfig notifyConfig = new BaseDescribeQueuesResponse.NotifyConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<BaseDescribeQueuesResponse.NotifyConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, notifyConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㨳\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return notifyConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return notifyConfig;
    }
}
