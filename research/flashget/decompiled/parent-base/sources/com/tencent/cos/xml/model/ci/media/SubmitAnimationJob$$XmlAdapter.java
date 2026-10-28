package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitAnimationJob$$XmlAdapter extends IXmlAdapter<SubmitAnimationJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitAnimationJob submitAnimationJob, String str) throws IOException, XmlPullParserException {
        if (submitAnimationJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䍡\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitAnimationJob.tag != null) {
            String s4 = ProtectedSandApp.s("䍢\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitAnimationJob.tag, xmlSerializer, "", s4);
        }
        SubmitAnimationJob.SubmitAnimationJobInput submitAnimationJobInput = submitAnimationJob.input;
        if (submitAnimationJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitAnimationJobInput, ProtectedSandApp.s("䍣\u0001"));
        }
        SubmitAnimationJob.SubmitAnimationJobOperation submitAnimationJobOperation = submitAnimationJob.operation;
        if (submitAnimationJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitAnimationJobOperation, ProtectedSandApp.s("䍤\u0001"));
        }
        if (submitAnimationJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䍥\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitAnimationJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitAnimationJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䍦\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitAnimationJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitAnimationJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䍧\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitAnimationJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitAnimationJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䍨\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
