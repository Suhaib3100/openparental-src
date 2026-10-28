package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
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
public class ImageAuditScenarioInfo$$XmlAdapter extends IXmlAdapter<ImageAuditScenarioInfo> {
    private HashMap<String, ChildElementBinder<ImageAuditScenarioInfo>> childElementBinders;

    public ImageAuditScenarioInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ImageAuditScenarioInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䱪\u0001"), new ChildElementBinder<ImageAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo imageAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                imageAuditScenarioInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱫\u0001"), new ChildElementBinder<ImageAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo imageAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                imageAuditScenarioInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱬\u0001"), new ChildElementBinder<ImageAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo imageAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditScenarioInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱭\u0001"), new ChildElementBinder<ImageAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo imageAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageAuditScenarioInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱮\u0001"), new ChildElementBinder<ImageAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo imageAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (imageAuditScenarioInfo.ocrResults == null) {
                    imageAuditScenarioInfo.ocrResults = new ArrayList();
                }
                imageAuditScenarioInfo.ocrResults.add((AuditOcrResults) QCloudXml.fromXml(xmlPullParser, AuditOcrResults.class, ProtectedSandApp.s("䱧\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱯\u0001"), new ChildElementBinder<ImageAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo imageAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (imageAuditScenarioInfo.objectResults == null) {
                    imageAuditScenarioInfo.objectResults = new ArrayList();
                }
                imageAuditScenarioInfo.objectResults.add((ImageAuditScenarioInfo.ObjectResults) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.ObjectResults.class, ProtectedSandApp.s("䱨\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱰\u0001"), new ChildElementBinder<ImageAuditScenarioInfo>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo imageAuditScenarioInfo, String str) throws IOException, XmlPullParserException {
                if (imageAuditScenarioInfo.libResults == null) {
                    imageAuditScenarioInfo.libResults = new ArrayList();
                }
                imageAuditScenarioInfo.libResults.add((ImageAuditScenarioInfo.LibResults) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.LibResults.class, ProtectedSandApp.s("䱩\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ImageAuditScenarioInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        ImageAuditScenarioInfo imageAuditScenarioInfo = new ImageAuditScenarioInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ImageAuditScenarioInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, imageAuditScenarioInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䱱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return imageAuditScenarioInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return imageAuditScenarioInfo;
    }
}
