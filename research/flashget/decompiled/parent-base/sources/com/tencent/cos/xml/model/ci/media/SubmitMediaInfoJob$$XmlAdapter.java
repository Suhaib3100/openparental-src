package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitMediaInfoJob$$XmlAdapter extends IXmlAdapter<SubmitMediaInfoJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaInfoJob submitMediaInfoJob, String str) throws IOException, XmlPullParserException {
        if (submitMediaInfoJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䑡\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitMediaInfoJob.tag != null) {
            String s4 = ProtectedSandApp.s("䑢\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaInfoJob.tag, xmlSerializer, "", s4);
        }
        SubmitMediaInfoJob.SubmitMediaInfoJobInput submitMediaInfoJobInput = submitMediaInfoJob.input;
        if (submitMediaInfoJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitMediaInfoJobInput, ProtectedSandApp.s("䑣\u0001"));
        }
        SubmitMediaInfoJob.SubmitMediaInfoJobOperation submitMediaInfoJobOperation = submitMediaInfoJob.operation;
        if (submitMediaInfoJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitMediaInfoJobOperation, ProtectedSandApp.s("䑤\u0001"));
        }
        if (submitMediaInfoJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䑥\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitMediaInfoJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitMediaInfoJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䑦\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitMediaInfoJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitMediaInfoJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䑧\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitMediaInfoJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitMediaInfoJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䑨\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
