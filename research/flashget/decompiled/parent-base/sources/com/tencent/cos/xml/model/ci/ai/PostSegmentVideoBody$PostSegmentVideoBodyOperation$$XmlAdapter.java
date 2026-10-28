package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostSegmentVideoBody$PostSegmentVideoBodyOperation$$XmlAdapter extends IXmlAdapter<PostSegmentVideoBody.PostSegmentVideoBodyOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSegmentVideoBody.PostSegmentVideoBodyOperation postSegmentVideoBodyOperation, String str) throws IOException, XmlPullParserException {
        if (postSegmentVideoBodyOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㴣\u0001");
        }
        xmlSerializer.startTag("", str);
        PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody = postSegmentVideoBodyOperation.segmentVideoBody;
        if (postSegmentVideoBodySegmentVideoBody != null) {
            QCloudXml.toXml(xmlSerializer, postSegmentVideoBodySegmentVideoBody, ProtectedSandApp.s("㴤\u0001"));
        }
        PostSegmentVideoBody.PostSegmentVideoBodyOutput postSegmentVideoBodyOutput = postSegmentVideoBodyOperation.output;
        if (postSegmentVideoBodyOutput != null) {
            QCloudXml.toXml(xmlSerializer, postSegmentVideoBodyOutput, ProtectedSandApp.s("㴥\u0001"));
        }
        if (postSegmentVideoBodyOperation.userData != null) {
            String s4 = ProtectedSandApp.s("㴦\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSegmentVideoBodyOperation.userData, xmlSerializer, "", s4);
        }
        if (postSegmentVideoBodyOperation.jobLevel != null) {
            String s5 = ProtectedSandApp.s("㴧\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postSegmentVideoBodyOperation.jobLevel, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
