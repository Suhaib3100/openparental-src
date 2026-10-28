package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class WordsGeneralizeJobDetail$WordsGeneralizeJobDetailOperation$$XmlAdapter extends IXmlAdapter<WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation> {
    private HashMap<String, ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation>> childElementBinders;

    public WordsGeneralizeJobDetail$WordsGeneralizeJobDetailOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㾘\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$WordsGeneralizeJobDetailOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation wordsGeneralizeJobDetailOperation, String str) throws IOException, XmlPullParserException {
                wordsGeneralizeJobDetailOperation.wordsGeneralizeResult = (WordsGeneralizeJobDetail.WordsGeneralizeResult) QCloudXml.fromXml(xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeResult.class, ProtectedSandApp.s("㾖\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾙\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$WordsGeneralizeJobDetailOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation wordsGeneralizeJobDetailOperation, String str) throws IOException, XmlPullParserException {
                wordsGeneralizeJobDetailOperation.wordsGeneralize = (WordsGeneralize) QCloudXml.fromXml(xmlPullParser, WordsGeneralize.class, ProtectedSandApp.s("㾗\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾚\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$WordsGeneralizeJobDetailOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation wordsGeneralizeJobDetailOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobDetailOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾛\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$WordsGeneralizeJobDetailOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation wordsGeneralizeJobDetailOperation, String str) throws IOException, XmlPullParserException {
                wordsGeneralizeJobDetailOperation.jobLevel = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation wordsGeneralizeJobDetailOperation = new WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeJobDetailOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, wordsGeneralizeJobDetailOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㾜\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return wordsGeneralizeJobDetailOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return wordsGeneralizeJobDetailOperation;
    }
}
