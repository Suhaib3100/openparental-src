package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class BaseDescribeQueuesResponse$Queue$$XmlAdapter extends IXmlAdapter<BaseDescribeQueuesResponse.Queue> {
    private HashMap<String, ChildElementBinder<BaseDescribeQueuesResponse.Queue>> childElementBinders;

    public BaseDescribeQueuesResponse$Queue$$XmlAdapter() {
        HashMap<String, ChildElementBinder<BaseDescribeQueuesResponse.Queue>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㨵\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                queue.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨶\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                queue.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨷\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                queue.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨸\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                queue.maxSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨹\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                queue.maxConcurrent = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨺\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                queue.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨻\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                queue.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨼\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                queue.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨽\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.Queue>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$Queue$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.Queue queue, String str) throws IOException, XmlPullParserException {
                queue.notifyConfig = (BaseDescribeQueuesResponse.NotifyConfig) QCloudXml.fromXml(xmlPullParser, BaseDescribeQueuesResponse.NotifyConfig.class, ProtectedSandApp.s("㨴\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public BaseDescribeQueuesResponse.Queue fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        BaseDescribeQueuesResponse.Queue queue = new BaseDescribeQueuesResponse.Queue();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<BaseDescribeQueuesResponse.Queue> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, queue, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㨾\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return queue;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return queue;
    }
}
