package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.RecognitionResult;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class RecognitionResult$$XmlAdapter extends IXmlAdapter<RecognitionResult> {
    private HashMap<String, ChildElementBinder<RecognitionResult>> childElementBinders;

    public RecognitionResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䭜\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.dataId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭝\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭞\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭟\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭠\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭡\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                recognitionResult.result = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭢\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭣\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭤\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭥\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                recognitionResult.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭦\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionResult.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭧\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                recognitionResult.compressionResult = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭨\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                recognitionResult.pornInfo = (RecognitionResult.PornInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.PornInfo.class, ProtectedSandApp.s("䭗\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭩\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                recognitionResult.politicsInfo = (RecognitionResult.PoliticsInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.PoliticsInfo.class, ProtectedSandApp.s("䭘\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭪\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                recognitionResult.terroristInfo = (RecognitionResult.TerroristInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.TerroristInfo.class, ProtectedSandApp.s("䭙\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭫\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                recognitionResult.adsInfo = (RecognitionResult.AdsInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.AdsInfo.class, ProtectedSandApp.s("䭚\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭬\u0001"), new ChildElementBinder<RecognitionResult>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult recognitionResult, String str) throws IOException, XmlPullParserException {
                recognitionResult.qualityInfo = (RecognitionResult.QualityInfo) QCloudXml.fromXml(xmlPullParser, RecognitionResult.QualityInfo.class, ProtectedSandApp.s("䭛\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        RecognitionResult recognitionResult = new RecognitionResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, recognitionResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䭭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return recognitionResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return recognitionResult;
    }
}
