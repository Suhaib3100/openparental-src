package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.audit.PostLiveVideoAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostLiveVideoAudit$$XmlAdapter extends IXmlAdapter<PostLiveVideoAudit> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostLiveVideoAudit postLiveVideoAudit, String str) throws IOException, XmlPullParserException {
        if (postLiveVideoAudit == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䆈\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postLiveVideoAudit.type != null) {
            String s4 = ProtectedSandApp.s("䆉\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postLiveVideoAudit.type, xmlSerializer, "", s4);
        }
        PostLiveVideoAudit.PostLiveVideoAuditInput postLiveVideoAuditInput = postLiveVideoAudit.input;
        if (postLiveVideoAuditInput != null) {
            QCloudXml.toXml(xmlSerializer, postLiveVideoAuditInput, ProtectedSandApp.s("䆊\u0001"));
        }
        PostLiveVideoAudit.PostLiveVideoAuditConf postLiveVideoAuditConf = postLiveVideoAudit.conf;
        if (postLiveVideoAuditConf != null) {
            QCloudXml.toXml(xmlSerializer, postLiveVideoAuditConf, ProtectedSandApp.s("䆋\u0001"));
        }
        PostLiveVideoAudit.PostLiveVideoAuditStorageConf postLiveVideoAuditStorageConf = postLiveVideoAudit.storageConf;
        if (postLiveVideoAuditStorageConf != null) {
            QCloudXml.toXml(xmlSerializer, postLiveVideoAuditStorageConf, ProtectedSandApp.s("䆌\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
