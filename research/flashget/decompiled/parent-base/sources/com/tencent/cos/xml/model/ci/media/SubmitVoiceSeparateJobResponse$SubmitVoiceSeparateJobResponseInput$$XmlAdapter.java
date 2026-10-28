package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseInput$$XmlAdapter extends IXmlAdapter<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput> {
    private HashMap<String, ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput>> childElementBinders;

    public SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䚴\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput submitVoiceSeparateJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚵\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput submitVoiceSeparateJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseInput.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚶\u0001"), new ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJobResponse$SubmitVoiceSeparateJobResponseInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput submitVoiceSeparateJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobResponseInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput submitVoiceSeparateJobResponseInput = new SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVoiceSeparateJobResponse.SubmitVoiceSeparateJobResponseInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVoiceSeparateJobResponseInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䚷\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVoiceSeparateJobResponseInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVoiceSeparateJobResponseInput;
    }
}
