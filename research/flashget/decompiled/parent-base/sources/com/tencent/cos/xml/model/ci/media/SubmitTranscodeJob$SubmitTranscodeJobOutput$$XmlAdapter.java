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
public class SubmitTranscodeJob$SubmitTranscodeJobOutput$$XmlAdapter extends IXmlAdapter<SubmitTranscodeJob.SubmitTranscodeJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobOutput>> childElementBinders;

    public SubmitTranscodeJob$SubmitTranscodeJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䖏\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobOutput submitTranscodeJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖐\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobOutput submitTranscodeJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䖑\u0001"), new ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitTranscodeJob$SubmitTranscodeJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitTranscodeJob.SubmitTranscodeJobOutput submitTranscodeJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitTranscodeJobOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitTranscodeJob.SubmitTranscodeJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitTranscodeJob.SubmitTranscodeJobOutput submitTranscodeJobOutput = new SubmitTranscodeJob.SubmitTranscodeJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitTranscodeJob.SubmitTranscodeJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitTranscodeJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䖒\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitTranscodeJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitTranscodeJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitTranscodeJob.SubmitTranscodeJobOutput submitTranscodeJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitTranscodeJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䖒\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitTranscodeJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䖏\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitTranscodeJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitTranscodeJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䖐\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitTranscodeJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitTranscodeJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䖑\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitTranscodeJobOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
