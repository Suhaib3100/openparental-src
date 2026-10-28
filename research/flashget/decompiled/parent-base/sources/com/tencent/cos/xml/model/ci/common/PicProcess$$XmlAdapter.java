package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PicProcess$$XmlAdapter extends IXmlAdapter<PicProcess> {
    private HashMap<String, ChildElementBinder<PicProcess>> childElementBinders;

    public PicProcess$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PicProcess>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䉲\u0001"), new ChildElementBinder<PicProcess>() { // from class: com.tencent.cos.xml.model.ci.common.PicProcess$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicProcess picProcess, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picProcess.isPicInfo = Boolean.parseBoolean(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉳\u0001"), new ChildElementBinder<PicProcess>() { // from class: com.tencent.cos.xml.model.ci.common.PicProcess$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicProcess picProcess, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picProcess.processRule = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PicProcess fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PicProcess picProcess = new PicProcess();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PicProcess> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, picProcess, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䉴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return picProcess;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return picProcess;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PicProcess picProcess, String str) throws IOException, XmlPullParserException {
        if (picProcess == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䉴\u0001");
        }
        xmlSerializer.startTag("", str);
        String s4 = ProtectedSandApp.s("䉲\u0001");
        xmlSerializer.startTag("", s4);
        xmlSerializer.text(String.valueOf(picProcess.isPicInfo));
        xmlSerializer.endTag("", s4);
        if (picProcess.processRule != null) {
            String s5 = ProtectedSandApp.s("䉳\u0001");
            xmlSerializer.startTag("", s5);
            a.a(picProcess.processRule, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
