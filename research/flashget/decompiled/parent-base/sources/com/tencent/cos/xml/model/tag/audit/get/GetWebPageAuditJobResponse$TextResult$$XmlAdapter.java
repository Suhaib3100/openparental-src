package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWebPageAuditJobResponse$TextResult$$XmlAdapter extends IXmlAdapter<GetWebPageAuditJobResponse.TextResult> {
    private HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse.TextResult>> childElementBinders;

    public GetWebPageAuditJobResponse$TextResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse.TextResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䵨\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.TextResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$TextResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.TextResult textResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textResult.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵩\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.TextResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$TextResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.TextResult textResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textResult.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵪\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.TextResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$TextResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.TextResult textResult, String str) throws IOException, XmlPullParserException {
                textResult.suggestion = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵫\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.TextResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$TextResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.TextResult textResult, String str) throws IOException, XmlPullParserException {
                textResult.pornInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䵤\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵬\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.TextResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$TextResult$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.TextResult textResult, String str) throws IOException, XmlPullParserException {
                textResult.terrorismInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䵥\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵭\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.TextResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$TextResult$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.TextResult textResult, String str) throws IOException, XmlPullParserException {
                textResult.politicsInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䵦\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵮\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.TextResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$TextResult$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.TextResult textResult, String str) throws IOException, XmlPullParserException {
                textResult.adsInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䵧\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWebPageAuditJobResponse.TextResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWebPageAuditJobResponse.TextResult textResult = new GetWebPageAuditJobResponse.TextResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWebPageAuditJobResponse.TextResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, textResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䵯\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return textResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return textResult;
    }
}
