package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TextAuditScenarioInfo$$XmlAdapter extends IXmlAdapter<TextAuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<TextAuditScenarioInfo>> childElementBinders;

    public TextAuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TextAuditScenarioInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䱽\u0001"), new ChildElementBinder<TextAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo textAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                textAuditScenarioInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱾\u0001"), new ChildElementBinder<TextAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo textAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                textAuditScenarioInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱿\u0001"), new ChildElementBinder<TextAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo textAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditScenarioInfo.keywords = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲀\u0001"), new ChildElementBinder<TextAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo textAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditScenarioInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲁\u0001"), new ChildElementBinder<TextAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo textAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditScenarioInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲂\u0001"), new ChildElementBinder<TextAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo textAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (textAuditScenarioInfo.libResults == null) {
                    textAuditScenarioInfo.libResults = new ArrayList();
                }
                textAuditScenarioInfo.libResults.add((TextAuditScenarioInfo.LibResults) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.LibResults.class, ProtectedSandApp.s("䱺\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲃\u0001"), new ChildElementBinder<TextAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo textAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (textAuditScenarioInfo.speakerResults == null) {
                    textAuditScenarioInfo.speakerResults = new ArrayList();
                }
                textAuditScenarioInfo.speakerResults.add((TextAuditScenarioInfo.Results) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.Results.class, ProtectedSandApp.s("䱻\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲄\u0001"), new ChildElementBinder<TextAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.TextAuditScenarioInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditScenarioInfo textAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (textAuditScenarioInfo.recognitionResults == null) {
                    textAuditScenarioInfo.recognitionResults = new ArrayList();
                }
                textAuditScenarioInfo.recognitionResults.add((TextAuditScenarioInfo.Results) QCloudXml.fromXml(xmlPullParser, TextAuditScenarioInfo.Results.class, ProtectedSandApp.s("䱼\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TextAuditScenarioInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TextAuditScenarioInfo textAuditScenarioInfo = new TextAuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TextAuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, textAuditScenarioInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䲅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return textAuditScenarioInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return textAuditScenarioInfo;
    }
}
