package com.tencent.cos.xml.model.tag.audit.post;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.tag.audit.post.PostVideoAudit;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostVideoAudit$Snapshot$$XmlAdapter extends IXmlAdapter<PostVideoAudit.Snapshot> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostVideoAudit.Snapshot snapshot, String str) throws IOException, XmlPullParserException {
        if (snapshot == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("七\u0001");
        }
        xmlSerializer.startTag("", str);
        if (snapshot.mode != null) {
            String s4 = ProtectedSandApp.s("丄\u0001");
            xmlSerializer.startTag("", s4);
            a.a(snapshot.mode, xmlSerializer, "", s4);
        }
        String s5 = ProtectedSandApp.s("丅\u0001");
        xmlSerializer.startTag("", s5);
        c.a(snapshot.count, xmlSerializer, "", s5);
        if (snapshot.timeInterval != 0.0f) {
            String s6 = ProtectedSandApp.s("丆\u0001");
            xmlSerializer.startTag("", s6);
            xmlSerializer.text(String.valueOf(snapshot.timeInterval));
            xmlSerializer.endTag("", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
