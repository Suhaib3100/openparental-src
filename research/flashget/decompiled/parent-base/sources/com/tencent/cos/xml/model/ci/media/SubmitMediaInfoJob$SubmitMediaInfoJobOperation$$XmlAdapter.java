package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitMediaInfoJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitMediaInfoJob$SubmitMediaInfoJobOperation$$XmlAdapter extends IXmlAdapter<SubmitMediaInfoJob.SubmitMediaInfoJobOperation> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaInfoJob.SubmitMediaInfoJobOperation submitMediaInfoJobOperation, String str) throws IOException, XmlPullParserException {
        if (submitMediaInfoJobOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䑫\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitMediaInfoJobOperation.userData != null) {
            String s4 = ProtectedSandApp.s("䑬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaInfoJobOperation.userData, xmlSerializer, "", s4);
        }
        if (submitMediaInfoJobOperation.jobLevel != null) {
            String s5 = ProtectedSandApp.s("䑭\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitMediaInfoJobOperation.jobLevel, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
