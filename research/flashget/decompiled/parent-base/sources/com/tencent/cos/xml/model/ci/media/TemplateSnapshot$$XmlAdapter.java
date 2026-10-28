package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshot;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateSnapshot$$XmlAdapter extends IXmlAdapter<TemplateSnapshot> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateSnapshot templateSnapshot, String str) throws IOException, XmlPullParserException {
        if (templateSnapshot == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䝾\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateSnapshot.tag != null) {
            String s4 = ProtectedSandApp.s("䝿\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateSnapshot.tag, xmlSerializer, "", s4);
        }
        if (templateSnapshot.name != null) {
            String s5 = ProtectedSandApp.s("䞀\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateSnapshot.name, xmlSerializer, "", s5);
        }
        TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot = templateSnapshot.snapshot;
        if (templateSnapshotSnapshot != null) {
            QCloudXml.toXml(xmlSerializer, templateSnapshotSnapshot, ProtectedSandApp.s("䞁\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
