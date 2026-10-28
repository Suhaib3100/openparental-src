package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWorkflowListResponse$GetWorkflowListResponseMediaWorkflowList$$XmlAdapter extends IXmlAdapter<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList> {
    private HashMap<String, ChildElementBinder<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList>> childElementBinders;

    public GetWorkflowListResponse$GetWorkflowListResponseMediaWorkflowList$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䌵\u0001"), new ChildElementBinder<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$GetWorkflowListResponseMediaWorkflowList$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList getWorkflowListResponseMediaWorkflowList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowListResponseMediaWorkflowList.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌶\u0001"), new ChildElementBinder<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$GetWorkflowListResponseMediaWorkflowList$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList getWorkflowListResponseMediaWorkflowList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowListResponseMediaWorkflowList.workflowId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌷\u0001"), new ChildElementBinder<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$GetWorkflowListResponseMediaWorkflowList$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList getWorkflowListResponseMediaWorkflowList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowListResponseMediaWorkflowList.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌸\u0001"), new ChildElementBinder<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$GetWorkflowListResponseMediaWorkflowList$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList getWorkflowListResponseMediaWorkflowList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowListResponseMediaWorkflowList.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌹\u0001"), new ChildElementBinder<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$GetWorkflowListResponseMediaWorkflowList$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList getWorkflowListResponseMediaWorkflowList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowListResponseMediaWorkflowList.updateTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList getWorkflowListResponseMediaWorkflowList = new GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowListResponseMediaWorkflowList, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䌺\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowListResponseMediaWorkflowList;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowListResponseMediaWorkflowList;
    }
}
