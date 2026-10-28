package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo;
import com.tencent.cos.xml.model.tag.audit.bean.AuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter extends IXmlAdapter<TextAuditJobResponse.TextAuditJobsDetail> {
    private HashMap<String, ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>> childElementBinders;

    public TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䶯\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.content = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶰\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.sectionCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶱\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.pornInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䶨\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶲\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.terrorismInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䶩\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶳\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.politicsInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䶪\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶴\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.adsInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䶫\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶵\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.illegalInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䶬\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶶\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.abuseInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䶭\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶷\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                if (textAuditJobsDetail.section == null) {
                    textAuditJobsDetail.section = new ArrayList();
                }
                textAuditJobsDetail.section.add((TextAuditJobResponse.Section) QCloudXml.fromXml(xmlPullParser, TextAuditJobResponse.Section.class, ProtectedSandApp.s("䶮\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶸\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶹\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶺\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶻\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶼\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶽\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶾\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.userInfo = (AuditUserInfo) QCloudXml.fromXml(xmlPullParser, AuditUserInfo.class, ProtectedSandApp.s("䶦\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶿\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.listInfo = (AuditListInfo) QCloudXml.fromXml(xmlPullParser, AuditListInfo.class, ProtectedSandApp.s("䶧\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䷀\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                textAuditJobsDetail.forbidState = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䷁\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䷂\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.20
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䷃\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.21
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䷄\u0001"), new ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$TextAuditJobsDetail$$XmlAdapter.22
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobsDetail.dataId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TextAuditJobResponse.TextAuditJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TextAuditJobResponse.TextAuditJobsDetail textAuditJobsDetail = new TextAuditJobResponse.TextAuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TextAuditJobResponse.TextAuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, textAuditJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䷅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return textAuditJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return textAuditJobsDetail;
    }
}
