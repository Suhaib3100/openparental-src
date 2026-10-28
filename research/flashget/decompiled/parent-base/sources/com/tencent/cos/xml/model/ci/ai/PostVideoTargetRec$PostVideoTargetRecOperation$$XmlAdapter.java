package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetRec;
import com.tencent.cos.xml.model.ci.common.VideoTargetRec;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVideoTargetRec$PostVideoTargetRecOperation$$XmlAdapter extends IXmlAdapter<PostVideoTargetRec.PostVideoTargetRecOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoTargetRec.PostVideoTargetRecOperation postVideoTargetRecOperation, String str) throws IOException, XmlPullParserException {
        if (postVideoTargetRecOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㷡\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVideoTargetRecOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("㷢\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVideoTargetRecOperation.templateId, xmlSerializer, "", s4);
        }
        VideoTargetRec videoTargetRec = postVideoTargetRecOperation.videoTargetRec;
        if (videoTargetRec != null) {
            QCloudXml.toXml(xmlSerializer, videoTargetRec, ProtectedSandApp.s("㷣\u0001"));
        }
        if (postVideoTargetRecOperation.userData != null) {
            String s5 = ProtectedSandApp.s("㷤\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVideoTargetRecOperation.userData, xmlSerializer, "", s5);
        }
        if (postVideoTargetRecOperation.jobLevel != null) {
            String s6 = ProtectedSandApp.s("㷥\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postVideoTargetRecOperation.jobLevel, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
