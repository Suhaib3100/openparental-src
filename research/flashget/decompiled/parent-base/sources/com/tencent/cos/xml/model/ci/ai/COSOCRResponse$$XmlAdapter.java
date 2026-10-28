package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.COSOCRResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class COSOCRResponse$$XmlAdapter extends IXmlAdapter<COSOCRResponse> {
    private HashMap<String, ChildElementBinder<COSOCRResponse>> childElementBinders;

    public COSOCRResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<COSOCRResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㯜\u0001"), new ChildElementBinder<COSOCRResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse cOSOCRResponse, String str) throws IOException, XmlPullParserException {
                cOSOCRResponse.textDetections = (COSOCRResponse.COSOCRResponseTextDetections) QCloudXml.fromXml(xmlPullParser, COSOCRResponse.COSOCRResponseTextDetections.class, ProtectedSandApp.s("㯛\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯝\u0001"), new ChildElementBinder<COSOCRResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse cOSOCRResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                cOSOCRResponse.language = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯞\u0001"), new ChildElementBinder<COSOCRResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse cOSOCRResponse, String str) throws IOException, XmlPullParserException {
                cOSOCRResponse.angel = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯟\u0001"), new ChildElementBinder<COSOCRResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse cOSOCRResponse, String str) throws IOException, XmlPullParserException {
                cOSOCRResponse.pdfPageSize = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯠\u0001"), new ChildElementBinder<COSOCRResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse cOSOCRResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                cOSOCRResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public COSOCRResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        COSOCRResponse cOSOCRResponse = new COSOCRResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<COSOCRResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, cOSOCRResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㯡\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return cOSOCRResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return cOSOCRResponse;
    }
}
