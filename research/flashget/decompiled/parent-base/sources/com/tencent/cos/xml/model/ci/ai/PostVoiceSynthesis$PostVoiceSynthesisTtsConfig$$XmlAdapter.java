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
public class PostVoiceSynthesis$PostVoiceSynthesisTtsConfig$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesis.PostVoiceSynthesisTtsConfig> {
    private HashMap<String, ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsConfig>> childElementBinders;

    public PostVoiceSynthesis$PostVoiceSynthesisTtsConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㹎\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisTtsConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsConfig postVoiceSynthesisTtsConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTtsConfig.inputType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㹏\u0001"), new ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsConfig>() { // from class: com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis$PostVoiceSynthesisTtsConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostVoiceSynthesis.PostVoiceSynthesisTtsConfig postVoiceSynthesisTtsConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postVoiceSynthesisTtsConfig.input = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostVoiceSynthesis.PostVoiceSynthesisTtsConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostVoiceSynthesis.PostVoiceSynthesisTtsConfig postVoiceSynthesisTtsConfig = new PostVoiceSynthesis.PostVoiceSynthesisTtsConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostVoiceSynthesis.PostVoiceSynthesisTtsConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postVoiceSynthesisTtsConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㹐\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postVoiceSynthesisTtsConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postVoiceSynthesisTtsConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVoiceSynthesis.PostVoiceSynthesisTtsConfig postVoiceSynthesisTtsConfig, String str) throws IOException, XmlPullParserException {
        if (postVoiceSynthesisTtsConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㹐\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVoiceSynthesisTtsConfig.inputType != null) {
            String s4 = ProtectedSandApp.s("㹎\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVoiceSynthesisTtsConfig.inputType, xmlSerializer, "", s4);
        }
        if (postVoiceSynthesisTtsConfig.input != null) {
            String s5 = ProtectedSandApp.s("㹏\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVoiceSynthesisTtsConfig.input, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
