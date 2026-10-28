package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class ImageAuditJobsDetail$$XmlAdapter extends IXmlAdapter<ImageAuditJobsDetail> {
    private HashMap<String, ChildElementBinder<ImageAuditJobsDetail>> childElementBinders;

    public ImageAuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ImageAuditJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䱁\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱂\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱃\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱄\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱅\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.compressionResult = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱆\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.pornInfo = (ImageAuditJobsDetail.ImagesAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo.class, ProtectedSandApp.s("䰽\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱇\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.terrorismInfo = (ImageAuditJobsDetail.ImagesAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo.class, ProtectedSandApp.s("䰾\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱈\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.politicsInfo = (ImageAuditJobsDetail.ImagesAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo.class, ProtectedSandApp.s("䰿\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱉\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.adsInfo = (ImageAuditJobsDetail.ImagesAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo.class, ProtectedSandApp.s("䱀\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱊\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.qualityInfo = (ImageAuditJobsDetail.ImagesAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo.class, ProtectedSandApp.s("䰺\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱋\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱌\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱍\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.result = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱎\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱏\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱐\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱑\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.userInfo = (AuditUserInfo) QCloudXml.fromXml(xmlPullParser, AuditUserInfo.class, ProtectedSandApp.s("䰻\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱒\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.listInfo = (AuditListInfo) QCloudXml.fromXml(xmlPullParser, AuditListInfo.class, ProtectedSandApp.s("䰼\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱓\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                imageAuditJobsDetail.forbidState = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱔\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.20
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱕\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.21
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱖\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.22
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱗\u0001"), new ChildElementBinder<ImageAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$$XmlAdapter.23
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail imageAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditJobsDetail.dataId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ImageAuditJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        ImageAuditJobsDetail imageAuditJobsDetail = new ImageAuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ImageAuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, imageAuditJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䱘\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return imageAuditJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return imageAuditJobsDetail;
    }
}
