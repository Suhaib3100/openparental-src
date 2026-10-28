package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.VideoTargetRec;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVideoTargetTemplete$$XmlAdapter extends IXmlAdapter<PostVideoTargetTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoTargetTemplete postVideoTargetTemplete, String str) throws IOException, XmlPullParserException {
        if (postVideoTargetTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㸮\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVideoTargetTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㸯\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVideoTargetTemplete.tag, xmlSerializer, "", s4);
        }
        if (postVideoTargetTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㸰\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postVideoTargetTemplete.name, xmlSerializer, "", s5);
        }
        VideoTargetRec videoTargetRec = postVideoTargetTemplete.videoTargetRec;
        if (videoTargetRec != null) {
            QCloudXml.toXml(xmlSerializer, videoTargetRec, ProtectedSandApp.s("㸱\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
