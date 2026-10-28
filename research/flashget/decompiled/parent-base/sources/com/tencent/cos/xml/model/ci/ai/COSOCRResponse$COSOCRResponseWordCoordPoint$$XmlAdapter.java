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
public class COSOCRResponse$COSOCRResponseWordCoordPoint$$XmlAdapter extends IXmlAdapter<COSOCRResponse.COSOCRResponseWordCoordPoint> {
    private HashMap<String, ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordPoint>> childElementBinders;

    public COSOCRResponse$COSOCRResponseWordCoordPoint$$XmlAdapter() {
        HashMap<String, ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordPoint>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㯶\u0001"), new ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordPoint>() { // from class: com.tencent.cos.xml.model.ci.ai.COSOCRResponse$COSOCRResponseWordCoordPoint$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, COSOCRResponse.COSOCRResponseWordCoordPoint cOSOCRResponseWordCoordPoint, String str) throws IOException, XmlPullParserException {
                cOSOCRResponseWordCoordPoint.wordCoordinate = (COSOCRResponse.COSOCRResponseWordCoordinate) QCloudXml.fromXml(xmlPullParser, COSOCRResponse.COSOCRResponseWordCoordinate.class, ProtectedSandApp.s("㯵\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public COSOCRResponse.COSOCRResponseWordCoordPoint fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        COSOCRResponse.COSOCRResponseWordCoordPoint cOSOCRResponseWordCoordPoint = new COSOCRResponse.COSOCRResponseWordCoordPoint();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<COSOCRResponse.COSOCRResponseWordCoordPoint> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, cOSOCRResponseWordCoordPoint, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㯷\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return cOSOCRResponseWordCoordPoint;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return cOSOCRResponseWordCoordPoint;
    }
}
