package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshot;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter extends IXmlAdapter<TemplateSnapshot.TemplateSnapshotSnapshot> {
    private HashMap<String, ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>> childElementBinders;

    public TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䞃\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.mode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞄\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.start = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞅\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.timeInterval = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞆\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.count = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞇\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞈\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞉\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.cIParam = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞊\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.isCheckCount = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞋\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.isCheckBlack = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞌\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.blackLevel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞍\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.pixelBlackThreshold = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞎\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSnapshot.snapshotOutMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞏\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSnapshot$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
                templateSnapshotSnapshot.spriteSnapshotConfig = (TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig) QCloudXml.fromXml(xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig.class, ProtectedSandApp.s("䞂\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateSnapshot.TemplateSnapshotSnapshot fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot = new TemplateSnapshot.TemplateSnapshotSnapshot();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateSnapshot.TemplateSnapshotSnapshot> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateSnapshotSnapshot, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䞐\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateSnapshotSnapshot;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateSnapshotSnapshot;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateSnapshot.TemplateSnapshotSnapshot templateSnapshotSnapshot, String str) throws IOException, XmlPullParserException {
        if (templateSnapshotSnapshot == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䞐\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateSnapshotSnapshot.mode != null) {
            String s4 = ProtectedSandApp.s("䞃\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateSnapshotSnapshot.mode, xmlSerializer, "", s4);
        }
        if (templateSnapshotSnapshot.start != null) {
            String s5 = ProtectedSandApp.s("䞄\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateSnapshotSnapshot.start, xmlSerializer, "", s5);
        }
        if (templateSnapshotSnapshot.timeInterval != null) {
            String s6 = ProtectedSandApp.s("䞅\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateSnapshotSnapshot.timeInterval, xmlSerializer, "", s6);
        }
        if (templateSnapshotSnapshot.count != null) {
            String s7 = ProtectedSandApp.s("䞆\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateSnapshotSnapshot.count, xmlSerializer, "", s7);
        }
        if (templateSnapshotSnapshot.width != null) {
            String s10 = ProtectedSandApp.s("䞇\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateSnapshotSnapshot.width, xmlSerializer, "", s10);
        }
        if (templateSnapshotSnapshot.height != null) {
            String s11 = ProtectedSandApp.s("䞈\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateSnapshotSnapshot.height, xmlSerializer, "", s11);
        }
        if (templateSnapshotSnapshot.cIParam != null) {
            String s12 = ProtectedSandApp.s("䞉\u0001");
            xmlSerializer.startTag("", s12);
            a.a(templateSnapshotSnapshot.cIParam, xmlSerializer, "", s12);
        }
        if (templateSnapshotSnapshot.isCheckCount != null) {
            String s13 = ProtectedSandApp.s("䞊\u0001");
            xmlSerializer.startTag("", s13);
            a.a(templateSnapshotSnapshot.isCheckCount, xmlSerializer, "", s13);
        }
        if (templateSnapshotSnapshot.isCheckBlack != null) {
            String s14 = ProtectedSandApp.s("䞋\u0001");
            xmlSerializer.startTag("", s14);
            a.a(templateSnapshotSnapshot.isCheckBlack, xmlSerializer, "", s14);
        }
        if (templateSnapshotSnapshot.blackLevel != null) {
            String s15 = ProtectedSandApp.s("䞌\u0001");
            xmlSerializer.startTag("", s15);
            a.a(templateSnapshotSnapshot.blackLevel, xmlSerializer, "", s15);
        }
        if (templateSnapshotSnapshot.pixelBlackThreshold != null) {
            String s16 = ProtectedSandApp.s("䞍\u0001");
            xmlSerializer.startTag("", s16);
            a.a(templateSnapshotSnapshot.pixelBlackThreshold, xmlSerializer, "", s16);
        }
        if (templateSnapshotSnapshot.snapshotOutMode != null) {
            String s17 = ProtectedSandApp.s("䞎\u0001");
            xmlSerializer.startTag("", s17);
            a.a(templateSnapshotSnapshot.snapshotOutMode, xmlSerializer, "", s17);
        }
        TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig = templateSnapshotSnapshot.spriteSnapshotConfig;
        if (templateSnapshotSpriteSnapshotConfig != null) {
            QCloudXml.toXml(xmlSerializer, templateSnapshotSpriteSnapshotConfig, ProtectedSandApp.s("䞏\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
