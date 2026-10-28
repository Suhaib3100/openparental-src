package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateVoiceSynthesisTemplete$$XmlAdapter extends IXmlAdapter<UpdateVoiceSynthesisTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateVoiceSynthesisTemplete updateVoiceSynthesisTemplete, String str) throws IOException, XmlPullParserException {
        if (updateVoiceSynthesisTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㼘\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateVoiceSynthesisTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㼙\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateVoiceSynthesisTemplete.tag, xmlSerializer, "", s4);
        }
        if (updateVoiceSynthesisTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㼚\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateVoiceSynthesisTemplete.name, xmlSerializer, "", s5);
        }
        if (updateVoiceSynthesisTemplete.mode != null) {
            String s6 = ProtectedSandApp.s("㼛\u0001");
            xmlSerializer.startTag("", s6);
            a.a(updateVoiceSynthesisTemplete.mode, xmlSerializer, "", s6);
        }
        if (updateVoiceSynthesisTemplete.codec != null) {
            String s7 = ProtectedSandApp.s("㼜\u0001");
            xmlSerializer.startTag("", s7);
            a.a(updateVoiceSynthesisTemplete.codec, xmlSerializer, "", s7);
        }
        if (updateVoiceSynthesisTemplete.voiceType != null) {
            String s10 = ProtectedSandApp.s("㼝\u0001");
            xmlSerializer.startTag("", s10);
            a.a(updateVoiceSynthesisTemplete.voiceType, xmlSerializer, "", s10);
        }
        if (updateVoiceSynthesisTemplete.volume != null) {
            String s11 = ProtectedSandApp.s("㼞\u0001");
            xmlSerializer.startTag("", s11);
            a.a(updateVoiceSynthesisTemplete.volume, xmlSerializer, "", s11);
        }
        if (updateVoiceSynthesisTemplete.speed != null) {
            String s12 = ProtectedSandApp.s("㼟\u0001");
            xmlSerializer.startTag("", s12);
            a.a(updateVoiceSynthesisTemplete.speed, xmlSerializer, "", s12);
        }
        if (updateVoiceSynthesisTemplete.emotion != null) {
            String s13 = ProtectedSandApp.s("㼠\u0001");
            xmlSerializer.startTag("", s13);
            a.a(updateVoiceSynthesisTemplete.emotion, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
