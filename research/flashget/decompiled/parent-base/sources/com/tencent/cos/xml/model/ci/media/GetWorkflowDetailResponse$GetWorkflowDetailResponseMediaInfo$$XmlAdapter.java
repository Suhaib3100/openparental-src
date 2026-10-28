package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWorkflowDetailResponse$GetWorkflowDetailResponseMediaInfo$$XmlAdapter extends IXmlAdapter<GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo> {
    private HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo>> childElementBinders;

    public GetWorkflowDetailResponse$GetWorkflowDetailResponseMediaInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䋵\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseMediaInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo getWorkflowDetailResponseMediaInfo, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseMediaInfo.video = (GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseVideo.class, ProtectedSandApp.s("䋲\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䋶\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseMediaInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo getWorkflowDetailResponseMediaInfo, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseMediaInfo.audio = (GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseAudio.class, ProtectedSandApp.s("䋳\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䋷\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseMediaInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo getWorkflowDetailResponseMediaInfo, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseMediaInfo.format = (GetWorkflowDetailResponse.GetWorkflowDetailResponseFormat) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseFormat.class, ProtectedSandApp.s("䋴\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo getWorkflowDetailResponseMediaInfo = new GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowDetailResponseMediaInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䋸\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowDetailResponseMediaInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowDetailResponseMediaInfo;
    }
}
