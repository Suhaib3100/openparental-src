package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitConcatJob$SubmitConcatJobOutput$$XmlAdapter extends IXmlAdapter<SubmitConcatJob.SubmitConcatJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitConcatJob.SubmitConcatJobOutput>> childElementBinders;

    public SubmitConcatJob$SubmitConcatJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitConcatJob.SubmitConcatJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䏇\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobOutput submitConcatJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏈\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobOutput submitConcatJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䏉\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobOutput submitConcatJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitConcatJob.SubmitConcatJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitConcatJob.SubmitConcatJobOutput submitConcatJobOutput = new SubmitConcatJob.SubmitConcatJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitConcatJob.SubmitConcatJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitConcatJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䏊\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitConcatJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitConcatJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitConcatJob.SubmitConcatJobOutput submitConcatJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitConcatJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䏊\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitConcatJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䏇\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitConcatJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitConcatJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䏈\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitConcatJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitConcatJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䏉\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitConcatJobOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
