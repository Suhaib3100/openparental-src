package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJob$$XmlAdapter extends IXmlAdapter<SubmitVoiceSeparateJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVoiceSeparateJob submitVoiceSeparateJob, String str) throws IOException, XmlPullParserException {
        if (submitVoiceSeparateJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䚓\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitVoiceSeparateJob.tag != null) {
            String s4 = ProtectedSandApp.s("䚔\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVoiceSeparateJob.tag, xmlSerializer, "", s4);
        }
        SubmitVoiceSeparateJob.SubmitVoiceSeparateJobInput submitVoiceSeparateJobInput = submitVoiceSeparateJob.input;
        if (submitVoiceSeparateJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitVoiceSeparateJobInput, ProtectedSandApp.s("䚕\u0001"));
        }
        SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOperation submitVoiceSeparateJobOperation = submitVoiceSeparateJob.operation;
        if (submitVoiceSeparateJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitVoiceSeparateJobOperation, ProtectedSandApp.s("䚖\u0001"));
        }
        if (submitVoiceSeparateJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䚗\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVoiceSeparateJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitVoiceSeparateJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䚘\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitVoiceSeparateJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitVoiceSeparateJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䚙\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitVoiceSeparateJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitVoiceSeparateJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䚚\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
