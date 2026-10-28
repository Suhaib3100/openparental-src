package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVoiceSynthesisTemplete$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesisTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVoiceSynthesisTemplete postVoiceSynthesisTemplete, String str) throws IOException, XmlPullParserException {
        if (postVoiceSynthesisTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㹼\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVoiceSynthesisTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㹽\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVoiceSynthesisTemplete.tag, xmlSerializer, "", s4);
        }
        if (postVoiceSynthesisTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㹾\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVoiceSynthesisTemplete.name, xmlSerializer, "", s5);
        }
        if (postVoiceSynthesisTemplete.mode != null) {
            String s6 = ProtectedSandApp.s("㹿\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postVoiceSynthesisTemplete.mode, xmlSerializer, "", s6);
        }
        if (postVoiceSynthesisTemplete.codec != null) {
            String s7 = ProtectedSandApp.s("㺀\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postVoiceSynthesisTemplete.codec, xmlSerializer, "", s7);
        }
        if (postVoiceSynthesisTemplete.voiceType != null) {
            String s10 = ProtectedSandApp.s("㺁\u0001");
            xmlSerializer.startTag("", s10);
            a.a(postVoiceSynthesisTemplete.voiceType, xmlSerializer, "", s10);
        }
        if (postVoiceSynthesisTemplete.volume != null) {
            String s11 = ProtectedSandApp.s("㺂\u0001");
            xmlSerializer.startTag("", s11);
            a.a(postVoiceSynthesisTemplete.volume, xmlSerializer, "", s11);
        }
        if (postVoiceSynthesisTemplete.speed != null) {
            String s12 = ProtectedSandApp.s("㺃\u0001");
            xmlSerializer.startTag("", s12);
            a.a(postVoiceSynthesisTemplete.speed, xmlSerializer, "", s12);
        }
        if (postVoiceSynthesisTemplete.emotion != null) {
            String s13 = ProtectedSandApp.s("㺄\u0001");
            xmlSerializer.startTag("", s13);
            a.a(postVoiceSynthesisTemplete.emotion, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
