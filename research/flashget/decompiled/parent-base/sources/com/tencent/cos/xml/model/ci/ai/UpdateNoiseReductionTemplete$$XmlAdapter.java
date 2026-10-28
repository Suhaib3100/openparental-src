package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.common.NoiseReduction;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class UpdateNoiseReductionTemplete$$XmlAdapter extends IXmlAdapter<UpdateNoiseReductionTemplete> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, UpdateNoiseReductionTemplete updateNoiseReductionTemplete, String str) throws IOException, XmlPullParserException {
        if (updateNoiseReductionTemplete == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㻟\u0001");
        }
        xmlSerializer.startTag("", str);
        if (updateNoiseReductionTemplete.tag != null) {
            String s4 = ProtectedSandApp.s("㻠\u0001");
            xmlSerializer.startTag("", s4);
            a.a(updateNoiseReductionTemplete.tag, xmlSerializer, "", s4);
        }
        if (updateNoiseReductionTemplete.name != null) {
            String s5 = ProtectedSandApp.s("㻡\u0001");
            xmlSerializer.startTag("", s5);
            a.a(updateNoiseReductionTemplete.name, xmlSerializer, "", s5);
        }
        NoiseReduction noiseReduction = updateNoiseReductionTemplete.noiseReduction;
        if (noiseReduction != null) {
            QCloudXml.toXml(xmlSerializer, noiseReduction, ProtectedSandApp.s("㻢\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
