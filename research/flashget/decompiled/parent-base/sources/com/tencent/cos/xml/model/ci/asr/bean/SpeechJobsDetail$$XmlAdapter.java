package com.tencent.cos.xml.model.ci.asr.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class SpeechJobsDetail$$XmlAdapter extends IXmlAdapter<SpeechJobsDetail> {
    private HashMap<String, ChildElementBinder<SpeechJobsDetail>> childElementBinders;

    public SpeechJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SpeechJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㿶\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿷\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿸\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿹\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿺\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.endTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿻\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.code = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿼\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.message = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿽\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.tag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿾\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                speechJobsDetail.queueId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㿿\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                speechJobsDetail.input = (SpeechJobsDetail.SpeechJobsDetailInput) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.SpeechJobsDetailInput.class, ProtectedSandApp.s("㿴\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䀀\u0001"), new ChildElementBinder<SpeechJobsDetail>() { // from class: com.tencent.cos.xml.model.ci.asr.bean.SpeechJobsDetail$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SpeechJobsDetail speechJobsDetail, String str) throws IOException, XmlPullParserException {
                speechJobsDetail.operation = (SpeechJobsDetail.SpeechJobsDetailOperation) QCloudXml.fromXml(xmlPullParser, SpeechJobsDetail.SpeechJobsDetailOperation.class, ProtectedSandApp.s("㿵\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SpeechJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SpeechJobsDetail speechJobsDetail = new SpeechJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SpeechJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, speechJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䀁\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return speechJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return speechJobsDetail;
    }
}
