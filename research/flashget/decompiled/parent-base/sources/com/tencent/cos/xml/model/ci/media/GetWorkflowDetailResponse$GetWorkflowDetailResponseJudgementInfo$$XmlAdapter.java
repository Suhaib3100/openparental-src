package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
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
public class GetWorkflowDetailResponse$GetWorkflowDetailResponseJudgementInfo$$XmlAdapter extends IXmlAdapter<GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo> {
    private HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo>> childElementBinders;

    public GetWorkflowDetailResponse$GetWorkflowDetailResponseJudgementInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䋩\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseJudgementInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo getWorkflowDetailResponseJudgementInfo, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseJudgementInfo.objectCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䋪\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseJudgementInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo getWorkflowDetailResponseJudgementInfo, String str) throws IOException, XmlPullParserException {
                if (getWorkflowDetailResponseJudgementInfo.judgementResult == null) {
                    getWorkflowDetailResponseJudgementInfo.judgementResult = new ArrayList();
                }
                getWorkflowDetailResponseJudgementInfo.judgementResult.add((GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementResult) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementResult.class, ProtectedSandApp.s("䋨\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo getWorkflowDetailResponseJudgementInfo = new GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowDetailResponseJudgementInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䋫\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowDetailResponseJudgementInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowDetailResponseJudgementInfo;
    }
}
