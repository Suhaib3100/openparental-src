package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.ci.audit.PostLiveVideoAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostLiveVideoAudit$PostLiveVideoAuditConf$$XmlAdapter extends IXmlAdapter<PostLiveVideoAudit.PostLiveVideoAuditConf> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostLiveVideoAudit.PostLiveVideoAuditConf postLiveVideoAuditConf, String str) throws IOException, XmlPullParserException {
        if (postLiveVideoAuditConf == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䆍\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postLiveVideoAuditConf.bizType != null) {
            String s4 = ProtectedSandApp.s("䆎\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postLiveVideoAuditConf.bizType, xmlSerializer, "", s4);
        }
        if (postLiveVideoAuditConf.callback != null) {
            String s5 = ProtectedSandApp.s("䆏\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postLiveVideoAuditConf.callback, xmlSerializer, "", s5);
        }
        String s6 = ProtectedSandApp.s("䆐\u0001");
        xmlSerializer.startTag("", s6);
        c.a(postLiveVideoAuditConf.callbackType, xmlSerializer, "", s6);
        xmlSerializer.endTag("", str);
    }
}
