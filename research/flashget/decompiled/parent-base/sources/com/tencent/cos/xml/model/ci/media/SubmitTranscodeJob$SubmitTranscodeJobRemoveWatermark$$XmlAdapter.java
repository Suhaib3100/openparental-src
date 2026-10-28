package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitTranscodeJob$SubmitTranscodeJobRemoveWatermark$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark> {
    private HashMap<String, ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark>> childElementBinders;

    public SubmitTranscodeJob$SubmitTranscodeJobRemoveWatermark$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䖓\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobRemoveWatermark$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark submitTranscodeJobRemoveWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobRemoveWatermark.dx = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖔\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobRemoveWatermark$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark submitTranscodeJobRemoveWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobRemoveWatermark.dy = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖕\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobRemoveWatermark$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark submitTranscodeJobRemoveWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobRemoveWatermark.width = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖖\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobRemoveWatermark$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark submitTranscodeJobRemoveWatermark, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobRemoveWatermark.height = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark submitTranscodeJobRemoveWatermark = new SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitTranscodeJobRemoveWatermark, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䖗\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitTranscodeJobRemoveWatermark;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitTranscodeJobRemoveWatermark;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitTranscodeJob.SubmitTranscodeJobRemoveWatermark submitTranscodeJobRemoveWatermark, String str) throws IOException, XmlPullParserException {
        if (submitTranscodeJobRemoveWatermark == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䖗\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitTranscodeJobRemoveWatermark.dx != null) {
            String s4 = ProtectedSandApp.s("䖓\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitTranscodeJobRemoveWatermark.dx, xmlSerializer, "", s4);
        }
        if (submitTranscodeJobRemoveWatermark.dy != null) {
            String s5 = ProtectedSandApp.s("䖔\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitTranscodeJobRemoveWatermark.dy, xmlSerializer, "", s5);
        }
        if (submitTranscodeJobRemoveWatermark.width != null) {
            String s6 = ProtectedSandApp.s("䖕\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitTranscodeJobRemoveWatermark.width, xmlSerializer, "", s6);
        }
        if (submitTranscodeJobRemoveWatermark.height != null) {
            String s7 = ProtectedSandApp.s("䖖\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitTranscodeJobRemoveWatermark.height, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
