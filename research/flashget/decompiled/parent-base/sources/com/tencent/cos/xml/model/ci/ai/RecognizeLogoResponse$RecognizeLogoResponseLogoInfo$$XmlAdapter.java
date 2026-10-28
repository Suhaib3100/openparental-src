package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.RecognizeLogoResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class RecognizeLogoResponse$RecognizeLogoResponseLogoInfo$$XmlAdapter extends IXmlAdapter<RecognizeLogoResponse.RecognizeLogoResponseLogoInfo> {
    private HashMap<String, ChildElementBinder<RecognizeLogoResponse.RecognizeLogoResponseLogoInfo>> childElementBinders;

    public RecognizeLogoResponse$RecognizeLogoResponseLogoInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognizeLogoResponse.RecognizeLogoResponseLogoInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㺫\u0001"), new ChildElementBinder<RecognizeLogoResponse.RecognizeLogoResponseLogoInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.RecognizeLogoResponse$RecognizeLogoResponseLogoInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognizeLogoResponse.RecognizeLogoResponseLogoInfo recognizeLogoResponseLogoInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognizeLogoResponseLogoInfo.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㺬\u0001"), new ChildElementBinder<RecognizeLogoResponse.RecognizeLogoResponseLogoInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.RecognizeLogoResponse$RecognizeLogoResponseLogoInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognizeLogoResponse.RecognizeLogoResponseLogoInfo recognizeLogoResponseLogoInfo, String str) throws IOException, XmlPullParserException {
                recognizeLogoResponseLogoInfo.score = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㺭\u0001"), new ChildElementBinder<RecognizeLogoResponse.RecognizeLogoResponseLogoInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.RecognizeLogoResponse$RecognizeLogoResponseLogoInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognizeLogoResponse.RecognizeLogoResponseLogoInfo recognizeLogoResponseLogoInfo, String str) throws IOException, XmlPullParserException {
                if (recognizeLogoResponseLogoInfo.location == null) {
                    recognizeLogoResponseLogoInfo.location = new ArrayList();
                }
                recognizeLogoResponseLogoInfo.location.add((RecognizeLogoResponse.RecognizeLogoResponseLocation) QCloudXml.fromXml(xmlPullParser, RecognizeLogoResponse.RecognizeLogoResponseLocation.class, ProtectedSandApp.s("㺪\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognizeLogoResponse.RecognizeLogoResponseLogoInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        RecognizeLogoResponse.RecognizeLogoResponseLogoInfo recognizeLogoResponseLogoInfo = new RecognizeLogoResponse.RecognizeLogoResponseLogoInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognizeLogoResponse.RecognizeLogoResponseLogoInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, recognizeLogoResponseLogoInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㺮\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return recognizeLogoResponseLogoInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return recognizeLogoResponseLogoInfo;
    }
}
