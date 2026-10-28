package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TextAuditJobResponse$Section$$XmlAdapter extends IXmlAdapter<TextAuditJobResponse.Section> {
    private HashMap<String, ChildElementBinder<TextAuditJobResponse.Section>> childElementBinders;

    public TextAuditJobResponse$Section$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TextAuditJobResponse.Section>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䶛\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.startByte = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶜\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                section.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶝\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.result = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶞\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.illegalInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䶕\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶟\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.abuseInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䶖\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶠\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.pornInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䶗\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶡\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.terrorismInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䶘\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶢\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.politicsInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䶙\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶣\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.adsInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䶚\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶤\u0001"), new ChildElementBinder<TextAuditJobResponse.Section>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$Section$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse.Section section, String str) throws IOException, XmlPullParserException {
                section.teenagerInfo = (TextAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.class, ProtectedSandApp.s("䶔\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TextAuditJobResponse.Section fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TextAuditJobResponse.Section section = new TextAuditJobResponse.Section();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TextAuditJobResponse.Section> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, section, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䶥\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return section;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return section;
    }
}
