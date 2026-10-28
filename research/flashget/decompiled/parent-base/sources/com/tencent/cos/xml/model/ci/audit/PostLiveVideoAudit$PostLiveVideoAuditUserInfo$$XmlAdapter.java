package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.audit.PostLiveVideoAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostLiveVideoAudit$PostLiveVideoAuditUserInfo$$XmlAdapter extends IXmlAdapter<PostLiveVideoAudit.PostLiveVideoAuditUserInfo> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostLiveVideoAudit.PostLiveVideoAuditUserInfo postLiveVideoAuditUserInfo, String str) throws IOException, XmlPullParserException {
        if (postLiveVideoAuditUserInfo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䆗\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postLiveVideoAuditUserInfo.tokenId != null) {
            String s4 = ProtectedSandApp.s("䆘\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postLiveVideoAuditUserInfo.tokenId, xmlSerializer, "", s4);
        }
        if (postLiveVideoAuditUserInfo.nickname != null) {
            String s5 = ProtectedSandApp.s("䆙\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postLiveVideoAuditUserInfo.nickname, xmlSerializer, "", s5);
        }
        if (postLiveVideoAuditUserInfo.deviceId != null) {
            String s6 = ProtectedSandApp.s("䆚\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postLiveVideoAuditUserInfo.deviceId, xmlSerializer, "", s6);
        }
        if (postLiveVideoAuditUserInfo.appId != null) {
            String s7 = ProtectedSandApp.s("䆛\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postLiveVideoAuditUserInfo.appId, xmlSerializer, "", s7);
        }
        if (postLiveVideoAuditUserInfo.room != null) {
            String s10 = ProtectedSandApp.s("䆜\u0001");
            xmlSerializer.startTag("", s10);
            a.a(postLiveVideoAuditUserInfo.room, xmlSerializer, "", s10);
        }
        if (postLiveVideoAuditUserInfo.iP != null) {
            String s11 = ProtectedSandApp.s("䆝\u0001");
            xmlSerializer.startTag("", s11);
            a.a(postLiveVideoAuditUserInfo.iP, xmlSerializer, "", s11);
        }
        if (postLiveVideoAuditUserInfo.type != null) {
            String s12 = ProtectedSandApp.s("䆞\u0001");
            xmlSerializer.startTag("", s12);
            a.a(postLiveVideoAuditUserInfo.type, xmlSerializer, "", s12);
        }
        if (postLiveVideoAuditUserInfo.receiveTokenId != null) {
            String s13 = ProtectedSandApp.s("䆟\u0001");
            xmlSerializer.startTag("", s13);
            a.a(postLiveVideoAuditUserInfo.receiveTokenId, xmlSerializer, "", s13);
        }
        if (postLiveVideoAuditUserInfo.gender != null) {
            String s14 = ProtectedSandApp.s("䆠\u0001");
            xmlSerializer.startTag("", s14);
            a.a(postLiveVideoAuditUserInfo.gender, xmlSerializer, "", s14);
        }
        if (postLiveVideoAuditUserInfo.level != null) {
            String s15 = ProtectedSandApp.s("䆡\u0001");
            xmlSerializer.startTag("", s15);
            a.a(postLiveVideoAuditUserInfo.level, xmlSerializer, "", s15);
        }
        if (postLiveVideoAuditUserInfo.role != null) {
            String s16 = ProtectedSandApp.s("䆢\u0001");
            xmlSerializer.startTag("", s16);
            a.a(postLiveVideoAuditUserInfo.role, xmlSerializer, "", s16);
        }
        xmlSerializer.endTag("", str);
    }
}
