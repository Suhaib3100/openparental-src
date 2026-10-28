package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateAnimation;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateAnimation$$XmlAdapter extends IXmlAdapter<TemplateAnimation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateAnimation templateAnimation, String str) throws IOException, XmlPullParserException {
        if (templateAnimation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䛓\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateAnimation.tag != null) {
            String s4 = ProtectedSandApp.s("䛔\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateAnimation.tag, xmlSerializer, "", s4);
        }
        if (templateAnimation.name != null) {
            String s5 = ProtectedSandApp.s("䛕\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templateAnimation.name, xmlSerializer, "", s5);
        }
        TemplateAnimation.TemplateAnimationContainer templateAnimationContainer = templateAnimation.container;
        if (templateAnimationContainer != null) {
            QCloudXml.toXml(xmlSerializer, templateAnimationContainer, ProtectedSandApp.s("䛖\u0001"));
        }
        TemplateAnimation.TemplateAnimationVideo templateAnimationVideo = templateAnimation.video;
        if (templateAnimationVideo != null) {
            QCloudXml.toXml(xmlSerializer, templateAnimationVideo, ProtectedSandApp.s("䛗\u0001"));
        }
        TemplateAnimation.TemplateAnimationTimeInterval templateAnimationTimeInterval = templateAnimation.timeInterval;
        if (templateAnimationTimeInterval != null) {
            QCloudXml.toXml(xmlSerializer, templateAnimationTimeInterval, ProtectedSandApp.s("䛘\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
