package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SpeechJobsDetail$FlashSentenceWord$$XmlAdapter extends IXmlAdapter<SpeechJobsDetail.FlashSentenceWord> {
    private HashMap<String, ChildElementBinder<SpeechJobsDetail.FlashSentenceWord>> childElementBinders;

    public SpeechJobsDetail$FlashSentenceWord$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechJobsDetail.FlashSentenceWord>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䀎\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashSentenceWord>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashSentenceWord$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashSentenceWord flashSentenceWord, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                flashSentenceWord.word = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀏\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashSentenceWord>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashSentenceWord$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashSentenceWord flashSentenceWord, String str) throws IOException, XmlPullParserException {
                flashSentenceWord.startTime = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀐\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashSentenceWord>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashSentenceWord$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashSentenceWord flashSentenceWord, String str) throws IOException, XmlPullParserException {
                flashSentenceWord.endTime = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechJobsDetail.FlashSentenceWord fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechJobsDetail.FlashSentenceWord flashSentenceWord = new SpeechJobsDetail.FlashSentenceWord();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechJobsDetail.FlashSentenceWord> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, flashSentenceWord, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䀑\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return flashSentenceWord;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return flashSentenceWord;
    }
}
