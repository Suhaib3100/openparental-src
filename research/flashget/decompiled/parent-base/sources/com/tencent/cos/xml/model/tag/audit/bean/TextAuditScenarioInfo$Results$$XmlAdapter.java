package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TextAuditScenarioInfo$Results$$XmlAdapter extends IXmlAdapter<TextAuditScenarioInfo.Results> {
    private HashMap<String, ChildElementBinder<TextAuditScenarioInfo.Results>> childElementBinders;

    public TextAuditScenarioInfo$Results$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TextAuditScenarioInfo.Results>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䲋\u0001"), new ChildElementBinder<TextAuditScenarioInfo.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$Results$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo.Results results, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                results.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲌\u0001"), new ChildElementBinder<TextAuditScenarioInfo.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$Results$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo.Results results, String str) throws IOException, XmlPullParserException {
                results.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲍\u0001"), new ChildElementBinder<TextAuditScenarioInfo.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$Results$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo.Results results, String str) throws IOException, XmlPullParserException {
                results.startTime = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲎\u0001"), new ChildElementBinder<TextAuditScenarioInfo.Results>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$Results$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo.Results results, String str) throws IOException, XmlPullParserException {
                results.endTime = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TextAuditScenarioInfo.Results fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TextAuditScenarioInfo.Results results = new TextAuditScenarioInfo.Results();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TextAuditScenarioInfo.Results> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, results, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䲏\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return results;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return results;
    }
}
