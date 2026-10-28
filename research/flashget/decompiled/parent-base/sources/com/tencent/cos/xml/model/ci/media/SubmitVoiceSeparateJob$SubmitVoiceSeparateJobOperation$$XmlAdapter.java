package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJob$SubmitVoiceSeparateJobOperation$$XmlAdapter extends IXmlAdapter<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOperation submitVoiceSeparateJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitVoiceSeparateJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䚝\u0001");
        }
        xmlSerializer.startTag("", str);
        SubmitVoiceSeparateJob.VoiceSeparate voiceSeparate = submitVoiceSeparateJobOperation.voiceSeparate;
        if (voiceSeparate != null) {
            QCloudXml.toXml(xmlSerializer, voiceSeparate, ProtectedSandApp.s("䚞\u0001"));
        }
        if (submitVoiceSeparateJobOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("䚟\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVoiceSeparateJobOperation.templateId, xmlSerializer, "", s4);
        }
        SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput submitVoiceSeparateJobOutput = submitVoiceSeparateJobOperation.output;
        if (submitVoiceSeparateJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitVoiceSeparateJobOutput, ProtectedSandApp.s("䚠\u0001"));
        }
        if (submitVoiceSeparateJobOperation.jobLevel != null) {
            String s5 = ProtectedSandApp.s("䚡\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVoiceSeparateJobOperation.jobLevel, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
