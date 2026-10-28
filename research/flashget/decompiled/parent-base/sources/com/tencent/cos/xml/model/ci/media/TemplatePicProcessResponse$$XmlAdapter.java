package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplatePicProcessResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplatePicProcessResponse$$XmlAdapter extends IXmlAdapter<TemplatePicProcessResponse> {
    private HashMap<String, ChildElementBinder<TemplatePicProcessResponse>> childElementBinders;

    public TemplatePicProcessResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplatePicProcessResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䝗\u0001"), new ChildElementBinder<TemplatePicProcessResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplatePicProcessResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplatePicProcessResponse templatePicProcessResponse, String str) throws IOException, XmlPullParserException {
                templatePicProcessResponse.template = (TemplatePicProcessResponse.TemplatePicProcessResponseTemplate) QCloudXml.fromXml(xmlPullParser, TemplatePicProcessResponse.TemplatePicProcessResponseTemplate.class, ProtectedSandApp.s("䝖\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䝘\u0001"), new ChildElementBinder<TemplatePicProcessResponse>() { // from class: com.tencent.cos.xml.model.ci.media.TemplatePicProcessResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplatePicProcessResponse templatePicProcessResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                templatePicProcessResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplatePicProcessResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplatePicProcessResponse templatePicProcessResponse = new TemplatePicProcessResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplatePicProcessResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, templatePicProcessResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䝙\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return templatePicProcessResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return templatePicProcessResponse;
    }
}
