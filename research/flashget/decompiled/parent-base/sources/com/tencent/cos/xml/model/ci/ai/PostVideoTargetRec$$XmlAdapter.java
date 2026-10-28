package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetRec;
import com.tencent.cos.xml.model.ci.common.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVideoTargetRec$$XmlAdapter extends IXmlAdapter<PostVideoTargetRec> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoTargetRec postVideoTargetRec, String str) throws IOException, XmlPullParserException {
        if (postVideoTargetRec == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㷗\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVideoTargetRec.tag != null) {
            String s4 = ProtectedSandApp.s("㷘\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVideoTargetRec.tag, xmlSerializer, "", s4);
        }
        PostVideoTargetRec.PostVideoTargetRecOperation postVideoTargetRecOperation = postVideoTargetRec.operation;
        if (postVideoTargetRecOperation != null) {
            QCloudXml.toXml(xmlSerializer, postVideoTargetRecOperation, ProtectedSandApp.s("㷙\u0001"));
        }
        PostVideoTargetRec.PostVideoTargetRecInput postVideoTargetRecInput = postVideoTargetRec.input;
        if (postVideoTargetRecInput != null) {
            QCloudXml.toXml(xmlSerializer, postVideoTargetRecInput, ProtectedSandApp.s("㷚\u0001"));
        }
        if (postVideoTargetRec.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("㷛\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVideoTargetRec.callBackFormat, xmlSerializer, "", s5);
        }
        if (postVideoTargetRec.callBackType != null) {
            String s6 = ProtectedSandApp.s("㷜\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postVideoTargetRec.callBackType, xmlSerializer, "", s6);
        }
        if (postVideoTargetRec.callBack != null) {
            String s7 = ProtectedSandApp.s("㷝\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postVideoTargetRec.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = postVideoTargetRec.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("㷞\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
