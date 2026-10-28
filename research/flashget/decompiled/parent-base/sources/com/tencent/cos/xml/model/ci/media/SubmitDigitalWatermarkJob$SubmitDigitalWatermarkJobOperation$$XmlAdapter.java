package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.common.DigitalWatermark;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitDigitalWatermarkJob$SubmitDigitalWatermarkJobOperation$$XmlAdapter extends IXmlAdapter<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOperation submitDigitalWatermarkJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitDigitalWatermarkJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䏽\u0001");
        }
        xmlSerializer.startTag("", str);
        SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput submitDigitalWatermarkJobOutput = submitDigitalWatermarkJobOperation.output;
        if (submitDigitalWatermarkJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitDigitalWatermarkJobOutput, ProtectedSandApp.s("䏾\u0001"));
        }
        DigitalWatermark digitalWatermark = submitDigitalWatermarkJobOperation.digitalWatermark;
        if (digitalWatermark != null) {
            QCloudXml.toXml(xmlSerializer, digitalWatermark, ProtectedSandApp.s("䏿\u0001"));
        }
        if (submitDigitalWatermarkJobOperation.jobLevel != null) {
            String s4 = ProtectedSandApp.s("䐀\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitDigitalWatermarkJobOperation.jobLevel, xmlSerializer, "", s4);
        }
        if (submitDigitalWatermarkJobOperation.userData != null) {
            String s5 = ProtectedSandApp.s("䐁\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitDigitalWatermarkJobOperation.userData, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
