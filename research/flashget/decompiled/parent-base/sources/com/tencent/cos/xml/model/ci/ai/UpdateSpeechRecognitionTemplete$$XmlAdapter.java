package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.SpeechRecognition;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateSpeechRecognitionTemplete$$XmlAdapter extends IXmlAdapter<UpdateSpeechRecognitionTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateSpeechRecognitionTemplete updateSpeechRecognitionTemplete, String str) throws IOException, XmlPullParserException {
        if (updateSpeechRecognitionTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㻭\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateSpeechRecognitionTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㻮\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateSpeechRecognitionTemplete.tag, xmlSerializer, "", s4);
        }
        if (updateSpeechRecognitionTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㻯\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateSpeechRecognitionTemplete.name, xmlSerializer, "", s5);
        }
        SpeechRecognition speechRecognition = updateSpeechRecognitionTemplete.speechRecognition;
        if (speechRecognition != null) {
            QCloudXml.toXml(xmlSerializer, speechRecognition, ProtectedSandApp.s("㻰\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
