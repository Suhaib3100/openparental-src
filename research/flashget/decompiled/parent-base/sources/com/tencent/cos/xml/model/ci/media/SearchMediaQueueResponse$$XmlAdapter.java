package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SearchMediaQueueResponse$$XmlAdapter extends IXmlAdapter<SearchMediaQueueResponse> {
    private HashMap<String, ChildElementBinder<SearchMediaQueueResponse>> childElementBinders;

    public SearchMediaQueueResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SearchMediaQueueResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䍈\u0001"), new ChildElementBinder<SearchMediaQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse searchMediaQueueResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                searchMediaQueueResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍉\u0001"), new ChildElementBinder<SearchMediaQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse searchMediaQueueResponse, String str) throws IOException, XmlPullParserException {
                searchMediaQueueResponse.totalCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍊\u0001"), new ChildElementBinder<SearchMediaQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse searchMediaQueueResponse, String str) throws IOException, XmlPullParserException {
                searchMediaQueueResponse.pageNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍋\u0001"), new ChildElementBinder<SearchMediaQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse searchMediaQueueResponse, String str) throws IOException, XmlPullParserException {
                searchMediaQueueResponse.pageSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍌\u0001"), new ChildElementBinder<SearchMediaQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse searchMediaQueueResponse, String str) throws IOException, XmlPullParserException {
                if (searchMediaQueueResponse.queueList == null) {
                    searchMediaQueueResponse.queueList = new ArrayList();
                }
                searchMediaQueueResponse.queueList.add((SearchMediaQueueResponse.SearchMediaQueueResponseQueueList) QCloudXml.fromXml(xmlPullParser, SearchMediaQueueResponse.SearchMediaQueueResponseQueueList.class, ProtectedSandApp.s("䍆\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍍\u0001"), new ChildElementBinder<SearchMediaQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.media.SearchMediaQueueResponse$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SearchMediaQueueResponse searchMediaQueueResponse, String str) throws IOException, XmlPullParserException {
                if (searchMediaQueueResponse.nonExistPIDs == null) {
                    searchMediaQueueResponse.nonExistPIDs = new ArrayList();
                }
                searchMediaQueueResponse.nonExistPIDs.add((SearchMediaQueueResponse.QueueID) QCloudXml.fromXml(xmlPullParser, SearchMediaQueueResponse.QueueID.class, ProtectedSandApp.s("䍇\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SearchMediaQueueResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SearchMediaQueueResponse searchMediaQueueResponse = new SearchMediaQueueResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SearchMediaQueueResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, searchMediaQueueResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䍎\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return searchMediaQueueResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return searchMediaQueueResponse;
    }
}
