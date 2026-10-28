package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail;
import com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SpeechJobsDetail$SpeechRecognitionResult$$XmlAdapter extends IXmlAdapter<SpeechJobsDetail.SpeechRecognitionResult> {
    private HashMap<String, ChildElementBinder<SpeechJobsDetail.SpeechRecognitionResult>> childElementBinders;

    public SpeechJobsDetail$SpeechRecognitionResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechJobsDetail.SpeechRecognitionResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䀲\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechRecognitionResult>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechRecognitionResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechRecognitionResult speechRecognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionResult.audioTime = Double.parseDouble(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀳\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechRecognitionResult>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechRecognitionResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechRecognitionResult speechRecognitionResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechRecognitionResult.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀴\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechRecognitionResult>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechRecognitionResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechRecognitionResult speechRecognitionResult, String str) throws IOException, XmlPullParserException {
                if (speechRecognitionResult.flashResult == null) {
                    speechRecognitionResult.flashResult = new ArrayList();
                }
                speechRecognitionResult.flashResult.add((SpeechJobsDetail.FlashResult) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.FlashResult.class, ProtectedSandApp.s("䀯\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀵\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechRecognitionResult>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechRecognitionResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechRecognitionResult speechRecognitionResult, String str) throws IOException, XmlPullParserException {
                if (speechRecognitionResult.resultDetail == null) {
                    speechRecognitionResult.resultDetail = new ArrayList();
                }
                speechRecognitionResult.resultDetail.add((SpeechJobsDetail.SentenceDetail) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.SentenceDetail.class, ProtectedSandApp.s("䀰\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀶\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechRecognitionResult>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechRecognitionResult$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechRecognitionResult speechRecognitionResult, String str) throws IOException, XmlPullParserException {
                speechRecognitionResult.wordsGeneralizeResult = (WordsGeneralizeJobDetail.WordsGeneralizeResult) QCloudXml.fromXml(xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeResult.class, ProtectedSandApp.s("䀱\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechJobsDetail.SpeechRecognitionResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechJobsDetail.SpeechRecognitionResult speechRecognitionResult = new SpeechJobsDetail.SpeechRecognitionResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechJobsDetail.SpeechRecognitionResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, speechRecognitionResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䀷\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return speechRecognitionResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return speechRecognitionResult;
    }
}
