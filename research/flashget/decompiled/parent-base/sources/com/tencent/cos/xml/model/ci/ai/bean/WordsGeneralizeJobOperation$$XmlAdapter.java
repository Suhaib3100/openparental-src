package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class WordsGeneralizeJobOperation$$XmlAdapter extends IXmlAdapter<WordsGeneralizeJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, WordsGeneralizeJobOperation wordsGeneralizeJobOperation, String str) throws IOException, XmlPullParserException {
        if (wordsGeneralizeJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㾮\u0001");
        }
        xmlSerializer.startTag("", str);
        WordsGeneralize wordsGeneralize = wordsGeneralizeJobOperation.wordsGeneralize;
        if (wordsGeneralize != null) {
            QCloudXml.toXml(xmlSerializer, wordsGeneralize, ProtectedSandApp.s("㾯\u0001"));
        }
        if (wordsGeneralizeJobOperation.userData != null) {
            String s4 = ProtectedSandApp.s("㾰\u0001");
            xmlSerializer.startTag("", s4);
            a.a(wordsGeneralizeJobOperation.userData, xmlSerializer, "", s4);
        }
        String s5 = ProtectedSandApp.s("㾱\u0001");
        xmlSerializer.startTag("", s5);
        c.a(wordsGeneralizeJobOperation.jobLevel, xmlSerializer, "", s5);
        xmlSerializer.endTag("", str);
    }
}
