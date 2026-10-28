package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitExtractDigitalWatermarkJob$SubmitExtractDigitalWatermarkJobOperation$$XmlAdapter extends IXmlAdapter<SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobOperation submitExtractDigitalWatermarkJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitExtractDigitalWatermarkJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䐺\u0001");
        }
        xmlSerializer.startTag("", str);
        SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobExtractDigitalWatermark submitExtractDigitalWatermarkJobExtractDigitalWatermark = submitExtractDigitalWatermarkJobOperation.extractDigitalWatermark;
        if (submitExtractDigitalWatermarkJobExtractDigitalWatermark != null) {
            QCloudXml.toXml(xmlSerializer, submitExtractDigitalWatermarkJobExtractDigitalWatermark, ProtectedSandApp.s("䐻\u0001"));
        }
        if (submitExtractDigitalWatermarkJobOperation.jobLevel != null) {
            String s4 = ProtectedSandApp.s("䐼\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitExtractDigitalWatermarkJobOperation.jobLevel, xmlSerializer, "", s4);
        }
        if (submitExtractDigitalWatermarkJobOperation.userData != null) {
            String s5 = ProtectedSandApp.s("䐽\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitExtractDigitalWatermarkJobOperation.userData, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
