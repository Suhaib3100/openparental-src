package com.tencent.cos.xml.model.tag.audit.get;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TextAuditJobResponse$$XmlAdapter extends IXmlAdapter<TextAuditJobResponse> {
    private HashMap<String, ChildElementBinder<TextAuditJobResponse>> childElementBinders;

    public TextAuditJobResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TextAuditJobResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䶑\u0001"), new ChildElementBinder<TextAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse textAuditJobResponse, String str) throws IOException, XmlPullParserException {
                textAuditJobResponse.jobsDetail = (TextAuditJobResponse.TextAuditJobsDetail) QCloudXml.fromXml(xmlPullParser, TextAuditJobResponse.TextAuditJobsDetail.class, ProtectedSandApp.s("䶐\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䶒\u0001"), new ChildElementBinder<TextAuditJobResponse>() { // from class: com.tencent.cos.xml.model.tag.audit.get.TextAuditJobResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TextAuditJobResponse textAuditJobResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                textAuditJobResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TextAuditJobResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TextAuditJobResponse textAuditJobResponse = new TextAuditJobResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TextAuditJobResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, textAuditJobResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䶓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return textAuditJobResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return textAuditJobResponse;
    }
}
