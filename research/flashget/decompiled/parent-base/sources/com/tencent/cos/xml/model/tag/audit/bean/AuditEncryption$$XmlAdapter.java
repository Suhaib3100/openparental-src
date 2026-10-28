package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AuditEncryption$$XmlAdapter extends IXmlAdapter<AuditEncryption> {
    private HashMap<String, ChildElementBinder<AuditEncryption>> childElementBinders;

    public AuditEncryption$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditEncryption>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䯨\u0001"), new ChildElementBinder<AuditEncryption>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditEncryption$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditEncryption auditEncryption, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditEncryption.algorithm = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯩\u0001"), new ChildElementBinder<AuditEncryption>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditEncryption$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditEncryption auditEncryption, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditEncryption.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯪\u0001"), new ChildElementBinder<AuditEncryption>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditEncryption$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditEncryption auditEncryption, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditEncryption.iV = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯫\u0001"), new ChildElementBinder<AuditEncryption>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditEncryption$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditEncryption auditEncryption, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditEncryption.keyId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䯬\u0001"), new ChildElementBinder<AuditEncryption>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditEncryption$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditEncryption auditEncryption, String str) throws IOException, XmlPullParserException {
                auditEncryption.keyType = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditEncryption fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AuditEncryption auditEncryption = new AuditEncryption();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditEncryption> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditEncryption, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䯭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return auditEncryption;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return auditEncryption;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditEncryption auditEncryption, String str) throws IOException, XmlPullParserException {
        if (auditEncryption == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䯭\u0001");
        }
        xmlSerializer.startTag("", str);
        if (auditEncryption.algorithm != null) {
            String s4 = ProtectedSandApp.s("䯨\u0001");
            xmlSerializer.startTag("", s4);
            com.tencent.cos.xml.model.ci.ai.a.a(auditEncryption.algorithm, xmlSerializer, "", s4);
        }
        if (auditEncryption.key != null) {
            String s5 = ProtectedSandApp.s("䯩\u0001");
            xmlSerializer.startTag("", s5);
            com.tencent.cos.xml.model.ci.ai.a.a(auditEncryption.key, xmlSerializer, "", s5);
        }
        if (auditEncryption.iV != null) {
            String s6 = ProtectedSandApp.s("䯪\u0001");
            xmlSerializer.startTag("", s6);
            com.tencent.cos.xml.model.ci.ai.a.a(auditEncryption.iV, xmlSerializer, "", s6);
        }
        if (auditEncryption.keyId != null) {
            String s7 = ProtectedSandApp.s("䯫\u0001");
            xmlSerializer.startTag("", s7);
            com.tencent.cos.xml.model.ci.ai.a.a(auditEncryption.keyId, xmlSerializer, "", s7);
        }
        String s10 = ProtectedSandApp.s("䯬\u0001");
        xmlSerializer.startTag("", s10);
        c.a(auditEncryption.keyType, xmlSerializer, "", s10);
        xmlSerializer.endTag("", str);
    }
}
