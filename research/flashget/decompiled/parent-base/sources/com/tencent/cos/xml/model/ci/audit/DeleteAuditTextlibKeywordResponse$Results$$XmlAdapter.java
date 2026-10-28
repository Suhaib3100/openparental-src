package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DeleteAuditTextlibKeywordResponse$Results$$XmlAdapter extends IXmlAdapter<DeleteAuditTextlibKeywordResponse.Results> {
    private HashMap<String, ChildElementBinder<DeleteAuditTextlibKeywordResponse.Results>> childElementBinders;

    public DeleteAuditTextlibKeywordResponse$Results$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DeleteAuditTextlibKeywordResponse.Results>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䂣\u0001"), new ChildElementBinder<DeleteAuditTextlibKeywordResponse.Results>() { // from class: com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResponse$Results$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DeleteAuditTextlibKeywordResponse.Results results, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                results.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂤\u0001"), new ChildElementBinder<DeleteAuditTextlibKeywordResponse.Results>() { // from class: com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResponse$Results$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DeleteAuditTextlibKeywordResponse.Results results, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                results.errMsg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂥\u0001"), new ChildElementBinder<DeleteAuditTextlibKeywordResponse.Results>() { // from class: com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResponse$Results$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DeleteAuditTextlibKeywordResponse.Results results, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                results.keywordID = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂦\u0001"), new ChildElementBinder<DeleteAuditTextlibKeywordResponse.Results>() { // from class: com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeywordResponse$Results$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DeleteAuditTextlibKeywordResponse.Results results, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                results.content = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DeleteAuditTextlibKeywordResponse.Results fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DeleteAuditTextlibKeywordResponse.Results results = new DeleteAuditTextlibKeywordResponse.Results();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DeleteAuditTextlibKeywordResponse.Results> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, results, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䂧\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return results;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return results;
    }
}
