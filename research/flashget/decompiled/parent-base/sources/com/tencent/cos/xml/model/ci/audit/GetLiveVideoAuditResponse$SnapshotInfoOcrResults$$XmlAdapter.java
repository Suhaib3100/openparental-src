package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
public class GetLiveVideoAuditResponse$SnapshotInfoOcrResults$$XmlAdapter extends IXmlAdapter<GetLiveVideoAuditResponse.SnapshotInfoOcrResults> {
    private HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResults>> childElementBinders;

    public GetLiveVideoAuditResponse$SnapshotInfoOcrResults$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResults>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䅃\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResults>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$SnapshotInfoOcrResults$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResults snapshotInfoOcrResults, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                snapshotInfoOcrResults.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅄\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResults>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$SnapshotInfoOcrResults$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResults snapshotInfoOcrResults, String str) throws IOException, XmlPullParserException {
                if (snapshotInfoOcrResults.keywords == null) {
                    snapshotInfoOcrResults.keywords = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        snapshotInfoOcrResults.keywords.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䅁\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅅\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResults>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$SnapshotInfoOcrResults$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResults snapshotInfoOcrResults, String str) throws IOException, XmlPullParserException {
                snapshotInfoOcrResults.location = (GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation.class, ProtectedSandApp.s("䅂\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetLiveVideoAuditResponse.SnapshotInfoOcrResults fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetLiveVideoAuditResponse.SnapshotInfoOcrResults snapshotInfoOcrResults = new GetLiveVideoAuditResponse.SnapshotInfoOcrResults();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResults> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, snapshotInfoOcrResults, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䅆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return snapshotInfoOcrResults;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return snapshotInfoOcrResults;
    }
}
