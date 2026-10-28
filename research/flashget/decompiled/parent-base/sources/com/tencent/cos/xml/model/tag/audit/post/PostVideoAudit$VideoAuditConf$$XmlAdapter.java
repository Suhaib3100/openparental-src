package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.post.PostVideoAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVideoAudit$VideoAuditConf$$XmlAdapter extends IXmlAdapter<PostVideoAudit.VideoAuditConf> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoAudit.VideoAuditConf videoAuditConf, String str) throws IOException, XmlPullParserException {
        if (videoAuditConf == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("万\u0001");
        }
        xmlSerializer.startTag("", str);
        if (videoAuditConf.callbackVersion != null) {
            String s4 = ProtectedSandApp.s("丈\u0001");
            xmlSerializer.startTag("", s4);
            a.a(videoAuditConf.callbackVersion, xmlSerializer, "", s4);
        }
        PostVideoAudit.Snapshot snapshot = videoAuditConf.snapshot;
        if (snapshot != null) {
            QCloudXml.toXml(xmlSerializer, snapshot, ProtectedSandApp.s("三\u0001"));
        }
        String s5 = ProtectedSandApp.s("上\u0001");
        xmlSerializer.startTag("", s5);
        c.a(videoAuditConf.detectContent, xmlSerializer, "", s5);
        if (videoAuditConf.detectType != null) {
            String s6 = ProtectedSandApp.s("下\u0001");
            xmlSerializer.startTag("", s6);
            a.a(videoAuditConf.detectType, xmlSerializer, "", s6);
        }
        String s7 = ProtectedSandApp.s("丌\u0001");
        xmlSerializer.startTag("", s7);
        c.a(videoAuditConf.async, xmlSerializer, "", s7);
        if (videoAuditConf.callback != null) {
            String s10 = ProtectedSandApp.s("不\u0001");
            xmlSerializer.startTag("", s10);
            a.a(videoAuditConf.callback, xmlSerializer, "", s10);
        }
        if (videoAuditConf.callbackType != 0) {
            String s11 = ProtectedSandApp.s("与\u0001");
            xmlSerializer.startTag("", s11);
            c.a(videoAuditConf.callbackType, xmlSerializer, "", s11);
        }
        if (videoAuditConf.bizType != null) {
            String s12 = ProtectedSandApp.s("丏\u0001");
            xmlSerializer.startTag("", s12);
            a.a(videoAuditConf.bizType, xmlSerializer, "", s12);
        }
        AuditConf.Freeze freeze = videoAuditConf.freeze;
        if (freeze != null) {
            QCloudXml.toXml(xmlSerializer, freeze, ProtectedSandApp.s("丐\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
