package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitMediaSegmentJob$SubmitMediaSegmentJobOperation$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJob.SubmitMediaSegmentJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaSegmentJob.SubmitMediaSegmentJobOperation submitMediaSegmentJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitMediaSegmentJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䒛\u0001");
        }
        xmlSerializer.startTag("", str);
        SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment submitMediaSegmentJobSegment = submitMediaSegmentJobOperation.segment;
        if (submitMediaSegmentJobSegment != null) {
            QCloudXml.toXml(xmlSerializer, submitMediaSegmentJobSegment, ProtectedSandApp.s("䒜\u0001"));
        }
        SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput submitMediaSegmentJobOutput = submitMediaSegmentJobOperation.output;
        if (submitMediaSegmentJobOutput != null) {
            QCloudXml.toXml(xmlSerializer, submitMediaSegmentJobOutput, ProtectedSandApp.s("䒝\u0001"));
        }
        if (submitMediaSegmentJobOperation.jobLevel != null) {
            String s4 = ProtectedSandApp.s("䒞\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaSegmentJobOperation.jobLevel, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
