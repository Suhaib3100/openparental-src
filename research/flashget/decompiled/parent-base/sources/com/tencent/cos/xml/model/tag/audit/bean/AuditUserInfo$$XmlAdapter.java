package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AuditUserInfo$$XmlAdapter extends IXmlAdapter<AuditUserInfo> {
    private HashMap<String, ChildElementBinder<AuditUserInfo>> childElementBinders;

    public AuditUserInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditUserInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䰩\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.tokenId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰪\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.nickname = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰫\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.deviceId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰬\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.appId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰭\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.room = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰮\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.iP = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰯\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰰\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.receiveTokenId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰱\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.gender = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰲\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.level = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰳\u0001"), new ChildElementBinder<AuditUserInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditUserInfo.role = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditUserInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AuditUserInfo auditUserInfo = new AuditUserInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditUserInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditUserInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䰴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return auditUserInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return auditUserInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AuditUserInfo auditUserInfo, String str) throws IOException, XmlPullParserException {
        if (auditUserInfo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䰴\u0001");
        }
        xmlSerializer.startTag("", str);
        if (auditUserInfo.tokenId != null) {
            String s4 = ProtectedSandApp.s("䰩\u0001");
            xmlSerializer.startTag("", s4);
            a.a(auditUserInfo.tokenId, xmlSerializer, "", s4);
        }
        if (auditUserInfo.nickname != null) {
            String s5 = ProtectedSandApp.s("䰪\u0001");
            xmlSerializer.startTag("", s5);
            a.a(auditUserInfo.nickname, xmlSerializer, "", s5);
        }
        if (auditUserInfo.deviceId != null) {
            String s6 = ProtectedSandApp.s("䰫\u0001");
            xmlSerializer.startTag("", s6);
            a.a(auditUserInfo.deviceId, xmlSerializer, "", s6);
        }
        if (auditUserInfo.appId != null) {
            String s7 = ProtectedSandApp.s("䰬\u0001");
            xmlSerializer.startTag("", s7);
            a.a(auditUserInfo.appId, xmlSerializer, "", s7);
        }
        if (auditUserInfo.room != null) {
            String s10 = ProtectedSandApp.s("䰭\u0001");
            xmlSerializer.startTag("", s10);
            a.a(auditUserInfo.room, xmlSerializer, "", s10);
        }
        if (auditUserInfo.iP != null) {
            String s11 = ProtectedSandApp.s("䰮\u0001");
            xmlSerializer.startTag("", s11);
            a.a(auditUserInfo.iP, xmlSerializer, "", s11);
        }
        if (auditUserInfo.type != null) {
            String s12 = ProtectedSandApp.s("䰯\u0001");
            xmlSerializer.startTag("", s12);
            a.a(auditUserInfo.type, xmlSerializer, "", s12);
        }
        if (auditUserInfo.receiveTokenId != null) {
            String s13 = ProtectedSandApp.s("䰰\u0001");
            xmlSerializer.startTag("", s13);
            a.a(auditUserInfo.receiveTokenId, xmlSerializer, "", s13);
        }
        if (auditUserInfo.gender != null) {
            String s14 = ProtectedSandApp.s("䰱\u0001");
            xmlSerializer.startTag("", s14);
            a.a(auditUserInfo.gender, xmlSerializer, "", s14);
        }
        if (auditUserInfo.level != null) {
            String s15 = ProtectedSandApp.s("䰲\u0001");
            xmlSerializer.startTag("", s15);
            a.a(auditUserInfo.level, xmlSerializer, "", s15);
        }
        if (auditUserInfo.role != null) {
            String s16 = ProtectedSandApp.s("䰳\u0001");
            xmlSerializer.startTag("", s16);
            a.a(auditUserInfo.role, xmlSerializer, "", s16);
        }
        xmlSerializer.endTag("", str);
    }
}
