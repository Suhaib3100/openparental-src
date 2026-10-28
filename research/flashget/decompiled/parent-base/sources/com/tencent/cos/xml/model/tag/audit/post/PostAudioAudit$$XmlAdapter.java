package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.bean.AuditInput;
import com.tencent.cos.xml.model.tag.audit.post.PostAudioAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostAudioAudit$$XmlAdapter extends IXmlAdapter<PostAudioAudit> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostAudioAudit postAudioAudit, String str) throws IOException, XmlPullParserException {
        if (postAudioAudit == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䷆\u0001");
        }
        xmlSerializer.startTag("", str);
        AuditInput auditInput = postAudioAudit.input;
        if (auditInput != null) {
            QCloudXml.toXml(xmlSerializer, auditInput, ProtectedSandApp.s("䷇\u0001"));
        }
        PostAudioAudit.AudioAuditConf audioAuditConf = postAudioAudit.conf;
        if (audioAuditConf != null) {
            QCloudXml.toXml(xmlSerializer, audioAuditConf, ProtectedSandApp.s("䷈\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
