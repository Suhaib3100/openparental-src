package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateSmartCover;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateSmartCover$$XmlAdapter extends IXmlAdapter<TemplateSmartCover> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateSmartCover templateSmartCover, String str) throws IOException, XmlPullParserException {
        if (templateSmartCover == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䝤\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateSmartCover.tag != null) {
            String s4 = ProtectedSandApp.s("䝥\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateSmartCover.tag, xmlSerializer, "", s4);
        }
        if (templateSmartCover.name != null) {
            String s5 = ProtectedSandApp.s("䝦\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateSmartCover.name, xmlSerializer, "", s5);
        }
        TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover = templateSmartCover.smartCover;
        if (templateSmartCoverSmartCover != null) {
            QCloudXml.toXml(xmlSerializer, templateSmartCoverSmartCover, ProtectedSandApp.s("䝧\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
