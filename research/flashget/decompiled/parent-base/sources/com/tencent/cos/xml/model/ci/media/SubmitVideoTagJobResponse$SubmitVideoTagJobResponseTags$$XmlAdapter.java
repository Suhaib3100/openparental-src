package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.b;
import com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitVideoTagJobResponse$SubmitVideoTagJobResponseTags$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags> {
    private HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags>> childElementBinders;

    public SubmitVideoTagJobResponse$SubmitVideoTagJobResponseTags$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䚌\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseTags$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags submitVideoTagJobResponseTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseTags.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚍\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseTags$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags submitVideoTagJobResponseTags, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoTagJobResponseTags.tagCls = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚎\u0001"), new ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoTagJobResponse$SubmitVideoTagJobResponseTags$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags submitVideoTagJobResponseTags, String str) throws IOException, XmlPullParserException {
                submitVideoTagJobResponseTags.confidence = b.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags submitVideoTagJobResponseTags = new SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoTagJobResponse.SubmitVideoTagJobResponseTags> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoTagJobResponseTags, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䚏\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoTagJobResponseTags;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoTagJobResponseTags;
    }
}
