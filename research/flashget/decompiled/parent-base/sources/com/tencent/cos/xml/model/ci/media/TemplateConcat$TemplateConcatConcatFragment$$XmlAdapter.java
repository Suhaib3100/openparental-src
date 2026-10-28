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
public class TemplateConcat$TemplateConcatConcatFragment$$XmlAdapter extends IXmlAdapter<TemplateConcat.TemplateConcatConcatFragment> {
    private HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatConcatFragment>> childElementBinders;

    public TemplateConcat$TemplateConcatConcatFragment$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateConcat.TemplateConcatConcatFragment>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䜕\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatFragment>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatFragment$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatFragment templateConcatConcatFragment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatConcatFragment.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜖\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatFragment>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatFragment$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatFragment templateConcatConcatFragment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatConcatFragment.mode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜗\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatFragment>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatFragment$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatFragment templateConcatConcatFragment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatConcatFragment.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜘\u0001"), new ChildElementBinder<TemplateConcat.TemplateConcatConcatFragment>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcat$TemplateConcatConcatFragment$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcat.TemplateConcatConcatFragment templateConcatConcatFragment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatConcatFragment.endTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateConcat.TemplateConcatConcatFragment fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateConcat.TemplateConcatConcatFragment templateConcatConcatFragment = new TemplateConcat.TemplateConcatConcatFragment();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateConcat.TemplateConcatConcatFragment> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateConcatConcatFragment, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䜙\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateConcatConcatFragment;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateConcatConcatFragment;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateConcat.TemplateConcatConcatFragment templateConcatConcatFragment, String str) throws IOException, XmlPullParserException {
        if (templateConcatConcatFragment == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䜙\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateConcatConcatFragment.url != null) {
            String s4 = ProtectedSandApp.s("䜕\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateConcatConcatFragment.url, xmlSerializer, "", s4);
        }
        if (templateConcatConcatFragment.mode != null) {
            String s5 = ProtectedSandApp.s("䜖\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateConcatConcatFragment.mode, xmlSerializer, "", s5);
        }
        if (templateConcatConcatFragment.startTime != null) {
            String s6 = ProtectedSandApp.s("䜗\u0001");
            xmlSerializer.startTag("", s6);
            a.a(templateConcatConcatFragment.startTime, xmlSerializer, "", s6);
        }
        if (templateConcatConcatFragment.endTime != null) {
            String s7 = ProtectedSandApp.s("䜘\u0001");
            xmlSerializer.startTag("", s7);
            a.a(templateConcatConcatFragment.endTime, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
