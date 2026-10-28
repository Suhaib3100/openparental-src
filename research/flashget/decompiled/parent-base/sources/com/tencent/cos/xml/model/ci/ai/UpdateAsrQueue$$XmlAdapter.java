package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.NotifyConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateAsrQueue$$XmlAdapter extends IXmlAdapter<UpdateAsrQueue> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateAsrQueue updateAsrQueue, String str) throws IOException, XmlPullParserException {
        if (updateAsrQueue == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㻇\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateAsrQueue.name != null) {
            String s4 = ProtectedSandApp.s("㻈\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateAsrQueue.name, xmlSerializer, "", s4);
        }
        if (updateAsrQueue.state != null) {
            String s5 = ProtectedSandApp.s("㻉\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateAsrQueue.state, xmlSerializer, "", s5);
        }
        NotifyConfig notifyConfig = updateAsrQueue.notifyConfig;
        if (notifyConfig != null) {
            QCloudXml.toXml(xmlSerializer, notifyConfig, ProtectedSandApp.s("㻊\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
