package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter extends IXmlAdapter<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot> {
    private HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>> childElementBinders;

    public GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䄙\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseSnapshot.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄚\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseSnapshot.snapshotTime = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄛\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseSnapshot.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄜\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseSnapshot.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄝\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseSnapshot.result = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄞\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseSnapshot.pornInfo = (GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo.class, ProtectedSandApp.s("䄖\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄟\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseSnapshot.adsInfo = (GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo.class, ProtectedSandApp.s("䄗\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄠\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshot$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseSnapshot.meaninglessInfo = (GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo.class, ProtectedSandApp.s("䄘\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot getLiveVideoAuditResponseSnapshot = new GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getLiveVideoAuditResponseSnapshot, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䄡\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getLiveVideoAuditResponseSnapshot;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getLiveVideoAuditResponseSnapshot;
    }
}
