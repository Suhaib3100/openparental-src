package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class AddAuditTextlibKeyword$$XmlAdapter extends IXmlAdapter<AddAuditTextlibKeyword> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, AddAuditTextlibKeyword addAuditTextlibKeyword, String str) throws IOException, XmlPullParserException {
        if (addAuditTextlibKeyword == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䁇\u0001");
        }
        xmlSerializer.startTag("", str);
        if (addAuditTextlibKeyword.keywords != null) {
            for (int i4 = 0; i4 < addAuditTextlibKeyword.keywords.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, addAuditTextlibKeyword.keywords.get(i4), ProtectedSandApp.s("䁈\u0001"));
            }
        }
        xmlSerializer.endTag("", str);
    }
}
