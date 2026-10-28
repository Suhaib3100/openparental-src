package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScore;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class VocalScore$VocalScoreOperation$$XmlAdapter extends IXmlAdapter<VocalScore.VocalScoreOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VocalScore.VocalScoreOperation vocalScoreOperation, String str) throws IOException, XmlPullParserException {
        if (vocalScoreOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㼹\u0001");
        }
        xmlSerializer.startTag("", str);
        VocalScore.VocalScoreVocalScore vocalScoreVocalScore = vocalScoreOperation.vocalScore;
        if (vocalScoreVocalScore != null) {
            QCloudXml.toXml(xmlSerializer, vocalScoreVocalScore, ProtectedSandApp.s("㼺\u0001"));
        }
        if (vocalScoreOperation.userData != null) {
            String s4 = ProtectedSandApp.s("㼻\u0001");
            xmlSerializer.startTag("", s4);
            a.a(vocalScoreOperation.userData, xmlSerializer, "", s4);
        }
        if (vocalScoreOperation.jobLevel != null) {
            String s5 = ProtectedSandApp.s("㼼\u0001");
            xmlSerializer.startTag("", s5);
            a.a(vocalScoreOperation.jobLevel, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
