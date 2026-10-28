package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitTranscodeJob$SubmitTranscodeJobInput$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJob.SubmitTranscodeJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitTranscodeJob.SubmitTranscodeJobInput submitTranscodeJobInput, String str) throws IOException, XmlPullParserException {
        if (submitTranscodeJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䖂\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitTranscodeJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䖃\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitTranscodeJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
