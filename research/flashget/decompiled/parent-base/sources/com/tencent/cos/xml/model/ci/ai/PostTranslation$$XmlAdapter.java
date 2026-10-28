package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostTranslation;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostTranslation$$XmlAdapter extends IXmlAdapter<PostTranslation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTranslation postTranslation, String str) throws IOException, XmlPullParserException {
        if (postTranslation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㶗\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postTranslation.tag != null) {
            String s4 = ProtectedSandApp.s("㶘\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postTranslation.tag, xmlSerializer, "", s4);
        }
        PostTranslation.PostTranslationInput postTranslationInput = postTranslation.input;
        if (postTranslationInput != null) {
            QCloudXml.toXml(xmlSerializer, postTranslationInput, ProtectedSandApp.s("㶙\u0001"));
        }
        PostTranslation.PostTranslationOperation postTranslationOperation = postTranslation.operation;
        if (postTranslationOperation != null) {
            QCloudXml.toXml(xmlSerializer, postTranslationOperation, ProtectedSandApp.s("㶚\u0001"));
        }
        if (postTranslation.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("㶛\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postTranslation.callBackFormat, xmlSerializer, "", s5);
        }
        if (postTranslation.callBackType != null) {
            String s6 = ProtectedSandApp.s("㶜\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postTranslation.callBackType, xmlSerializer, "", s6);
        }
        if (postTranslation.callBack != null) {
            String s7 = ProtectedSandApp.s("㶝\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postTranslation.callBack, xmlSerializer, "", s7);
        }
        PostTranslation.CallBackMqConfig callBackMqConfig = postTranslation.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("㶞\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
