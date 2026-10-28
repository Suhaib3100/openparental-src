package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.common.DigitalWatermark;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitTranscodeJob$SubmitTranscodeJobOperation$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJob.SubmitTranscodeJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitTranscodeJob.SubmitTranscodeJobOperation submitTranscodeJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitTranscodeJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䖄\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitTranscodeJobOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("䖅\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitTranscodeJobOperation.templateId, xmlSerializer, "", s4);
        }
        SubmitTranscodeJob.SubmitTranscodeJobTranscode submitTranscodeJobTranscode = submitTranscodeJobOperation.transcode;
        if (submitTranscodeJobTranscode != null) {
            QCloudXml.toXml(xmlSerializer, submitTranscodeJobTranscode, ProtectedSandApp.s("䖆\u0001"));
        }
        if (submitTranscodeJobOperation.watermarkTemplateId != null) {
            for (int i4 = 0; i4 < submitTranscodeJobOperation.watermarkTemplateId.size(); i4++) {
                String s5 = ProtectedSandApp.s("䖇\u0001");
                xmlSerializer.startTag("", s5);
                xmlSerializer.text(String.valueOf(submitTranscodeJobOperation.watermarkTemplateId.get(i4)));
                xmlSerializer.endTag("", s5);
            }
        }
        if (submitTranscodeJobOperation.watermark != null) {
            for (int i5 = 0; i5 < submitTranscodeJobOperation.watermark.size(); i5++) {
                QCloudXml.toXml(xmlSerializer, submitTranscodeJobOperation.watermark.get(i5), ProtectedSandApp.s("䖈\u0001"));
            }
        }
        SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark submitTranscodeJobRemoveWatermark = submitTranscodeJobOperation.removeWatermark;
        if (submitTranscodeJobRemoveWatermark != null) {
            QCloudXml.toXml(xmlSerializer, submitTranscodeJobRemoveWatermark, ProtectedSandApp.s("䖉\u0001"));
        }
        SubmitTranscodeJob.SubmitTranscodeJobSubtitles submitTranscodeJobSubtitles = submitTranscodeJobOperation.subtitles;
        if (submitTranscodeJobSubtitles != null) {
            QCloudXml.toXml(xmlSerializer, submitTranscodeJobSubtitles, ProtectedSandApp.s("䖊\u0001"));
        }
        DigitalWatermark digitalWatermark = submitTranscodeJobOperation.digitalWatermark;
        if (digitalWatermark != null) {
            QCloudXml.toXml(xmlSerializer, digitalWatermark, ProtectedSandApp.s("䖋\u0001"));
        }
        SubmitTranscodeJob.SubmitTranscodeJobOutput submitTranscodeJobOutput = submitTranscodeJobOperation.output;
        if (submitTranscodeJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitTranscodeJobOutput, ProtectedSandApp.s("䖌\u0001"));
        }
        if (submitTranscodeJobOperation.userData != null) {
            String s6 = ProtectedSandApp.s("䖍\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitTranscodeJobOperation.userData, xmlSerializer, "", s6);
        }
        if (submitTranscodeJobOperation.jobLevel != null) {
            String s7 = ProtectedSandApp.s("䖎\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitTranscodeJobOperation.jobLevel, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
