package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitDigitalWatermarkJob$SubmitDigitalWatermarkJobOutput$$XmlAdapter extends IXmlAdapter<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput>> childElementBinders;

    public SubmitDigitalWatermarkJob$SubmitDigitalWatermarkJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䐂\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob$SubmitDigitalWatermarkJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput submitDigitalWatermarkJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitDigitalWatermarkJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䐃\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob$SubmitDigitalWatermarkJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput submitDigitalWatermarkJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitDigitalWatermarkJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䐄\u0001"), new ChildElementBinder<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitDigitalWatermarkJob$SubmitDigitalWatermarkJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput submitDigitalWatermarkJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitDigitalWatermarkJobOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput submitDigitalWatermarkJobOutput = new SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitDigitalWatermarkJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䐅\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitDigitalWatermarkJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitDigitalWatermarkJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitDigitalWatermarkJob.SubmitDigitalWatermarkJobOutput submitDigitalWatermarkJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitDigitalWatermarkJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䐅\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitDigitalWatermarkJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䐂\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitDigitalWatermarkJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitDigitalWatermarkJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䐃\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitDigitalWatermarkJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitDigitalWatermarkJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䐄\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitDigitalWatermarkJobOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
