package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.VideoTargetTempleteResponseTemplate;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateVideoTargetTempleteResponse$$XmlAdapter extends IXmlAdapter<UpdateVideoTargetTempleteResponse> {
    private HashMap<String, ChildElementBinder<UpdateVideoTargetTempleteResponse>> childElementBinders;

    public UpdateVideoTargetTempleteResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateVideoTargetTempleteResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㼆\u0001"), new ChildElementBinder<UpdateVideoTargetTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateVideoTargetTempleteResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateVideoTargetTempleteResponse updateVideoTargetTempleteResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateVideoTargetTempleteResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㼇\u0001"), new ChildElementBinder<UpdateVideoTargetTempleteResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateVideoTargetTempleteResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateVideoTargetTempleteResponse updateVideoTargetTempleteResponse, String str) throws IOException, XmlPullParserException {
                updateVideoTargetTempleteResponse.template = (VideoTargetTempleteResponseTemplate) QCloudXml.fromXml(xmlPullParser, VideoTargetTempleteResponseTemplate.class, ProtectedSandApp.s("㼅\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateVideoTargetTempleteResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateVideoTargetTempleteResponse updateVideoTargetTempleteResponse = new UpdateVideoTargetTempleteResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateVideoTargetTempleteResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateVideoTargetTempleteResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㼈\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateVideoTargetTempleteResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateVideoTargetTempleteResponse;
    }
}
