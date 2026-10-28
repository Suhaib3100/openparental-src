package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.ci.asr.bean.CreateSpeechJobs;
import com.tencent.cos.xml.model.tag.Locator;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateSpeechJobs$CreateSpeechJobsOperation$$XmlAdapter extends IXmlAdapter<CreateSpeechJobs.CreateSpeechJobsOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateSpeechJobs.CreateSpeechJobsOperation createSpeechJobsOperation, String str) throws IOException, XmlPullParserException {
        if (createSpeechJobsOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㿛\u0001");
        }
        xmlSerializer.startTag("", str);
        SpeechRecognition speechRecognition = createSpeechJobsOperation.speechRecognition;
        if (speechRecognition != null) {
            QCloudXml.toXml(xmlSerializer, speechRecognition, ProtectedSandApp.s("㿜\u0001"));
        }
        Locator locator = createSpeechJobsOperation.output;
        if (locator != null) {
            QCloudXml.toXml(xmlSerializer, locator, ProtectedSandApp.s("㿝\u0001"));
        }
        if (createSpeechJobsOperation.userData != null) {
            String s4 = ProtectedSandApp.s("㿞\u0001");
            xmlSerializer.startTag("", s4);
            a.a(createSpeechJobsOperation.userData, xmlSerializer, "", s4);
        }
        String s5 = ProtectedSandApp.s("㿟\u0001");
        xmlSerializer.startTag("", s5);
        c.a(createSpeechJobsOperation.jobLevel, xmlSerializer, "", s5);
        if (createSpeechJobsOperation.templateId != null) {
            String s6 = ProtectedSandApp.s("㿠\u0001");
            xmlSerializer.startTag("", s6);
            a.a(createSpeechJobsOperation.templateId, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
