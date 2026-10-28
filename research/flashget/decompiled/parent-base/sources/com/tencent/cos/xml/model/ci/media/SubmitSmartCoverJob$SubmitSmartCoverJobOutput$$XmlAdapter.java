package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitSmartCoverJob$SubmitSmartCoverJobOutput$$XmlAdapter extends IXmlAdapter<SubmitSmartCoverJob.SubmitSmartCoverJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitSmartCoverJob.SubmitSmartCoverJobOutput>> childElementBinders;

    public SubmitSmartCoverJob$SubmitSmartCoverJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSmartCoverJob.SubmitSmartCoverJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䔘\u0001"), new ChildElementBinder<SubmitSmartCoverJob.SubmitSmartCoverJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob$SubmitSmartCoverJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJob.SubmitSmartCoverJobOutput submitSmartCoverJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔙\u0001"), new ChildElementBinder<SubmitSmartCoverJob.SubmitSmartCoverJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob$SubmitSmartCoverJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJob.SubmitSmartCoverJobOutput submitSmartCoverJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䔚\u0001"), new ChildElementBinder<SubmitSmartCoverJob.SubmitSmartCoverJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSmartCoverJob$SubmitSmartCoverJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSmartCoverJob.SubmitSmartCoverJobOutput submitSmartCoverJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSmartCoverJobOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSmartCoverJob.SubmitSmartCoverJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSmartCoverJob.SubmitSmartCoverJobOutput submitSmartCoverJobOutput = new SubmitSmartCoverJob.SubmitSmartCoverJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSmartCoverJob.SubmitSmartCoverJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSmartCoverJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䔛\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSmartCoverJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSmartCoverJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitSmartCoverJob.SubmitSmartCoverJobOutput submitSmartCoverJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitSmartCoverJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䔛\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitSmartCoverJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䔘\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitSmartCoverJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitSmartCoverJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䔙\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitSmartCoverJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitSmartCoverJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䔚\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitSmartCoverJobOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
