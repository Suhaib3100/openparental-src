package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DeleteAuditTextlibResponse$$XmlAdapter extends IXmlAdapter<DeleteAuditTextlibResponse> {
    private HashMap<String, ChildElementBinder<DeleteAuditTextlibResponse>> childElementBinders;

    public DeleteAuditTextlibResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DeleteAuditTextlibResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䂫\u0001"), new ChildElementBinder<DeleteAuditTextlibResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DeleteAuditTextlibResponse deleteAuditTextlibResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                deleteAuditTextlibResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DeleteAuditTextlibResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DeleteAuditTextlibResponse deleteAuditTextlibResponse = new DeleteAuditTextlibResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DeleteAuditTextlibResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, deleteAuditTextlibResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䂬\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return deleteAuditTextlibResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return deleteAuditTextlibResponse;
    }
}
