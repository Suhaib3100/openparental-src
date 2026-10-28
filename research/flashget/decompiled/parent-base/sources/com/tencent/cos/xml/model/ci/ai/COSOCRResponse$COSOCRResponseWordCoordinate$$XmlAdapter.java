package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.COSOCRResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class COSOCRResponse$COSOCRResponseWordCoordinate$$XmlAdapter extends IXmlAdapter<COSOCRResponse.COSOCRResponseWordCoordinate> {
    private HashMap<String, ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordinate>> childElementBinders;

    public COSOCRResponse$COSOCRResponseWordCoordinate$$XmlAdapter() {
        HashMap<String, ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordinate>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㯸\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordinate>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseWordCoordinate$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseWordCoordinate cOSOCRResponseWordCoordinate, String str) throws IOException, XmlPullParserException {
                cOSOCRResponseWordCoordinate.f71711x = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㯹\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordinate>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseWordCoordinate$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseWordCoordinate cOSOCRResponseWordCoordinate, String str) throws IOException, XmlPullParserException {
                cOSOCRResponseWordCoordinate.f71712y = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public COSOCRResponse.COSOCRResponseWordCoordinate fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        COSOCRResponse.COSOCRResponseWordCoordinate cOSOCRResponseWordCoordinate = new COSOCRResponse.COSOCRResponseWordCoordinate();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordinate> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, cOSOCRResponseWordCoordinate, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㯺\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return cOSOCRResponseWordCoordinate;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return cOSOCRResponseWordCoordinate;
    }
}
