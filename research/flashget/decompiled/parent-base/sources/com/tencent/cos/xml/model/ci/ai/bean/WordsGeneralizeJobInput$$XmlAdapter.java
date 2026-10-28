package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class WordsGeneralizeJobInput$$XmlAdapter extends IXmlAdapter<WordsGeneralizeJobInput> {
    private HashMap<String, ChildElementBinder<WordsGeneralizeJobInput>> childElementBinders;

    public WordsGeneralizeJobInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<WordsGeneralizeJobInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㾪\u0001"), new ChildElementBinder<WordsGeneralizeJobInput>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobInput wordsGeneralizeJobInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾫\u0001"), new ChildElementBinder<WordsGeneralizeJobInput>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobInput wordsGeneralizeJobInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobInput.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾬\u0001"), new ChildElementBinder<WordsGeneralizeJobInput>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralizeJobInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralizeJobInput wordsGeneralizeJobInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralizeJobInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public WordsGeneralizeJobInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        WordsGeneralizeJobInput wordsGeneralizeJobInput = new WordsGeneralizeJobInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<WordsGeneralizeJobInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, wordsGeneralizeJobInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㾭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return wordsGeneralizeJobInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return wordsGeneralizeJobInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, WordsGeneralizeJobInput wordsGeneralizeJobInput, String str) throws IOException, XmlPullParserException {
        if (wordsGeneralizeJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㾭\u0001");
        }
        xmlSerializer.startTag("", str);
        if (wordsGeneralizeJobInput.region != null) {
            String s4 = ProtectedSandApp.s("㾪\u0001");
            xmlSerializer.startTag("", s4);
            a.a(wordsGeneralizeJobInput.region, xmlSerializer, "", s4);
        }
        if (wordsGeneralizeJobInput.bucketId != null) {
            String s5 = ProtectedSandApp.s("㾫\u0001");
            xmlSerializer.startTag("", s5);
            a.a(wordsGeneralizeJobInput.bucketId, xmlSerializer, "", s5);
        }
        if (wordsGeneralizeJobInput.object != null) {
            String s6 = ProtectedSandApp.s("㾬\u0001");
            xmlSerializer.startTag("", s6);
            a.a(wordsGeneralizeJobInput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
