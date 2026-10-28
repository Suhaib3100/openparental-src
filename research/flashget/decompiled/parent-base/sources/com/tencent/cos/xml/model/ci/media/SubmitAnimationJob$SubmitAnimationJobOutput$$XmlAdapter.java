package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitAnimationJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitAnimationJob$SubmitAnimationJobOutput$$XmlAdapter extends IXmlAdapter<SubmitAnimationJob.SubmitAnimationJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobOutput>> childElementBinders;

    public SubmitAnimationJob$SubmitAnimationJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䍸\u0001"), new ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJob$SubmitAnimationJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJob.SubmitAnimationJobOutput submitAnimationJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍹\u0001"), new ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJob$SubmitAnimationJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJob.SubmitAnimationJobOutput submitAnimationJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䍺\u0001"), new ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitAnimationJob$SubmitAnimationJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitAnimationJob.SubmitAnimationJobOutput submitAnimationJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitAnimationJobOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitAnimationJob.SubmitAnimationJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitAnimationJob.SubmitAnimationJobOutput submitAnimationJobOutput = new SubmitAnimationJob.SubmitAnimationJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitAnimationJob.SubmitAnimationJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitAnimationJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䍻\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitAnimationJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitAnimationJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitAnimationJob.SubmitAnimationJobOutput submitAnimationJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitAnimationJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䍻\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitAnimationJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䍸\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitAnimationJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitAnimationJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䍹\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitAnimationJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitAnimationJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䍺\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitAnimationJobOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
