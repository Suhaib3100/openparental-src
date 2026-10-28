package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.DetectLabelResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DetectLabelResponse$$XmlAdapter extends IXmlAdapter<DetectLabelResponse> {
    private HashMap<String, ChildElementBinder<DetectLabelResponse>> childElementBinders;

    public DetectLabelResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DetectLabelResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㰼\u0001"), new ChildElementBinder<DetectLabelResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse detectLabelResponse, String str) throws IOException, XmlPullParserException {
                detectLabelResponse.webLabels = (DetectLabelResponse.DetectLabelResponseLabels) QCloudXml.fromXml(xmlPullParser, DetectLabelResponse.DetectLabelResponseLabels.class, ProtectedSandApp.s("㰸\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㰽\u0001"), new ChildElementBinder<DetectLabelResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse detectLabelResponse, String str) throws IOException, XmlPullParserException {
                detectLabelResponse.cameraLabels = (DetectLabelResponse.DetectLabelResponseLabels) QCloudXml.fromXml(xmlPullParser, DetectLabelResponse.DetectLabelResponseLabels.class, ProtectedSandApp.s("㰹\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㰾\u0001"), new ChildElementBinder<DetectLabelResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse detectLabelResponse, String str) throws IOException, XmlPullParserException {
                detectLabelResponse.albumLabels = (DetectLabelResponse.DetectLabelResponseLabels) QCloudXml.fromXml(xmlPullParser, DetectLabelResponse.DetectLabelResponseLabels.class, ProtectedSandApp.s("㰺\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㰿\u0001"), new ChildElementBinder<DetectLabelResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse detectLabelResponse, String str) throws IOException, XmlPullParserException {
                detectLabelResponse.newsLabels = (DetectLabelResponse.DetectLabelResponseLabels) QCloudXml.fromXml(xmlPullParser, DetectLabelResponse.DetectLabelResponseLabels.class, ProtectedSandApp.s("㰻\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DetectLabelResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DetectLabelResponse detectLabelResponse = new DetectLabelResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DetectLabelResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, detectLabelResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㱀\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return detectLabelResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return detectLabelResponse;
    }
}
