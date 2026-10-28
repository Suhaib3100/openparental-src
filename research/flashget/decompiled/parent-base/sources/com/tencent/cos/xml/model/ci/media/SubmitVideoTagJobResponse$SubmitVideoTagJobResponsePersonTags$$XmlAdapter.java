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
public class SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePersonTags$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags> {
    private HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags>> childElementBinders;

    public SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePersonTags$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䙺\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePersonTags$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags submitVideoTagJobResponsePersonTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponsePersonTags.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙻\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePersonTags$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags submitVideoTagJobResponsePersonTags, String str) throws IOException, XmlPullParserException {
                submitVideoTagJobResponsePersonTags.confidence = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙼\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePersonTags$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags submitVideoTagJobResponsePersonTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponsePersonTags.count = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙽\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePersonTags$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags submitVideoTagJobResponsePersonTags, String str) throws IOException, XmlPullParserException {
                if (submitVideoTagJobResponsePersonTags.detailPerSecond == null) {
                    submitVideoTagJobResponsePersonTags.detailPerSecond = new ArrayList();
                }
                submitVideoTagJobResponsePersonTags.detailPerSecond.add((SubmitVideoTagJobResponse.SubmitVideoTagJobResponseDetailPerSecond) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseDetailPerSecond.class, ProtectedSandApp.s("䙹\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags submitVideoTagJobResponsePersonTags = new SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoTagJobResponsePersonTags, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䙾\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoTagJobResponsePersonTags;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoTagJobResponsePersonTags;
    }
}
