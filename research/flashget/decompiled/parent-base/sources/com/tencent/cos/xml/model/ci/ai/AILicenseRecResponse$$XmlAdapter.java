package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AILicenseRecResponse$$XmlAdapter extends IXmlAdapter<AILicenseRecResponse> {
    private HashMap<String, ChildElementBinder<AILicenseRecResponse>> childElementBinders;

    public AILicenseRecResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AILicenseRecResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㮛\u0001"), new ChildElementBinder<AILicenseRecResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AILicenseRecResponse aILicenseRecResponse, String str) throws IOException, XmlPullParserException {
                aILicenseRecResponse.status = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮜\u0001"), new ChildElementBinder<AILicenseRecResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AILicenseRecResponse aILicenseRecResponse, String str) throws IOException, XmlPullParserException {
                if (aILicenseRecResponse.idInfo == null) {
                    aILicenseRecResponse.idInfo = new ArrayList();
                }
                aILicenseRecResponse.idInfo.add((AILicenseRecResponse.AILicenseRecResponseIdInfo) QCloudXml.fromXml(xmlPullParser, AILicenseRecResponse.AILicenseRecResponseIdInfo.class, ProtectedSandApp.s("㮚\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AILicenseRecResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AILicenseRecResponse aILicenseRecResponse = new AILicenseRecResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AILicenseRecResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aILicenseRecResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㮝\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aILicenseRecResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aILicenseRecResponse;
    }
}
