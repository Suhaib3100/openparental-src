package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.AudioConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateVoiceSeparateTemplete$$XmlAdapter extends IXmlAdapter<UpdateVoiceSeparateTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateVoiceSeparateTemplete updateVoiceSeparateTemplete, String str) throws IOException, XmlPullParserException {
        if (updateVoiceSeparateTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㼉\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateVoiceSeparateTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㼊\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateVoiceSeparateTemplete.tag, xmlSerializer, "", s4);
        }
        if (updateVoiceSeparateTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㼋\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateVoiceSeparateTemplete.name, xmlSerializer, "", s5);
        }
        if (updateVoiceSeparateTemplete.audioMode != null) {
            String s6 = ProtectedSandApp.s("㼌\u0001");
            xmlSerializer.startTag("", s6);
            a.a(updateVoiceSeparateTemplete.audioMode, xmlSerializer, "", s6);
        }
        AudioConfig audioConfig = updateVoiceSeparateTemplete.audioConfig;
        if (audioConfig != null) {
            QCloudXml.toXml(xmlSerializer, audioConfig, ProtectedSandApp.s("㼍\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
