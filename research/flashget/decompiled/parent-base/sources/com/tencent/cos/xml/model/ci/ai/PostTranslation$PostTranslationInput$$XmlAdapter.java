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
public class PostTranslation$PostTranslationInput$$XmlAdapter extends IXmlAdapter<PostTranslation.PostTranslationInput> {
    private HashMap<String, ChildElementBinder<PostTranslation.PostTranslationInput>> childElementBinders;

    public PostTranslation$PostTranslationInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostTranslation.PostTranslationInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㶣\u0001"), new ChildElementBinder<PostTranslation.PostTranslationInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationInput postTranslationInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationInput.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㶤\u0001"), new ChildElementBinder<PostTranslation.PostTranslationInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationInput postTranslationInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationInput.lang = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㶥\u0001"), new ChildElementBinder<PostTranslation.PostTranslationInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationInput postTranslationInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationInput.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㶦\u0001"), new ChildElementBinder<PostTranslation.PostTranslationInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationInput$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationInput postTranslationInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationInput.basicType = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostTranslation.PostTranslationInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostTranslation.PostTranslationInput postTranslationInput = new PostTranslation.PostTranslationInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostTranslation.PostTranslationInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postTranslationInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㶧\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postTranslationInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postTranslationInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTranslation.PostTranslationInput postTranslationInput, String str) throws IOException, XmlPullParserException {
        if (postTranslationInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㶧\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postTranslationInput.object != null) {
            String s4 = ProtectedSandApp.s("㶣\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postTranslationInput.object, xmlSerializer, "", s4);
        }
        if (postTranslationInput.lang != null) {
            String s5 = ProtectedSandApp.s("㶤\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postTranslationInput.lang, xmlSerializer, "", s5);
        }
        if (postTranslationInput.type != null) {
            String s6 = ProtectedSandApp.s("㶥\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postTranslationInput.type, xmlSerializer, "", s6);
        }
        if (postTranslationInput.basicType != null) {
            String s7 = ProtectedSandApp.s("㶦\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postTranslationInput.basicType, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
