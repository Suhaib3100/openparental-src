package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitConcatJob$SubmitConcatJobOperation$$XmlAdapter extends IXmlAdapter<SubmitConcatJob.SubmitConcatJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitConcatJob.SubmitConcatJobOperation submitConcatJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitConcatJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䏂\u0001");
        }
        xmlSerializer.startTag("", str);
        SubmitConcatJob.SubmitConcatJobConcatTemplate submitConcatJobConcatTemplate = submitConcatJobOperation.concatTemplate;
        if (submitConcatJobConcatTemplate != null) {
            QCloudXml.toXml(xmlSerializer, submitConcatJobConcatTemplate, ProtectedSandApp.s("䏃\u0001"));
        }
        if (submitConcatJobOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("䏄\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitConcatJobOperation.templateId, xmlSerializer, "", s4);
        }
        SubmitConcatJob.SubmitConcatJobOutput submitConcatJobOutput = submitConcatJobOperation.output;
        if (submitConcatJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitConcatJobOutput, ProtectedSandApp.s("䏅\u0001"));
        }
        if (submitConcatJobOperation.jobLevel != null) {
            String s5 = ProtectedSandApp.s("䏆\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitConcatJobOperation.jobLevel, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
