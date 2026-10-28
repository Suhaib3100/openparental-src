package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.AuditListInfo;
import com.tencent.cos.xml.model.tag.audit.bean.AuditUserInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter extends IXmlAdapter<GetAudioAuditJobResponse.AudioAuditJobsDetail> {
    private HashMap<String, ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>> childElementBinders;

    public GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䲛\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲜\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲝\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.audioText = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲞\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                audioAuditJobsDetail.pornInfo = (GetAudioAuditJobResponse.AudioAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo.class, ProtectedSandApp.s("䲖\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲟\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                audioAuditJobsDetail.terrorismInfo = (GetAudioAuditJobResponse.AudioAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo.class, ProtectedSandApp.s("䲗\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲠\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                audioAuditJobsDetail.politicsInfo = (GetAudioAuditJobResponse.AudioAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo.class, ProtectedSandApp.s("䲘\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲡\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                audioAuditJobsDetail.adsInfo = (GetAudioAuditJobResponse.AudioAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, GetAudioAuditJobResponse.AudioAuditScenarioInfo.class, ProtectedSandApp.s("䲙\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲢\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                if (audioAuditJobsDetail.section == null) {
                    audioAuditJobsDetail.section = new ArrayList();
                }
                audioAuditJobsDetail.section.add((GetAudioAuditJobResponse.AudioSection) QCloudXml.fromXml(xmlPullParser, GetAudioAuditJobResponse.AudioSection.class, ProtectedSandApp.s("䲚\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲣\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲤\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲥\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲦\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲧\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲨\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲩\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲪\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲫\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲬\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                audioAuditJobsDetail.userInfo = (AuditUserInfo) QCloudXml.fromXml(xmlPullParser, AuditUserInfo.class, ProtectedSandApp.s("䲔\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲭\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                audioAuditJobsDetail.listInfo = (AuditListInfo) QCloudXml.fromXml(xmlPullParser, AuditListInfo.class, ProtectedSandApp.s("䲕\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲮\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.20
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                audioAuditJobsDetail.forbidState = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲯\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.21
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲰\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.22
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲱\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.23
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䲲\u0001"), new ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetAudioAuditJobResponse$AudioAuditJobsDetail$$XmlAdapter.24
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audioAuditJobsDetail.dataId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetAudioAuditJobResponse.AudioAuditJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetAudioAuditJobResponse.AudioAuditJobsDetail audioAuditJobsDetail = new GetAudioAuditJobResponse.AudioAuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetAudioAuditJobResponse.AudioAuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, audioAuditJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䲳\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return audioAuditJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return audioAuditJobsDetail;
    }
}
