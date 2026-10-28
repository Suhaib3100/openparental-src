package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVideoMontageJob$$XmlAdapter extends IXmlAdapter<SubmitVideoMontageJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVideoMontageJob submitVideoMontageJob, String str) throws IOException, XmlPullParserException {
        if (submitVideoMontageJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䗜\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitVideoMontageJob.tag != null) {
            String s4 = ProtectedSandApp.s("䗝\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVideoMontageJob.tag, xmlSerializer, "", s4);
        }
        SubmitVideoMontageJob.SubmitVideoMontageJobInput submitVideoMontageJobInput = submitVideoMontageJob.input;
        if (submitVideoMontageJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitVideoMontageJobInput, ProtectedSandApp.s("䗞\u0001"));
        }
        SubmitVideoMontageJob.SubmitVideoMontageJobOperation submitVideoMontageJobOperation = submitVideoMontageJob.operation;
        if (submitVideoMontageJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitVideoMontageJobOperation, ProtectedSandApp.s("䗟\u0001"));
        }
        if (submitVideoMontageJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䗠\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVideoMontageJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitVideoMontageJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䗡\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitVideoMontageJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitVideoMontageJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䗢\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitVideoMontageJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitVideoMontageJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䗣\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
