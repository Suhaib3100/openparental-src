package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateVoiceSeparateResponse$$XmlAdapter extends IXmlAdapter<TemplateVoiceSeparateResponse> {
    private HashMap<String, ChildElementBinder<TemplateVoiceSeparateResponse>> childElementBinders;

    public TemplateVoiceSeparateResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateVoiceSeparateResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䡗\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse templateVoiceSeparateResponse, String str) throws IOException, XmlPullParserException {
                templateVoiceSeparateResponse.template = (TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate) QCloudXml.fromXml(xmlPullParser, TemplateVoiceSeparateResponse.TemplateVoiceSeparateResponseTemplate.class, ProtectedSandApp.s("䡖\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䡘\u0001"), new ChildElementBinder<TemplateVoiceSeparateResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateVoiceSeparateResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateVoiceSeparateResponse templateVoiceSeparateResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateVoiceSeparateResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateVoiceSeparateResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateVoiceSeparateResponse templateVoiceSeparateResponse = new TemplateVoiceSeparateResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateVoiceSeparateResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateVoiceSeparateResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䡙\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateVoiceSeparateResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateVoiceSeparateResponse;
    }
}
