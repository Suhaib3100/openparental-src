package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWebPageAuditJobResponse$Labels$$XmlAdapter extends IXmlAdapter<GetWebPageAuditJobResponse.Labels> {
    private HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse.Labels>> childElementBinders;

    public GetWebPageAuditJobResponse$Labels$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse.Labels>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䵟\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.Labels>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$Labels$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.pornInfo = (GetWebPageAuditJobResponse.WebPageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditScenarioInfo.class, ProtectedSandApp.s("䵛\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵠\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.Labels>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$Labels$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.terrorismInfo = (GetWebPageAuditJobResponse.WebPageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditScenarioInfo.class, ProtectedSandApp.s("䵜\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵡\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.Labels>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$Labels$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.politicsInfo = (GetWebPageAuditJobResponse.WebPageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditScenarioInfo.class, ProtectedSandApp.s("䵝\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵢\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.Labels>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$Labels$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.adsInfo = (GetWebPageAuditJobResponse.WebPageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditScenarioInfo.class, ProtectedSandApp.s("䵞\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWebPageAuditJobResponse.Labels fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWebPageAuditJobResponse.Labels labels = new GetWebPageAuditJobResponse.Labels();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWebPageAuditJobResponse.Labels> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, labels, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䵣\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
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
