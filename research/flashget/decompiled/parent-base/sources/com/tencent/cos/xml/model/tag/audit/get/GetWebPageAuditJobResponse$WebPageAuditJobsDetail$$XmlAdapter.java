package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter extends IXmlAdapter<GetWebPageAuditJobResponse.WebPageAuditJobsDetail> {
    private HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>> childElementBinders;

    public GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䵸\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                webPageAuditJobsDetail.suggestion = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵹\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵺\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                webPageAuditJobsDetail.pageCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵻\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.highlightHtml = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵼\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                webPageAuditJobsDetail.labels = (GetWebPageAuditJobResponse.Labels) QCloudXml.fromXml(xmlPullParser, GetWebPageAuditJobResponse.Labels.class, ProtectedSandApp.s("䵵\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵽\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                webPageAuditJobsDetail.imageResults = (GetWebPageAuditJobResponse.ImageResults) QCloudXml.fromXml(xmlPullParser, GetWebPageAuditJobResponse.ImageResults.class, ProtectedSandApp.s("䵶\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵾\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                webPageAuditJobsDetail.textResults = (GetWebPageAuditJobResponse.TextResults) QCloudXml.fromXml(xmlPullParser, GetWebPageAuditJobResponse.TextResults.class, ProtectedSandApp.s("䵷\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵿\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶀\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶁\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶂\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶃\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶄\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶅\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                webPageAuditJobsDetail.userInfo = (AuditUserInfo) QCloudXml.fromXml(xmlPullParser, AuditUserInfo.class, ProtectedSandApp.s("䵳\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶆\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                webPageAuditJobsDetail.listInfo = (AuditListInfo) QCloudXml.fromXml(xmlPullParser, AuditListInfo.class, ProtectedSandApp.s("䵴\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶇\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                webPageAuditJobsDetail.forbidState = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶈\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶉\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶊\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶋\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$WebPageAuditJobsDetail$$XmlAdapter.20
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                webPageAuditJobsDetail.dataId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWebPageAuditJobResponse.WebPageAuditJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWebPageAuditJobResponse.WebPageAuditJobsDetail webPageAuditJobsDetail = new GetWebPageAuditJobResponse.WebPageAuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWebPageAuditJobResponse.WebPageAuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, webPageAuditJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䶌\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return webPageAuditJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return webPageAuditJobsDetail;
    }
}
