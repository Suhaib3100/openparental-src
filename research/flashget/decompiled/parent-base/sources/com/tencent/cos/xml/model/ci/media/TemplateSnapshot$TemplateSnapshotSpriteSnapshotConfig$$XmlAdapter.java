package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateSnapshot;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter extends IXmlAdapter<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig> {
    private HashMap<String, ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>> childElementBinders;

    public TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䞑\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSpriteSnapshotConfig.cellWidth = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞒\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSpriteSnapshotConfig.cellHeight = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞓\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSpriteSnapshotConfig.padding = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞔\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSpriteSnapshotConfig.margin = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞕\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSpriteSnapshotConfig.color = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞖\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSpriteSnapshotConfig.columns = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞗\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSpriteSnapshotConfig.lines = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䞘\u0001"), new ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSnapshot$TemplateSnapshotSpriteSnapshotConfig$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSnapshotSpriteSnapshotConfig.scaleMethod = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig = new TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateSnapshotSpriteSnapshotConfig, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䞙\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateSnapshotSpriteSnapshotConfig;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateSnapshotSpriteSnapshotConfig;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateSnapshot.TemplateSnapshotSpriteSnapshotConfig templateSnapshotSpriteSnapshotConfig, String str) throws IOException, XmlPullParserException {
        if (templateSnapshotSpriteSnapshotConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䞙\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateSnapshotSpriteSnapshotConfig.cellWidth != null) {
            String s4 = ProtectedSandApp.s("䞑\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateSnapshotSpriteSnapshotConfig.cellWidth, xmlSerializer, "", s4);
        }
        if (templateSnapshotSpriteSnapshotConfig.cellHeight != null) {
            String s5 = ProtectedSandApp.s("䞒\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateSnapshotSpriteSnapshotConfig.cellHeight, xmlSerializer, "", s5);
        }
        if (templateSnapshotSpriteSnapshotConfig.padding != null) {
            String s6 = ProtectedSandApp.s("䞓\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateSnapshotSpriteSnapshotConfig.padding, xmlSerializer, "", s6);
        }
        if (templateSnapshotSpriteSnapshotConfig.margin != null) {
            String s7 = ProtectedSandApp.s("䞔\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateSnapshotSpriteSnapshotConfig.margin, xmlSerializer, "", s7);
        }
        if (templateSnapshotSpriteSnapshotConfig.color != null) {
            String s10 = ProtectedSandApp.s("䞕\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateSnapshotSpriteSnapshotConfig.color, xmlSerializer, "", s10);
        }
        if (templateSnapshotSpriteSnapshotConfig.columns != null) {
            String s11 = ProtectedSandApp.s("䞖\u0001");
            xmlSerializer.startTag("", s11);
            a.a(templateSnapshotSpriteSnapshotConfig.columns, xmlSerializer, "", s11);
        }
        if (templateSnapshotSpriteSnapshotConfig.lines != null) {
            String s12 = ProtectedSandApp.s("䞗\u0001");
            xmlSerializer.startTag("", s12);
            a.a(templateSnapshotSpriteSnapshotConfig.lines, xmlSerializer, "", s12);
        }
        if (templateSnapshotSpriteSnapshotConfig.scaleMethod != null) {
            String s13 = ProtectedSandApp.s("䞘\u0001");
            xmlSerializer.startTag("", s13);
            a.a(templateSnapshotSpriteSnapshotConfig.scaleMethod, xmlSerializer, "", s13);
        }
        xmlSerializer.endTag("", str);
    }
}
