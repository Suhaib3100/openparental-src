package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWorkflowDetailResponse$GetWorkflowDetailResponseAudio$$XmlAdapter extends IXmlAdapter<GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio> {
    private HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio>> childElementBinders;

    public GetWorkflowDetailResponse$GetWorkflowDetailResponseAudio$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䋈\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseAudio$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio getWorkflowDetailResponseAudio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseAudio.duration = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio getWorkflowDetailResponseAudio = new GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowDetailResponseAudio, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䋉\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowDetailResponseAudio;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowDetailResponseAudio;
    }
}
