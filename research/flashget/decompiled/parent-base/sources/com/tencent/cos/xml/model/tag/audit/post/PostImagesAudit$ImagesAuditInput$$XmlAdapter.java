package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.tag.audit.bean.AuditEncryption;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.post.PostImagesAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostImagesAudit$ImagesAuditInput$$XmlAdapter extends IXmlAdapter<PostImagesAudit.ImagesAuditInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostImagesAudit.ImagesAuditInput imagesAuditInput, String str) throws IOException, XmlPullParserException {
        if (imagesAuditInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷡\u0001");
        }
        xmlSerializer.startTag("", str);
        if (imagesAuditInput.content != null) {
            String s4 = ProtectedSandApp.s("䷢\u0001");
            xmlSerializer.startTag("", s4);
            a.a(imagesAuditInput.content, xmlSerializer, "", s4);
        }
        if (imagesAuditInput.interval != 0) {
            String s5 = ProtectedSandApp.s("䷣\u0001");
            xmlSerializer.startTag("", s5);
            c.a(imagesAuditInput.interval, xmlSerializer, "", s5);
        }
        if (imagesAuditInput.maxFrames != 0) {
            String s6 = ProtectedSandApp.s("䷤\u0001");
            xmlSerializer.startTag("", s6);
            c.a(imagesAuditInput.maxFrames, xmlSerializer, "", s6);
        }
        String s7 = ProtectedSandApp.s("䷥\u0001");
        xmlSerializer.startTag("", s7);
        c.a(imagesAuditInput.largeImageDetect, xmlSerializer, "", s7);
        AuditEncryption auditEncryption = imagesAuditInput.encryption;
        if (auditEncryption != null) {
            QCloudXml.toXml(xmlSerializer, auditEncryption, ProtectedSandApp.s("䷦\u0001"));
        }
        if (imagesAuditInput.object != null) {
            String s10 = ProtectedSandApp.s("䷧\u0001");
            xmlSerializer.startTag("", s10);
            a.a(imagesAuditInput.object, xmlSerializer, "", s10);
        }
        if (imagesAuditInput.url != null) {
            String s11 = ProtectedSandApp.s("䷨\u0001");
            xmlSerializer.startTag("", s11);
            a.a(imagesAuditInput.url, xmlSerializer, "", s11);
        }
        if (imagesAuditInput.dataId != null) {
            String s12 = ProtectedSandApp.s("䷩\u0001");
            xmlSerializer.startTag("", s12);
            a.a(imagesAuditInput.dataId, xmlSerializer, "", s12);
        }
        AuditUserInfo auditUserInfo = imagesAuditInput.userInfo;
        if (auditUserInfo != null) {
            QCloudXml.toXml(xmlSerializer, auditUserInfo, ProtectedSandApp.s("䷪\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
