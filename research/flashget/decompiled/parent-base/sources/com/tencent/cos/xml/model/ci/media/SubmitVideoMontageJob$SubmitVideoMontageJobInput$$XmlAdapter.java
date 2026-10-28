package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVideoMontageJob$SubmitVideoMontageJobInput$$XmlAdapter extends IXmlAdapter<SubmitVideoMontageJob.SubmitVideoMontageJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVideoMontageJob.SubmitVideoMontageJobInput submitVideoMontageJobInput, String str) throws IOException, XmlPullParserException {
        if (submitVideoMontageJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䗤\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitVideoMontageJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䗥\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVideoMontageJobInput.object, xmlSerializer, "", s4);
        }
        if (submitVideoMontageJobInput.url != null) {
            String s5 = ProtectedSandApp.s("䗦\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVideoMontageJobInput.url, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
