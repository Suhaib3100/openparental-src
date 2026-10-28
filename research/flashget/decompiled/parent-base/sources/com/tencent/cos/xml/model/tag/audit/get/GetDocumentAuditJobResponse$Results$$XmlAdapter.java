package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetDocumentAuditJobResponse$Results$$XmlAdapter extends IXmlAdapter<GetDocumentAuditJobResponse.Results> {
    private HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.Results>> childElementBinders;

    public GetDocumentAuditJobResponse$Results$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetDocumentAuditJobResponse.Results>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䳽\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                results.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳾\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                results.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䳿\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                results.pageNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴀\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                results.sheetNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴁\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                results.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴂\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                results.suggestion = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴃\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                results.pornInfo = (ImageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.class, ProtectedSandApp.s("䳺\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴄\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                results.terrorismInfo = (ImageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.class, ProtectedSandApp.s("䳻\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴅\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                results.politicsInfo = (ImageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.class, ProtectedSandApp.s("䳼\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴆\u0001"), new ChildElementBinder<GetDocumentAuditJobResponse.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetDocumentAuditJobResponse$Results$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetDocumentAuditJobResponse.Results results, String str) throws IOException, XmlPullParserException {
                results.adsInfo = (ImageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.class, ProtectedSandApp.s("䳹\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetDocumentAuditJobResponse.Results fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetDocumentAuditJobResponse.Results results = new GetDocumentAuditJobResponse.Results();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetDocumentAuditJobResponse.Results> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, results, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䴇\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return results;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return results;
    }
}
