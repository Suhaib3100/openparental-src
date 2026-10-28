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
public class AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter extends IXmlAdapter<AIDetectCarResponse.AIDetectCarResponseCarTags> {
    private HashMap<String, ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>> childElementBinders;

    public AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㬔\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectCarResponseCarTags.serial = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬕\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectCarResponseCarTags.brand = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬖\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectCarResponseCarTags.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬗\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                aIDetectCarResponseCarTags.color = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬘\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags, String str) throws IOException, XmlPullParserException {
                aIDetectCarResponseCarTags.confidence = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬙\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags, String str) throws IOException, XmlPullParserException {
                aIDetectCarResponseCarTags.year = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬚\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags, String str) throws IOException, XmlPullParserException {
                if (aIDetectCarResponseCarTags.carLocation == null) {
                    aIDetectCarResponseCarTags.carLocation = new ArrayList();
                }
                aIDetectCarResponseCarTags.carLocation.add((AIDetectCarResponse.AIDetectCarResponseCarLocation) QCloudXml.fromXml(xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarLocation.class, ProtectedSandApp.s("㬒\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㬛\u0001"), new ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags>() { // from class: com.tencent.cos.xml.model.ci.ai.AIDetectCarResponse$AIDetectCarResponseCarTags$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags, String str) throws IOException, XmlPullParserException {
                if (aIDetectCarResponseCarTags.plateContent == null) {
                    aIDetectCarResponseCarTags.plateContent = new ArrayList();
                }
                aIDetectCarResponseCarTags.plateContent.add((AIDetectCarResponse.AIDetectCarResponsePlateContent) QCloudXml.fromXml(xmlPullParser, AIDetectCarResponse.AIDetectCarResponsePlateContent.class, ProtectedSandApp.s("㬓\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AIDetectCarResponse.AIDetectCarResponseCarTags fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AIDetectCarResponse.AIDetectCarResponseCarTags aIDetectCarResponseCarTags = new AIDetectCarResponse.AIDetectCarResponseCarTags();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AIDetectCarResponse.AIDetectCarResponseCarTags> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, aIDetectCarResponseCarTags, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㬜\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return aIDetectCarResponseCarTags;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return aIDetectCarResponseCarTags;
    }
}
