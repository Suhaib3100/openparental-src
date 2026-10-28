package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetDocumentAuditJobResponse$Labels$$XmlAdapter extends IXmlAdapter<GetDocumentAuditJobResponse.Labels> {
    private HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.Labels>> childElementBinders;

    public GetDocumentAuditJobResponse$Labels$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.Labels>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䳱\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Labels>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Labels$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.pornInfo = (GetDocumentAuditJobResponse.DocumentAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditScenarioInfo.class, ProtectedSandApp.s("䳭\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳲\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Labels>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Labels$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.terrorismInfo = (GetDocumentAuditJobResponse.DocumentAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditScenarioInfo.class, ProtectedSandApp.s("䳮\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳳\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Labels>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Labels$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.politicsInfo = (GetDocumentAuditJobResponse.DocumentAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditScenarioInfo.class, ProtectedSandApp.s("䳯\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳴\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Labels>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Labels$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.adsInfo = (GetDocumentAuditJobResponse.DocumentAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditScenarioInfo.class, ProtectedSandApp.s("䳰\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetDocumentAuditJobResponse.Labels fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetDocumentAuditJobResponse.Labels labels = new GetDocumentAuditJobResponse.Labels();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetDocumentAuditJobResponse.Labels> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, labels, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䳵\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return labels;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return labels;
    }
}
