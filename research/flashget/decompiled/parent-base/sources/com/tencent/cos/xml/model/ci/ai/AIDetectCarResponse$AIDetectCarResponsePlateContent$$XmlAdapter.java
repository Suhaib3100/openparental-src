package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AIDetectCarResponse$AIDetectCarResponsePlateContent$$XmlAdapter extends IXmlAdapter<AIDetectCarResponse.AIDetectCarResponsePlateContent> {
    private HashMap<String, ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateContent>> childElementBinders;

    public AIDetectCarResponse$AIDetectCarResponsePlateContent$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateContent>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬞\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateContent>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponsePlateContent$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponsePlateContent aIDetectCarResponsePlateContent, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectCarResponsePlateContent.plate = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬟\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateContent>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponsePlateContent$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponsePlateContent aIDetectCarResponsePlateContent, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectCarResponsePlateContent.color = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬠\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateContent>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponsePlateContent$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponsePlateContent aIDetectCarResponsePlateContent, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectCarResponsePlateContent.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬡\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateContent>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponsePlateContent$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponsePlateContent aIDetectCarResponsePlateContent, String str) throws IOException, XmlPullParserException {
                if (aIDetectCarResponsePlateContent.plateLocation == null) {
                    aIDetectCarResponsePlateContent.plateLocation = new ArrayList();
                }
                aIDetectCarResponsePlateContent.plateLocation.add((AIDetectCarResponse.AIDetectCarResponsePlateLocation) QCloudXml.fromXml(xmlPullParser, AIDetectCarResponse.AIDetectCarResponsePlateLocation.class, ProtectedSandApp.s("㬝\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectCarResponse.AIDetectCarResponsePlateContent fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectCarResponse.AIDetectCarResponsePlateContent aIDetectCarResponsePlateContent = new AIDetectCarResponse.AIDetectCarResponsePlateContent();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectCarResponse.AIDetectCarResponsePlateContent> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectCarResponsePlateContent, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬢\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectCarResponsePlateContent;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectCarResponsePlateContent;
    }
}
