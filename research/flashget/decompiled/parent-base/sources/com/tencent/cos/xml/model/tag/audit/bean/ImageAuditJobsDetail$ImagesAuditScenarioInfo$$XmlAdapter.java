package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter extends IXmlAdapter<ImageAuditJobsDetail.ImagesAuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>> childElementBinders;

    public ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䱜\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                imagesAuditScenarioInfo.code = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱝\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imagesAuditScenarioInfo.msg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱞\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imagesAuditScenarioInfo.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱟\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                imagesAuditScenarioInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱠\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                imagesAuditScenarioInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱡\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imagesAuditScenarioInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱢\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imagesAuditScenarioInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱣\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (imagesAuditScenarioInfo.ocrResults == null) {
                    imagesAuditScenarioInfo.ocrResults = new ArrayList();
                }
                imagesAuditScenarioInfo.ocrResults.add((AuditOcrResults) QCloudXml.fromXml(xmlPullParser, AuditOcrResults.class, ProtectedSandApp.s("䱚\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱤\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (imagesAuditScenarioInfo.objectResults == null) {
                    imagesAuditScenarioInfo.objectResults = new ArrayList();
                }
                imagesAuditScenarioInfo.objectResults.add((ImageAuditScenarioInfo.ObjectResults) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.ObjectResults.class, ProtectedSandApp.s("䱛\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱥\u0001"), new ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditJobsDetail$ImagesAuditScenarioInfo$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (imagesAuditScenarioInfo.libResults == null) {
                    imagesAuditScenarioInfo.libResults = new ArrayList();
                }
                imagesAuditScenarioInfo.libResults.add((ImageAuditScenarioInfo.LibResults) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.LibResults.class, ProtectedSandApp.s("䱙\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ImageAuditJobsDetail.ImagesAuditScenarioInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        ImageAuditJobsDetail.ImagesAuditScenarioInfo imagesAuditScenarioInfo = new ImageAuditJobsDetail.ImagesAuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ImageAuditJobsDetail.ImagesAuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, imagesAuditScenarioInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䱦\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return imagesAuditScenarioInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return imagesAuditScenarioInfo;
    }
}
