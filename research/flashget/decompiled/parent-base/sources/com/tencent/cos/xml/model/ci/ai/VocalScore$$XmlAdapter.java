package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScore;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class VocalScore$$XmlAdapter extends IXmlAdapter<VocalScore> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VocalScore vocalScore, String str) throws IOException, XmlPullParserException {
        if (vocalScore == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㼫\u0001");
        }
        xmlSerializer.startTag("", str);
        if (vocalScore.tag != null) {
            String s4 = ProtectedSandApp.s("㼬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(vocalScore.tag, xmlSerializer, "", s4);
        }
        VocalScore.VocalScoreInput vocalScoreInput = vocalScore.input;
        if (vocalScoreInput != null) {
            QCloudXml.toXml(xmlSerializer, vocalScoreInput, ProtectedSandApp.s("㼭\u0001"));
        }
        VocalScore.VocalScoreOperation vocalScoreOperation = vocalScore.operation;
        if (vocalScoreOperation != null) {
            QCloudXml.toXml(xmlSerializer, vocalScoreOperation, ProtectedSandApp.s("㼮\u0001"));
        }
        if (vocalScore.callBackFormat != null) {
            String s5 = ProtectedSandApp.s("㼯\u0001");
            xmlSerializer.startTag("", s5);
            a.a(vocalScore.callBackFormat, xmlSerializer, "", s5);
        }
        if (vocalScore.callBackType != null) {
            String s6 = ProtectedSandApp.s("㼰\u0001");
            xmlSerializer.startTag("", s6);
            a.a(vocalScore.callBackType, xmlSerializer, "", s6);
        }
        if (vocalScore.callBack != null) {
            String s7 = ProtectedSandApp.s("㼱\u0001");
            xmlSerializer.startTag("", s7);
            a.a(vocalScore.callBack, xmlSerializer, "", s7);
        }
        VocalScore.CallBackMqConfig callBackMqConfig = vocalScore.callBackMqConfig;
        if (callBackMqConfig != null) {
            QCloudXml.toXml(xmlSerializer, callBackMqConfig, ProtectedSandApp.s("㼲\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
