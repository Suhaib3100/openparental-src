package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.DetectLabelResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DetectLabelResponse$DetectLabelResponseLabels$$XmlAdapter extends IXmlAdapter<DetectLabelResponse.DetectLabelResponseLabels> {
    private HashMap<String, ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabels>> childElementBinders;

    public DetectLabelResponse$DetectLabelResponseLabels$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabels>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㱂\u0001"), new ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabels>() { // from class: com.tencent.cos.xml.model.ci.ai.DetectLabelResponse$DetectLabelResponseLabels$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DetectLabelResponse.DetectLabelResponseLabels detectLabelResponseLabels, String str) throws IOException, XmlPullParserException {
                if (detectLabelResponseLabels.labels == null) {
                    detectLabelResponseLabels.labels = new ArrayList();
                }
                detectLabelResponseLabels.labels.add((DetectLabelResponse.DetectLabelResponseLabelsItem) QCloudXml.fromXml(xmlPullParser, DetectLabelResponse.DetectLabelResponseLabelsItem.class, ProtectedSandApp.s("㱁\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DetectLabelResponse.DetectLabelResponseLabels fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DetectLabelResponse.DetectLabelResponseLabels detectLabelResponseLabels = new DetectLabelResponse.DetectLabelResponseLabels();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DetectLabelResponse.DetectLabelResponseLabels> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, detectLabelResponseLabels, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㱂\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return detectLabelResponseLabels;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return detectLabelResponseLabels;
    }
}
