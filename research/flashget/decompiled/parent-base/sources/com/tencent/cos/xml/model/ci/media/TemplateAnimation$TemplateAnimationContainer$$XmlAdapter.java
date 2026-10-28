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
public class TemplateAnimation$TemplateAnimationContainer$$XmlAdapter extends IXmlAdapter<TemplateAnimation.TemplateAnimationContainer> {
    private HashMap<String, ChildElementBinder<TemplateAnimation.TemplateAnimationContainer>> childElementBinders;

    public TemplateAnimation$TemplateAnimationContainer$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateAnimation.TemplateAnimationContainer>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䛙\u0001"), new ChildElementBinder<TemplateAnimation.TemplateAnimationContainer>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimation$TemplateAnimationContainer$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimation.TemplateAnimationContainer templateAnimationContainer, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateAnimationContainer.format = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateAnimation.TemplateAnimationContainer fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateAnimation.TemplateAnimationContainer templateAnimationContainer = new TemplateAnimation.TemplateAnimationContainer();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateAnimation.TemplateAnimationContainer> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateAnimationContainer, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䛚\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateAnimationContainer;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateAnimationContainer;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateAnimation.TemplateAnimationContainer templateAnimationContainer, String str) throws IOException, XmlPullParserException {
        if (templateAnimationContainer == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䛚\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateAnimationContainer.format != null) {
            String s4 = ProtectedSandApp.s("䛙\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateAnimationContainer.format, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
