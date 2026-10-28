package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVoiceSynthesis;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVoiceSynthesis$PostVoiceSynthesisOperation$$XmlAdapter extends IXmlAdapter<PostVoiceSynthesis.PostVoiceSynthesisOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVoiceSynthesis.PostVoiceSynthesisOperation postVoiceSynthesisOperation, String str) throws IOException, XmlPullParserException {
        if (postVoiceSynthesisOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㹃\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVoiceSynthesisOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("㹄\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVoiceSynthesisOperation.templateId, xmlSerializer, "", s4);
        }
        PostVoiceSynthesis.PostVoiceSynthesisTtsTpl postVoiceSynthesisTtsTpl = postVoiceSynthesisOperation.ttsTpl;
        if (postVoiceSynthesisTtsTpl != null) {
            QCloudXml.toXml(xmlSerializer, postVoiceSynthesisTtsTpl, ProtectedSandApp.s("㹅\u0001"));
        }
        PostVoiceSynthesis.PostVoiceSynthesisTtsConfig postVoiceSynthesisTtsConfig = postVoiceSynthesisOperation.ttsConfig;
        if (postVoiceSynthesisTtsConfig != null) {
            QCloudXml.toXml(xmlSerializer, postVoiceSynthesisTtsConfig, ProtectedSandApp.s("㹆\u0001"));
        }
        PostVoiceSynthesis.PostVoiceSynthesisOutput postVoiceSynthesisOutput = postVoiceSynthesisOperation.output;
        if (postVoiceSynthesisOutput != null) {
            QCloudXml.toXml(xmlSerializer, postVoiceSynthesisOutput, ProtectedSandApp.s("㹇\u0001"));
        }
        if (postVoiceSynthesisOperation.userData != null) {
            String s5 = ProtectedSandApp.s("㹈\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVoiceSynthesisOperation.userData, xmlSerializer, "", s5);
        }
        if (postVoiceSynthesisOperation.jobLevel != null) {
            String s6 = ProtectedSandApp.s("㹉\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postVoiceSynthesisOperation.jobLevel, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
