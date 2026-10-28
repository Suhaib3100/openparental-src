package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.NoiseReductionTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateNoiseReductionTempleteResponse$$XmlAdapter extends IXmlAdapter<UpdateNoiseReductionTempleteResponse> {
    private HashMap<String, ChildElementBinder<UpdateNoiseReductionTempleteResponse>> childElementBinders;

    public UpdateNoiseReductionTempleteResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateNoiseReductionTempleteResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㻪\u0001"), new ChildElementBinder<UpdateNoiseReductionTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateNoiseReductionTempleteResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateNoiseReductionTempleteResponse updateNoiseReductionTempleteResponse, String str) throws IOException, XmlPullParserException {
                updateNoiseReductionTempleteResponse.template = (NoiseReductionTempleteResponseTemplate) QCloudXml.fromXml(xmlPullParser, NoiseReductionTempleteResponseTemplate.class, ProtectedSandApp.s("㻩\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻫\u0001"), new ChildElementBinder<UpdateNoiseReductionTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateNoiseReductionTempleteResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateNoiseReductionTempleteResponse updateNoiseReductionTempleteResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateNoiseReductionTempleteResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateNoiseReductionTempleteResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateNoiseReductionTempleteResponse updateNoiseReductionTempleteResponse = new UpdateNoiseReductionTempleteResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateNoiseReductionTempleteResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateNoiseReductionTempleteResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㻬\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateNoiseReductionTempleteResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateNoiseReductionTempleteResponse;
    }
}
