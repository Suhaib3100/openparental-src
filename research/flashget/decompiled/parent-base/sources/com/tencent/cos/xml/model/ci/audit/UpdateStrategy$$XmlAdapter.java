package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.CreateStrategy;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateStrategy$$XmlAdapter extends IXmlAdapter<UpdateStrategy> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateStrategy updateStrategy, String str) throws IOException, XmlPullParserException {
        if (updateStrategy == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䇔\u0001");
        }
        xmlSerializer.startTag("", str);
        CreateStrategy.Labels labels = updateStrategy.labels;
        if (labels != null) {
            QCloudXml.toXml(xmlSerializer, labels, ProtectedSandApp.s("䇕\u0001"));
        }
        if (updateStrategy.textLibs != null) {
            for (int i4 = 0; i4 < updateStrategy.textLibs.size(); i4++) {
                String s4 = ProtectedSandApp.s("䇖\u0001");
                xmlSerializer.startTag("", s4);
                xmlSerializer.text(String.valueOf(updateStrategy.textLibs.get(i4)));
                xmlSerializer.endTag("", s4);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
