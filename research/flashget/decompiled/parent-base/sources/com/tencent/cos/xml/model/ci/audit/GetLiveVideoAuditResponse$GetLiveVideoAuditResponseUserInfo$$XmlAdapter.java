package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter extends IXmlAdapter<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo> {
    private HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>> childElementBinders;

    public GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䄮\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.tokenId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄯\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.nickname = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄰\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.deviceId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄱\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.appId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄲\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.room = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄳\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.iP = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄴\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄵\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.receiveTokenId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄶\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.gender = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄷\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.level = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄸\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseUserInfo$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseUserInfo.role = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo getLiveVideoAuditResponseUserInfo = new GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getLiveVideoAuditResponseUserInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䄹\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getLiveVideoAuditResponseUserInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getLiveVideoAuditResponseUserInfo;
    }
}
