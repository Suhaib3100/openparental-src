package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVideoTagJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVideoTagJob$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVideoTagJob submitVideoTagJob, String str) throws IOException, XmlPullParserException {
        if (submitVideoTagJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䘦\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitVideoTagJob.tag != null) {
            String s4 = ProtectedSandApp.s("䘧\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVideoTagJob.tag, xmlSerializer, "", s4);
        }
        SubmitVideoTagJob.SubmitVideoTagJobInput submitVideoTagJobInput = submitVideoTagJob.input;
        if (submitVideoTagJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitVideoTagJobInput, ProtectedSandApp.s("䘨\u0001"));
        }
        SubmitVideoTagJob.SubmitVideoTagJobOperation submitVideoTagJobOperation = submitVideoTagJob.operation;
        if (submitVideoTagJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitVideoTagJobOperation, ProtectedSandApp.s("䘩\u0001"));
        }
        if (submitVideoTagJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䘪\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVideoTagJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitVideoTagJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䘫\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitVideoTagJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitVideoTagJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䘬\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitVideoTagJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitVideoTagJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䘭\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
