package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.ai.c;
import com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail;
import com.tencent.cos.xml.model.tag.Locator;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SpeechJobsDetail$SpeechJobsDetailOperation$$XmlAdapter extends IXmlAdapter<SpeechJobsDetail.SpeechJobsDetailOperation> {
    private HashMap<String, ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation>> childElementBinders;

    public SpeechJobsDetail$SpeechJobsDetailOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䀨\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailOperation speechJobsDetailOperation, String str) throws IOException, XmlPullParserException {
                speechJobsDetailOperation.speechRecognition = (SpeechRecognition) QCloudXml.fromXml(xmlPullParser, SpeechRecognition.class, ProtectedSandApp.s("䀥\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀩\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailOperation speechJobsDetailOperation, String str) throws IOException, XmlPullParserException {
                speechJobsDetailOperation.output = (Locator) QCloudXml.fromXml(xmlPullParser, Locator.class, ProtectedSandApp.s("䀦\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀪\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailOperation speechJobsDetailOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetailOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀫\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailOperation speechJobsDetailOperation, String str) throws IOException, XmlPullParserException {
                speechJobsDetailOperation.jobLevel = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀬\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailOperation$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailOperation speechJobsDetailOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetailOperation.templateId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀭\u0001"), new ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$SpeechJobsDetailOperation$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail.SpeechJobsDetailOperation speechJobsDetailOperation, String str) throws IOException, XmlPullParserException {
                speechJobsDetailOperation.speechRecognitionResult = (SpeechJobsDetail.SpeechRecognitionResult) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.SpeechRecognitionResult.class, ProtectedSandApp.s("䀧\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechJobsDetail.SpeechJobsDetailOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechJobsDetail.SpeechJobsDetailOperation speechJobsDetailOperation = new SpeechJobsDetail.SpeechJobsDetailOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechJobsDetail.SpeechJobsDetailOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, speechJobsDetailOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䀮\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return speechJobsDetailOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return speechJobsDetailOperation;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SpeechJobsDetail.SpeechJobsDetailOperation speechJobsDetailOperation, String str) throws IOException, XmlPullParserException {
        if (speechJobsDetailOperation == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䀮\u0001");
        }
        xmlSerializer.startTag("", str);
        SpeechRecognition speechRecognition = speechJobsDetailOperation.speechRecognition;
        if (speechRecognition != null) {
            QCloudXml.toXml(xmlSerializer, speechRecognition, ProtectedSandApp.s("䀨\u0001"));
        }
        Locator locator = speechJobsDetailOperation.output;
        if (locator != null) {
            QCloudXml.toXml(xmlSerializer, locator, ProtectedSandApp.s("䀩\u0001"));
        }
        if (speechJobsDetailOperation.userData != null) {
            String s4 = ProtectedSandApp.s("䀪\u0001");
            xmlSerializer.startTag("", s4);
            com.tencent.cos.xml.model.ci.ai.a.a(speechJobsDetailOperation.userData, xmlSerializer, "", s4);
        }
        String s5 = ProtectedSandApp.s("䀫\u0001");
        xmlSerializer.startTag("", s5);
        c.a(speechJobsDetailOperation.jobLevel, xmlSerializer, "", s5);
        if (speechJobsDetailOperation.templateId != null) {
            String s6 = ProtectedSandApp.s("䀬\u0001");
            xmlSerializer.startTag("", s6);
            com.tencent.cos.xml.model.ci.ai.a.a(speechJobsDetailOperation.templateId, xmlSerializer, "", s6);
        }
        SpeechJobsDetail.SpeechRecognitionResult speechRecognitionResult = speechJobsDetailOperation.speechRecognitionResult;
        if (speechRecognitionResult != null) {
            QCloudXml.toXml(xmlSerializer, speechRecognitionResult, ProtectedSandApp.s("䀭\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
