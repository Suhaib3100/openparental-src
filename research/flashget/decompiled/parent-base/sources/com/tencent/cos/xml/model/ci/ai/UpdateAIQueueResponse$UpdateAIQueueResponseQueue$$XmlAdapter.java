package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse;
import com.tencent.cos.xml.model.ci.common.NotifyConfig;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter extends IXmlAdapter<UpdateAIQueueResponse.UpdateAIQueueResponseQueue> {
    private HashMap<String, ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>> childElementBinders;

    public UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㺽\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAIQueueResponseQueue.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㺾\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAIQueueResponseQueue.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㺿\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAIQueueResponseQueue.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻀\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateAIQueueResponseQueue.notifyConfig = (NotifyConfig) QCloudXml.fromXml(xmlPullParser, NotifyConfig.class, ProtectedSandApp.s("㺼\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻁\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateAIQueueResponseQueue.maxSize = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻂\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateAIQueueResponseQueue.maxConcurrent = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻃\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAIQueueResponseQueue.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻄\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAIQueueResponseQueue.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻅\u0001"), new ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAIQueueResponse$UpdateAIQueueResponseQueue$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAIQueueResponseQueue.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateAIQueueResponse.UpdateAIQueueResponseQueue fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateAIQueueResponse.UpdateAIQueueResponseQueue updateAIQueueResponseQueue = new UpdateAIQueueResponse.UpdateAIQueueResponseQueue();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateAIQueueResponse.UpdateAIQueueResponseQueue> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateAIQueueResponseQueue, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㻆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateAIQueueResponseQueue;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateAIQueueResponseQueue;
    }
}
