package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AssessQualityResponse$$XmlAdapter extends IXmlAdapter<AssessQualityResponse> {
    private HashMap<String, ChildElementBinder<AssessQualityResponse>> childElementBinders;

    public AssessQualityResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AssessQualityResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㮼\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                assessQualityResponse.longImage = Boolean.parseBoolean(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮽\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                assessQualityResponse.blackAndWhite = Boolean.parseBoolean(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮾\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                assessQualityResponse.smallImage = Boolean.parseBoolean(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮿\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                assessQualityResponse.bigImage = Boolean.parseBoolean(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯀\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                assessQualityResponse.pureImage = Boolean.parseBoolean(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯁\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                assessQualityResponse.clarityScore = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯂\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                assessQualityResponse.aestheticScore = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯃\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                assessQualityResponse.lowQualityScore = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯄\u0001"), new ChildElementBinder<AssessQualityResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AssessQualityResponse$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AssessQualityResponse assessQualityResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                assessQualityResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AssessQualityResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AssessQualityResponse assessQualityResponse = new AssessQualityResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AssessQualityResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, assessQualityResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㯅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return assessQualityResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return assessQualityResponse;
    }
}
