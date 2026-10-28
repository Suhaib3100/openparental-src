package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSoundHound;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostSoundHound$PostSoundHoundOperation$$XmlAdapter extends IXmlAdapter<PostSoundHound.PostSoundHoundOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSoundHound.PostSoundHoundOperation postSoundHoundOperation, String str) throws IOException, XmlPullParserException {
        if (postSoundHoundOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㵣\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postSoundHoundOperation.userData != null) {
            String s4 = ProtectedSandApp.s("㵤\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSoundHoundOperation.userData, xmlSerializer, "", s4);
        }
        if (postSoundHoundOperation.jobLevel != null) {
            String s5 = ProtectedSandApp.s("㵥\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postSoundHoundOperation.jobLevel, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
