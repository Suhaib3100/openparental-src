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
public class WordsGeneralize$$XmlAdapter extends IXmlAdapter<WordsGeneralize> {
    private HashMap<String, ChildElementBinder<WordsGeneralize>> childElementBinders;

    public WordsGeneralize$$XmlAdapter() {
        HashMap<String, ChildElementBinder<WordsGeneralize>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㾅\u0001"), new ChildElementBinder<WordsGeneralize>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralize$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralize wordsGeneralize, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralize.nerMethod = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㾆\u0001"), new ChildElementBinder<WordsGeneralize>() { // from class: com.tencent.cos.xml.model.ci.ai.bean.WordsGeneralize$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, WordsGeneralize wordsGeneralize, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                wordsGeneralize.segMethod = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public WordsGeneralize fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        WordsGeneralize wordsGeneralize = new WordsGeneralize();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<WordsGeneralize> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, wordsGeneralize, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㾇\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return wordsGeneralize;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return wordsGeneralize;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, WordsGeneralize wordsGeneralize, String str) throws IOException, XmlPullParserException {
        if (wordsGeneralize == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㾇\u0001");
        }
        xmlSerializer.startTag("", str);
        if (wordsGeneralize.nerMethod != null) {
            String s4 = ProtectedSandApp.s("㾅\u0001");
            xmlSerializer.startTag("", s4);
            a.a(wordsGeneralize.nerMethod, xmlSerializer, "", s4);
        }
        if (wordsGeneralize.segMethod != null) {
            String s5 = ProtectedSandApp.s("㾆\u0001");
            xmlSerializer.startTag("", s5);
            a.a(wordsGeneralize.segMethod, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
