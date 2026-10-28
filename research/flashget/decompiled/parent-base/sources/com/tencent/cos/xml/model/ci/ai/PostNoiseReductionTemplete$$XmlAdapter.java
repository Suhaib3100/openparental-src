package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.NoiseReduction;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostNoiseReductionTemplete$$XmlAdapter extends IXmlAdapter<PostNoiseReductionTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostNoiseReductionTemplete postNoiseReductionTemplete, String str) throws IOException, XmlPullParserException {
        if (postNoiseReductionTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㴋\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postNoiseReductionTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㴌\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postNoiseReductionTemplete.tag, xmlSerializer, "", s4);
        }
        if (postNoiseReductionTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㴍\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postNoiseReductionTemplete.name, xmlSerializer, "", s5);
        }
        NoiseReduction noiseReduction = postNoiseReductionTemplete.noiseReduction;
        if (noiseReduction != null) {
            QCloudXml.toXml(xmlSerializer, noiseReduction, ProtectedSandApp.s("㴎\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
