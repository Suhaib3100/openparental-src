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
public class PostVoiceSynthesis$PostVoiceSynthesisOutput$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesis.PostVoiceSynthesisOutput> {
    private HashMap<String, ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisOutput>> childElementBinders;

    public PostVoiceSynthesis$PostVoiceSynthesisOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㹊\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisOutput postVoiceSynthesisOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹋\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisOutput postVoiceSynthesisOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹌\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisOutput postVoiceSynthesisOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVoiceSynthesis.PostVoiceSynthesisOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVoiceSynthesis.PostVoiceSynthesisOutput postVoiceSynthesisOutput = new PostVoiceSynthesis.PostVoiceSynthesisOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVoiceSynthesisOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㹍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVoiceSynthesisOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVoiceSynthesisOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVoiceSynthesis.PostVoiceSynthesisOutput postVoiceSynthesisOutput, String str) throws IOException, XmlPullParserException {
        if (postVoiceSynthesisOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㹍\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVoiceSynthesisOutput.region != null) {
            String s4 = ProtectedSandApp.s("㹊\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVoiceSynthesisOutput.region, xmlSerializer, "", s4);
        }
        if (postVoiceSynthesisOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("㹋\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVoiceSynthesisOutput.bucket, xmlSerializer, "", s5);
        }
        if (postVoiceSynthesisOutput.object != null) {
            String s6 = ProtectedSandApp.s("㹌\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postVoiceSynthesisOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
