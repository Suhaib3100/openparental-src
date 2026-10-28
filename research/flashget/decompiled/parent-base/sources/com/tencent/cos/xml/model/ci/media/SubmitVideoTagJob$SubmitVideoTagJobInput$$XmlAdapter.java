package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVideoTagJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVideoTagJob$SubmitVideoTagJobInput$$XmlAdapter extends IXmlAdapter<SubmitVideoTagJob.SubmitVideoTagJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVideoTagJob.SubmitVideoTagJobInput submitVideoTagJobInput, String str) throws IOException, XmlPullParserException {
        if (submitVideoTagJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䘮\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitVideoTagJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䘯\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVideoTagJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
