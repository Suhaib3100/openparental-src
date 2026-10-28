package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReduction;
import com.tencent.cos.xml.model.ci.common.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostNoiseReduction$$XmlAdapter extends IXmlAdapter<PostNoiseReduction> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostNoiseReduction postNoiseReduction, String str) throws IOException, XmlPullParserException {
        if (postNoiseReduction == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㳔\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postNoiseReduction.tag != null) {
            String s4 = ProtectedSandApp.s("㳕\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postNoiseReduction.tag, xmlSerializer, "", s4);
        }
        PostNoiseReduction.PostNoiseReductionInput postNoiseReductionInput = postNoiseReduction.input;
        if (postNoiseReductionInput != null) {
            QCloudXml.toXml(xmlSerializer, postNoiseReductionInput, ProtectedSandApp.s("㳖\u0001"));
        }
        PostNoiseReduction.PostNoiseReductionOperation postNoiseReductionOperation = postNoiseReduction.operation;
        if (postNoiseReductionOperation != null) {
            QCloudXml.toXml(xmlSerializer, postNoiseReductionOperation, ProtectedSandApp.s("㳗\u0001"));
        }
        if (postNoiseReduction.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("㳘\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postNoiseReduction.callBackFormat, xmlSerializer, "", s5);
        }
        if (postNoiseReduction.callBackType != null) {
            String s6 = ProtectedSandApp.s("㳙\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postNoiseReduction.callBackType, xmlSerializer, "", s6);
        }
        if (postNoiseReduction.callBack != null) {
            String s7 = ProtectedSandApp.s("㳚\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postNoiseReduction.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = postNoiseReduction.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("㳛\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
