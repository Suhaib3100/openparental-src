package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitPicProcessJob$SubmitPicProcessJobInput$$XmlAdapter extends IXmlAdapter<SubmitPicProcessJob.SubmitPicProcessJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitPicProcessJob.SubmitPicProcessJobInput submitPicProcessJobInput, String str) throws IOException, XmlPullParserException {
        if (submitPicProcessJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䓗\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitPicProcessJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䓘\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitPicProcessJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
