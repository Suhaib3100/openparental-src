package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitMediaInfoJob$SubmitMediaInfoJobInput$$XmlAdapter extends IXmlAdapter<SubmitMediaInfoJob.SubmitMediaInfoJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaInfoJob.SubmitMediaInfoJobInput submitMediaInfoJobInput, String str) throws IOException, XmlPullParserException {
        if (submitMediaInfoJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䑩\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitMediaInfoJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䑪\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaInfoJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
