package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.TemplateVideoMontage;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplateVideoMontage$TemplateVideoMontageContainer$$XmlAdapter extends IXmlAdapter<TemplateVideoMontage.TemplateVideoMontageContainer> {
    private HashMap<String, ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageContainer>> childElementBinders;

    public TemplateVideoMontage$TemplateVideoMontageContainer$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageContainer>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䠟\u0001"), new ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageContainer>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVideoMontage$TemplateVideoMontageContainer$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVideoMontage.TemplateVideoMontageContainer templateVideoMontageContainer, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVideoMontageContainer.format = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVideoMontage.TemplateVideoMontageContainer fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVideoMontage.TemplateVideoMontageContainer templateVideoMontageContainer = new TemplateVideoMontage.TemplateVideoMontageContainer();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVideoMontage.TemplateVideoMontageContainer> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateVideoMontageContainer, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䠠\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateVideoMontageContainer;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateVideoMontageContainer;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplateVideoMontage.TemplateVideoMontageContainer templateVideoMontageContainer, String str) throws IOException, XmlPullParserException {
        if (templateVideoMontageContainer == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䠠\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templateVideoMontageContainer.format != null) {
            String s4 = ProtectedSandApp.s("䠟\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templateVideoMontageContainer.format, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
