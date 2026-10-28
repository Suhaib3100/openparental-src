package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.SpeechRecognitionTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateSpeechRecognitionTempleteResponse$$XmlAdapter extends IXmlAdapter<UpdateSpeechRecognitionTempleteResponse> {
    private HashMap<String, ChildElementBinder<UpdateSpeechRecognitionTempleteResponse>> childElementBinders;

    public UpdateSpeechRecognitionTempleteResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateSpeechRecognitionTempleteResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㻸\u0001"), new ChildElementBinder<UpdateSpeechRecognitionTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateSpeechRecognitionTempleteResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateSpeechRecognitionTempleteResponse updateSpeechRecognitionTempleteResponse, String str) throws IOException, XmlPullParserException {
                updateSpeechRecognitionTempleteResponse.template = (SpeechRecognitionTempleteResponseTemplate) QCloudXml.fromXml(xmlPullParser, SpeechRecognitionTempleteResponseTemplate.class, ProtectedSandApp.s("㻷\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻹\u0001"), new ChildElementBinder<UpdateSpeechRecognitionTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateSpeechRecognitionTempleteResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateSpeechRecognitionTempleteResponse updateSpeechRecognitionTempleteResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateSpeechRecognitionTempleteResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateSpeechRecognitionTempleteResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateSpeechRecognitionTempleteResponse updateSpeechRecognitionTempleteResponse = new UpdateSpeechRecognitionTempleteResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateSpeechRecognitionTempleteResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateSpeechRecognitionTempleteResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㻺\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateSpeechRecognitionTempleteResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateSpeechRecognitionTempleteResponse;
    }
}
