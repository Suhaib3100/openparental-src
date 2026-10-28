package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseInput$$XmlAdapter extends IXmlAdapter<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput> {
    private HashMap<String, ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput>> childElementBinders;

    public SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䑷\u0001"), new ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput submitMediaInfoJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaInfoJobResponseInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑸\u0001"), new ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput submitMediaInfoJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaInfoJobResponseInput.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䑹\u0001"), new ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJobResponse$SubmitMediaInfoJobResponseInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput submitMediaInfoJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaInfoJobResponseInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput submitMediaInfoJobResponseInput = new SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaInfoJobResponse.SubmitMediaInfoJobResponseInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaInfoJobResponseInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䑺\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaInfoJobResponseInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaInfoJobResponseInput;
    }
}
