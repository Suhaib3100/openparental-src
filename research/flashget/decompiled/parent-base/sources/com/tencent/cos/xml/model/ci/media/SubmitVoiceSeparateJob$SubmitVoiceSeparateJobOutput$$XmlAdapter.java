package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVoiceSeparateJob$SubmitVoiceSeparateJobOutput$$XmlAdapter extends IXmlAdapter<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput>> childElementBinders;

    public SubmitVoiceSeparateJob$SubmitVoiceSeparateJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䚢\u0001"), new ChildElementBinder<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob$SubmitVoiceSeparateJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput submitVoiceSeparateJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚣\u0001"), new ChildElementBinder<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob$SubmitVoiceSeparateJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput submitVoiceSeparateJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚤\u0001"), new ChildElementBinder<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob$SubmitVoiceSeparateJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput submitVoiceSeparateJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobOutput.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䚥\u0001"), new ChildElementBinder<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVoiceSeparateJob$SubmitVoiceSeparateJobOutput$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput submitVoiceSeparateJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVoiceSeparateJobOutput.auObject = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput submitVoiceSeparateJobOutput = new SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVoiceSeparateJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䚦\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVoiceSeparateJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVoiceSeparateJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVoiceSeparateJob.SubmitVoiceSeparateJobOutput submitVoiceSeparateJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitVoiceSeparateJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䚦\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitVoiceSeparateJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䚢\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVoiceSeparateJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitVoiceSeparateJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䚣\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVoiceSeparateJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitVoiceSeparateJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䚤\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitVoiceSeparateJobOutput.object, xmlSerializer, "", s6);
        }
        if (submitVoiceSeparateJobOutput.auObject != null) {
            String s7 = ProtectedSandApp.s("䚥\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitVoiceSeparateJobOutput.auObject, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
