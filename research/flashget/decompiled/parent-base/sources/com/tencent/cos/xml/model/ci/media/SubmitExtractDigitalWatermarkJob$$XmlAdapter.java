package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitExtractDigitalWatermarkJob$$XmlAdapter extends IXmlAdapter<SubmitExtractDigitalWatermarkJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitExtractDigitalWatermarkJob submitExtractDigitalWatermarkJob, String str) throws IOException, XmlPullParserException {
        if (submitExtractDigitalWatermarkJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䐫\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitExtractDigitalWatermarkJob.tag != null) {
            String s4 = ProtectedSandApp.s("䐬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitExtractDigitalWatermarkJob.tag, xmlSerializer, "", s4);
        }
        SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobInput submitExtractDigitalWatermarkJobInput = submitExtractDigitalWatermarkJob.input;
        if (submitExtractDigitalWatermarkJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitExtractDigitalWatermarkJobInput, ProtectedSandApp.s("䐭\u0001"));
        }
        SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobOperation submitExtractDigitalWatermarkJobOperation = submitExtractDigitalWatermarkJob.operation;
        if (submitExtractDigitalWatermarkJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitExtractDigitalWatermarkJobOperation, ProtectedSandApp.s("䐮\u0001"));
        }
        if (submitExtractDigitalWatermarkJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䐯\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitExtractDigitalWatermarkJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitExtractDigitalWatermarkJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䐰\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitExtractDigitalWatermarkJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitExtractDigitalWatermarkJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䐱\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitExtractDigitalWatermarkJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitExtractDigitalWatermarkJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䐲\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
