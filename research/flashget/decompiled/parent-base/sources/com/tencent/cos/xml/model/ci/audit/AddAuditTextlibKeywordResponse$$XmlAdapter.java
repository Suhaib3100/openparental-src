package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.AddAuditTextlibKeywordResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class AddAuditTextlibKeywordResponse$$XmlAdapter extends IXmlAdapter<AddAuditTextlibKeywordResponse> {
    private HashMap<String, ChildElementBinder<AddAuditTextlibKeywordResponse>> childElementBinders;

    public AddAuditTextlibKeywordResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<AddAuditTextlibKeywordResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䁓\u0001"), new ChildElementBinder<AddAuditTextlibKeywordResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.AddAuditTextlibKeywordResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AddAuditTextlibKeywordResponse addAuditTextlibKeywordResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                addAuditTextlibKeywordResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䁔\u0001"), new ChildElementBinder<AddAuditTextlibKeywordResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.AddAuditTextlibKeywordResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, AddAuditTextlibKeywordResponse addAuditTextlibKeywordResponse, String str) throws IOException, XmlPullParserException {
                if (addAuditTextlibKeywordResponse.results == null) {
                    addAuditTextlibKeywordResponse.results = new ArrayList();
                }
                addAuditTextlibKeywordResponse.results.add((AddAuditTextlibKeywordResponse.Results) QCloudXml.fromXml(xmlPullParser, AddAuditTextlibKeywordResponse.Results.class, ProtectedSandApp.s("䁒\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public AddAuditTextlibKeywordResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        AddAuditTextlibKeywordResponse addAuditTextlibKeywordResponse = new AddAuditTextlibKeywordResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<AddAuditTextlibKeywordResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, addAuditTextlibKeywordResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䁕\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return addAuditTextlibKeywordResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return addAuditTextlibKeywordResponse;
    }
}
