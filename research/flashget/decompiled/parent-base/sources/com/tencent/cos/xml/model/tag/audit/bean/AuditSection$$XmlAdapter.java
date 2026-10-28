package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AuditSection$$XmlAdapter extends IXmlAdapter<AuditSection> {
    private HashMap<String, ChildElementBinder<AuditSection>> childElementBinders;

    public AuditSection$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditSection>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䰣\u0001"), new ChildElementBinder<AuditSection>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditSection$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditSection auditSection, String str) throws IOException, XmlPullParserException {
                auditSection.pornInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䰞\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰤\u0001"), new ChildElementBinder<AuditSection>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditSection$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditSection auditSection, String str) throws IOException, XmlPullParserException {
                auditSection.terrorismInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䰟\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰥\u0001"), new ChildElementBinder<AuditSection>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditSection$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditSection auditSection, String str) throws IOException, XmlPullParserException {
                auditSection.politicsInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䰠\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰦\u0001"), new ChildElementBinder<AuditSection>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditSection$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditSection auditSection, String str) throws IOException, XmlPullParserException {
                auditSection.adsInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䰡\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰧\u0001"), new ChildElementBinder<AuditSection>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditSection$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditSection auditSection, String str) throws IOException, XmlPullParserException {
                auditSection.teenagerInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䰢\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditSection fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AuditSection auditSection = new AuditSection();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditSection> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditSection, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䰨\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return auditSection;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return auditSection;
    }
}
