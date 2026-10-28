package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditOcrResults;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter extends IXmlAdapter<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>> childElementBinders;

    public GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䴟\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                snapshotAuditScenarioInfo.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴠\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                snapshotAuditScenarioInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴡\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                snapshotAuditScenarioInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴢\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                snapshotAuditScenarioInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴣\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                snapshotAuditScenarioInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴤\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (snapshotAuditScenarioInfo.ocrResults == null) {
                    snapshotAuditScenarioInfo.ocrResults = new ArrayList();
                }
                snapshotAuditScenarioInfo.ocrResults.add((AuditOcrResults) QCloudXml.fromXml(xmlPullParser, AuditOcrResults.class, ProtectedSandApp.s("䴜\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴥\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (snapshotAuditScenarioInfo.objectResults == null) {
                    snapshotAuditScenarioInfo.objectResults = new ArrayList();
                }
                snapshotAuditScenarioInfo.objectResults.add((ImageAuditScenarioInfo.ObjectResults) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.ObjectResults.class, ProtectedSandApp.s("䴝\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴦\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$SnapshotAuditScenarioInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (snapshotAuditScenarioInfo.libResults == null) {
                    snapshotAuditScenarioInfo.libResults = new ArrayList();
                }
                snapshotAuditScenarioInfo.libResults.add((ImageAuditScenarioInfo.LibResults) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.LibResults.class, ProtectedSandApp.s("䴞\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetVideoAuditJobResponse.SnapshotAuditScenarioInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetVideoAuditJobResponse.SnapshotAuditScenarioInfo snapshotAuditScenarioInfo = new GetVideoAuditJobResponse.SnapshotAuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetVideoAuditJobResponse.SnapshotAuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, snapshotAuditScenarioInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䴧\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return snapshotAuditScenarioInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return snapshotAuditScenarioInfo;
    }
}
