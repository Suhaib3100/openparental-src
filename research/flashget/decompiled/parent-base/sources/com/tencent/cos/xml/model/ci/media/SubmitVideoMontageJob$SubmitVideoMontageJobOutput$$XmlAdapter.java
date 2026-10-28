package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitVideoMontageJob$SubmitVideoMontageJobOutput$$XmlAdapter extends IXmlAdapter<SubmitVideoMontageJob.SubmitVideoMontageJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobOutput>> childElementBinders;

    public SubmitVideoMontageJob$SubmitVideoMontageJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䗭\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobOutput submitVideoMontageJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗮\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobOutput submitVideoMontageJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䗯\u0001"), new ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitVideoMontageJob$SubmitVideoMontageJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitVideoMontageJob.SubmitVideoMontageJobOutput submitVideoMontageJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitVideoMontageJobOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitVideoMontageJob.SubmitVideoMontageJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitVideoMontageJob.SubmitVideoMontageJobOutput submitVideoMontageJobOutput = new SubmitVideoMontageJob.SubmitVideoMontageJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitVideoMontageJob.SubmitVideoMontageJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitVideoMontageJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䗰\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitVideoMontageJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitVideoMontageJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitVideoMontageJob.SubmitVideoMontageJobOutput submitVideoMontageJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitVideoMontageJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䗰\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitVideoMontageJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䗭\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitVideoMontageJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitVideoMontageJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䗮\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitVideoMontageJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitVideoMontageJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䗯\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitVideoMontageJobOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
