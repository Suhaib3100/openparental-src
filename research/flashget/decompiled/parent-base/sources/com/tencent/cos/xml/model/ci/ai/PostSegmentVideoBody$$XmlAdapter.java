package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody;
import com.tencent.cos.xml.model.ci.common.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostSegmentVideoBody$$XmlAdapter extends IXmlAdapter<PostSegmentVideoBody> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSegmentVideoBody postSegmentVideoBody, String str) throws IOException, XmlPullParserException {
        if (postSegmentVideoBody == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㴙\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postSegmentVideoBody.tag != null) {
            String s4 = ProtectedSandApp.s("㴚\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSegmentVideoBody.tag, xmlSerializer, "", s4);
        }
        PostSegmentVideoBody.PostSegmentVideoBodyInput postSegmentVideoBodyInput = postSegmentVideoBody.input;
        if (postSegmentVideoBodyInput != null) {
            QCloudXml.toXml(xmlSerializer, postSegmentVideoBodyInput, ProtectedSandApp.s("㴛\u0001"));
        }
        PostSegmentVideoBody.PostSegmentVideoBodyOperation postSegmentVideoBodyOperation = postSegmentVideoBody.operation;
        if (postSegmentVideoBodyOperation != null) {
            QCloudXml.toXml(xmlSerializer, postSegmentVideoBodyOperation, ProtectedSandApp.s("㴜\u0001"));
        }
        if (postSegmentVideoBody.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("㴝\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postSegmentVideoBody.callBackFormat, xmlSerializer, "", s5);
        }
        if (postSegmentVideoBody.callBackType != null) {
            String s6 = ProtectedSandApp.s("㴞\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postSegmentVideoBody.callBackType, xmlSerializer, "", s6);
        }
        if (postSegmentVideoBody.callBack != null) {
            String s7 = ProtectedSandApp.s("㴟\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postSegmentVideoBody.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = postSegmentVideoBody.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("㴠\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
