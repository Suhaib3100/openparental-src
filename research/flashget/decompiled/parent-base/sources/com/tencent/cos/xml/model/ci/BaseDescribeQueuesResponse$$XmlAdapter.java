package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class BaseDescribeQueuesResponse$$XmlAdapter extends IXmlAdapter<BaseDescribeQueuesResponse> {
    private HashMap<String, ChildElementBinder<BaseDescribeQueuesResponse>> childElementBinders;

    public BaseDescribeQueuesResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<BaseDescribeQueuesResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㨧\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse baseDescribeQueuesResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                baseDescribeQueuesResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨨\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse baseDescribeQueuesResponse, String str) throws IOException, XmlPullParserException {
                baseDescribeQueuesResponse.totalCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨩\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse baseDescribeQueuesResponse, String str) throws IOException, XmlPullParserException {
                baseDescribeQueuesResponse.pageNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨪\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse baseDescribeQueuesResponse, String str) throws IOException, XmlPullParserException {
                baseDescribeQueuesResponse.pageSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨫\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse baseDescribeQueuesResponse, String str) throws IOException, XmlPullParserException {
                if (baseDescribeQueuesResponse.queueList == null) {
                    baseDescribeQueuesResponse.queueList = new ArrayList();
                }
                baseDescribeQueuesResponse.queueList.add((BaseDescribeQueuesResponse.Queue) QCloudXml.fromXml(xmlPullParser, BaseDescribeQueuesResponse.Queue.class, ProtectedSandApp.s("㨣\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㨬\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse baseDescribeQueuesResponse, String str) throws IOException, XmlPullParserException {
                if (baseDescribeQueuesResponse.nonExistPIDs == null) {
                    baseDescribeQueuesResponse.nonExistPIDs = new ArrayList();
                }
                baseDescribeQueuesResponse.nonExistPIDs.add((BaseDescribeQueuesResponse.QueueID) QCloudXml.fromXml(xmlPullParser, BaseDescribeQueuesResponse.QueueID.class, ProtectedSandApp.s("㨤\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public BaseDescribeQueuesResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        BaseDescribeQueuesResponse baseDescribeQueuesResponse = new BaseDescribeQueuesResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<BaseDescribeQueuesResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, baseDescribeQueuesResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㨭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return baseDescribeQueuesResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return baseDescribeQueuesResponse;
    }
}
