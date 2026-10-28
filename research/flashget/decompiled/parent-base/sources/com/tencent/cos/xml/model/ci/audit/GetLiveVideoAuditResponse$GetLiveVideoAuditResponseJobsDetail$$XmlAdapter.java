package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse;
import com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter extends IXmlAdapter<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail> {
    private HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>> childElementBinders;

    public GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䄄\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄅\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄆\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.dataId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄇\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄈\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄉\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄊\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.snapshotCount = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄋\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄌\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseJobsDetail.result = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄍\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseJobsDetail.pornInfo = (GetLiveVideoAuditResponse.GetLiveVideoAuditResponseInfo) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseInfo.class, ProtectedSandApp.s("䃽\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄎\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseJobsDetail.adsInfo = (GetLiveVideoAuditResponse.GetLiveVideoAuditResponseInfo) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseInfo.class, ProtectedSandApp.s("䃾\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄏\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseJobsDetail.meaninglessInfo = (GetLiveVideoAuditResponse.GetLiveVideoAuditResponseInfo) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseInfo.class, ProtectedSandApp.s("䃿\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄐\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                if (getLiveVideoAuditResponseJobsDetail.snapshot == null) {
                    getLiveVideoAuditResponseJobsDetail.snapshot = new ArrayList();
                }
                getLiveVideoAuditResponseJobsDetail.snapshot.add((GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseSnapshot.class, ProtectedSandApp.s("䄀\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄑\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                if (getLiveVideoAuditResponseJobsDetail.audioSection == null) {
                    getLiveVideoAuditResponseJobsDetail.audioSection = new ArrayList();
                }
                getLiveVideoAuditResponseJobsDetail.audioSection.add((GetLiveVideoAuditResponse.GetLiveVideoAuditResponseAudioSection) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseAudioSection.class, ProtectedSandApp.s("䄁\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄒\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseJobsDetail.userInfo = (GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo) QCloudXml.fromXml(xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseUserInfo.class, ProtectedSandApp.s("䄂\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄓\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                getLiveVideoAuditResponseJobsDetail.listInfo = (AuditListInfo) QCloudXml.fromXml(xmlPullParser, AuditListInfo.class, ProtectedSandApp.s("䄃\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䄔\u0001"), new ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.audit.GetLiveVideoAuditResponse$GetLiveVideoAuditResponseJobsDetail$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getLiveVideoAuditResponseJobsDetail.type = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail getLiveVideoAuditResponseJobsDetail = new GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetLiveVideoAuditResponse.GetLiveVideoAuditResponseJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getLiveVideoAuditResponseJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䄕\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getLiveVideoAuditResponseJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getLiveVideoAuditResponseJobsDetail;
    }
}
