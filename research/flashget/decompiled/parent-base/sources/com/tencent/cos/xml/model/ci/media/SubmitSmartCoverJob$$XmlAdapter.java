package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitSmartCoverJob$$XmlAdapter extends IXmlAdapter<SubmitSmartCoverJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitSmartCoverJob submitSmartCoverJob, String str) throws IOException, XmlPullParserException {
        if (submitSmartCoverJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䔈\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitSmartCoverJob.tag != null) {
            String s4 = ProtectedSandApp.s("䔉\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitSmartCoverJob.tag, xmlSerializer, "", s4);
        }
        SubmitSmartCoverJob.SubmitSmartCoverJobInput submitSmartCoverJobInput = submitSmartCoverJob.input;
        if (submitSmartCoverJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitSmartCoverJobInput, ProtectedSandApp.s("䔊\u0001"));
        }
        SubmitSmartCoverJob.SubmitSmartCoverJobOperation submitSmartCoverJobOperation = submitSmartCoverJob.operation;
        if (submitSmartCoverJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitSmartCoverJobOperation, ProtectedSandApp.s("䔋\u0001"));
        }
        if (submitSmartCoverJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䔌\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitSmartCoverJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitSmartCoverJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䔍\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitSmartCoverJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitSmartCoverJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䔎\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitSmartCoverJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitSmartCoverJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䔏\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
