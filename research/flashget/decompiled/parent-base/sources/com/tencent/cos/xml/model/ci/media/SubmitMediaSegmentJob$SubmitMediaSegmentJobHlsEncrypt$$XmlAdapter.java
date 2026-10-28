package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitMediaSegmentJob$SubmitMediaSegmentJobHlsEncrypt$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt> {
    private HashMap<String, ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt>> childElementBinders;

    public SubmitMediaSegmentJob$SubmitMediaSegmentJobHlsEncrypt$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䒖\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobHlsEncrypt$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt submitMediaSegmentJobHlsEncrypt, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobHlsEncrypt.isHlsEncrypt = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒗\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobHlsEncrypt$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt submitMediaSegmentJobHlsEncrypt, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobHlsEncrypt.uriKey = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt submitMediaSegmentJobHlsEncrypt = new SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaSegmentJobHlsEncrypt, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䒘\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaSegmentJobHlsEncrypt;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaSegmentJobHlsEncrypt;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt submitMediaSegmentJobHlsEncrypt, String str) throws IOException, XmlPullParserException {
        if (submitMediaSegmentJobHlsEncrypt == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䒘\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitMediaSegmentJobHlsEncrypt.isHlsEncrypt != null) {
            String s4 = ProtectedSandApp.s("䒖\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaSegmentJobHlsEncrypt.isHlsEncrypt, xmlSerializer, "", s4);
        }
        if (submitMediaSegmentJobHlsEncrypt.uriKey != null) {
            String s5 = ProtectedSandApp.s("䒗\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitMediaSegmentJobHlsEncrypt.uriKey, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
