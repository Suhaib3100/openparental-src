package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateAnimation;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateAnimation$TemplateAnimationTimeInterval$$XmlAdapter extends IXmlAdapter<TemplateAnimation.TemplateAnimationTimeInterval> {
    private HashMap<String, ChildElementBinder<TemplateAnimation.TemplateAnimationTimeInterval>> childElementBinders;

    public TemplateAnimation$TemplateAnimationTimeInterval$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateAnimation.TemplateAnimationTimeInterval>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䛛\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationTimeInterval>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationTimeInterval$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationTimeInterval templateAnimationTimeInterval, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationTimeInterval.start = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䛜\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationTimeInterval>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationTimeInterval$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationTimeInterval templateAnimationTimeInterval, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationTimeInterval.duration = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateAnimation.TemplateAnimationTimeInterval fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateAnimation.TemplateAnimationTimeInterval templateAnimationTimeInterval = new TemplateAnimation.TemplateAnimationTimeInterval();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateAnimation.TemplateAnimationTimeInterval> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateAnimationTimeInterval, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䛝\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateAnimationTimeInterval;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateAnimationTimeInterval;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateAnimation.TemplateAnimationTimeInterval templateAnimationTimeInterval, String str) throws IOException, XmlPullParserException {
        if (templateAnimationTimeInterval == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䛝\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateAnimationTimeInterval.start != null) {
            String s4 = ProtectedSandApp.s("䛛\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateAnimationTimeInterval.start, xmlSerializer, "", s4);
        }
        if (templateAnimationTimeInterval.duration != null) {
            String s5 = ProtectedSandApp.s("䛜\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateAnimationTimeInterval.duration, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
