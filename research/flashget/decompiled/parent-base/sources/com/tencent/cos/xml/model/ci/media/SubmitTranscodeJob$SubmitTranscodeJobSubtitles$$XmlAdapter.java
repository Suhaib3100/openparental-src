package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitTranscodeJob$SubmitTranscodeJobSubtitles$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJob.SubmitTranscodeJobSubtitles> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitTranscodeJob.SubmitTranscodeJobSubtitles submitTranscodeJobSubtitles, String str) throws IOException, XmlPullParserException {
        if (submitTranscodeJobSubtitles == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䖚\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitTranscodeJobSubtitles.subtitle != null) {
            for (int i4 = 0; i4 < submitTranscodeJobSubtitles.subtitle.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, submitTranscodeJobSubtitles.subtitle.get(i4), ProtectedSandApp.s("䖛\u0001"));
            }
        }
        xmlSerializer.endTag("", str);
    }
}
