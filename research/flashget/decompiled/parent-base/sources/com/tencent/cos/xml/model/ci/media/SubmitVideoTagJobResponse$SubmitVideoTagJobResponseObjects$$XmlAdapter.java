package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.b;
import com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitVideoTagJobResponse$SubmitVideoTagJobResponseObjects$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects> {
    private HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects>> childElementBinders;

    public SubmitVideoTagJobResponse$SubmitVideoTagJobResponseObjects$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䙮\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseObjects$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects submitVideoTagJobResponseObjects, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseObjects.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙯\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseObjects$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects submitVideoTagJobResponseObjects, String str) throws IOException, XmlPullParserException {
                submitVideoTagJobResponseObjects.confidence = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙰\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseObjects$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects submitVideoTagJobResponseObjects, String str) throws IOException, XmlPullParserException {
                if (submitVideoTagJobResponseObjects.bBox == null) {
                    submitVideoTagJobResponseObjects.bBox = new ArrayList();
                }
                submitVideoTagJobResponseObjects.bBox.add((SubmitVideoTagJobResponse.SubmitVideoTagJobResponseBBox) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseBBox.class, ProtectedSandApp.s("䙭\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects submitVideoTagJobResponseObjects = new SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjects> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoTagJobResponseObjects, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䙱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoTagJobResponseObjects;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoTagJobResponseObjects;
    }
}
