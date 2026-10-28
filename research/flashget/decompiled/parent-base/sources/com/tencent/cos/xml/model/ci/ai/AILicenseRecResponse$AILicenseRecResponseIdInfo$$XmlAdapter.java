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
public class AILicenseRecResponse$AILicenseRecResponseIdInfo$$XmlAdapter extends IXmlAdapter<AILicenseRecResponse.AILicenseRecResponseIdInfo> {
    private HashMap<String, ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseIdInfo>> childElementBinders;

    public AILicenseRecResponse$AILicenseRecResponseIdInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseIdInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㮟\u0001"), new ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse$AILicenseRecResponseIdInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AILicenseRecResponse.AILicenseRecResponseIdInfo aILicenseRecResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aILicenseRecResponseIdInfo.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮠\u0001"), new ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse$AILicenseRecResponseIdInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AILicenseRecResponse.AILicenseRecResponseIdInfo aILicenseRecResponseIdInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aILicenseRecResponseIdInfo.detectedText = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮡\u0001"), new ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse$AILicenseRecResponseIdInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AILicenseRecResponse.AILicenseRecResponseIdInfo aILicenseRecResponseIdInfo, String str) throws IOException, XmlPullParserException {
                aILicenseRecResponseIdInfo.score = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㮢\u0001"), new ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseIdInfo>() { // from class: com.tencent.cos.xml.model.ci.ai.AILicenseRecResponse$AILicenseRecResponseIdInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AILicenseRecResponse.AILicenseRecResponseIdInfo aILicenseRecResponseIdInfo, String str) throws IOException, XmlPullParserException {
                if (aILicenseRecResponseIdInfo.location == null) {
                    aILicenseRecResponseIdInfo.location = new ArrayList();
                }
                aILicenseRecResponseIdInfo.location.add((AILicenseRecResponse.AILicenseRecResponseLocation) QCloudXml.fromXml(xmlPullParser, AILicenseRecResponse.AILicenseRecResponseLocation.class, ProtectedSandApp.s("㮞\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AILicenseRecResponse.AILicenseRecResponseIdInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AILicenseRecResponse.AILicenseRecResponseIdInfo aILicenseRecResponseIdInfo = new AILicenseRecResponse.AILicenseRecResponseIdInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AILicenseRecResponse.AILicenseRecResponseIdInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aILicenseRecResponseIdInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㮣\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aILicenseRecResponseIdInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aILicenseRecResponseIdInfo;
    }
}
