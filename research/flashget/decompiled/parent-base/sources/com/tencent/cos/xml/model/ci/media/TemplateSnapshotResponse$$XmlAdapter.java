package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshot;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateSnapshotResponse$$XmlAdapter extends IXmlAdapter<TemplateSnapshotResponse> {
    private HashMap<String, ChildElementBinder<TemplateSnapshotResponse>> childElementBinders;

    public TemplateSnapshotResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateSnapshotResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䞡\u0001"), new ChildElementBinder<TemplateSnapshotResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshotResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshotResponse templateSnapshotResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotResponse.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞢\u0001"), new ChildElementBinder<TemplateSnapshotResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshotResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshotResponse templateSnapshotResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotResponse.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞣\u0001"), new ChildElementBinder<TemplateSnapshotResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshotResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshotResponse templateSnapshotResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotResponse.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞤\u0001"), new ChildElementBinder<TemplateSnapshotResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshotResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshotResponse templateSnapshotResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotResponse.updateTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞥\u0001"), new ChildElementBinder<TemplateSnapshotResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshotResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshotResponse templateSnapshotResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotResponse.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞦\u0001"), new ChildElementBinder<TemplateSnapshotResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshotResponse$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshotResponse templateSnapshotResponse, String str) throws IOException, XmlPullParserException {
                templateSnapshotResponse.snapshot = (TemplateSnapshot.TemplateSnapshotSnapshot) QCloudXml.fromXml(xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot.class, ProtectedSandApp.s("䞠\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateSnapshotResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateSnapshotResponse templateSnapshotResponse = new TemplateSnapshotResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateSnapshotResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateSnapshotResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䞧\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateSnapshotResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateSnapshotResponse;
    }
}
