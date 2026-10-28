package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitPicProcessJob$$XmlAdapter extends IXmlAdapter<SubmitPicProcessJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitPicProcessJob submitPicProcessJob, String str) throws IOException, XmlPullParserException {
        if (submitPicProcessJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䓏\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitPicProcessJob.tag != null) {
            String s4 = ProtectedSandApp.s("䓐\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitPicProcessJob.tag, xmlSerializer, "", s4);
        }
        SubmitPicProcessJob.SubmitPicProcessJobInput submitPicProcessJobInput = submitPicProcessJob.input;
        if (submitPicProcessJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitPicProcessJobInput, ProtectedSandApp.s("䓑\u0001"));
        }
        SubmitPicProcessJob.SubmitPicProcessJobOperation submitPicProcessJobOperation = submitPicProcessJob.operation;
        if (submitPicProcessJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitPicProcessJobOperation, ProtectedSandApp.s("䓒\u0001"));
        }
        if (submitPicProcessJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䓓\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitPicProcessJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitPicProcessJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䓔\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitPicProcessJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitPicProcessJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䓕\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitPicProcessJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitPicProcessJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䓖\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
