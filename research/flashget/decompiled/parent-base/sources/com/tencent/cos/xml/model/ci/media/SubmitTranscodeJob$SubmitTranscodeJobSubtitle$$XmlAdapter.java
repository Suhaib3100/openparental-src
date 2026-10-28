package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitTranscodeJob$SubmitTranscodeJobSubtitle$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJob.SubmitTranscodeJobSubtitle> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitTranscodeJob.SubmitTranscodeJobSubtitle submitTranscodeJobSubtitle, String str) throws IOException, XmlPullParserException {
        if (submitTranscodeJobSubtitle == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䖘\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitTranscodeJobSubtitle.url != null) {
            String s4 = ProtectedSandApp.s("䖙\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitTranscodeJobSubtitle.url, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
