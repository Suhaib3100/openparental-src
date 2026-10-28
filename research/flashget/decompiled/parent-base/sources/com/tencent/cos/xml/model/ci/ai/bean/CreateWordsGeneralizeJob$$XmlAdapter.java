package com.tencent.cos.xml.model.ci.ai.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateWordsGeneralizeJob$$XmlAdapter extends IXmlAdapter<CreateWordsGeneralizeJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateWordsGeneralizeJob createWordsGeneralizeJob, String str) throws IOException, XmlPullParserException {
        if (createWordsGeneralizeJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㽲\u0001");
        }
        xmlSerializer.startTag("", str);
        if (createWordsGeneralizeJob.tag != null) {
            String s4 = ProtectedSandApp.s("㽳\u0001");
            xmlSerializer.startTag("", s4);
            a.a(createWordsGeneralizeJob.tag, xmlSerializer, "", s4);
        }
        WordsGeneralizeJobInput wordsGeneralizeJobInput = createWordsGeneralizeJob.input;
        if (wordsGeneralizeJobInput != null) {
            QCloudXml.toXml(xmlSerializer, wordsGeneralizeJobInput, ProtectedSandApp.s("㽴\u0001"));
        }
        WordsGeneralizeJobOperation wordsGeneralizeJobOperation = createWordsGeneralizeJob.operation;
        if (wordsGeneralizeJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, wordsGeneralizeJobOperation, ProtectedSandApp.s("㽵\u0001"));
        }
        if (createWordsGeneralizeJob.queueId != null) {
            String s5 = ProtectedSandApp.s("㽶\u0001");
            xmlSerializer.startTag("", s5);
            a.a(createWordsGeneralizeJob.queueId, xmlSerializer, "", s5);
        }
        if (createWordsGeneralizeJob.callBack != null) {
            String s6 = ProtectedSandApp.s("㽷\u0001");
            xmlSerializer.startTag("", s6);
            a.a(createWordsGeneralizeJob.callBack, xmlSerializer, "", s6);
        }
        if (createWordsGeneralizeJob.callBackFormat != null) {
            String s7 = ProtectedSandApp.s("㽸\u0001");
            xmlSerializer.startTag("", s7);
            a.a(createWordsGeneralizeJob.callBackFormat, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
