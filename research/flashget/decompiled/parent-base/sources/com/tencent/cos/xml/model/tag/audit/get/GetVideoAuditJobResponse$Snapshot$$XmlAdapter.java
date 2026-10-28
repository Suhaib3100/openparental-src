package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetVideoAuditJobResponse$Snapshot$$XmlAdapter extends IXmlAdapter<GetVideoAuditJobResponse.Snapshot> {
    private HashMap<String, ChildElementBinder<GetVideoAuditJobResponse.Snapshot>> childElementBinders;

    public GetVideoAuditJobResponse$Snapshot$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetVideoAuditJobResponse.Snapshot>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䴔\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$Snapshot$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.Snapshot snapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                snapshot.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴕\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$Snapshot$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.Snapshot snapshot, String str) throws IOException, XmlPullParserException {
                snapshot.snapshotTime = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴖\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$Snapshot$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.Snapshot snapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                snapshot.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴗\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$Snapshot$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.Snapshot snapshot, String str) throws IOException, XmlPullParserException {
                snapshot.pornInfo = (GetVideoAuditJobResponse.SnapshotAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo.class, ProtectedSandApp.s("䴐\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴘\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$Snapshot$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.Snapshot snapshot, String str) throws IOException, XmlPullParserException {
                snapshot.terrorismInfo = (GetVideoAuditJobResponse.SnapshotAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo.class, ProtectedSandApp.s("䴑\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴙\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$Snapshot$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.Snapshot snapshot, String str) throws IOException, XmlPullParserException {
                snapshot.politicsInfo = (GetVideoAuditJobResponse.SnapshotAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo.class, ProtectedSandApp.s("䴒\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴚\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.Snapshot>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$Snapshot$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.Snapshot snapshot, String str) throws IOException, XmlPullParserException {
                snapshot.adsInfo = (GetVideoAuditJobResponse.SnapshotAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo.class, ProtectedSandApp.s("䴓\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetVideoAuditJobResponse.Snapshot fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetVideoAuditJobResponse.Snapshot snapshot = new GetVideoAuditJobResponse.Snapshot();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetVideoAuditJobResponse.Snapshot> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, snapshot, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䴛\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return snapshot;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return snapshot;
    }
}
