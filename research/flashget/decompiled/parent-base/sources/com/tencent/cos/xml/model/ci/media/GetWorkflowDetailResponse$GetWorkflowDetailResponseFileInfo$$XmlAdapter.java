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
public class GetWorkflowDetailResponse$GetWorkflowDetailResponseFileInfo$$XmlAdapter extends IXmlAdapter<GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo> {
    private HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo>> childElementBinders;

    public GetWorkflowDetailResponse$GetWorkflowDetailResponseFileInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䋓\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseFileInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo getWorkflowDetailResponseFileInfo, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseFileInfo.basicInfo = (GetWorkflowDetailResponse.GetWorkflowDetailResponseBasicInfo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseBasicInfo.class, ProtectedSandApp.s("䋐\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䋔\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseFileInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo getWorkflowDetailResponseFileInfo, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseFileInfo.mediaInfo = (GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseMediaInfo.class, ProtectedSandApp.s("䋑\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䋕\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseFileInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo getWorkflowDetailResponseFileInfo, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseFileInfo.imageInfo = (GetWorkflowDetailResponse.GetWorkflowDetailResponseImageInfo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseImageInfo.class, ProtectedSandApp.s("䋒\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo getWorkflowDetailResponseFileInfo = new GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowDetailResponseFileInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䋖\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowDetailResponseFileInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowDetailResponseFileInfo;
    }
}
