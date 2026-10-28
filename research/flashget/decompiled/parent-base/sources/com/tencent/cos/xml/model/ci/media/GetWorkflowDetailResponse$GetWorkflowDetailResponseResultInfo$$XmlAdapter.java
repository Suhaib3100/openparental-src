package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetWorkflowDetailResponse$GetWorkflowDetailResponseResultInfo$$XmlAdapter extends IXmlAdapter<GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo> {
    private HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo>> childElementBinders;

    public GetWorkflowDetailResponse$GetWorkflowDetailResponseResultInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䌁\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseResultInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo getWorkflowDetailResponseResultInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseResultInfo.objectCount = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌂\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseResultInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo getWorkflowDetailResponseResultInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseResultInfo.spriteObjectCount = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌃\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseResultInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo getWorkflowDetailResponseResultInfo, String str) throws IOException, XmlPullParserException {
                if (getWorkflowDetailResponseResultInfo.objectInfo == null) {
                    getWorkflowDetailResponseResultInfo.objectInfo = new ArrayList();
                }
                getWorkflowDetailResponseResultInfo.objectInfo.add((GetWorkflowDetailResponse.GetWorkflowDetailResponseObjectInfo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseObjectInfo.class, ProtectedSandApp.s("䋿\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌄\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseResultInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo getWorkflowDetailResponseResultInfo, String str) throws IOException, XmlPullParserException {
                if (getWorkflowDetailResponseResultInfo.spriteObjectInfo == null) {
                    getWorkflowDetailResponseResultInfo.spriteObjectInfo = new ArrayList();
                }
                getWorkflowDetailResponseResultInfo.spriteObjectInfo.add((GetWorkflowDetailResponse.GetWorkflowDetailResponseSpriteObjectInfo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseSpriteObjectInfo.class, ProtectedSandApp.s("䌀\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo getWorkflowDetailResponseResultInfo = new GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowDetailResponseResultInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䌅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowDetailResponseResultInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowDetailResponseResultInfo;
    }
}
