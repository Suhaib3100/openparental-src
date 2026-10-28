package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseInput$$XmlAdapter extends IXmlAdapter<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput> {
    private HashMap<String, ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput>> childElementBinders;

    public SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䘇\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput submitVideoMontageJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘈\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput submitVideoMontageJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseInput.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䘉\u0001"), new ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJobResponse$SubmitVideoMontageJobResponseInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput submitVideoMontageJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobResponseInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput submitVideoMontageJobResponseInput = new SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoMontageJobResponse.SubmitVideoMontageJobResponseInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoMontageJobResponseInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䘊\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoMontageJobResponseInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoMontageJobResponseInput;
    }
}
