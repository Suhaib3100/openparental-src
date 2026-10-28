package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJob$SubmitVoiceSeparateJobInput$$XmlAdapter extends IXmlAdapter<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVoiceSeparateJob.SubmitVoiceSeparateJobInput submitVoiceSeparateJobInput, String str) throws IOException, XmlPullParserException {
        if (submitVoiceSeparateJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䚛\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitVoiceSeparateJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䚜\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVoiceSeparateJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
