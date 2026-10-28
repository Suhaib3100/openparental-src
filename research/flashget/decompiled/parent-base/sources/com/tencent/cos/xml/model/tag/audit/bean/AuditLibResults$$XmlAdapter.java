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
public class AuditLibResults$$XmlAdapter extends IXmlAdapter<AuditLibResults> {
    private HashMap<String, ChildElementBinder<AuditLibResults>> childElementBinders;

    public AuditLibResults$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditLibResults>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䰄\u0001"), new ChildElementBinder<AuditLibResults>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditLibResults$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditLibResults auditLibResults, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                auditLibResults.imageId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰅\u0001"), new ChildElementBinder<AuditLibResults>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditLibResults$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditLibResults auditLibResults, String str) throws IOException, XmlPullParserException {
                auditLibResults.score = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditLibResults fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AuditLibResults auditLibResults = new AuditLibResults();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditLibResults> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, auditLibResults, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䰆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return auditLibResults;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return auditLibResults;
    }
}
