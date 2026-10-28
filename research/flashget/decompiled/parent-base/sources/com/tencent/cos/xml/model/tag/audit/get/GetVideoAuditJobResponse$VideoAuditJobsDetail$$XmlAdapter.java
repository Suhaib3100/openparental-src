package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo;
import com.tencent.cos.xml.model.tag.audit.bean.AuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse;
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
public class GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter extends IXmlAdapter<GetVideoAuditJobResponse.VideoAuditJobsDetail> {
    private HashMap<String, ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>> childElementBinders;

    public GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䴰\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴱\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴲\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.snapshotCount = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴳\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                videoAuditJobsDetail.pornInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䴪\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴴\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                videoAuditJobsDetail.terrorismInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䴫\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴵\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                videoAuditJobsDetail.politicsInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䴬\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴶\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                videoAuditJobsDetail.adsInfo = (AuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, AuditScenarioInfo.class, ProtectedSandApp.s("䴭\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴷\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                if (videoAuditJobsDetail.snapshot == null) {
                    videoAuditJobsDetail.snapshot = new ArrayList();
                }
                videoAuditJobsDetail.snapshot.add((GetVideoAuditJobResponse.Snapshot) QCloudXml.fromXml(xmlPullParser, GetVideoAuditJobResponse.Snapshot.class, ProtectedSandApp.s("䴮\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴸\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                if (videoAuditJobsDetail.audioSection == null) {
                    videoAuditJobsDetail.audioSection = new ArrayList();
                }
                videoAuditJobsDetail.audioSection.add((GetAudioAuditJobResponse.AudioSection) QCloudXml.fromXml(xmlPullParser, GetAudioAuditJobResponse.AudioSection.class, ProtectedSandApp.s("䴯\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴹\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴺\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴻\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴼\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴽\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴾\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䴿\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                videoAuditJobsDetail.userInfo = (AuditUserInfo) QCloudXml.fromXml(xmlPullParser, AuditUserInfo.class, ProtectedSandApp.s("䴨\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵀\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                videoAuditJobsDetail.listInfo = (AuditListInfo) QCloudXml.fromXml(xmlPullParser, AuditListInfo.class, ProtectedSandApp.s("䴩\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵁\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                videoAuditJobsDetail.forbidState = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵂\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵃\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.20
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵄\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.21
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵅\u0001"), new ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetVideoAuditJobResponse$VideoAuditJobsDetail$$XmlAdapter.22
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoAuditJobsDetail.dataId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetVideoAuditJobResponse.VideoAuditJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetVideoAuditJobResponse.VideoAuditJobsDetail videoAuditJobsDetail = new GetVideoAuditJobResponse.VideoAuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetVideoAuditJobResponse.VideoAuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, videoAuditJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䵆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return videoAuditJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return videoAuditJobsDetail;
    }
}
