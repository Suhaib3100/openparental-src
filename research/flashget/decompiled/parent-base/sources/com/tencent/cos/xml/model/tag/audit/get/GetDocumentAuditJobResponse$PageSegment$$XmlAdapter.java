package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetDocumentAuditJobResponse$PageSegment$$XmlAdapter extends IXmlAdapter<GetDocumentAuditJobResponse.PageSegment> {
    private HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.PageSegment>> childElementBinders;

    public GetDocumentAuditJobResponse$PageSegment$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.PageSegment>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䳷\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.PageSegment>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$PageSegment$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.PageSegment pageSegment, String str) throws IOException, XmlPullParserException {
                if (pageSegment.results == null) {
                    pageSegment.results = new ArrayList();
                }
                pageSegment.results.add((GetDocumentAuditJobResponse.Results) QCloudXml.fromXml(xmlPullParser, GetDocumentAuditJobResponse.Results.class, ProtectedSandApp.s("䳶\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetDocumentAuditJobResponse.PageSegment fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetDocumentAuditJobResponse.PageSegment pageSegment = new GetDocumentAuditJobResponse.PageSegment();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetDocumentAuditJobResponse.PageSegment> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, pageSegment, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䳸\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return pageSegment;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return pageSegment;
    }
}
