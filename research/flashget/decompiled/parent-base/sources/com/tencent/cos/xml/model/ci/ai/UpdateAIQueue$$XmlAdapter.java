package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.NotifyConfig;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateAIQueue$$XmlAdapter extends IXmlAdapter<UpdateAIQueue> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateAIQueue updateAIQueue, String str) throws IOException, XmlPullParserException {
        if (updateAIQueue == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㺯\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateAIQueue.name != null) {
            String s4 = ProtectedSandApp.s("㺰\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateAIQueue.name, xmlSerializer, "", s4);
        }
        if (updateAIQueue.state != null) {
            String s5 = ProtectedSandApp.s("㺱\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateAIQueue.state, xmlSerializer, "", s5);
        }
        NotifyConfig notifyConfig = updateAIQueue.notifyConfig;
        if (notifyConfig != null) {
            QCloudXml.toXml(xmlSerializer, notifyConfig, ProtectedSandApp.s("㺲\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
