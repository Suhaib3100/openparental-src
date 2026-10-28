package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AuditListInfo$ListResults$$XmlAdapter extends IXmlAdapter<AuditListInfo.ListResults> {
    private HashMap<String, ChildElementBinder<AuditListInfo.ListResults>> childElementBinders;

    public AuditListInfo$ListResults$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AuditListInfo.ListResults>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䰊\u0001"), new ChildElementBinder<AuditListInfo.ListResults>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo$ListResults$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditListInfo.ListResults listResults, String str) throws IOException, XmlPullParserException {
                listResults.listType = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰋\u0001"), new ChildElementBinder<AuditListInfo.ListResults>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo$ListResults$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditListInfo.ListResults listResults, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                listResults.listName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰌\u0001"), new ChildElementBinder<AuditListInfo.ListResults>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo$ListResults$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AuditListInfo.ListResults listResults, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                listResults.entity = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AuditListInfo.ListResults fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AuditListInfo.ListResults listResults = new AuditListInfo.ListResults();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AuditListInfo.ListResults> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, listResults, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䰍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return listResults;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return listResults;
    }
}
