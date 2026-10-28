package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitSnapshotJob$SubmitSnapshotJobOutput$$XmlAdapter extends IXmlAdapter<SubmitSnapshotJob.SubmitSnapshotJobOutput> {
    private HashMap<String, ChildElementBinder<SubmitSnapshotJob.SubmitSnapshotJobOutput>> childElementBinders;

    public SubmitSnapshotJob$SubmitSnapshotJobOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitSnapshotJob.SubmitSnapshotJobOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䕎\u0001"), new ChildElementBinder<SubmitSnapshotJob.SubmitSnapshotJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob$SubmitSnapshotJobOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJob.SubmitSnapshotJobOutput submitSnapshotJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕏\u0001"), new ChildElementBinder<SubmitSnapshotJob.SubmitSnapshotJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob$SubmitSnapshotJobOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJob.SubmitSnapshotJobOutput submitSnapshotJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕐\u0001"), new ChildElementBinder<SubmitSnapshotJob.SubmitSnapshotJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob$SubmitSnapshotJobOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJob.SubmitSnapshotJobOutput submitSnapshotJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobOutput.object = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䕑\u0001"), new ChildElementBinder<SubmitSnapshotJob.SubmitSnapshotJobOutput>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitSnapshotJob$SubmitSnapshotJobOutput$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitSnapshotJob.SubmitSnapshotJobOutput submitSnapshotJobOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitSnapshotJobOutput.spriteObject = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitSnapshotJob.SubmitSnapshotJobOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitSnapshotJob.SubmitSnapshotJobOutput submitSnapshotJobOutput = new SubmitSnapshotJob.SubmitSnapshotJobOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitSnapshotJob.SubmitSnapshotJobOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitSnapshotJobOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䕒\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitSnapshotJobOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitSnapshotJobOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitSnapshotJob.SubmitSnapshotJobOutput submitSnapshotJobOutput, String str) throws IOException, XmlPullParserException {
        if (submitSnapshotJobOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䕒\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitSnapshotJobOutput.region != null) {
            String s4 = ProtectedSandApp.s("䕎\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitSnapshotJobOutput.region, xmlSerializer, "", s4);
        }
        if (submitSnapshotJobOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("䕏\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitSnapshotJobOutput.bucket, xmlSerializer, "", s5);
        }
        if (submitSnapshotJobOutput.object != null) {
            String s6 = ProtectedSandApp.s("䕐\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitSnapshotJobOutput.object, xmlSerializer, "", s6);
        }
        if (submitSnapshotJobOutput.spriteObject != null) {
            String s7 = ProtectedSandApp.s("䕑\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitSnapshotJobOutput.spriteObject, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
