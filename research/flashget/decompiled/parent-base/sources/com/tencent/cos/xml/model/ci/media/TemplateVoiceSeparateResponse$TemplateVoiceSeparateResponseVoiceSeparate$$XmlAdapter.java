package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparate;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseVoiceSeparate$$XmlAdapter extends IXmlAdapter<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate> {
    private HashMap<String, ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate>> childElementBinders;

    public TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseVoiceSeparate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䡥\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseVoiceSeparate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate templateVoiceSeparateResponseVoiceSeparate, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponseVoiceSeparate.audioMode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡦\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$TemplateVoiceSeparateResponseVoiceSeparate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate templateVoiceSeparateResponseVoiceSeparate, String str) throws IOException, XmlPullParserException {
                templateVoiceSeparateResponseVoiceSeparate.audioConfig = (TemplateVoiceSeparate.AudioConfig) QCloudXml.fromXml(xmlPullParser, TemplateVoiceSeparate.AudioConfig.class, ProtectedSandApp.s("䡤\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate templateVoiceSeparateResponseVoiceSeparate = new TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseVoiceSeparate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateVoiceSeparateResponseVoiceSeparate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䡧\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateVoiceSeparateResponseVoiceSeparate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateVoiceSeparateResponseVoiceSeparate;
    }
}
