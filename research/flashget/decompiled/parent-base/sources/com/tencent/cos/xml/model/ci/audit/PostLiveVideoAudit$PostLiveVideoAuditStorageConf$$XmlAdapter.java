package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.audit.PostLiveVideoAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostLiveVideoAudit$PostLiveVideoAuditStorageConf$$XmlAdapter extends IXmlAdapter<PostLiveVideoAudit.PostLiveVideoAuditStorageConf> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostLiveVideoAudit.PostLiveVideoAuditStorageConf postLiveVideoAuditStorageConf, String str) throws IOException, XmlPullParserException {
        if (postLiveVideoAuditStorageConf == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䆕\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postLiveVideoAuditStorageConf.path != null) {
            String s4 = ProtectedSandApp.s("䆖\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postLiveVideoAuditStorageConf.path, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
