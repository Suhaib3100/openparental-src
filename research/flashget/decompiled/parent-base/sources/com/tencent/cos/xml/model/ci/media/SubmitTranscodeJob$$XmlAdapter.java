package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitTranscodeJob$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitTranscodeJob submitTranscodeJob, String str) throws IOException, XmlPullParserException {
        if (submitTranscodeJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䕹\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitTranscodeJob.tag != null) {
            String s4 = ProtectedSandApp.s("䕺\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitTranscodeJob.tag, xmlSerializer, "", s4);
        }
        SubmitTranscodeJob.SubmitTranscodeJobInput submitTranscodeJobInput = submitTranscodeJob.input;
        if (submitTranscodeJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitTranscodeJobInput, ProtectedSandApp.s("䕻\u0001"));
        }
        SubmitTranscodeJob.SubmitTranscodeJobOperation submitTranscodeJobOperation = submitTranscodeJob.operation;
        if (submitTranscodeJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitTranscodeJobOperation, ProtectedSandApp.s("䕼\u0001"));
        }
        if (submitTranscodeJob.queueType != null) {
            String s5 = ProtectedSandApp.s("䕽\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitTranscodeJob.queueType, xmlSerializer, "", s5);
        }
        if (submitTranscodeJob.callBackFormat != null) {
            String s6 = ProtectedSandApp.s("䕾\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitTranscodeJob.callBackFormat, xmlSerializer, "", s6);
        }
        if (submitTranscodeJob.callBackType != null) {
            String s7 = ProtectedSandApp.s("䕿\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitTranscodeJob.callBackType, xmlSerializer, "", s7);
        }
        if (submitTranscodeJob.callBack != null) {
            String s10 = ProtectedSandApp.s("䖀\u0001");
            xmlSerializer.startTag("", s10);
            a.a(submitTranscodeJob.callBack, xmlSerializer, "", s10);
        }
        CallBackMqConfig callBackMqConfig = submitTranscodeJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䖁\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
