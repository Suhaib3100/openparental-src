package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitExtractDigitalWatermarkJob$SubmitExtractDigitalWatermarkJobExtractDigitalWatermark$$XmlAdapter extends IXmlAdapter<SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobExtractDigitalWatermark> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobExtractDigitalWatermark submitExtractDigitalWatermarkJobExtractDigitalWatermark, String str) throws IOException, XmlPullParserException {
        if (submitExtractDigitalWatermarkJobExtractDigitalWatermark == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䐳\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitExtractDigitalWatermarkJobExtractDigitalWatermark.type != null) {
            String s4 = ProtectedSandApp.s("䐴\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitExtractDigitalWatermarkJobExtractDigitalWatermark.type, xmlSerializer, "", s4);
        }
        if (submitExtractDigitalWatermarkJobExtractDigitalWatermark.version != null) {
            String s5 = ProtectedSandApp.s("䐵\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitExtractDigitalWatermarkJobExtractDigitalWatermark.version, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
