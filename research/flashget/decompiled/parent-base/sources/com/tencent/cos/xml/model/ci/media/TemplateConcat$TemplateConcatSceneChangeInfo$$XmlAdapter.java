package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateConcat;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateConcat$TemplateConcatSceneChangeInfo$$XmlAdapter extends IXmlAdapter<TemplateConcat.TemplateConcatSceneChangeInfo> {
    private HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatSceneChangeInfo>> childElementBinders;

    public TemplateConcat$TemplateConcatSceneChangeInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatSceneChangeInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䜬\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatSceneChangeInfo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatSceneChangeInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatSceneChangeInfo templateConcatSceneChangeInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatSceneChangeInfo.mode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜭\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatSceneChangeInfo>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatSceneChangeInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatSceneChangeInfo templateConcatSceneChangeInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatSceneChangeInfo.time = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateConcat.TemplateConcatSceneChangeInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateConcat.TemplateConcatSceneChangeInfo templateConcatSceneChangeInfo = new TemplateConcat.TemplateConcatSceneChangeInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateConcat.TemplateConcatSceneChangeInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateConcatSceneChangeInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䜮\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateConcatSceneChangeInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateConcatSceneChangeInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateConcat.TemplateConcatSceneChangeInfo templateConcatSceneChangeInfo, String str) throws IOException, XmlPullParserException {
        if (templateConcatSceneChangeInfo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䜮\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateConcatSceneChangeInfo.mode != null) {
            String s4 = ProtectedSandApp.s("䜬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateConcatSceneChangeInfo.mode, xmlSerializer, "", s4);
        }
        if (templateConcatSceneChangeInfo.time != null) {
            String s5 = ProtectedSandApp.s("䜭\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateConcatSceneChangeInfo.time, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
