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
public class RecognitionResult$AdsInfo$$XmlAdapter extends IXmlAdapter<RecognitionResult.AdsInfo> {
    private HashMap<String, ChildElementBinder<RecognitionResult.AdsInfo>> childElementBinders;

    public RecognitionResult$AdsInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult.AdsInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䭰\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                adsInfo.code = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭱\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                adsInfo.msg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭲\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                adsInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭳\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                adsInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭴\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                adsInfo.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭵\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                adsInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭶\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                adsInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭷\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                if (adsInfo.ocrResults == null) {
                    adsInfo.ocrResults = new ArrayList();
                }
                adsInfo.ocrResults.add((AuditOcrResults) QCloudXml.fromXml(xmlPullParser, AuditOcrResults.class, ProtectedSandApp.s("䭮\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭸\u0001"), new ChildElementBinder<RecognitionResult.AdsInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$AdsInfo$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.AdsInfo adsInfo, String str) throws IOException, XmlPullParserException {
                if (adsInfo.libResults == null) {
                    adsInfo.libResults = new ArrayList();
                }
                adsInfo.libResults.add((AuditLibResults) QCloudXml.fromXml(xmlPullParser, AuditLibResults.class, ProtectedSandApp.s("䭯\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult.AdsInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        RecognitionResult.AdsInfo adsInfo = new RecognitionResult.AdsInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult.AdsInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, adsInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䭹\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return adsInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return adsInfo;
    }
}
