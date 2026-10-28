package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostTranslation;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostTranslation$PostTranslationTranslation$$XmlAdapter extends IXmlAdapter<PostTranslation.PostTranslationTranslation> {
    private HashMap<String, ChildElementBinder<PostTranslation.PostTranslationTranslation>> childElementBinders;

    public PostTranslation$PostTranslationTranslation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostTranslation.PostTranslationTranslation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㶲\u0001"), new ChildElementBinder<PostTranslation.PostTranslationTranslation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationTranslation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationTranslation postTranslationTranslation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationTranslation.lang = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㶳\u0001"), new ChildElementBinder<PostTranslation.PostTranslationTranslation>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationTranslation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationTranslation postTranslationTranslation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationTranslation.type = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostTranslation.PostTranslationTranslation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostTranslation.PostTranslationTranslation postTranslationTranslation = new PostTranslation.PostTranslationTranslation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostTranslation.PostTranslationTranslation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postTranslationTranslation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㶴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postTranslationTranslation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postTranslationTranslation;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTranslation.PostTranslationTranslation postTranslationTranslation, String str) throws IOException, XmlPullParserException {
        if (postTranslationTranslation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㶴\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postTranslationTranslation.lang != null) {
            String s4 = ProtectedSandApp.s("㶲\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postTranslationTranslation.lang, xmlSerializer, "", s4);
        }
        if (postTranslationTranslation.type != null) {
            String s5 = ProtectedSandApp.s("㶳\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postTranslationTranslation.type, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
