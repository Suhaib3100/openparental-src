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
public class SpeechJobsDetail$FlashResult$$XmlAdapter extends IXmlAdapter<SpeechJobsDetail.FlashResult> {
    private HashMap<String, ChildElementBinder<SpeechJobsDetail.FlashResult>> childElementBinders;

    public SpeechJobsDetail$FlashResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechJobsDetail.FlashResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䀃\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashResult>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashResult flashResult, String str) throws IOException, XmlPullParserException {
                flashResult.channelId = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀄\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashResult>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashResult flashResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                flashResult.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀅\u0001"), new ChildElementBinder<SpeechJobsDetail.FlashResult>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$FlashResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.FlashResult flashResult, String str) throws IOException, XmlPullParserException {
                if (flashResult.sentenceList == null) {
                    flashResult.sentenceList = new ArrayList();
                }
                flashResult.sentenceList.add((SpeechJobsDetail.FlashSentence) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.FlashSentence.class, ProtectedSandApp.s("䀂\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechJobsDetail.FlashResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechJobsDetail.FlashResult flashResult = new SpeechJobsDetail.FlashResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechJobsDetail.FlashResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, flashResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䀆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return flashResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return flashResult;
    }
}
