package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitConcatJob$SubmitConcatJobInput$$XmlAdapter extends IXmlAdapter<SubmitConcatJob.SubmitConcatJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitConcatJob.SubmitConcatJobInput submitConcatJobInput, String str) throws IOException, XmlPullParserException {
        if (submitConcatJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䏀\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitConcatJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䏁\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitConcatJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
