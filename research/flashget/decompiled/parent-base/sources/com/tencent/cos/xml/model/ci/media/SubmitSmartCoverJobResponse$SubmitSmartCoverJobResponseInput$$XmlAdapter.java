package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseInput$$XmlAdapter extends IXmlAdapter<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput> {
    private HashMap<String, ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput>> childElementBinders;

    public SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䔥\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput submitSmartCoverJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔦\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput submitSmartCoverJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseInput.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔧\u0001"), new ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJobResponse$SubmitSmartCoverJobResponseInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput submitSmartCoverJobResponseInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobResponseInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput submitSmartCoverJobResponseInput = new SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSmartCoverJobResponse.SubmitSmartCoverJobResponseInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSmartCoverJobResponseInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䔨\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSmartCoverJobResponseInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSmartCoverJobResponseInput;
    }
}
