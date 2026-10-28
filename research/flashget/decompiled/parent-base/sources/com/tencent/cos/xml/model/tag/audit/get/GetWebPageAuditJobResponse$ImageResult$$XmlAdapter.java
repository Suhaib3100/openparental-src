package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo;
import com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWebPageAuditJobResponse$ImageResult$$XmlAdapter extends IXmlAdapter<GetWebPageAuditJobResponse.ImageResult> {
    private HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>> childElementBinders;

    public GetWebPageAuditJobResponse$ImageResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䵏\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$ImageResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.ImageResult imageResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageResult.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵐\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$ImageResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.ImageResult imageResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageResult.text = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵑\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$ImageResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.ImageResult imageResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageResult.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵒\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$ImageResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.ImageResult imageResult, String str) throws IOException, XmlPullParserException {
                imageResult.suggestion = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵓\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$ImageResult$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.ImageResult imageResult, String str) throws IOException, XmlPullParserException {
                imageResult.pornInfo = (ImageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.class, ProtectedSandApp.s("䵋\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵔\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$ImageResult$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.ImageResult imageResult, String str) throws IOException, XmlPullParserException {
                imageResult.terrorismInfo = (ImageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.class, ProtectedSandApp.s("䵌\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵕\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$ImageResult$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.ImageResult imageResult, String str) throws IOException, XmlPullParserException {
                imageResult.politicsInfo = (ImageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.class, ProtectedSandApp.s("䵍\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䵖\u0001"), new ChildElementBinder<GetWebPageAuditJobResponse.ImageResult>() { // from class: com.tencent.cos.xml.model.tag.audit.get.GetWebPageAuditJobResponse$ImageResult$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWebPageAuditJobResponse.ImageResult imageResult, String str) throws IOException, XmlPullParserException {
                imageResult.adsInfo = (ImageAuditScenarioInfo) QCloudXml.fromXml(xmlPullParser, ImageAuditScenarioInfo.class, ProtectedSandApp.s("䵎\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWebPageAuditJobResponse.ImageResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWebPageAuditJobResponse.ImageResult imageResult = new GetWebPageAuditJobResponse.ImageResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWebPageAuditJobResponse.ImageResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, imageResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䵗\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return imageResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return imageResult;
    }
}
