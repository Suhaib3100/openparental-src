package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse;
import com.tencent.cos.xml.model.ci.common.NotifyConfig;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter extends IXmlAdapter<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue> {
    private HashMap<String, ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>> childElementBinders;

    public UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㻕\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAsrQueueResponseQueue.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻖\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAsrQueueResponseQueue.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻗\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAsrQueueResponseQueue.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻘\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateAsrQueueResponseQueue.notifyConfig = (NotifyConfig) QCloudXml.fromXml(xmlPullParser, NotifyConfig.class, ProtectedSandApp.s("㻔\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻙\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateAsrQueueResponseQueue.maxSize = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻚\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateAsrQueueResponseQueue.maxConcurrent = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻛\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAsrQueueResponseQueue.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻜\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAsrQueueResponseQueue.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻝\u0001"), new ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$UpdateAsrQueueResponseQueue$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAsrQueueResponseQueue.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue updateAsrQueueResponseQueue = new UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateAsrQueueResponseQueue, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㻞\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateAsrQueueResponseQueue;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateAsrQueueResponseQueue;
    }
}
