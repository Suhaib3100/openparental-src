package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostImagesAudit$$XmlAdapter extends IXmlAdapter<PostImagesAudit> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostImagesAudit postImagesAudit, String str) throws IOException, XmlPullParserException {
        if (postImagesAudit == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷞\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postImagesAudit.input != null) {
            for (int i4 = 0; i4 < postImagesAudit.input.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, postImagesAudit.input.get(i4), ProtectedSandApp.s("䷟\u0001"));
            }
        }
        AuditConf auditConf = postImagesAudit.conf;
        if (auditConf != null) {
            QCloudXml.toXml(xmlSerializer, auditConf, ProtectedSandApp.s("䷠\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
