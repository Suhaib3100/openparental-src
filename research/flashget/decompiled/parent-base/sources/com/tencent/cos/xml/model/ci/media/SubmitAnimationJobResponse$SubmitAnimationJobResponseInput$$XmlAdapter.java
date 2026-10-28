package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitAnimationJobResponse$SubmitAnimationJobResponseInput$$XmlAdapter extends IXmlAdapter<SubmitAnimationJobResponse.SubmitAnimationJobResponseInput> {
    private HashMap<String, ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseInput>> childElementBinders;

    public SubmitAnimationJobResponse$SubmitAnimationJobResponseInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䎅\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseInput submitAnimationJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobResponseInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎆\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseInput submitAnimationJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobResponseInput.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎇\u0001"), new ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJobResponse$SubmitAnimationJobResponseInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJobResponse.SubmitAnimationJobResponseInput submitAnimationJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobResponseInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitAnimationJobResponse.SubmitAnimationJobResponseInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitAnimationJobResponse.SubmitAnimationJobResponseInput submitAnimationJobResponseInput = new SubmitAnimationJobResponse.SubmitAnimationJobResponseInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitAnimationJobResponse.SubmitAnimationJobResponseInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitAnimationJobResponseInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䎈\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitAnimationJobResponseInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitAnimationJobResponseInput;
    }
}
