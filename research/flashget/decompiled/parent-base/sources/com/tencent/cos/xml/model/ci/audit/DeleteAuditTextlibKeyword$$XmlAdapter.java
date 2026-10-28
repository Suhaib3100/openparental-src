package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class DeleteAuditTextlibKeyword$$XmlAdapter extends IXmlAdapter<DeleteAuditTextlibKeyword> {
    private HashMap<String, ChildElementBinder<DeleteAuditTextlibKeyword>> childElementBinders;

    public DeleteAuditTextlibKeyword$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DeleteAuditTextlibKeyword>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䂘\u0001"), new ChildElementBinder<DeleteAuditTextlibKeyword>() { // from class: com.tencent.cos.xml.model.ci.audit.DeleteAuditTextlibKeyword$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DeleteAuditTextlibKeyword deleteAuditTextlibKeyword, String str) throws IOException, XmlPullParserException {
                if (deleteAuditTextlibKeyword.keywordIDs == null) {
                    deleteAuditTextlibKeyword.keywordIDs = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        deleteAuditTextlibKeyword.keywordIDs.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䂗\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DeleteAuditTextlibKeyword fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DeleteAuditTextlibKeyword deleteAuditTextlibKeyword = new DeleteAuditTextlibKeyword();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DeleteAuditTextlibKeyword> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, deleteAuditTextlibKeyword, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䂙\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return deleteAuditTextlibKeyword;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return deleteAuditTextlibKeyword;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, DeleteAuditTextlibKeyword deleteAuditTextlibKeyword, String str) throws IOException, XmlPullParserException {
        if (deleteAuditTextlibKeyword == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䂙\u0001");
        }
        xmlSerializer.startTag("", str);
        if (deleteAuditTextlibKeyword.keywordIDs != null) {
            for (int i4 = 0; i4 < deleteAuditTextlibKeyword.keywordIDs.size(); i4++) {
                String s4 = ProtectedSandApp.s("䂘\u0001");
                xmlSerializer.startTag("", s4);
                xmlSerializer.text(String.valueOf(deleteAuditTextlibKeyword.keywordIDs.get(i4)));
                xmlSerializer.endTag("", s4);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
