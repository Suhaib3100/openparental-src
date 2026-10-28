package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateAsrQueueResponse$$XmlAdapter extends IXmlAdapter<UpdateAsrQueueResponse> {
    private HashMap<String, ChildElementBinder<UpdateAsrQueueResponse>> childElementBinders;

    public UpdateAsrQueueResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateAsrQueueResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㻑\u0001"), new ChildElementBinder<UpdateAsrQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse updateAsrQueueResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAsrQueueResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㻒\u0001"), new ChildElementBinder<UpdateAsrQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.UpdateAsrQueueResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAsrQueueResponse updateAsrQueueResponse, String str) throws IOException, XmlPullParserException {
                updateAsrQueueResponse.queue = (UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue) QCloudXml.fromXml(xmlPullParser, UpdateAsrQueueResponse.UpdateAsrQueueResponseQueue.class, ProtectedSandApp.s("㻐\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateAsrQueueResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateAsrQueueResponse updateAsrQueueResponse = new UpdateAsrQueueResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateAsrQueueResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateAsrQueueResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㻓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateAsrQueueResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateAsrQueueResponse;
    }
}
