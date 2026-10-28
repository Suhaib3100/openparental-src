package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostVideoTargetRec;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVideoTargetRec$PostVideoTargetRecInput$$XmlAdapter extends IXmlAdapter<PostVideoTargetRec.PostVideoTargetRecInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoTargetRec.PostVideoTargetRecInput postVideoTargetRecInput, String str) throws IOException, XmlPullParserException {
        if (postVideoTargetRecInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㷟\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postVideoTargetRecInput.object != null) {
            String s4 = ProtectedSandApp.s("㷠\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postVideoTargetRecInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
