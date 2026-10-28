package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob;
import com.tencent.cos.xml.model.ci.media.TemplateSmartCover;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitSmartCoverJob$SubmitSmartCoverJobOperation$$XmlAdapter extends IXmlAdapter<SubmitSmartCoverJob.SubmitSmartCoverJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitSmartCoverJob.SubmitSmartCoverJobOperation submitSmartCoverJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitSmartCoverJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䔒\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitSmartCoverJobOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("䔓\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitSmartCoverJobOperation.templateId, xmlSerializer, "", s4);
        }
        TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover = submitSmartCoverJobOperation.smartCover;
        if (templateSmartCoverSmartCover != null) {
            QCloudXml.toXml(xmlSerializer, templateSmartCoverSmartCover, ProtectedSandApp.s("䔔\u0001"));
        }
        SubmitSmartCoverJob.SubmitSmartCoverJobOutput submitSmartCoverJobOutput = submitSmartCoverJobOperation.output;
        if (submitSmartCoverJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitSmartCoverJobOutput, ProtectedSandApp.s("䔕\u0001"));
        }
        if (submitSmartCoverJobOperation.userData != null) {
            String s5 = ProtectedSandApp.s("䔖\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitSmartCoverJobOperation.userData, xmlSerializer, "", s5);
        }
        if (submitSmartCoverJobOperation.jobLevel != null) {
            String s6 = ProtectedSandApp.s("䔗\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitSmartCoverJobOperation.jobLevel, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
