package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitPicProcessJob$SubmitPicProcessJobOutput$$XmlAdapter extends IXmlAdapter<SubmitPicProcessJob.SubmitPicProcessJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitPicProcessJob.SubmitPicProcessJobOutput>> childElementBinders;

    public SubmitPicProcessJob$SubmitPicProcessJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitPicProcessJob.SubmitPicProcessJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䓟\u0001"), new ChildElementBinder<SubmitPicProcessJob.SubmitPicProcessJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob$SubmitPicProcessJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJob.SubmitPicProcessJobOutput submitPicProcessJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitPicProcessJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓠\u0001"), new ChildElementBinder<SubmitPicProcessJob.SubmitPicProcessJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob$SubmitPicProcessJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJob.SubmitPicProcessJobOutput submitPicProcessJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitPicProcessJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䓡\u0001"), new ChildElementBinder<SubmitPicProcessJob.SubmitPicProcessJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitPicProcessJob$SubmitPicProcessJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitPicProcessJob.SubmitPicProcessJobOutput submitPicProcessJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitPicProcessJobOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitPicProcessJob.SubmitPicProcessJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitPicProcessJob.SubmitPicProcessJobOutput submitPicProcessJobOutput = new SubmitPicProcessJob.SubmitPicProcessJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitPicProcessJob.SubmitPicProcessJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitPicProcessJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䓢\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitPicProcessJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitPicProcessJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitPicProcessJob.SubmitPicProcessJobOutput submitPicProcessJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitPicProcessJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䓢\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitPicProcessJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䓟\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitPicProcessJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitPicProcessJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䓠\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitPicProcessJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitPicProcessJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䓡\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitPicProcessJobOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
