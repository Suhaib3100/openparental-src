package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitDigitalWatermarkJob$$XmlAdapter extends IXmlAdapter<SubmitDigitalWatermarkJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitDigitalWatermarkJob submitDigitalWatermarkJob, String str) throws IOException, XmlPullParserException {
        if (submitDigitalWatermarkJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䏳\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitDigitalWatermarkJob.tag != null) {
            String s4 = ProtectedSandApp.s("䏴\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitDigitalWatermarkJob.tag, xmlSerializer, "", s4);
        }
        SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobInput submitDigitalWatermarkJobInput = submitDigitalWatermarkJob.input;
        if (submitDigitalWatermarkJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitDigitalWatermarkJobInput, ProtectedSandApp.s("䏵\u0001"));
        }
        SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOperation submitDigitalWatermarkJobOperation = submitDigitalWatermarkJob.operation;
        if (submitDigitalWatermarkJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitDigitalWatermarkJobOperation, ProtectedSandApp.s("䏶\u0001"));
        }
        if (submitDigitalWatermarkJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䏷\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitDigitalWatermarkJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitDigitalWatermarkJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䏸\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitDigitalWatermarkJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitDigitalWatermarkJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䏹\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitDigitalWatermarkJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitDigitalWatermarkJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䏺\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
