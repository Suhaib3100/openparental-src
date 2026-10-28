package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAuditTextlibListResponse$Strategies$$XmlAdapter extends IXmlAdapter<GetAuditTextlibListResponse.Strategies> {
    private HashMap<String, ChildElementBinder<GetAuditTextlibListResponse.Strategies>> childElementBinders;

    public GetAuditTextlibListResponse$Strategies$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAuditTextlibListResponse.Strategies>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䃕\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Strategies>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Strategies$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Strategies strategies, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                strategies.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䃖\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Strategies>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Strategies$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Strategies strategies, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                strategies.service = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䃗\u0001"), new ChildElementBinder<GetAuditTextlibListResponse.Strategies>() { // from class: com.tencent.cos.xml.model.ci.audit.GetAuditTextlibListResponse$Strategies$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAuditTextlibListResponse.Strategies strategies, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                strategies.bizType = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAuditTextlibListResponse.Strategies fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAuditTextlibListResponse.Strategies strategies = new GetAuditTextlibListResponse.Strategies();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAuditTextlibListResponse.Strategies> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, strategies, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䃘\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return strategies;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return strategies;
    }
}
