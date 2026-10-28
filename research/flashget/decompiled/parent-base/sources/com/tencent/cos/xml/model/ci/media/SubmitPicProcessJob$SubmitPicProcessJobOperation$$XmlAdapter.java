package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.common.PicProcess;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitPicProcessJob$SubmitPicProcessJobOperation$$XmlAdapter extends IXmlAdapter<SubmitPicProcessJob.SubmitPicProcessJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitPicProcessJob.SubmitPicProcessJobOperation submitPicProcessJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitPicProcessJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䓙\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitPicProcessJobOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("䓚\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitPicProcessJobOperation.templateId, xmlSerializer, "", s4);
        }
        PicProcess picProcess = submitPicProcessJobOperation.picProcess;
        if (picProcess != null) {
            QCloudXml.toXml(xmlSerializer, picProcess, ProtectedSandApp.s("䓛\u0001"));
        }
        SubmitPicProcessJob.SubmitPicProcessJobOutput submitPicProcessJobOutput = submitPicProcessJobOperation.output;
        if (submitPicProcessJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitPicProcessJobOutput, ProtectedSandApp.s("䓜\u0001"));
        }
        if (submitPicProcessJobOperation.userData != null) {
            String s5 = ProtectedSandApp.s("䓝\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitPicProcessJobOperation.userData, xmlSerializer, "", s5);
        }
        if (submitPicProcessJobOperation.jobLevel != null) {
            String s6 = ProtectedSandApp.s("䓞\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitPicProcessJobOperation.jobLevel, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
