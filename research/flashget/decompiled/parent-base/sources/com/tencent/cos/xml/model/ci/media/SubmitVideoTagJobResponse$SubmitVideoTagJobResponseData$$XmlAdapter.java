package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
public class SubmitVideoTagJobResponse$SubmitVideoTagJobResponseData$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData> {
    private HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData>> childElementBinders;

    public SubmitVideoTagJobResponse$SubmitVideoTagJobResponseData$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䙌\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseData$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData submitVideoTagJobResponseData, String str) throws IOException, XmlPullParserException {
                submitVideoTagJobResponseData.tags = (SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags.class, ProtectedSandApp.s("䙇\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙍\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseData$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData submitVideoTagJobResponseData, String str) throws IOException, XmlPullParserException {
                if (submitVideoTagJobResponseData.personTags == null) {
                    submitVideoTagJobResponseData.personTags = new ArrayList();
                }
                submitVideoTagJobResponseData.personTags.add((SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePersonTags.class, ProtectedSandApp.s("䙈\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙎\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseData$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData submitVideoTagJobResponseData, String str) throws IOException, XmlPullParserException {
                if (submitVideoTagJobResponseData.placeTags == null) {
                    submitVideoTagJobResponseData.placeTags = new ArrayList();
                }
                submitVideoTagJobResponseData.placeTags.add((SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags.class, ProtectedSandApp.s("䙉\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙏\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseData$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData submitVideoTagJobResponseData, String str) throws IOException, XmlPullParserException {
                if (submitVideoTagJobResponseData.actionTags == null) {
                    submitVideoTagJobResponseData.actionTags = new ArrayList();
                }
                submitVideoTagJobResponseData.actionTags.add((SubmitVideoTagJobResponse.SubmitVideoTagJobResponseActionTags) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseActionTags.class, ProtectedSandApp.s("䙊\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䙐\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseData$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData submitVideoTagJobResponseData, String str) throws IOException, XmlPullParserException {
                if (submitVideoTagJobResponseData.objectTags == null) {
                    submitVideoTagJobResponseData.objectTags = new ArrayList();
                }
                submitVideoTagJobResponseData.objectTags.add((SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjectTags) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseObjectTags.class, ProtectedSandApp.s("䙋\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData submitVideoTagJobResponseData = new SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseData> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoTagJobResponseData, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䙑\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoTagJobResponseData;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoTagJobResponseData;
    }
}
