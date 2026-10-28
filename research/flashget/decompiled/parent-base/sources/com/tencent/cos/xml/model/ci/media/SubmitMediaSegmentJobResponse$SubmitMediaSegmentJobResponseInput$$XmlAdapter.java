package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseInput$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput> {
    private HashMap<String, ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput>> childElementBinders;

    public SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䒲\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput submitMediaSegmentJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒳\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput submitMediaSegmentJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseInput.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒴\u0001"), new ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJobResponse$SubmitMediaSegmentJobResponseInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput submitMediaSegmentJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobResponseInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput submitMediaSegmentJobResponseInput = new SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaSegmentJobResponse.SubmitMediaSegmentJobResponseInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaSegmentJobResponseInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䒵\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaSegmentJobResponseInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaSegmentJobResponseInput;
    }
}
