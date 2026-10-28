package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditEncryption;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.post.PostVideoAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVideoAudit$VideoAuditInput$$XmlAdapter extends IXmlAdapter<PostVideoAudit.VideoAuditInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoAudit.VideoAuditInput videoAuditInput, String str) throws IOException, XmlPullParserException {
        if (videoAuditInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("丑\u0001");
        }
        xmlSerializer.startTag("", str);
        AuditEncryption auditEncryption = videoAuditInput.encryption;
        if (auditEncryption != null) {
            QCloudXml.toXml(xmlSerializer, auditEncryption, ProtectedSandApp.s("丒\u0001"));
        }
        if (videoAuditInput.object != null) {
            String s4 = ProtectedSandApp.s("专\u0001");
            xmlSerializer.startTag("", s4);
            a.a(videoAuditInput.object, xmlSerializer, "", s4);
        }
        if (videoAuditInput.url != null) {
            String s5 = ProtectedSandApp.s("且\u0001");
            xmlSerializer.startTag("", s5);
            a.a(videoAuditInput.url, xmlSerializer, "", s5);
        }
        if (videoAuditInput.dataId != null) {
            String s6 = ProtectedSandApp.s("丕\u0001");
            xmlSerializer.startTag("", s6);
            a.a(videoAuditInput.dataId, xmlSerializer, "", s6);
        }
        AuditUserInfo auditUserInfo = videoAuditInput.userInfo;
        if (auditUserInfo != null) {
            QCloudXml.toXml(xmlSerializer, auditUserInfo, ProtectedSandApp.s("世\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
