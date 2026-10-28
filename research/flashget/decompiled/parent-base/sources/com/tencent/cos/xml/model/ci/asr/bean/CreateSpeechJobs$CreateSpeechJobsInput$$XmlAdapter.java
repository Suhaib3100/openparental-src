package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.asr.bean.CreateSpeechJobs;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateSpeechJobs$CreateSpeechJobsInput$$XmlAdapter extends IXmlAdapter<CreateSpeechJobs.CreateSpeechJobsInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateSpeechJobs.CreateSpeechJobsInput createSpeechJobsInput, String str) throws IOException, XmlPullParserException {
        if (createSpeechJobsInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㿘\u0001");
        }
        xmlSerializer.startTag("", str);
        if (createSpeechJobsInput.object != null) {
            String s4 = ProtectedSandApp.s("㿙\u0001");
            xmlSerializer.startTag("", s4);
            a.a(createSpeechJobsInput.object, xmlSerializer, "", s4);
        }
        if (createSpeechJobsInput.url != null) {
            String s5 = ProtectedSandApp.s("㿚\u0001");
            xmlSerializer.startTag("", s5);
            a.a(createSpeechJobsInput.url, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
