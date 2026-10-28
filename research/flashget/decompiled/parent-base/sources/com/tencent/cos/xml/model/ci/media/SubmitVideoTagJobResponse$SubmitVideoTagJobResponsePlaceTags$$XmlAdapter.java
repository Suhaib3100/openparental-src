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
public class SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePlaceTags$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags> {
    private HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags>> childElementBinders;

    public SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePlaceTags$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䚀\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePlaceTags$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags submitVideoTagJobResponsePlaceTags, String str) throws IOException, XmlPullParserException {
                if (submitVideoTagJobResponsePlaceTags.tags == null) {
                    submitVideoTagJobResponsePlaceTags.tags = new ArrayList();
                }
                submitVideoTagJobResponsePlaceTags.tags.add((SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags) QCloudXml.fromXml(xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags.class, ProtectedSandApp.s("䙿\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚁\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePlaceTags$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags submitVideoTagJobResponsePlaceTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponsePlaceTags.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚂\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePlaceTags$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags submitVideoTagJobResponsePlaceTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponsePlaceTags.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚃\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePlaceTags$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags submitVideoTagJobResponsePlaceTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponsePlaceTags.startIndex = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚄\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePlaceTags$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags submitVideoTagJobResponsePlaceTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponsePlaceTags.endIndex = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚅\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponsePlaceTags$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags submitVideoTagJobResponsePlaceTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponsePlaceTags.clipFrameResult = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags submitVideoTagJobResponsePlaceTags = new SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponsePlaceTags> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoTagJobResponsePlaceTags, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䚆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoTagJobResponsePlaceTags;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoTagJobResponsePlaceTags;
    }
}
