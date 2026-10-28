package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.audit.CreateStrategy;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateStrategy$$XmlAdapter extends IXmlAdapter<CreateStrategy> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateStrategy createStrategy, String str) throws IOException, XmlPullParserException {
        if (createStrategy == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䁶\u0001");
        }
        xmlSerializer.startTag("", str);
        if (createStrategy.name != null) {
            String s4 = ProtectedSandApp.s("䁷\u0001");
            xmlSerializer.startTag("", s4);
            a.a(createStrategy.name, xmlSerializer, "", s4);
        }
        CreateStrategy.Labels labels = createStrategy.labels;
        if (labels != null) {
            QCloudXml.toXml(xmlSerializer, labels, ProtectedSandApp.s("䁸\u0001"));
        }
        if (createStrategy.textLibs != null) {
            for (int i4 = 0; i4 < createStrategy.textLibs.size(); i4++) {
                String s5 = ProtectedSandApp.s("䁹\u0001");
                xmlSerializer.startTag("", s5);
                xmlSerializer.text(String.valueOf(createStrategy.textLibs.get(i4)));
                xmlSerializer.endTag("", s5);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
