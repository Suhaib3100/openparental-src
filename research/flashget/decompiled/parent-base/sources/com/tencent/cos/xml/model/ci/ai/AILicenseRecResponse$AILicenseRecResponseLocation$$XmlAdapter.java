package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AILicenseRecResponse$AILicenseRecResponseLocation$$XmlAdapter extends IXmlAdapter<AILicenseRecResponse.AILicenseRecResponseLocation> {
    private HashMap<String, ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseLocation>> childElementBinders;

    public AILicenseRecResponse$AILicenseRecResponseLocation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseLocation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㮤\u0001"), new ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseLocation>() { // from class: com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse$AILicenseRecResponseLocation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AILicenseRecResponse.AILicenseRecResponseLocation aILicenseRecResponseLocation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aILicenseRecResponseLocation.point = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AILicenseRecResponse.AILicenseRecResponseLocation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AILicenseRecResponse.AILicenseRecResponseLocation aILicenseRecResponseLocation = new AILicenseRecResponse.AILicenseRecResponseLocation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseLocation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aILicenseRecResponseLocation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㮥\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aILicenseRecResponseLocation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aILicenseRecResponseLocation;
    }
}
