package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.b;
import com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetLiveVideoAuditResponse$SnapshotInfoOcrResultsLocation$$XmlAdapter extends IXmlAdapter<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation> {
    private HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation>> childElementBinders;

    public GetLiveVideoAuditResponse$SnapshotInfoOcrResultsLocation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䅇\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$SnapshotInfoOcrResultsLocation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation snapshotInfoOcrResultsLocation, String str) throws IOException, XmlPullParserException {
                snapshotInfoOcrResultsLocation.f71715x = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅈\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$SnapshotInfoOcrResultsLocation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation snapshotInfoOcrResultsLocation, String str) throws IOException, XmlPullParserException {
                snapshotInfoOcrResultsLocation.f71716y = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅉\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$SnapshotInfoOcrResultsLocation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation snapshotInfoOcrResultsLocation, String str) throws IOException, XmlPullParserException {
                snapshotInfoOcrResultsLocation.height = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅊\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$SnapshotInfoOcrResultsLocation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation snapshotInfoOcrResultsLocation, String str) throws IOException, XmlPullParserException {
                snapshotInfoOcrResultsLocation.width = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅋\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$SnapshotInfoOcrResultsLocation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation snapshotInfoOcrResultsLocation, String str) throws IOException, XmlPullParserException {
                snapshotInfoOcrResultsLocation.rotate = b.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation snapshotInfoOcrResultsLocation = new GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetLiveVideoAuditResponse.SnapshotInfoOcrResultsLocation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, snapshotInfoOcrResultsLocation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䅌\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return snapshotInfoOcrResultsLocation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return snapshotInfoOcrResultsLocation;
    }
}
