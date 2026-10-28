package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class WordsGeneralizeJobDetail$$XmlAdapter extends IXmlAdapter<WordsGeneralizeJobDetail> {
    private HashMap<String, ChildElementBinder<WordsGeneralizeJobDetail>> childElementBinders;

    public WordsGeneralizeJobDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<WordsGeneralizeJobDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㾊\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾋\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾌\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾍\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾎\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾏\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾐\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾑\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾒\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾓\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                wordsGeneralizeJobDetail.input = (WordsGeneralizeJobInput) QCloudXml.fromXml(xmlPullParser, WordsGeneralizeJobInput.class, ProtectedSandApp.s("㾈\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾔\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail wordsGeneralizeJobDetail, String str) throws IOException, XmlPullParserException {
                wordsGeneralizeJobDetail.operation = (WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation) QCloudXml.fromXml(xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation.class, ProtectedSandApp.s("㾉\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public WordsGeneralizeJobDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        WordsGeneralizeJobDetail wordsGeneralizeJobDetail = new WordsGeneralizeJobDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<WordsGeneralizeJobDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, wordsGeneralizeJobDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㾕\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return wordsGeneralizeJobDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return wordsGeneralizeJobDetail;
    }
}
