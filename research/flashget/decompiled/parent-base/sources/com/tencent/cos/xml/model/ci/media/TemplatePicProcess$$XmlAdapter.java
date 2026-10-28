package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.common.PicProcess;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class TemplatePicProcess$$XmlAdapter extends IXmlAdapter<TemplatePicProcess> {
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, TemplatePicProcess templatePicProcess, String str) throws IOException, XmlPullParserException {
        if (templatePicProcess == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䝌\u0001");
        }
        xmlSerializer.startTag("", str);
        if (templatePicProcess.tag != null) {
            String s4 = ProtectedSandApp.s("䝍\u0001");
            xmlSerializer.startTag("", s4);
            a.a(templatePicProcess.tag, xmlSerializer, "", s4);
        }
        if (templatePicProcess.name != null) {
            String s5 = ProtectedSandApp.s("䝎\u0001");
            xmlSerializer.startTag("", s5);
            a.a(templatePicProcess.name, xmlSerializer, "", s5);
        }
        PicProcess picProcess = templatePicProcess.picProcess;
        if (picProcess != null) {
            QCloudXml.toXml(xmlSerializer, picProcess, ProtectedSandApp.s("䝏\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
