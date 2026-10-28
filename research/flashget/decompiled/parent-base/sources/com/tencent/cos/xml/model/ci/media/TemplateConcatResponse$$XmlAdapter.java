package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateConcatResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateConcatResponse$$XmlAdapter extends IXmlAdapter<TemplateConcatResponse> {
    private HashMap<String, ChildElementBinder<TemplateConcatResponse>> childElementBinders;

    public TemplateConcatResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateConcatResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䜿\u0001"), new ChildElementBinder<TemplateConcatResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse templateConcatResponse, String str) throws IOException, XmlPullParserException {
                templateConcatResponse.template = (TemplateConcatResponse.TemplateConcatResponseTemplate) QCloudXml.fromXml(xmlPullParser, TemplateConcatResponse.TemplateConcatResponseTemplate.class, ProtectedSandApp.s("䜾\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝀\u0001"), new ChildElementBinder<TemplateConcatResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateConcatResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateConcatResponse templateConcatResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templateConcatResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateConcatResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateConcatResponse templateConcatResponse = new TemplateConcatResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateConcatResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templateConcatResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䝁\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templateConcatResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templateConcatResponse;
    }
}
