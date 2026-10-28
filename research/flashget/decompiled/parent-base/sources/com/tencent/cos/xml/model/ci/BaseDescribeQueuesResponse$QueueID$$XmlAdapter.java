package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class BaseDescribeQueuesResponse$QueueID$$XmlAdapter extends IXmlAdapter<BaseDescribeQueuesResponse.QueueID> {
    private HashMap<String, ChildElementBinder<BaseDescribeQueuesResponse.QueueID>> childElementBinders;

    public BaseDescribeQueuesResponse$QueueID$$XmlAdapter() {
        HashMap<String, ChildElementBinder<BaseDescribeQueuesResponse.QueueID>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㨿\u0001"), new ChildElementBinder<BaseDescribeQueuesResponse.QueueID>() { // from class: com.tencent.cos.xml.model.ci.BaseDescribeQueuesResponse$QueueID$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseDescribeQueuesResponse.QueueID queueID, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                queueID.queueID = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public BaseDescribeQueuesResponse.QueueID fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        BaseDescribeQueuesResponse.QueueID queueID = new BaseDescribeQueuesResponse.QueueID();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<BaseDescribeQueuesResponse.QueueID> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, queueID, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㨿\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return queueID;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return queueID;
    }
}
