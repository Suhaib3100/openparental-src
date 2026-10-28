package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitMediaSegmentJob$SubmitMediaSegmentJobInput$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJob.SubmitMediaSegmentJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaSegmentJob.SubmitMediaSegmentJobInput submitMediaSegmentJobInput, String str) throws IOException, XmlPullParserException {
        if (submitMediaSegmentJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䒙\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitMediaSegmentJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䒚\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaSegmentJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
