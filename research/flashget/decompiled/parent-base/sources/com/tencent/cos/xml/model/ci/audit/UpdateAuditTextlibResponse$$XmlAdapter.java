package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class UpdateAuditTextlibResponse$$XmlAdapter extends IXmlAdapter<UpdateAuditTextlibResponse> {
    private HashMap<String, ChildElementBinder<UpdateAuditTextlibResponse>> childElementBinders;

    public UpdateAuditTextlibResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<UpdateAuditTextlibResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䇑\u0001"), new ChildElementBinder<UpdateAuditTextlibResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.UpdateAuditTextlibResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAuditTextlibResponse updateAuditTextlibResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAuditTextlibResponse.libID = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䇒\u0001"), new ChildElementBinder<UpdateAuditTextlibResponse>() { // from class: com.tencent.cos.xml.model.ci.audit.UpdateAuditTextlibResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, UpdateAuditTextlibResponse updateAuditTextlibResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                updateAuditTextlibResponse.requestId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public UpdateAuditTextlibResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        UpdateAuditTextlibResponse updateAuditTextlibResponse = new UpdateAuditTextlibResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<UpdateAuditTextlibResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, updateAuditTextlibResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䇓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return updateAuditTextlibResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return updateAuditTextlibResponse;
    }
}
