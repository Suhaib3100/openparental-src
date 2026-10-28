package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateSmartCover;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateSmartCover$TemplateSmartCoverSmartCover$$XmlAdapter extends IXmlAdapter<TemplateSmartCover.TemplateSmartCoverSmartCover> {
    private HashMap<String, ChildElementBinder<TemplateSmartCover.TemplateSmartCoverSmartCover>> childElementBinders;

    public TemplateSmartCover$TemplateSmartCoverSmartCover$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateSmartCover.TemplateSmartCoverSmartCover>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䝨\u0001"), new ChildElementBinder<TemplateSmartCover.TemplateSmartCoverSmartCover>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCover$TemplateSmartCoverSmartCover$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverSmartCover.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝩\u0001"), new ChildElementBinder<TemplateSmartCover.TemplateSmartCoverSmartCover>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCover$TemplateSmartCoverSmartCover$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverSmartCover.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝪\u0001"), new ChildElementBinder<TemplateSmartCover.TemplateSmartCoverSmartCover>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCover$TemplateSmartCoverSmartCover$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverSmartCover.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝫\u0001"), new ChildElementBinder<TemplateSmartCover.TemplateSmartCoverSmartCover>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCover$TemplateSmartCoverSmartCover$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverSmartCover.count = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝬\u0001"), new ChildElementBinder<TemplateSmartCover.TemplateSmartCoverSmartCover>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateSmartCover$TemplateSmartCoverSmartCover$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateSmartCoverSmartCover.deleteDuplicates = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateSmartCover.TemplateSmartCoverSmartCover fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover = new TemplateSmartCover.TemplateSmartCoverSmartCover();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateSmartCover.TemplateSmartCoverSmartCover> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateSmartCoverSmartCover, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䝭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateSmartCoverSmartCover;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateSmartCoverSmartCover;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateSmartCover.TemplateSmartCoverSmartCover templateSmartCoverSmartCover, String str) throws IOException, XmlPullParserException {
        if (templateSmartCoverSmartCover == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䝭\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateSmartCoverSmartCover.format != null) {
            String s4 = ProtectedSandApp.s("䝨\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateSmartCoverSmartCover.format, xmlSerializer, "", s4);
        }
        if (templateSmartCoverSmartCover.width != null) {
            String s5 = ProtectedSandApp.s("䝩\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateSmartCoverSmartCover.width, xmlSerializer, "", s5);
        }
        if (templateSmartCoverSmartCover.height != null) {
            String s6 = ProtectedSandApp.s("䝪\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateSmartCoverSmartCover.height, xmlSerializer, "", s6);
        }
        if (templateSmartCoverSmartCover.count != null) {
            String s7 = ProtectedSandApp.s("䝫\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateSmartCoverSmartCover.count, xmlSerializer, "", s7);
        }
        if (templateSmartCoverSmartCover.deleteDuplicates != null) {
            String s10 = ProtectedSandApp.s("䝬\u0001");
            xmlSerializer.startTag("", s10);
            a.a(templateSmartCoverSmartCover.deleteDuplicates, xmlSerializer, "", s10);
        }
        xmlSerializer.endTag("", str);
    }
}
