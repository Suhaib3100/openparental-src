package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWorkflowListResponse$$XmlAdapter extends IXmlAdapter<GetWorkflowListResponse> {
    private HashMap<String, ChildElementBinder<GetWorkflowListResponse>> childElementBinders;

    public GetWorkflowListResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowListResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䌯\u0001"), new ChildElementBinder<GetWorkflowListResponse>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse getWorkflowListResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowListResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌰\u0001"), new ChildElementBinder<GetWorkflowListResponse>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse getWorkflowListResponse, String str) throws IOException, XmlPullParserException {
                getWorkflowListResponse.totalCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌱\u0001"), new ChildElementBinder<GetWorkflowListResponse>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse getWorkflowListResponse, String str) throws IOException, XmlPullParserException {
                getWorkflowListResponse.pageNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌲\u0001"), new ChildElementBinder<GetWorkflowListResponse>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse getWorkflowListResponse, String str) throws IOException, XmlPullParserException {
                getWorkflowListResponse.pageSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌳\u0001"), new ChildElementBinder<GetWorkflowListResponse>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowListResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowListResponse getWorkflowListResponse, String str) throws IOException, XmlPullParserException {
                if (getWorkflowListResponse.mediaWorkflowList == null) {
                    getWorkflowListResponse.mediaWorkflowList = new ArrayList();
                }
                getWorkflowListResponse.mediaWorkflowList.add((GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList) QCloudXml.fromXml(xmlPullParser, GetWorkflowListResponse.GetWorkflowListResponseMediaWorkflowList.class, ProtectedSandApp.s("䌮\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowListResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowListResponse getWorkflowListResponse = new GetWorkflowListResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowListResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowListResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䌴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowListResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowListResponse;
    }
}
