package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReduction;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostNoiseReduction$PostNoiseReductionInput$$XmlAdapter extends IXmlAdapter<PostNoiseReduction.PostNoiseReductionInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostNoiseReduction.PostNoiseReductionInput postNoiseReductionInput, String str) throws IOException, XmlPullParserException {
        if (postNoiseReductionInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㳜\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postNoiseReductionInput.object != null) {
            String s4 = ProtectedSandApp.s("㳝\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postNoiseReductionInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
