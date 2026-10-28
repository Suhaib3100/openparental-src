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
public class AuditScenarioInfo$$XmlAdapter extends IXmlAdapter<AuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<AuditScenarioInfo>> childElementBinders;

    public AuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditScenarioInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䰚\u0001"), new ChildElementBinder<AuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditScenarioInfo auditScenarioInfo, String str) throws IOException, XmlPullParserException {
                auditScenarioInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰛\u0001"), new ChildElementBinder<AuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditScenarioInfo auditScenarioInfo, String str) throws IOException, XmlPullParserException {
                auditScenarioInfo.count = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰜\u0001"), new ChildElementBinder<AuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditScenarioInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditScenarioInfo auditScenarioInfo, String str) throws IOException, XmlPullParserException {
                auditScenarioInfo.score = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditScenarioInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AuditScenarioInfo auditScenarioInfo = new AuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditScenarioInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䰝\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return auditScenarioInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return auditScenarioInfo;
    }
}
