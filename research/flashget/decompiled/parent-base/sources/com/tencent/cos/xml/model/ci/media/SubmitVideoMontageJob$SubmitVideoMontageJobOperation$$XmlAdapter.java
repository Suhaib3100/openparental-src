package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVideoMontageJob$SubmitVideoMontageJobOperation$$XmlAdapter extends IXmlAdapter<SubmitVideoMontageJob.SubmitVideoMontageJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVideoMontageJob.SubmitVideoMontageJobOperation submitVideoMontageJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitVideoMontageJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䗧\u0001");
        }
        xmlSerializer.startTag("", str);
        SubmitVideoMontageJob.SubmitVideoMontageJobVideoMontage submitVideoMontageJobVideoMontage = submitVideoMontageJobOperation.videoMontage;
        if (submitVideoMontageJobVideoMontage != null) {
            QCloudXml.toXml(xmlSerializer, submitVideoMontageJobVideoMontage, ProtectedSandApp.s("䗨\u0001"));
        }
        if (submitVideoMontageJobOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("䗩\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVideoMontageJobOperation.templateId, xmlSerializer, "", s4);
        }
        SubmitVideoMontageJob.SubmitVideoMontageJobOutput submitVideoMontageJobOutput = submitVideoMontageJobOperation.output;
        if (submitVideoMontageJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitVideoMontageJobOutput, ProtectedSandApp.s("䗪\u0001"));
        }
        if (submitVideoMontageJobOperation.userData != null) {
            String s5 = ProtectedSandApp.s("䗫\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVideoMontageJobOperation.userData, xmlSerializer, "", s5);
        }
        if (submitVideoMontageJobOperation.jobLevel != null) {
            String s6 = ProtectedSandApp.s("䗬\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitVideoMontageJobOperation.jobLevel, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
