package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.DetectLabelResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DetectLabelResponse$DetectLabelResponseLabelsItem$$XmlAdapter extends IXmlAdapter<DetectLabelResponse.DetectLabelResponseLabelsItem> {
    private HashMap<String, ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabelsItem>> childElementBinders;

    public DetectLabelResponse$DetectLabelResponseLabelsItem$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabelsItem>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㱃\u0001"), new ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabelsItem>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$DetectLabelResponseLabelsItem$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse.DetectLabelResponseLabelsItem detectLabelResponseLabelsItem, String str) throws IOException, XmlPullParserException {
                detectLabelResponseLabelsItem.confidence = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱄\u0001"), new ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabelsItem>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$DetectLabelResponseLabelsItem$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse.DetectLabelResponseLabelsItem detectLabelResponseLabelsItem, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                detectLabelResponseLabelsItem.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱅\u0001"), new ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabelsItem>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$DetectLabelResponseLabelsItem$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse.DetectLabelResponseLabelsItem detectLabelResponseLabelsItem, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                detectLabelResponseLabelsItem.firstCategory = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㱆\u0001"), new ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabelsItem>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$DetectLabelResponseLabelsItem$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse.DetectLabelResponseLabelsItem detectLabelResponseLabelsItem, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                detectLabelResponseLabelsItem.secondCategory = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DetectLabelResponse.DetectLabelResponseLabelsItem fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DetectLabelResponse.DetectLabelResponseLabelsItem detectLabelResponseLabelsItem = new DetectLabelResponse.DetectLabelResponseLabelsItem();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabelsItem> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, detectLabelResponseLabelsItem, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㱇\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return detectLabelResponseLabelsItem;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return detectLabelResponseLabelsItem;
    }
}
