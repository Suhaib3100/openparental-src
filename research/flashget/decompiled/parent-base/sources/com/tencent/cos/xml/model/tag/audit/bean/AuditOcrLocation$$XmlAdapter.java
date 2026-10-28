package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AuditOcrLocation$$XmlAdapter extends IXmlAdapter<AuditOcrLocation> {
    private HashMap<String, ChildElementBinder<AuditOcrLocation>> childElementBinders;

    public AuditOcrLocation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditOcrLocation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䰎\u0001"), new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditOcrLocation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation, String str) throws IOException, XmlPullParserException {
                auditOcrLocation.f71735x = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰏\u0001"), new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditOcrLocation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation, String str) throws IOException, XmlPullParserException {
                auditOcrLocation.f71736y = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰐\u0001"), new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditOcrLocation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation, String str) throws IOException, XmlPullParserException {
                auditOcrLocation.height = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰑\u0001"), new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditOcrLocation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation, String str) throws IOException, XmlPullParserException {
                auditOcrLocation.width = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰒\u0001"), new ChildElementBinder<AuditOcrLocation>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditOcrLocation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditOcrLocation auditOcrLocation, String str) throws IOException, XmlPullParserException {
                auditOcrLocation.rotate = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditOcrLocation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AuditOcrLocation auditOcrLocation = new AuditOcrLocation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditOcrLocation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditOcrLocation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䰓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return auditOcrLocation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return auditOcrLocation;
    }
}
