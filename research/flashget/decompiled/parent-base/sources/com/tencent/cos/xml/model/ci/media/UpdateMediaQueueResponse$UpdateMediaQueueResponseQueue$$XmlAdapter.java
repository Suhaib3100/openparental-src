package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.media.UpdateMediaQueue;
import com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter extends IXmlAdapter<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue> {
    private HashMap<String, ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>> childElementBinders;

    public UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䢾\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueResponseQueue.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢿\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueResponseQueue.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䣀\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueResponseQueue.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䣁\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateMediaQueueResponseQueue.notifyConfig = (UpdateMediaQueue.UpdateMediaQueueNotifyConfig) QCloudXml.fromXml(xmlPullParser, UpdateMediaQueue.UpdateMediaQueueNotifyConfig.class, ProtectedSandApp.s("䢽\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䣂\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateMediaQueueResponseQueue.maxSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䣃\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                updateMediaQueueResponseQueue.maxConcurrent = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䣄\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueResponseQueue.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䣅\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueResponseQueue.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䣆\u0001"), new ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$UpdateMediaQueueResponseQueue$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueResponseQueue.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue updateMediaQueueResponseQueue = new UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateMediaQueueResponseQueue, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䣇\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateMediaQueueResponseQueue;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateMediaQueueResponseQueue;
    }
}
