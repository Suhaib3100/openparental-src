package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter extends IXmlAdapter<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList> {
    private HashMap<String, ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>> childElementBinders;

    public SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䍗\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                searchMediaQueueResponseQueueList.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍘\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                searchMediaQueueResponseQueueList.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍙\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                searchMediaQueueResponseQueueList.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍚\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                searchMediaQueueResponseQueueList.notifyConfig = (SearchMediaQueueResponse.SearchMediaQueueResponseNotifyConfig) QCloudXml.fromXml(xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseNotifyConfig.class, ProtectedSandApp.s("䍖\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍛\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                searchMediaQueueResponseQueueList.maxSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍜\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                searchMediaQueueResponseQueueList.maxConcurrent = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍝\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                searchMediaQueueResponseQueueList.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍞\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                searchMediaQueueResponseQueueList.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍟\u0001"), new ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$SearchMediaQueueResponseQueueList$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                searchMediaQueueResponseQueueList.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SearchMediaQueueResponse.SearchMediaQueueResponseQueueList fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SearchMediaQueueResponse.SearchMediaQueueResponseQueueList searchMediaQueueResponseQueueList = new SearchMediaQueueResponse.SearchMediaQueueResponseQueueList();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SearchMediaQueueResponse.SearchMediaQueueResponseQueueList> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, searchMediaQueueResponseQueueList, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䍠\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return searchMediaQueueResponseQueueList;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return searchMediaQueueResponseQueueList;
    }
}
