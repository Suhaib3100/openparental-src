package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitSmartCoverJob$SubmitSmartCoverJobInput$$XmlAdapter extends IXmlAdapter<SubmitSmartCoverJob.SubmitSmartCoverJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitSmartCoverJob.SubmitSmartCoverJobInput submitSmartCoverJobInput, String str) throws IOException, XmlPullParserException {
        if (submitSmartCoverJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䔐\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitSmartCoverJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䔑\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitSmartCoverJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
