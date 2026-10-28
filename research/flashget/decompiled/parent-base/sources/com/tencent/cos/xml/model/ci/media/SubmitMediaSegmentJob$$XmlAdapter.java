package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitMediaSegmentJob$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaSegmentJob submitMediaSegmentJob, String str) throws IOException, XmlPullParserException {
        if (submitMediaSegmentJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䒎\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitMediaSegmentJob.tag != null) {
            String s4 = ProtectedSandApp.s("䒏\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaSegmentJob.tag, xmlSerializer, "", s4);
        }
        SubmitMediaSegmentJob.SubmitMediaSegmentJobInput submitMediaSegmentJobInput = submitMediaSegmentJob.input;
        if (submitMediaSegmentJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitMediaSegmentJobInput, ProtectedSandApp.s("䒐\u0001"));
        }
        SubmitMediaSegmentJob.SubmitMediaSegmentJobOperation submitMediaSegmentJobOperation = submitMediaSegmentJob.operation;
        if (submitMediaSegmentJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitMediaSegmentJobOperation, ProtectedSandApp.s("䒑\u0001"));
        }
        if (submitMediaSegmentJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䒒\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitMediaSegmentJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitMediaSegmentJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䒓\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitMediaSegmentJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitMediaSegmentJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䒔\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitMediaSegmentJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitMediaSegmentJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䒕\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
