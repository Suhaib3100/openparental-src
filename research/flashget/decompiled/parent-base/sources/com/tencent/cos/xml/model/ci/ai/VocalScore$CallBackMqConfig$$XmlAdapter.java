package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScore;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class VocalScore$CallBackMqConfig$$XmlAdapter extends IXmlAdapter<VocalScore.CallBackMqConfig> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VocalScore.CallBackMqConfig callBackMqConfig, String str) throws IOException, XmlPullParserException {
        if (callBackMqConfig == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㼳\u0001");
        }
        xmlSerializer.startTag("", str);
        if (callBackMqConfig.mqRegion != null) {
            String s4 = ProtectedSandApp.s("㼴\u0001");
            xmlSerializer.startTag("", s4);
            a.a(callBackMqConfig.mqRegion, xmlSerializer, "", s4);
        }
        if (callBackMqConfig.mqMode != null) {
            String s5 = ProtectedSandApp.s("㼵\u0001");
            xmlSerializer.startTag("", s5);
            a.a(callBackMqConfig.mqMode, xmlSerializer, "", s5);
        }
        if (callBackMqConfig.mqName != null) {
            String s6 = ProtectedSandApp.s("㼶\u0001");
            xmlSerializer.startTag("", s6);
            a.a(callBackMqConfig.mqName, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
