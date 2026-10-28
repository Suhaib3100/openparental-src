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
public class GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter extends IXmlAdapter<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks> {
    private HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>> childElementBinders;

    public GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䌌\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.type = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌍\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌎\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌏\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.createTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌐\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌑\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌒\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌓\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌔\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getWorkflowDetailResponseTasks.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌕\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseTasks.resultInfo = (GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseResultInfo.class, ProtectedSandApp.s("䌉\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌖\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                getWorkflowDetailResponseTasks.judgementInfo = (GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseJudgementInfo.class, ProtectedSandApp.s("䌊\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䌗\u0001"), new ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks>() { // from class: com.tencent.cos.xml.model.ci.media.GetWorkflowDetailResponse$GetWorkflowDetailResponseTasks$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks, String str) throws IOException, XmlPullParserException {
                if (getWorkflowDetailResponseTasks.fileInfo == null) {
                    getWorkflowDetailResponseTasks.fileInfo = new ArrayList();
                }
                getWorkflowDetailResponseTasks.fileInfo.add((GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo) QCloudXml.fromXml(xmlPullParser, GetWorkflowDetailResponse.GetWorkflowDetailResponseFileInfo.class, ProtectedSandApp.s("䌋\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks getWorkflowDetailResponseTasks = new GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetWorkflowDetailResponse.GetWorkflowDetailResponseTasks> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getWorkflowDetailResponseTasks, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䌘\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getWorkflowDetailResponseTasks;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getWorkflowDetailResponseTasks;
    }
}
