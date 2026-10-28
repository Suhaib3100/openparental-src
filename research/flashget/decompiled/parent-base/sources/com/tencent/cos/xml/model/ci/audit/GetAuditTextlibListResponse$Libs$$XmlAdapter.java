package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAuditTextlibListResponse$Libs$$XmlAdapter extends IXmlAdapter<GetAuditTextlibListResponse.Libs> {
    private HashMap<String, ChildElementBinder<GetAuditTextlibListResponse.Libs>> childElementBinders;

    public GetAuditTextlibListResponse$Libs$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditTextlibListResponse.Libs>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䃎\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Libs>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Libs$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Libs libs, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                libs.libID = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䃏\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Libs>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Libs$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Libs libs, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                libs.libName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䃐\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Libs>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Libs$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Libs libs, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                libs.suggestion = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䃑\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Libs>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Libs$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Libs libs, String str) throws IOException, XmlPullParserException {
                if (libs.strategies == null) {
                    libs.strategies = new ArrayList();
                }
                libs.strategies.add((GetAuditTextlibListResponse.Strategies) QCloudXml.fromXml(xmlPullParser, GetAuditTextlibListResponse.Strategies.class, ProtectedSandApp.s("䃍\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䃒\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Libs>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Libs$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Libs libs, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                libs.matchType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䃓\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Libs>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Libs$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Libs libs, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                libs.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditTextlibListResponse.Libs fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAuditTextlibListResponse.Libs libs = new GetAuditTextlibListResponse.Libs();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditTextlibListResponse.Libs> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, libs, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䃔\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return libs;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return libs;
    }
}
