package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter extends IXmlAdapter<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo> {
    private HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>> childElementBinders;

    public GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䄥\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseSnapshotInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄦\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseSnapshotInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄧\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseSnapshotInfo.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄨\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseSnapshotInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄩\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseSnapshotInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄪\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo, String str) throws IOException, XmlPullParserException {
                if (getLiveVideoAuditResponseSnapshotInfo.ocrResults == null) {
                    getLiveVideoAuditResponseSnapshotInfo.ocrResults = new ArrayList();
                }
                getLiveVideoAuditResponseSnapshotInfo.ocrResults.add((GetLiveVideoAuditResponse.SnapshotInfoOcrResults) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResults.class, ProtectedSandApp.s("䄢\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄫\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo, String str) throws IOException, XmlPullParserException {
                if (getLiveVideoAuditResponseSnapshotInfo.libResults == null) {
                    getLiveVideoAuditResponseSnapshotInfo.libResults = new ArrayList();
                }
                getLiveVideoAuditResponseSnapshotInfo.libResults.add((GetLiveVideoAuditResponse.SnapshotInfoLibResults) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoLibResults.class, ProtectedSandApp.s("䄣\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄬\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseSnapshotInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo, String str) throws IOException, XmlPullParserException {
                if (getLiveVideoAuditResponseSnapshotInfo.objectResults == null) {
                    getLiveVideoAuditResponseSnapshotInfo.objectResults = new ArrayList();
                }
                getLiveVideoAuditResponseSnapshotInfo.objectResults.add((GetLiveVideoAuditResponse.SnapshotInfoObjectResults) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoObjectResults.class, ProtectedSandApp.s("䄤\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo getLiveVideoAuditResponseSnapshotInfo = new GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshotInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getLiveVideoAuditResponseSnapshotInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䄭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getLiveVideoAuditResponseSnapshotInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getLiveVideoAuditResponseSnapshotInfo;
    }
}
