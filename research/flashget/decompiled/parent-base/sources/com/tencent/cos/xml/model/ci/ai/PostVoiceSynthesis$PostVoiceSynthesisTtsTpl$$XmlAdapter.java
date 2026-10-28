package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVoiceSynthesis$PostVoiceSynthesisTtsTpl$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl> {
    private HashMap<String, ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl>> childElementBinders;

    public PostVoiceSynthesis$PostVoiceSynthesisTtsTpl$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㹑\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisTtsTpl$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTtsTpl.mode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹒\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisTtsTpl$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTtsTpl.codec = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹓\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisTtsTpl$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTtsTpl.voiceType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹔\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisTtsTpl$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTtsTpl.volume = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹕\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisTtsTpl$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTtsTpl.speed = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹖\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisTtsTpl$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTtsTpl.emotion = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVoiceSynthesis.PostVoiceSynthesisTtsTpl fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl = new PostVoiceSynthesis.PostVoiceSynthesisTtsTpl();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsTpl> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVoiceSynthesisTtsTpl, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㹗\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVoiceSynthesisTtsTpl;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVoiceSynthesisTtsTpl;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl, String str) throws IOException, XmlPullParserException {
        if (postVoiceSynthesisTtsTpl == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㹗\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVoiceSynthesisTtsTpl.mode != null) {
            String s4 = ProtectedSandApp.s("㹑\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVoiceSynthesisTtsTpl.mode, xmlSerializer, "", s4);
        }
        if (postVoiceSynthesisTtsTpl.codec != null) {
            String s5 = ProtectedSandApp.s("㹒\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVoiceSynthesisTtsTpl.codec, xmlSerializer, "", s5);
        }
        if (postVoiceSynthesisTtsTpl.voiceType != null) {
            String s6 = ProtectedSandApp.s("㹓\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postVoiceSynthesisTtsTpl.voiceType, xmlSerializer, "", s6);
        }
        if (postVoiceSynthesisTtsTpl.volume != null) {
            String s7 = ProtectedSandApp.s("㹔\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postVoiceSynthesisTtsTpl.volume, xmlSerializer, "", s7);
        }
        if (postVoiceSynthesisTtsTpl.speed != null) {
            String s10 = ProtectedSandApp.s("㹕\u0001");
            xmlSerializer.startTag("", s10);
            a.a(postVoiceSynthesisTtsTpl.speed, xmlSerializer, "", s10);
        }
        if (postVoiceSynthesisTtsTpl.emotion != null) {
            String s11 = ProtectedSandApp.s("㹖\u0001");
            xmlSerializer.startTag("", s11);
            a.a(postVoiceSynthesisTtsTpl.emotion, xmlSerializer, "", s11);
        }
        xmlSerializer.endTag("", str);
    }
}
