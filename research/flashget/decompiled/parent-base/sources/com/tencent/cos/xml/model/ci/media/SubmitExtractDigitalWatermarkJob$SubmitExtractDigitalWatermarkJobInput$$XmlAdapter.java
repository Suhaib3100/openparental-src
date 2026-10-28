package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitExtractDigitalWatermarkJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitExtractDigitalWatermarkJob$SubmitExtractDigitalWatermarkJobInput$$XmlAdapter extends IXmlAdapter<SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitExtractDigitalWatermarkJob.SubmitExtractDigitalWatermarkJobInput submitExtractDigitalWatermarkJobInput, String str) throws IOException, XmlPullParserException {
        if (submitExtractDigitalWatermarkJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䐸\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitExtractDigitalWatermarkJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䐹\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitExtractDigitalWatermarkJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
