package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.COSOCRResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class COSOCRResponse$COSOCRResponseTextDetections$$XmlAdapter extends IXmlAdapter<COSOCRResponse.COSOCRResponseTextDetections> {
    private HashMap<String, ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections>> childElementBinders;

    public COSOCRResponse$COSOCRResponseTextDetections$$XmlAdapter() {
        HashMap<String, ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㯮\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseTextDetections$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseTextDetections cOSOCRResponseTextDetections, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                cOSOCRResponseTextDetections.detectedText = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯯\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseTextDetections$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseTextDetections cOSOCRResponseTextDetections, String str) throws IOException, XmlPullParserException {
                cOSOCRResponseTextDetections.confidence = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯰\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseTextDetections$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseTextDetections cOSOCRResponseTextDetections, String str) throws IOException, XmlPullParserException {
                if (cOSOCRResponseTextDetections.polygon == null) {
                    cOSOCRResponseTextDetections.polygon = new ArrayList();
                }
                cOSOCRResponseTextDetections.polygon.add((COSOCRResponse.COSOCRResponsePolygon) QCloudXml.fromXml(xmlPullParser, COSOCRResponse.COSOCRResponsePolygon.class, ProtectedSandApp.s("㯪\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯱\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseTextDetections$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseTextDetections cOSOCRResponseTextDetections, String str) throws IOException, XmlPullParserException {
                if (cOSOCRResponseTextDetections.itemPolygon == null) {
                    cOSOCRResponseTextDetections.itemPolygon = new ArrayList();
                }
                cOSOCRResponseTextDetections.itemPolygon.add((COSOCRResponse.COSOCRResponseItemPolygon) QCloudXml.fromXml(xmlPullParser, COSOCRResponse.COSOCRResponseItemPolygon.class, ProtectedSandApp.s("㯫\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯲\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseTextDetections$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseTextDetections cOSOCRResponseTextDetections, String str) throws IOException, XmlPullParserException {
                if (cOSOCRResponseTextDetections.words == null) {
                    cOSOCRResponseTextDetections.words = new ArrayList();
                }
                cOSOCRResponseTextDetections.words.add((COSOCRResponse.COSOCRResponseWords) QCloudXml.fromXml(xmlPullParser, COSOCRResponse.COSOCRResponseWords.class, ProtectedSandApp.s("㯬\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯳\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseTextDetections$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseTextDetections cOSOCRResponseTextDetections, String str) throws IOException, XmlPullParserException {
                if (cOSOCRResponseTextDetections.wordPolygon == null) {
                    cOSOCRResponseTextDetections.wordPolygon = new ArrayList();
                }
                cOSOCRResponseTextDetections.wordPolygon.add((COSOCRResponse.COSOCRResponseWordPolygon) QCloudXml.fromXml(xmlPullParser, COSOCRResponse.COSOCRResponseWordPolygon.class, ProtectedSandApp.s("㯭\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public COSOCRResponse.COSOCRResponseTextDetections fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        COSOCRResponse.COSOCRResponseTextDetections cOSOCRResponseTextDetections = new COSOCRResponse.COSOCRResponseTextDetections();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<COSOCRResponse.COSOCRResponseTextDetections> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, cOSOCRResponseTextDetections, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㯴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return cOSOCRResponseTextDetections;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return cOSOCRResponseTextDetections;
    }
}
