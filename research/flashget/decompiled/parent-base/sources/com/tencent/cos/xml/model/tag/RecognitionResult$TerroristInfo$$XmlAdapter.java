package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.RecognitionResult;
import com.tencent.cos.xml.model.tag.audit.bean.AuditLibResults;
import com.tencent.cos.xml.model.tag.audit.bean.AuditOcrResults;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class RecognitionResult$TerroristInfo$$XmlAdapter extends IXmlAdapter<RecognitionResult.TerroristInfo> {
    private HashMap<String, ChildElementBinder<RecognitionResult.TerroristInfo>> childElementBinders;

    public RecognitionResult$TerroristInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult.TerroristInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䮠\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                terroristInfo.code = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮡\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                terroristInfo.msg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮢\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                terroristInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮣\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                terroristInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮤\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                terroristInfo.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮥\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                terroristInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮦\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                terroristInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮧\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                if (terroristInfo.ocrResults == null) {
                    terroristInfo.ocrResults = new ArrayList();
                }
                terroristInfo.ocrResults.add((AuditOcrResults) QCloudXml.fromXml(xmlPullParser, AuditOcrResults.class, ProtectedSandApp.s("䮞\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮨\u0001"), new ChildElementBinder<RecognitionResult.TerroristInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$TerroristInfo$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.TerroristInfo terroristInfo, String str) throws IOException, XmlPullParserException {
                if (terroristInfo.libResults == null) {
                    terroristInfo.libResults = new ArrayList();
                }
                terroristInfo.libResults.add((AuditLibResults) QCloudXml.fromXml(xmlPullParser, AuditLibResults.class, ProtectedSandApp.s("䮟\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult.TerroristInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        RecognitionResult.TerroristInfo terroristInfo = new RecognitionResult.TerroristInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult.TerroristInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, terroristInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䮩\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return terroristInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return terroristInfo;
    }
}
