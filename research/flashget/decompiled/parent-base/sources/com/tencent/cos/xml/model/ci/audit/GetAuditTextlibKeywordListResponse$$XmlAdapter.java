package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.audit.GetAuditTextlibKeywordListResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAuditTextlibKeywordListResponse$$XmlAdapter extends IXmlAdapter<GetAuditTextlibKeywordListResponse> {
    private HashMap<String, ChildElementBinder<GetAuditTextlibKeywordListResponse>> childElementBinders;

    public GetAuditTextlibKeywordListResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditTextlibKeywordListResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䂸\u0001"), new ChildElementBinder<GetAuditTextlibKeywordListResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibKeywordListResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibKeywordListResponse getAuditTextlibKeywordListResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getAuditTextlibKeywordListResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂹\u0001"), new ChildElementBinder<GetAuditTextlibKeywordListResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibKeywordListResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibKeywordListResponse getAuditTextlibKeywordListResponse, String str) throws IOException, XmlPullParserException {
                getAuditTextlibKeywordListResponse.totalCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂺\u0001"), new ChildElementBinder<GetAuditTextlibKeywordListResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibKeywordListResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibKeywordListResponse getAuditTextlibKeywordListResponse, String str) throws IOException, XmlPullParserException {
                if (getAuditTextlibKeywordListResponse.keywords == null) {
                    getAuditTextlibKeywordListResponse.keywords = new ArrayList();
                }
                getAuditTextlibKeywordListResponse.keywords.add((GetAuditTextlibKeywordListResponse.Keywords) QCloudXml.fromXml(xmlPullParser, GetAuditTextlibKeywordListResponse.Keywords.class, ProtectedSandApp.s("䂷\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditTextlibKeywordListResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAuditTextlibKeywordListResponse getAuditTextlibKeywordListResponse = new GetAuditTextlibKeywordListResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditTextlibKeywordListResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getAuditTextlibKeywordListResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䂻\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getAuditTextlibKeywordListResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getAuditTextlibKeywordListResponse;
    }
}
