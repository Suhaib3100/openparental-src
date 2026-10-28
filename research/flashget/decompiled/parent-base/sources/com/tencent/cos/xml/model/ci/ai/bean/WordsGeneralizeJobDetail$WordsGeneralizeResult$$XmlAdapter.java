package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class WordsGeneralizeJobDetail$WordsGeneralizeResult$$XmlAdapter extends IXmlAdapter<WordsGeneralizeJobDetail.WordsGeneralizeResult> {
    private HashMap<String, ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeResult>> childElementBinders;

    public WordsGeneralizeJobDetail$WordsGeneralizeResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㾢\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeResult>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$WordsGeneralizeResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeResult wordsGeneralizeResult, String str) throws IOException, XmlPullParserException {
                if (wordsGeneralizeResult.wordsGeneralizeLable == null) {
                    wordsGeneralizeResult.wordsGeneralizeLable = new ArrayList();
                }
                wordsGeneralizeResult.wordsGeneralizeLable.add((WordsGeneralizeJobDetail.WordsGeneralizeLable) QCloudXml.fromXml(xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeLable.class, ProtectedSandApp.s("㾠\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾣\u0001"), new ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeResult>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobDetail$WordsGeneralizeResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeResult wordsGeneralizeResult, String str) throws IOException, XmlPullParserException {
                if (wordsGeneralizeResult.wordsGeneralizeToken == null) {
                    wordsGeneralizeResult.wordsGeneralizeToken = new ArrayList();
                }
                wordsGeneralizeResult.wordsGeneralizeToken.add((WordsGeneralizeJobDetail.WordsGeneralizeToken) QCloudXml.fromXml(xmlPullParser, WordsGeneralizeJobDetail.WordsGeneralizeToken.class, ProtectedSandApp.s("㾡\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public WordsGeneralizeJobDetail.WordsGeneralizeResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        WordsGeneralizeJobDetail.WordsGeneralizeResult wordsGeneralizeResult = new WordsGeneralizeJobDetail.WordsGeneralizeResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<WordsGeneralizeJobDetail.WordsGeneralizeResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, wordsGeneralizeResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㾤\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return wordsGeneralizeResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return wordsGeneralizeResult;
    }
}
