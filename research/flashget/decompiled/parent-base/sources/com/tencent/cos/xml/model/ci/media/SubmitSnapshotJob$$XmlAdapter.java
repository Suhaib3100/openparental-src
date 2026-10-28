package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob;
import com.tencent.cos.xml.model.tag.CallBackMqConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitSnapshotJob$$XmlAdapter extends IXmlAdapter<SubmitSnapshotJob> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitSnapshotJob submitSnapshotJob, String str) throws IOException, XmlPullParserException {
        if (submitSnapshotJob == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䔾\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitSnapshotJob.tag != null) {
            String s4 = ProtectedSandApp.s("䔿\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitSnapshotJob.tag, xmlSerializer, "", s4);
        }
        SubmitSnapshotJob.SubmitSnapshotJobInput submitSnapshotJobInput = submitSnapshotJob.input;
        if (submitSnapshotJobInput != null) {
            QCloudXml.toXml(xmlSerializer, submitSnapshotJobInput, ProtectedSandApp.s("䕀\u0001"));
        }
        SubmitSnapshotJob.SubmitSnapshotJobOperation submitSnapshotJobOperation = submitSnapshotJob.operation;
        if (submitSnapshotJobOperation != null) {
            QCloudXml.toXml(xmlSerializer, submitSnapshotJobOperation, ProtectedSandApp.s("䕁\u0001"));
        }
        if (submitSnapshotJob.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("䕂\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitSnapshotJob.callBackFormat, xmlSerializer, "", s5);
        }
        if (submitSnapshotJob.callBackType != null) {
            String s6 = ProtectedSandApp.s("䕃\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitSnapshotJob.callBackType, xmlSerializer, "", s6);
        }
        if (submitSnapshotJob.callBack != null) {
            String s7 = ProtectedSandApp.s("䕄\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitSnapshotJob.callBack, xmlSerializer, "", s7);
        }
        CallBackMqConfig callBackMqConfig = submitSnapshotJob.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("䕅\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
