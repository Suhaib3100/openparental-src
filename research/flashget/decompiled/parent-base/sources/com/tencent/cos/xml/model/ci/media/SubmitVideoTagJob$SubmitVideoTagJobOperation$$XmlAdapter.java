package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVideoTagJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVideoTagJob$SubmitVideoTagJobOperation$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJob.SubmitVideoTagJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVideoTagJob.SubmitVideoTagJobOperation submitVideoTagJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitVideoTagJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䘰\u0001");
        }
        xmlSerializer.startTag("", str);
        OperationVideoTag operationVideoTag = submitVideoTagJobOperation.videoTag;
        if (operationVideoTag != null) {
            QCloudXml.toXml(xmlSerializer, operationVideoTag, ProtectedSandApp.s("䘱\u0001"));
        }
        if (submitVideoTagJobOperation.jobLevel != null) {
            String s4 = ProtectedSandApp.s("䘲\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVideoTagJobOperation.jobLevel, xmlSerializer, "", s4);
        }
        if (submitVideoTagJobOperation.userData != null) {
            String s5 = ProtectedSandApp.s("䘳\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVideoTagJobOperation.userData, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
