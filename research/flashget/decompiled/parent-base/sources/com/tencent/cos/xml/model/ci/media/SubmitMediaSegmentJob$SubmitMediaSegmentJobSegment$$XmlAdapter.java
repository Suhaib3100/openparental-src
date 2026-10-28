package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitMediaSegmentJob$SubmitMediaSegmentJobSegment$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment> {
    private HashMap<String, ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment>> childElementBinders;

    public SubmitMediaSegmentJob$SubmitMediaSegmentJobSegment$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䒤\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobSegment$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment submitMediaSegmentJobSegment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobSegment.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒥\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobSegment$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment submitMediaSegmentJobSegment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobSegment.duration = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒦\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobSegment$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment submitMediaSegmentJobSegment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobSegment.transcodeIndex = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒧\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobSegment$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment submitMediaSegmentJobSegment, String str) throws IOException, XmlPullParserException {
                submitMediaSegmentJobSegment.hlsEncrypt = (SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt) QCloudXml.fromXml(xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt.class, ProtectedSandApp.s("䒣\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment submitMediaSegmentJobSegment = new SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaSegmentJobSegment, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䒨\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaSegmentJobSegment;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaSegmentJobSegment;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaSegmentJob.SubmitMediaSegmentJobSegment submitMediaSegmentJobSegment, String str) throws IOException, XmlPullParserException {
        if (submitMediaSegmentJobSegment == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䒨\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitMediaSegmentJobSegment.format != null) {
            String s4 = ProtectedSandApp.s("䒤\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaSegmentJobSegment.format, xmlSerializer, "", s4);
        }
        if (submitMediaSegmentJobSegment.duration != null) {
            String s5 = ProtectedSandApp.s("䒥\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitMediaSegmentJobSegment.duration, xmlSerializer, "", s5);
        }
        if (submitMediaSegmentJobSegment.transcodeIndex != null) {
            String s6 = ProtectedSandApp.s("䒦\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitMediaSegmentJobSegment.transcodeIndex, xmlSerializer, "", s6);
        }
        SubmitMediaSegmentJob.SubmitMediaSegmentJobHlsEncrypt submitMediaSegmentJobHlsEncrypt = submitMediaSegmentJobSegment.hlsEncrypt;
        if (submitMediaSegmentJobHlsEncrypt != null) {
            QCloudXml.toXml(xmlSerializer, submitMediaSegmentJobHlsEncrypt, ProtectedSandApp.s("䒧\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
