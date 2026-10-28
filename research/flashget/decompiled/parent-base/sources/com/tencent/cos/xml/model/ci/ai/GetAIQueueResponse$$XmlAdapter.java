package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAIQueueResponse$$XmlAdapter extends IXmlAdapter<GetAIQueueResponse> {
    private HashMap<String, ChildElementBinder<GetAIQueueResponse>> childElementBinders;

    public GetAIQueueResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAIQueueResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㱥\u0001"), new ChildElementBinder<GetAIQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse getAIQueueResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIQueueResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱦\u0001"), new ChildElementBinder<GetAIQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse getAIQueueResponse, String str) throws IOException, XmlPullParserException {
                getAIQueueResponse.totalCount = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱧\u0001"), new ChildElementBinder<GetAIQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse getAIQueueResponse, String str) throws IOException, XmlPullParserException {
                getAIQueueResponse.pageNumber = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱨\u0001"), new ChildElementBinder<GetAIQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse getAIQueueResponse, String str) throws IOException, XmlPullParserException {
                getAIQueueResponse.pageSize = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱩\u0001"), new ChildElementBinder<GetAIQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse getAIQueueResponse, String str) throws IOException, XmlPullParserException {
                if (getAIQueueResponse.queueList == null) {
                    getAIQueueResponse.queueList = new ArrayList();
                }
                getAIQueueResponse.queueList.add((GetAIQueueResponse.GetAIQueueResponseQueueList) QCloudXml.fromXml(xmlPullParser, GetAIQueueResponse.GetAIQueueResponseQueueList.class, ProtectedSandApp.s("㱣\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱪\u0001"), new ChildElementBinder<GetAIQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIQueueResponse$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIQueueResponse getAIQueueResponse, String str) throws IOException, XmlPullParserException {
                if (getAIQueueResponse.nonExistPIDs == null) {
                    getAIQueueResponse.nonExistPIDs = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        getAIQueueResponse.nonExistPIDs.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("㱤\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAIQueueResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAIQueueResponse getAIQueueResponse = new GetAIQueueResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAIQueueResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getAIQueueResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㱫\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getAIQueueResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getAIQueueResponse;
    }
}
