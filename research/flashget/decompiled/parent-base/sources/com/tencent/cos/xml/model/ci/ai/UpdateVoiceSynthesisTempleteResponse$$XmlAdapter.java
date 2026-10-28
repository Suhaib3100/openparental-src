package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.VoiceSynthesisTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateVoiceSynthesisTempleteResponse$$XmlAdapter extends IXmlAdapter<UpdateVoiceSynthesisTempleteResponse> {
    private HashMap<String, ChildElementBinder<UpdateVoiceSynthesisTempleteResponse>> childElementBinders;

    public UpdateVoiceSynthesisTempleteResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateVoiceSynthesisTempleteResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㼨\u0001"), new ChildElementBinder<UpdateVoiceSynthesisTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateVoiceSynthesisTempleteResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateVoiceSynthesisTempleteResponse updateVoiceSynthesisTempleteResponse, String str) throws IOException, XmlPullParserException {
                updateVoiceSynthesisTempleteResponse.template = (VoiceSynthesisTempleteResponseTemplate) QCloudXml.fromXml(xmlPullParser, VoiceSynthesisTempleteResponseTemplate.class, ProtectedSandApp.s("㼧\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㼩\u0001"), new ChildElementBinder<UpdateVoiceSynthesisTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateVoiceSynthesisTempleteResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateVoiceSynthesisTempleteResponse updateVoiceSynthesisTempleteResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateVoiceSynthesisTempleteResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateVoiceSynthesisTempleteResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateVoiceSynthesisTempleteResponse updateVoiceSynthesisTempleteResponse = new UpdateVoiceSynthesisTempleteResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateVoiceSynthesisTempleteResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateVoiceSynthesisTempleteResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㼪\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateVoiceSynthesisTempleteResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateVoiceSynthesisTempleteResponse;
    }
}
