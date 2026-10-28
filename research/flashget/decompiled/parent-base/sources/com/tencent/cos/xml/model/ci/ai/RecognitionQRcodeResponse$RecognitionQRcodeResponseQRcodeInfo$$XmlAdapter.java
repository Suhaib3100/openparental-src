package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.RecognitionQRcodeResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class RecognitionQRcodeResponse$RecognitionQRcodeResponseQRcodeInfo$$XmlAdapter extends IXmlAdapter<RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo> {
    private HashMap<String, ChildElementBinder<RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo>> childElementBinders;

    public RecognitionQRcodeResponse$RecognitionQRcodeResponseQRcodeInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㺜\u0001"), new ChildElementBinder<RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.RecognitionQRcodeResponse$RecognitionQRcodeResponseQRcodeInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo recognitionQRcodeResponseQRcodeInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                recognitionQRcodeResponseQRcodeInfo.codeUrl = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㺝\u0001"), new ChildElementBinder<RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.RecognitionQRcodeResponse$RecognitionQRcodeResponseQRcodeInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo recognitionQRcodeResponseQRcodeInfo, String str) throws IOException, XmlPullParserException {
                if (recognitionQRcodeResponseQRcodeInfo.codeLocation == null) {
                    recognitionQRcodeResponseQRcodeInfo.codeLocation = new ArrayList();
                }
                recognitionQRcodeResponseQRcodeInfo.codeLocation.add((RecognitionQRcodeResponse.RecognitionQRcodeResponseCodeLocation) QCloudXml.fromXml(xmlPullParser, RecognitionQRcodeResponse.RecognitionQRcodeResponseCodeLocation.class, ProtectedSandApp.s("㺛\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo recognitionQRcodeResponseQRcodeInfo = new RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionQRcodeResponse.RecognitionQRcodeResponseQRcodeInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, recognitionQRcodeResponseQRcodeInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㺞\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return recognitionQRcodeResponseQRcodeInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return recognitionQRcodeResponseQRcodeInfo;
    }
}
