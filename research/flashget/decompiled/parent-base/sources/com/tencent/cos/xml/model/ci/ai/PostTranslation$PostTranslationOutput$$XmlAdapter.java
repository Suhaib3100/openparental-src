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
public class PostTranslation$PostTranslationOutput$$XmlAdapter extends IXmlAdapter<PostTranslation.PostTranslationOutput> {
    private HashMap<String, ChildElementBinder<PostTranslation.PostTranslationOutput>> childElementBinders;

    public PostTranslation$PostTranslationOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostTranslation.PostTranslationOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㶮\u0001"), new ChildElementBinder<PostTranslation.PostTranslationOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationOutput postTranslationOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㶯\u0001"), new ChildElementBinder<PostTranslation.PostTranslationOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationOutput postTranslationOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㶰\u0001"), new ChildElementBinder<PostTranslation.PostTranslationOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostTranslation$PostTranslationOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostTranslation.PostTranslationOutput postTranslationOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postTranslationOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostTranslation.PostTranslationOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostTranslation.PostTranslationOutput postTranslationOutput = new PostTranslation.PostTranslationOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostTranslation.PostTranslationOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postTranslationOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㶱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postTranslationOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postTranslationOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTranslation.PostTranslationOutput postTranslationOutput, String str) throws IOException, XmlPullParserException {
        if (postTranslationOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㶱\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postTranslationOutput.region != null) {
            String s4 = ProtectedSandApp.s("㶮\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postTranslationOutput.region, xmlSerializer, "", s4);
        }
        if (postTranslationOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("㶯\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postTranslationOutput.bucket, xmlSerializer, "", s5);
        }
        if (postTranslationOutput.object != null) {
            String s6 = ProtectedSandApp.s("㶰\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postTranslationOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
