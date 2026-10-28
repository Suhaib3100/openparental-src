package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitDigitalWatermarkJob$SubmitDigitalWatermarkJobInput$$XmlAdapter extends IXmlAdapter<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobInput submitDigitalWatermarkJobInput, String str) throws IOException, XmlPullParserException {
        if (submitDigitalWatermarkJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䏻\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitDigitalWatermarkJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䏼\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitDigitalWatermarkJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
