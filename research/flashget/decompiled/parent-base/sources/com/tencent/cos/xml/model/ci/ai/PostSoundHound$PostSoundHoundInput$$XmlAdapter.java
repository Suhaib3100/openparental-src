package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSoundHound;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostSoundHound$PostSoundHoundInput$$XmlAdapter extends IXmlAdapter<PostSoundHound.PostSoundHoundInput> {
    private HashMap<String, ChildElementBinder<PostSoundHound.PostSoundHoundInput>> childElementBinders;

    public PostSoundHound$PostSoundHoundInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSoundHound.PostSoundHoundInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㵡\u0001"), new ChildElementBinder<PostSoundHound.PostSoundHoundInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSoundHound$PostSoundHoundInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSoundHound.PostSoundHoundInput postSoundHoundInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSoundHoundInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSoundHound.PostSoundHoundInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSoundHound.PostSoundHoundInput postSoundHoundInput = new PostSoundHound.PostSoundHoundInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSoundHound.PostSoundHoundInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSoundHoundInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㵢\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSoundHoundInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSoundHoundInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSoundHound.PostSoundHoundInput postSoundHoundInput, String str) throws IOException, XmlPullParserException {
        if (postSoundHoundInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㵢\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postSoundHoundInput.object != null) {
            String s4 = ProtectedSandApp.s("㵡\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSoundHoundInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
