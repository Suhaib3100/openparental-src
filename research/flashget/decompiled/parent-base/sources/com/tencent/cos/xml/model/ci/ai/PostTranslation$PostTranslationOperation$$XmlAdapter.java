package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostTranslation;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostTranslation$PostTranslationOperation$$XmlAdapter extends IXmlAdapter<PostTranslation.PostTranslationOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTranslation.PostTranslationOperation postTranslationOperation, String str) throws IOException, XmlPullParserException {
        if (postTranslationOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㶨\u0001");
        }
        xmlSerializer.startTag("", str);
        PostTranslation.PostTranslationTranslation postTranslationTranslation = postTranslationOperation.translation;
        if (postTranslationTranslation != null) {
            QCloudXml.toXml(xmlSerializer, postTranslationTranslation, ProtectedSandApp.s("㶩\u0001"));
        }
        PostTranslation.PostTranslationOutput postTranslationOutput = postTranslationOperation.output;
        if (postTranslationOutput != null) {
            QCloudXml.toXml(xmlSerializer, postTranslationOutput, ProtectedSandApp.s("㶪\u0001"));
        }
        if (postTranslationOperation.userData != null) {
            String s4 = ProtectedSandApp.s("㶫\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postTranslationOperation.userData, xmlSerializer, "", s4);
        }
        if (postTranslationOperation.jobLevel != null) {
            String s5 = ProtectedSandApp.s("㶬\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postTranslationOperation.jobLevel, xmlSerializer, "", s5);
        }
        if (postTranslationOperation.noNeedOutput != null) {
            String s6 = ProtectedSandApp.s("㶭\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postTranslationOperation.noNeedOutput, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
