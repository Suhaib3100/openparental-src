package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitSnapshotJob$SubmitSnapshotJobInput$$XmlAdapter extends IXmlAdapter<SubmitSnapshotJob.SubmitSnapshotJobInput> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitSnapshotJob.SubmitSnapshotJobInput submitSnapshotJobInput, String str) throws IOException, XmlPullParserException {
        if (submitSnapshotJobInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䕆\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitSnapshotJobInput.object != null) {
            String s4 = ProtectedSandApp.s("䕇\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitSnapshotJobInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
