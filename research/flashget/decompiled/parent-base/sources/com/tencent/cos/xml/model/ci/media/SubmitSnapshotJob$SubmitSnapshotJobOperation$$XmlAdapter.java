package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshot;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitSnapshotJob$SubmitSnapshotJobOperation$$XmlAdapter extends IXmlAdapter<SubmitSnapshotJob.SubmitSnapshotJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitSnapshotJob.SubmitSnapshotJobOperation submitSnapshotJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitSnapshotJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䕈\u0001");
        }
        xmlSerializer.startTag("", str);
        TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot = submitSnapshotJobOperation.snapshot;
        if (templateSnapshotSnapshot != null) {
            QCloudXml.toXml(xmlSerializer, templateSnapshotSnapshot, ProtectedSandApp.s("䕉\u0001"));
        }
        if (submitSnapshotJobOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("䕊\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitSnapshotJobOperation.templateId, xmlSerializer, "", s4);
        }
        SubmitSnapshotJob.SubmitSnapshotJobOutput submitSnapshotJobOutput = submitSnapshotJobOperation.output;
        if (submitSnapshotJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitSnapshotJobOutput, ProtectedSandApp.s("䕋\u0001"));
        }
        if (submitSnapshotJobOperation.userData != null) {
            String s5 = ProtectedSandApp.s("䕌\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitSnapshotJobOperation.userData, xmlSerializer, "", s5);
        }
        if (submitSnapshotJobOperation.jobLevel != null) {
            String s6 = ProtectedSandApp.s("䕍\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitSnapshotJobOperation.jobLevel, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
