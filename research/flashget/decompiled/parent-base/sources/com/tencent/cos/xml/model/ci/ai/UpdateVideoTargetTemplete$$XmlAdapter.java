package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.VideoTargetRec;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateVideoTargetTemplete$$XmlAdapter extends IXmlAdapter<UpdateVideoTargetTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateVideoTargetTemplete updateVideoTargetTemplete, String str) throws IOException, XmlPullParserException {
        if (updateVideoTargetTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㻻\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateVideoTargetTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㻼\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateVideoTargetTemplete.tag, xmlSerializer, "", s4);
        }
        if (updateVideoTargetTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㻽\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateVideoTargetTemplete.name, xmlSerializer, "", s5);
        }
        VideoTargetRec videoTargetRec = updateVideoTargetTemplete.videoTargetRec;
        if (videoTargetRec != null) {
            QCloudXml.toXml(xmlSerializer, videoTargetRec, ProtectedSandApp.s("㻾\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
