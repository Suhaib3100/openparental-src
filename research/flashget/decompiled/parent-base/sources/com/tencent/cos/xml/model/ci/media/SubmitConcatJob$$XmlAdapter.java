package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitConcatJob$$XmlAdapter extends IXmlAdapter<SubmitConcatJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitConcatJob submitConcatJob, String str) throws IOException, XmlPullParserException {
        if (submitConcatJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䎤\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitConcatJob.tag != null) {
            String s4 = ProtectedSandApp.s("䎥\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitConcatJob.tag, xmlSerializer, "", s4);
        }
        SubmitConcatJob.SubmitConcatJobInput submitConcatJobInput = submitConcatJob.input;
        if (submitConcatJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitConcatJobInput, ProtectedSandApp.s("䎦\u0001"));
        }
        SubmitConcatJob.SubmitConcatJobOperation submitConcatJobOperation = submitConcatJob.operation;
        if (submitConcatJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitConcatJobOperation, ProtectedSandApp.s("䎧\u0001"));
        }
        if (submitConcatJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䎨\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitConcatJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitConcatJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䎩\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitConcatJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitConcatJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䎪\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitConcatJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitConcatJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䎫\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
