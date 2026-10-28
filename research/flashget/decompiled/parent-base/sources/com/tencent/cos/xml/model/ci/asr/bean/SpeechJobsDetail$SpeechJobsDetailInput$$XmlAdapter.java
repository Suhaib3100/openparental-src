package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SpeechJobsDetail$SpeechJobsDetailInput$$XmlAdapter extends IXmlAdapter<SpeechJobsDetail.SpeechJobsDetailInput> {
    private HashMap<String, ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailInput>> childElementBinders;

    public SpeechJobsDetail$SpeechJobsDetailInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䀡\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailInput>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailInput speechJobsDetailInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetailInput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀢\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailInput>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailInput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailInput speechJobsDetailInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetailInput.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀣\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailInput>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailInput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailInput speechJobsDetailInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetailInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechJobsDetail.SpeechJobsDetailInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechJobsDetail.SpeechJobsDetailInput speechJobsDetailInput = new SpeechJobsDetail.SpeechJobsDetailInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, speechJobsDetailInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䀤\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return speechJobsDetailInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return speechJobsDetailInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SpeechJobsDetail.SpeechJobsDetailInput speechJobsDetailInput, String str) throws IOException, XmlPullParserException {
        if (speechJobsDetailInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䀤\u0001");
        }
        xmlSerializer.startTag("", str);
        if (speechJobsDetailInput.region != null) {
            String s4 = ProtectedSandApp.s("䀡\u0001");
            xmlSerializer.startTag("", s4);
            a.a(speechJobsDetailInput.region, xmlSerializer, "", s4);
        }
        if (speechJobsDetailInput.bucketId != null) {
            String s5 = ProtectedSandApp.s("䀢\u0001");
            xmlSerializer.startTag("", s5);
            a.a(speechJobsDetailInput.bucketId, xmlSerializer, "", s5);
        }
        if (speechJobsDetailInput.object != null) {
            String s6 = ProtectedSandApp.s("䀣\u0001");
            xmlSerializer.startTag("", s6);
            a.a(speechJobsDetailInput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
