package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.asr.bean.CreateSpeechJobs;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateSpeechJobs$$XmlAdapter extends IXmlAdapter<CreateSpeechJobs> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateSpeechJobs createSpeechJobs, String str) throws IOException, XmlPullParserException {
        if (createSpeechJobs == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㿏\u0001");
        }
        xmlSerializer.startTag("", str);
        if (createSpeechJobs.tag != null) {
            String s4 = ProtectedSandApp.s("㿐\u0001");
            xmlSerializer.startTag("", s4);
            a.a(createSpeechJobs.tag, xmlSerializer, "", s4);
        }
        CreateSpeechJobs.CreateSpeechJobsInput createSpeechJobsInput = createSpeechJobs.input;
        if (createSpeechJobsInput != null) {
            QCloudXml.toXml(xmlSerializer, createSpeechJobsInput, ProtectedSandApp.s("㿑\u0001"));
        }
        CreateSpeechJobs.CreateSpeechJobsOperation createSpeechJobsOperation = createSpeechJobs.operation;
        if (createSpeechJobsOperation != null) {
            QCloudXml.toXml(xmlSerializer, createSpeechJobsOperation, ProtectedSandApp.s("㿒\u0001"));
        }
        if (createSpeechJobs.queueId != null) {
            String s5 = ProtectedSandApp.s("㿓\u0001");
            xmlSerializer.startTag("", s5);
            a.a(createSpeechJobs.queueId, xmlSerializer, "", s5);
        }
        if (createSpeechJobs.callBack != null) {
            String s6 = ProtectedSandApp.s("㿔\u0001");
            xmlSerializer.startTag("", s6);
            a.a(createSpeechJobs.callBack, xmlSerializer, "", s6);
        }
        if (createSpeechJobs.callBackFormat != null) {
            String s7 = ProtectedSandApp.s("㿕\u0001");
            xmlSerializer.startTag("", s7);
            a.a(createSpeechJobs.callBackFormat, xmlSerializer, "", s7);
        }
        if (createSpeechJobs.callBackType != null) {
            String s10 = ProtectedSandApp.s("㿖\u0001");
            xmlSerializer.startTag("", s10);
            a.a(createSpeechJobs.callBackType, xmlSerializer, "", s10);
        }
        CallBackMqConfig callBackMqConfig = createSpeechJobs.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("㿗\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
