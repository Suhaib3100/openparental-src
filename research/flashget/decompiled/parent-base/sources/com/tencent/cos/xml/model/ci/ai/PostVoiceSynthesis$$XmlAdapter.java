package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis;
import com.tencent.cos.xml.model.ci.common.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVoiceSynthesis$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesis> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVoiceSynthesis postVoiceSynthesis, String str) throws IOException, XmlPullParserException {
        if (postVoiceSynthesis == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㸼\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVoiceSynthesis.tag != null) {
            String s4 = ProtectedSandApp.s("㸽\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVoiceSynthesis.tag, xmlSerializer, "", s4);
        }
        PostVoiceSynthesis.PostVoiceSynthesisOperation postVoiceSynthesisOperation = postVoiceSynthesis.operation;
        if (postVoiceSynthesisOperation != null) {
            QCloudXml.toXml(xmlSerializer, postVoiceSynthesisOperation, ProtectedSandApp.s("㸾\u0001"));
        }
        if (postVoiceSynthesis.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("㸿\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVoiceSynthesis.callBackFormat, xmlSerializer, "", s5);
        }
        if (postVoiceSynthesis.callBackType != null) {
            String s6 = ProtectedSandApp.s("㹀\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postVoiceSynthesis.callBackType, xmlSerializer, "", s6);
        }
        if (postVoiceSynthesis.callBack != null) {
            String s7 = ProtectedSandApp.s("㹁\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postVoiceSynthesis.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = postVoiceSynthesis.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("㹂\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
