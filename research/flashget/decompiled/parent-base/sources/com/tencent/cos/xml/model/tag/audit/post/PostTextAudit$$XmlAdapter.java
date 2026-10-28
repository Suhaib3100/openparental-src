package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.post.PostTextAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostTextAudit$$XmlAdapter extends IXmlAdapter<PostTextAudit> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostTextAudit postTextAudit, String str) throws IOException, XmlPullParserException {
        if (postTextAudit == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷯\u0001");
        }
        xmlSerializer.startTag("", str);
        PostTextAudit.TextAuditInput textAuditInput = postTextAudit.input;
        if (textAuditInput != null) {
            QCloudXml.toXml(xmlSerializer, textAuditInput, ProtectedSandApp.s("䷰\u0001"));
        }
        PostTextAudit.TextAuditConf textAuditConf = postTextAudit.conf;
        if (textAuditConf != null) {
            QCloudXml.toXml(xmlSerializer, textAuditConf, ProtectedSandApp.s("䷱\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
