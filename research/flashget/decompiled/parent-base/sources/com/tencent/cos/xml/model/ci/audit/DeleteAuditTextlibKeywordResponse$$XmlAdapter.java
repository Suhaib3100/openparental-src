package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DeleteAuditTextlibKeywordResponse$$XmlAdapter extends IXmlAdapter<DeleteAuditTextlibKeywordResponse> {
    private HashMap<String, ChildElementBinder<DeleteAuditTextlibKeywordResponse>> childElementBinders;

    public DeleteAuditTextlibKeywordResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DeleteAuditTextlibKeywordResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䂠\u0001"), new ChildElementBinder<DeleteAuditTextlibKeywordResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DeleteAuditTextlibKeywordResponse deleteAuditTextlibKeywordResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                deleteAuditTextlibKeywordResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂡\u0001"), new ChildElementBinder<DeleteAuditTextlibKeywordResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DeleteAuditTextlibKeywordResponse deleteAuditTextlibKeywordResponse, String str) throws IOException, XmlPullParserException {
                if (deleteAuditTextlibKeywordResponse.results == null) {
                    deleteAuditTextlibKeywordResponse.results = new ArrayList();
                }
                deleteAuditTextlibKeywordResponse.results.add((DeleteAuditTextlibKeywordResponse.Results) QCloudXml.fromXml(xmlPullParser, DeleteAuditTextlibKeywordResponse.Results.class, ProtectedSandApp.s("䂟\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DeleteAuditTextlibKeywordResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DeleteAuditTextlibKeywordResponse deleteAuditTextlibKeywordResponse = new DeleteAuditTextlibKeywordResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DeleteAuditTextlibKeywordResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, deleteAuditTextlibKeywordResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䂢\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return deleteAuditTextlibKeywordResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return deleteAuditTextlibKeywordResponse;
    }
}
