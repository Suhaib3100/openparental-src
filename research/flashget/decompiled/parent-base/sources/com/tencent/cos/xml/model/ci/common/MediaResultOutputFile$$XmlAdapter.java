package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class MediaResultOutputFile$$XmlAdapter extends IXmlAdapter<MediaResultOutputFile> {
    private HashMap<String, ChildElementBinder<MediaResultOutputFile>> childElementBinders;

    public MediaResultOutputFile$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaResultOutputFile>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䉖\u0001"), new ChildElementBinder<MediaResultOutputFile>() { // from class: com.tencent.cos.xml.model.ci.common.MediaResultOutputFile$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaResultOutputFile mediaResultOutputFile, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaResultOutputFile.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉗\u0001"), new ChildElementBinder<MediaResultOutputFile>() { // from class: com.tencent.cos.xml.model.ci.common.MediaResultOutputFile$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaResultOutputFile mediaResultOutputFile, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaResultOutputFile.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉘\u0001"), new ChildElementBinder<MediaResultOutputFile>() { // from class: com.tencent.cos.xml.model.ci.common.MediaResultOutputFile$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaResultOutputFile mediaResultOutputFile, String str) throws IOException, XmlPullParserException {
                if (mediaResultOutputFile.objectName == null) {
                    mediaResultOutputFile.objectName = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        mediaResultOutputFile.objectName.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䉔\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉙\u0001"), new ChildElementBinder<MediaResultOutputFile>() { // from class: com.tencent.cos.xml.model.ci.common.MediaResultOutputFile$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaResultOutputFile mediaResultOutputFile, String str) throws IOException, XmlPullParserException {
                if (mediaResultOutputFile.md5Info == null) {
                    mediaResultOutputFile.md5Info = new ArrayList();
                }
                mediaResultOutputFile.md5Info.add((MediaResultMd5Info) QCloudXml.fromXml(xmlPullParser, MediaResultMd5Info.class, ProtectedSandApp.s("䉕\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaResultOutputFile fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaResultOutputFile mediaResultOutputFile = new MediaResultOutputFile();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaResultOutputFile> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaResultOutputFile, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䉚\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaResultOutputFile;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaResultOutputFile;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaResultOutputFile mediaResultOutputFile, String str) throws IOException, XmlPullParserException {
        if (mediaResultOutputFile == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䉚\u0001");
        }
        xmlSerializer.startTag("", str);
        if (mediaResultOutputFile.bucket != null) {
            String s4 = ProtectedSandApp.s("䉖\u0001");
            xmlSerializer.startTag("", s4);
            a.a(mediaResultOutputFile.bucket, xmlSerializer, "", s4);
        }
        if (mediaResultOutputFile.region != null) {
            String s5 = ProtectedSandApp.s("䉗\u0001");
            xmlSerializer.startTag("", s5);
            a.a(mediaResultOutputFile.region, xmlSerializer, "", s5);
        }
        if (mediaResultOutputFile.objectName != null) {
            for (int i4 = 0; i4 < mediaResultOutputFile.objectName.size(); i4++) {
                String s6 = ProtectedSandApp.s("䉘\u0001");
                xmlSerializer.startTag("", s6);
                xmlSerializer.text(String.valueOf(mediaResultOutputFile.objectName.get(i4)));
                xmlSerializer.endTag("", s6);
            }
        }
        if (mediaResultOutputFile.md5Info != null) {
            for (int i5 = 0; i5 < mediaResultOutputFile.md5Info.size(); i5++) {
                QCloudXml.toXml(xmlSerializer, mediaResultOutputFile.md5Info.get(i5), ProtectedSandApp.s("䉛\u0001"));
            }
        }
        xmlSerializer.endTag("", str);
    }
}
