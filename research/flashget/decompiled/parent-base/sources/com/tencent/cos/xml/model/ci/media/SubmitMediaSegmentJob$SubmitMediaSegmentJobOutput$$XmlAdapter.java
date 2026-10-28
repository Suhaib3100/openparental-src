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
public class SubmitMediaSegmentJob$SubmitMediaSegmentJobOutput$$XmlAdapter extends IXmlAdapter<SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput>> childElementBinders;

    public SubmitMediaSegmentJob$SubmitMediaSegmentJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䒟\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput submitMediaSegmentJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒠\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput submitMediaSegmentJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䒡\u0001"), new ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitMediaSegmentJob$SubmitMediaSegmentJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput submitMediaSegmentJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitMediaSegmentJobOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput submitMediaSegmentJobOutput = new SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitMediaSegmentJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䒢\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitMediaSegmentJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitMediaSegmentJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitMediaSegmentJob.SubmitMediaSegmentJobOutput submitMediaSegmentJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitMediaSegmentJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䒢\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitMediaSegmentJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䒟\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitMediaSegmentJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitMediaSegmentJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䒠\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitMediaSegmentJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitMediaSegmentJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䒡\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitMediaSegmentJobOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
