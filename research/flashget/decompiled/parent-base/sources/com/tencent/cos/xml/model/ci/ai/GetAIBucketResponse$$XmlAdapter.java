package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.GetAIBucketResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAIBucketResponse$$XmlAdapter extends IXmlAdapter<GetAIBucketResponse> {
    private HashMap<String, ChildElementBinder<GetAIBucketResponse>> childElementBinders;

    public GetAIBucketResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAIBucketResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㱑\u0001"), new ChildElementBinder<GetAIBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIBucketResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIBucketResponse getAIBucketResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAIBucketResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱒\u0001"), new ChildElementBinder<GetAIBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIBucketResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIBucketResponse getAIBucketResponse, String str) throws IOException, XmlPullParserException {
                getAIBucketResponse.totalCount = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱓\u0001"), new ChildElementBinder<GetAIBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIBucketResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIBucketResponse getAIBucketResponse, String str) throws IOException, XmlPullParserException {
                getAIBucketResponse.pageNumber = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱔\u0001"), new ChildElementBinder<GetAIBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIBucketResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIBucketResponse getAIBucketResponse, String str) throws IOException, XmlPullParserException {
                getAIBucketResponse.pageSize = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱕\u0001"), new ChildElementBinder<GetAIBucketResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetAIBucketResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAIBucketResponse getAIBucketResponse, String str) throws IOException, XmlPullParserException {
                if (getAIBucketResponse.aiBucketList == null) {
                    getAIBucketResponse.aiBucketList = new ArrayList();
                }
                getAIBucketResponse.aiBucketList.add((GetAIBucketResponse.GetAIBucketResponseAiBucketList) QCloudXml.fromXml(xmlPullParser, GetAIBucketResponse.GetAIBucketResponseAiBucketList.class, ProtectedSandApp.s("㱐\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAIBucketResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAIBucketResponse getAIBucketResponse = new GetAIBucketResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAIBucketResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getAIBucketResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㱖\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getAIBucketResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getAIBucketResponse;
    }
}
