package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetDocumentAuditJobResponse$DocumentAuditScenarioInfo$$XmlAdapter extends IXmlAdapter<GetDocumentAuditJobResponse.DocumentAuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditScenarioInfo>> childElementBinders;

    public GetDocumentAuditJobResponse$DocumentAuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditScenarioInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䳪\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditScenarioInfo documentAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                documentAuditScenarioInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳫\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditScenarioInfo documentAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                documentAuditScenarioInfo.score = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetDocumentAuditJobResponse.DocumentAuditScenarioInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetDocumentAuditJobResponse.DocumentAuditScenarioInfo documentAuditScenarioInfo = new GetDocumentAuditJobResponse.DocumentAuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, documentAuditScenarioInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䳬\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return documentAuditScenarioInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return documentAuditScenarioInfo;
    }
}
