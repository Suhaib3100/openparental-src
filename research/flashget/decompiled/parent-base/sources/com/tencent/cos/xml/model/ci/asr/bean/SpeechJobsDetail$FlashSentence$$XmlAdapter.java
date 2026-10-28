package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
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
public class SpeechJobsDetail$FlashSentence$$XmlAdapter extends IXmlAdapter<SpeechJobsDetail.FlashSentence> {
    private HashMap<String, ChildElementBinder<SpeechJobsDetail.FlashSentence>> childElementBinders;

    public SpeechJobsDetail$FlashSentence$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechJobsDetail.FlashSentence>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䀈\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashSentence>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashSentence$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashSentence flashSentence, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                flashSentence.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀉\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashSentence>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashSentence$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashSentence flashSentence, String str) throws IOException, XmlPullParserException {
                flashSentence.startTime = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀊\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashSentence>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashSentence$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashSentence flashSentence, String str) throws IOException, XmlPullParserException {
                flashSentence.endTime = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀋\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashSentence>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashSentence$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashSentence flashSentence, String str) throws IOException, XmlPullParserException {
                flashSentence.speakerId = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀌\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashSentence>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashSentence$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashSentence flashSentence, String str) throws IOException, XmlPullParserException {
                if (flashSentence.wordList == null) {
                    flashSentence.wordList = new ArrayList();
                }
                flashSentence.wordList.add((SpeechJobsDetail.FlashSentenceWord) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.FlashSentenceWord.class, ProtectedSandApp.s("䀇\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechJobsDetail.FlashSentence fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechJobsDetail.FlashSentence flashSentence = new SpeechJobsDetail.FlashSentence();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechJobsDetail.FlashSentence> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, flashSentence, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䀍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return flashSentence;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return flashSentence;
    }
}
