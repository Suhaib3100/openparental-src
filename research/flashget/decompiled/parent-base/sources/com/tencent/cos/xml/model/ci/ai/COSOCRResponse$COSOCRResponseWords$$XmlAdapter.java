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
public class COSOCRResponse$COSOCRResponseWords$$XmlAdapter extends IXmlAdapter<COSOCRResponse.COSOCRResponseWords> {
    private HashMap<String, ChildElementBinder<COSOCRResponse.COSOCRResponseWords>> childElementBinders;

    public COSOCRResponse$COSOCRResponseWords$$XmlAdapter() {
        HashMap<String, ChildElementBinder<COSOCRResponse.COSOCRResponseWords>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㰅\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseWords>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseWords$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseWords cOSOCRResponseWords, String str) throws IOException, XmlPullParserException {
                cOSOCRResponseWords.confidence = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㰆\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseWords>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseWords$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseWords cOSOCRResponseWords, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                cOSOCRResponseWords.character = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㰇\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseWords>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseWords$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseWords cOSOCRResponseWords, String str) throws IOException, XmlPullParserException {
                cOSOCRResponseWords.wordCoordPoint = (COSOCRResponse.COSOCRResponseWordCoordPoint) QCloudXml.fromXml(xmlPullParser, COSOCRResponse.COSOCRResponseWordCoordPoint.class, ProtectedSandApp.s("㰄\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public COSOCRResponse.COSOCRResponseWords fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        COSOCRResponse.COSOCRResponseWords cOSOCRResponseWords = new COSOCRResponse.COSOCRResponseWords();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<COSOCRResponse.COSOCRResponseWords> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, cOSOCRResponseWords, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㰈\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return cOSOCRResponseWords;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return cOSOCRResponseWords;
    }
}
