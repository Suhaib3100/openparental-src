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
public class PostLiveVideoAudit$PostLiveVideoAuditInput$$XmlAdapter extends IXmlAdapter<PostLiveVideoAudit.PostLiveVideoAuditInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostLiveVideoAudit.PostLiveVideoAuditInput postLiveVideoAuditInput, String str) throws IOException, XmlPullParserException {
        if (postLiveVideoAuditInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䆑\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postLiveVideoAuditInput.url != null) {
            String s4 = ProtectedSandApp.s("䆒\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postLiveVideoAuditInput.url, xmlSerializer, "", s4);
        }
        if (postLiveVideoAuditInput.dataId != null) {
            String s5 = ProtectedSandApp.s("䆓\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postLiveVideoAuditInput.dataId, xmlSerializer, "", s5);
        }
        PostLiveVideoAudit.PostLiveVideoAuditUserInfo postLiveVideoAuditUserInfo = postLiveVideoAuditInput.userInfo;
        if (postLiveVideoAuditUserInfo != null) {
            QCloudXml.toXml(xmlSerializer, postLiveVideoAuditUserInfo, ProtectedSandApp.s("䆔\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
