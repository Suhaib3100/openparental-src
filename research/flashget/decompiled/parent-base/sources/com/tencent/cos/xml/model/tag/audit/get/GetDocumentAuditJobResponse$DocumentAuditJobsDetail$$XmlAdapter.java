package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter extends IXmlAdapter<GetDocumentAuditJobResponse.DocumentAuditJobsDetail> {
    private HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>> childElementBinders;

    public GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䳖\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                documentAuditJobsDetail.suggestion = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳗\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳘\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳙\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                documentAuditJobsDetail.pageCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳚\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                documentAuditJobsDetail.labels = (GetDocumentAuditJobResponse.Labels) QCloudXml.fromXml(xmlPullParser, GetDocumentAuditJobResponse.Labels.class, ProtectedSandApp.s("䳔\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳛\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                documentAuditJobsDetail.pageSegment = (GetDocumentAuditJobResponse.PageSegment) QCloudXml.fromXml(xmlPullParser, GetDocumentAuditJobResponse.PageSegment.class, ProtectedSandApp.s("䳕\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳜\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳝\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳞\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳟\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳠\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳡\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳢\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                documentAuditJobsDetail.userInfo = (AuditUserInfo) QCloudXml.fromXml(xmlPullParser, AuditUserInfo.class, ProtectedSandApp.s("䳒\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳣\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                documentAuditJobsDetail.listInfo = (AuditListInfo) QCloudXml.fromXml(xmlPullParser, AuditListInfo.class, ProtectedSandApp.s("䳓\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳤\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                documentAuditJobsDetail.forbidState = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳥\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳦\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳧\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳨\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$DocumentAuditJobsDetail$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                documentAuditJobsDetail.dataId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetDocumentAuditJobResponse.DocumentAuditJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetDocumentAuditJobResponse.DocumentAuditJobsDetail documentAuditJobsDetail = new GetDocumentAuditJobResponse.DocumentAuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetDocumentAuditJobResponse.DocumentAuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, documentAuditJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䳩\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return documentAuditJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return documentAuditJobsDetail;
    }
}
