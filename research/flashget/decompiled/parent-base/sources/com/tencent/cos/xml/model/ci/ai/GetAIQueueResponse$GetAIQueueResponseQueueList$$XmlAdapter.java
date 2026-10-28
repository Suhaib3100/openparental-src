package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter extends IXmlAdapter<GetAIQueueResponse.GetAIQueueResponseQueueList> {
    private HashMap<String, ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>> childElementBinders;

    public GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㱶\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseQueueList.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱷\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseQueueList.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱸\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseQueueList.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱹\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                getAIQueueResponseQueueList.notifyConfig = (GetAIQueueResponse.GetAIQueueResponseNotifyConfig) QCloudXml.fromXml(xmlPullParser, GetAIQueueResponse.GetAIQueueResponseNotifyConfig.class, ProtectedSandApp.s("㱵\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱺\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                getAIQueueResponseQueueList.maxSize = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱻\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                getAIQueueResponseQueueList.maxConcurrent = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱼\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseQueueList.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱽\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseQueueList.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱾\u0001"), new ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$GetAIQueueResponseQueueList$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponseQueueList.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAIQueueResponse.GetAIQueueResponseQueueList fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAIQueueResponse.GetAIQueueResponseQueueList getAIQueueResponseQueueList = new GetAIQueueResponse.GetAIQueueResponseQueueList();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAIQueueResponse.GetAIQueueResponseQueueList> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getAIQueueResponseQueueList, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㱿\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getAIQueueResponseQueueList;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getAIQueueResponseQueueList;
    }
}
