package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AuditJobsDetail$$XmlAdapter extends IXmlAdapter<AuditJobsDetail> {
    private HashMap<String, ChildElementBinder<AuditJobsDetail>> childElementBinders;

    public AuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䯶\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯷\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯸\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯹\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯺\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯻\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯼\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                auditJobsDetail.userInfo = (AuditUserInfo) QCloudXml.fromXml(xmlPullParser, AuditUserInfo.class, ProtectedSandApp.s("䯴\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯽\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                auditJobsDetail.listInfo = (AuditListInfo) QCloudXml.fromXml(xmlPullParser, AuditListInfo.class, ProtectedSandApp.s("䯵\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯾\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                auditJobsDetail.forbidState = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯿\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰀\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰁\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰂\u0001"), new ChildElementBinder<AuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditJobsDetail$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditJobsDetail auditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditJobsDetail.dataId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AuditJobsDetail auditJobsDetail = new AuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䰃\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return auditJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return auditJobsDetail;
    }
}
