package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateMediaQueueResponse$$XmlAdapter extends IXmlAdapter<UpdateMediaQueueResponse> {
    private HashMap<String, ChildElementBinder<UpdateMediaQueueResponse>> childElementBinders;

    public UpdateMediaQueueResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateMediaQueueResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䢺\u0001"), new ChildElementBinder<UpdateMediaQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse updateMediaQueueResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateMediaQueueResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䢻\u0001"), new ChildElementBinder<UpdateMediaQueueResponse>() { // from class: com.tencent.cos.xml.model.ci.media.UpdateMediaQueueResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateMediaQueueResponse updateMediaQueueResponse, String str) throws IOException, XmlPullParserException {
                updateMediaQueueResponse.queue = (UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue) QCloudXml.fromXml(xmlPullParser, UpdateMediaQueueResponse.UpdateMediaQueueResponseQueue.class, ProtectedSandApp.s("䢹\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateMediaQueueResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateMediaQueueResponse updateMediaQueueResponse = new UpdateMediaQueueResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateMediaQueueResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateMediaQueueResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䢼\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateMediaQueueResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateMediaQueueResponse;
    }
}
