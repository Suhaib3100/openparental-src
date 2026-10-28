package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSoundHound;
import com.tencent.cos.xml.model.ci.common.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostSoundHound$$XmlAdapter extends IXmlAdapter<PostSoundHound> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSoundHound postSoundHound, String str) throws IOException, XmlPullParserException {
        if (postSoundHound == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㵙\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postSoundHound.tag != null) {
            String s4 = ProtectedSandApp.s("㵚\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSoundHound.tag, xmlSerializer, "", s4);
        }
        PostSoundHound.PostSoundHoundInput postSoundHoundInput = postSoundHound.input;
        if (postSoundHoundInput != null) {
            QCloudXml.toXml(xmlSerializer, postSoundHoundInput, ProtectedSandApp.s("㵛\u0001"));
        }
        PostSoundHound.PostSoundHoundOperation postSoundHoundOperation = postSoundHound.operation;
        if (postSoundHoundOperation != null) {
            QCloudXml.toXml(xmlSerializer, postSoundHoundOperation, ProtectedSandApp.s("㵜\u0001"));
        }
        if (postSoundHound.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("㵝\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postSoundHound.callBackFormat, xmlSerializer, "", s5);
        }
        if (postSoundHound.callBackType != null) {
            String s6 = ProtectedSandApp.s("㵞\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postSoundHound.callBackType, xmlSerializer, "", s6);
        }
        if (postSoundHound.callBack != null) {
            String s7 = ProtectedSandApp.s("㵟\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postSoundHound.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = postSoundHound.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("㵠\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
