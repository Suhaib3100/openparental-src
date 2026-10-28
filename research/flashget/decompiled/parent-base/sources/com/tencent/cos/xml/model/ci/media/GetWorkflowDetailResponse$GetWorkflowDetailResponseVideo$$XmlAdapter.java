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
public class GetWorkflowDetailResponse$GetWorkflowDetailResponseVideo$$XmlAdapter extends IXmlAdapter<GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo> {
    private HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo>> childElementBinders;

    public GetWorkflowDetailResponse$GetWorkflowDetailResponseVideo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䌙\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseVideo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo getWorkflowDetailResponseVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseVideo.height = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌚\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseVideo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo getWorkflowDetailResponseVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseVideo.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌛\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseVideo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo getWorkflowDetailResponseVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseVideo.dar = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌜\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseVideo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo getWorkflowDetailResponseVideo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseVideo.duration = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo getWorkflowDetailResponseVideo = new GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowDetailResponseVideo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䌝\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowDetailResponseVideo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowDetailResponseVideo;
    }
}
