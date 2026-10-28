package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.SpeechRecognition;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostSpeechRecognitionTemplete$$XmlAdapter extends IXmlAdapter<PostSpeechRecognitionTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSpeechRecognitionTemplete postSpeechRecognitionTemplete, String str) throws IOException, XmlPullParserException {
        if (postSpeechRecognitionTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㶉\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postSpeechRecognitionTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㶊\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSpeechRecognitionTemplete.tag, xmlSerializer, "", s4);
        }
        if (postSpeechRecognitionTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㶋\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postSpeechRecognitionTemplete.name, xmlSerializer, "", s5);
        }
        SpeechRecognition speechRecognition = postSpeechRecognitionTemplete.speechRecognition;
        if (speechRecognition != null) {
            QCloudXml.toXml(xmlSerializer, speechRecognition, ProtectedSandApp.s("㶌\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
