package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReduction;
import com.tencent.cos.xml.model.ci.common.NoiseReduction;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostNoiseReduction$PostNoiseReductionOperation$$XmlAdapter extends IXmlAdapter<PostNoiseReduction.PostNoiseReductionOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostNoiseReduction.PostNoiseReductionOperation postNoiseReductionOperation, String str) throws IOException, XmlPullParserException {
        if (postNoiseReductionOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㳞\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postNoiseReductionOperation.templateId != null) {
            String s4 = ProtectedSandApp.s("㳟\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postNoiseReductionOperation.templateId, xmlSerializer, "", s4);
        }
        NoiseReduction noiseReduction = postNoiseReductionOperation.noiseReduction;
        if (noiseReduction != null) {
            QCloudXml.toXml(xmlSerializer, noiseReduction, ProtectedSandApp.s("㳠\u0001"));
        }
        if (postNoiseReductionOperation.jobLevel != null) {
            String s5 = ProtectedSandApp.s("㳡\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postNoiseReductionOperation.jobLevel, xmlSerializer, "", s5);
        }
        if (postNoiseReductionOperation.userData != null) {
            String s6 = ProtectedSandApp.s("㳢\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postNoiseReductionOperation.userData, xmlSerializer, "", s6);
        }
        PostNoiseReduction.PostNoiseReductionOutput postNoiseReductionOutput = postNoiseReductionOperation.output;
        if (postNoiseReductionOutput != null) {
            QCloudXml.toXml(xmlSerializer, postNoiseReductionOutput, ProtectedSandApp.s("㳣\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
