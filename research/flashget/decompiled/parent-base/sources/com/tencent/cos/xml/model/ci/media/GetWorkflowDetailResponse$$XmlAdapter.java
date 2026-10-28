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
public class GetWorkflowDetailResponse$$XmlAdapter extends IXmlAdapter<GetWorkflowDetailResponse> {
    private HashMap<String, ChildElementBinder<GetWorkflowDetailResponse>> childElementBinders;

    public GetWorkflowDetailResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowDetailResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䋅\u0001"), new ChildElementBinder<GetWorkflowDetailResponse>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse getWorkflowDetailResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䋆\u0001"), new ChildElementBinder<GetWorkflowDetailResponse>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse getWorkflowDetailResponse, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponse.workflowExecution = (GetWorkflowDetailResponse.GetWorkflowDetailResponseWorkflowExecution) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseWorkflowExecution.class, ProtectedSandApp.s("䋄\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowDetailResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowDetailResponse getWorkflowDetailResponse = new GetWorkflowDetailResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowDetailResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowDetailResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䋇\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowDetailResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowDetailResponse;
    }
}
