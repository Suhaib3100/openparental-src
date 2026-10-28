package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.UpdateMediaQueue;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateMediaQueue$$XmlAdapter extends IXmlAdapter<UpdateMediaQueue> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateMediaQueue updateMediaQueue, String str) throws IOException, XmlPullParserException {
        if (updateMediaQueue == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䢧\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateMediaQueue.name != null) {
            String s4 = ProtectedSandApp.s("䢨\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateMediaQueue.name, xmlSerializer, "", s4);
        }
        if (updateMediaQueue.state != null) {
            String s5 = ProtectedSandApp.s("䢩\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateMediaQueue.state, xmlSerializer, "", s5);
        }
        UpdateMediaQueue.UpdateMediaQueueNotifyConfig updateMediaQueueNotifyConfig = updateMediaQueue.notifyConfig;
        if (updateMediaQueueNotifyConfig != null) {
            QCloudXml.toXml(xmlSerializer, updateMediaQueueNotifyConfig, ProtectedSandApp.s("䢪\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
