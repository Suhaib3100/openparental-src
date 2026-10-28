package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.tag.audit.bean.AuditConf;
import com.tencent.cos.xml.model.tag.audit.post.PostAudioAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostAudioAudit$AudioAuditConf$$XmlAdapter extends IXmlAdapter<PostAudioAudit.AudioAuditConf> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostAudioAudit.AudioAuditConf audioAuditConf, String str) throws IOException, XmlPullParserException {
        if (audioAuditConf == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷉\u0001");
        }
        xmlSerializer.startTag("", str);
        if (audioAuditConf.callbackVersion != null) {
            String s4 = ProtectedSandApp.s("䷊\u0001");
            xmlSerializer.startTag("", s4);
            a.a(audioAuditConf.callbackVersion, xmlSerializer, "", s4);
        }
        if (audioAuditConf.detectType != null) {
            String s5 = ProtectedSandApp.s("䷋\u0001");
            xmlSerializer.startTag("", s5);
            a.a(audioAuditConf.detectType, xmlSerializer, "", s5);
        }
        String s6 = ProtectedSandApp.s("䷌\u0001");
        xmlSerializer.startTag("", s6);
        c.a(audioAuditConf.async, xmlSerializer, "", s6);
        if (audioAuditConf.callback != null) {
            String s7 = ProtectedSandApp.s("䷍\u0001");
            xmlSerializer.startTag("", s7);
            a.a(audioAuditConf.callback, xmlSerializer, "", s7);
        }
        if (audioAuditConf.callbackType != 0) {
            String s10 = ProtectedSandApp.s("䷎\u0001");
            xmlSerializer.startTag("", s10);
            c.a(audioAuditConf.callbackType, xmlSerializer, "", s10);
        }
        if (audioAuditConf.bizType != null) {
            String s11 = ProtectedSandApp.s("䷏\u0001");
            xmlSerializer.startTag("", s11);
            a.a(audioAuditConf.bizType, xmlSerializer, "", s11);
        }
        AuditConf.Freeze freeze = audioAuditConf.freeze;
        if (freeze != null) {
            QCloudXml.toXml(xmlSerializer, freeze, ProtectedSandApp.s("䷐\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
