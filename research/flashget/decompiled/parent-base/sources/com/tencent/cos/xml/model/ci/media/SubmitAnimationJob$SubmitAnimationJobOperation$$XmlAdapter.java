package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitAnimationJob$SubmitAnimationJobOperation$$XmlAdapter extends IXmlAdapter<SubmitAnimationJob.SubmitAnimationJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitAnimationJob.SubmitAnimationJobOperation submitAnimationJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitAnimationJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䍲\u0001");
        }
        xmlSerializer.startTag("", str);
        SubmitAnimationJob.SubmitAnimationJobAnimation submitAnimationJobAnimation = submitAnimationJobOperation.animation;
        if (submitAnimationJobAnimation != null) {
            QCloudXml.toXml(xmlSerializer, submitAnimationJobAnimation, ProtectedSandApp.s("䍳\u0001"));
        }
        if (submitAnimationJobOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("䍴\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitAnimationJobOperation.templateId, xmlSerializer, "", s4);
        }
        SubmitAnimationJob.SubmitAnimationJobOutput submitAnimationJobOutput = submitAnimationJobOperation.output;
        if (submitAnimationJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitAnimationJobOutput, ProtectedSandApp.s("䍵\u0001"));
        }
        if (submitAnimationJobOperation.userData != null) {
            String s5 = ProtectedSandApp.s("䍶\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitAnimationJobOperation.userData, xmlSerializer, "", s5);
        }
        if (submitAnimationJobOperation.jobLevel != null) {
            String s6 = ProtectedSandApp.s("䍷\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitAnimationJobOperation.jobLevel, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
