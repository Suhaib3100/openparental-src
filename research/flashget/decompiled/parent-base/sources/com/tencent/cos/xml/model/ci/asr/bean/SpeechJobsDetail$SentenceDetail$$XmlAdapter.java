package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
public class SpeechJobsDetail$SentenceDetail$$XmlAdapter extends IXmlAdapter<SpeechJobsDetail.SentenceDetail> {
    private HashMap<String, ChildElementBinder<SpeechJobsDetail.SentenceDetail>> childElementBinders;

    public SpeechJobsDetail$SentenceDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechJobsDetail.SentenceDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䀓\u0001"), new ChildElementBinder<SpeechJobsDetail.SentenceDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SentenceDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SentenceDetail sentenceDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                sentenceDetail.startMs = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀔\u0001"), new ChildElementBinder<SpeechJobsDetail.SentenceDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SentenceDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SentenceDetail sentenceDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                sentenceDetail.endMs = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀕\u0001"), new ChildElementBinder<SpeechJobsDetail.SentenceDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SentenceDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SentenceDetail sentenceDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                sentenceDetail.finalSentence = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀖\u0001"), new ChildElementBinder<SpeechJobsDetail.SentenceDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SentenceDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SentenceDetail sentenceDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                sentenceDetail.sliceSentence = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀗\u0001"), new ChildElementBinder<SpeechJobsDetail.SentenceDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SentenceDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SentenceDetail sentenceDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                sentenceDetail.speakerId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀘\u0001"), new ChildElementBinder<SpeechJobsDetail.SentenceDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SentenceDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SentenceDetail sentenceDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                sentenceDetail.speechSpeed = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀙\u0001"), new ChildElementBinder<SpeechJobsDetail.SentenceDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SentenceDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SentenceDetail sentenceDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                sentenceDetail.wordsNum = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀚\u0001"), new ChildElementBinder<SpeechJobsDetail.SentenceDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SentenceDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SentenceDetail sentenceDetail, String str) throws IOException, XmlPullParserException {
                if (sentenceDetail.words == null) {
                    sentenceDetail.words = new ArrayList();
                }
                sentenceDetail.words.add((SpeechJobsDetail.SentenceWords) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.SentenceWords.class, ProtectedSandApp.s("䀒\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechJobsDetail.SentenceDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechJobsDetail.SentenceDetail sentenceDetail = new SpeechJobsDetail.SentenceDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechJobsDetail.SentenceDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, sentenceDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䀛\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return sentenceDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return sentenceDetail;
    }
}
