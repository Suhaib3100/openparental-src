package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitAnimationJob$SubmitAnimationJobInput$$XmlAdapter extends IXmlAdapter<SubmitAnimationJob.SubmitAnimationJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitAnimationJob.SubmitAnimationJobInput submitAnimationJobInput, String str) throws IOException, XmlPullParserException {
        if (submitAnimationJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䍰\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitAnimationJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䍱\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitAnimationJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
