package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
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
public class MediaInfoStream$$XmlAdapter extends IXmlAdapter<MediaInfoStream> {
    private HashMap<String, ChildElementBinder<MediaInfoStream>> childElementBinders;

    public MediaInfoStream$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfoStream>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䈘\u0001"), new ChildElementBinder<MediaInfoStream>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStream$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStream mediaInfoStream, String str) throws IOException, XmlPullParserException {
                if (mediaInfoStream.video == null) {
                    mediaInfoStream.video = new ArrayList();
                }
                mediaInfoStream.video.add((MediaInfoStreamVideo) QCloudXml.fromXml(xmlPullParser, MediaInfoStreamVideo.class, ProtectedSandApp.s("䈕\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈙\u0001"), new ChildElementBinder<MediaInfoStream>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStream$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStream mediaInfoStream, String str) throws IOException, XmlPullParserException {
                if (mediaInfoStream.audio == null) {
                    mediaInfoStream.audio = new ArrayList();
                }
                mediaInfoStream.audio.add((MediaInfoStreamAudio) QCloudXml.fromXml(xmlPullParser, MediaInfoStreamAudio.class, ProtectedSandApp.s("䈖\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈚\u0001"), new ChildElementBinder<MediaInfoStream>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStream$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStream mediaInfoStream, String str) throws IOException, XmlPullParserException {
                if (mediaInfoStream.subtitle == null) {
                    mediaInfoStream.subtitle = new ArrayList();
                }
                mediaInfoStream.subtitle.add((MediaInfoStreamSubtitle) QCloudXml.fromXml(xmlPullParser, MediaInfoStreamSubtitle.class, ProtectedSandApp.s("䈗\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfoStream fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfoStream mediaInfoStream = new MediaInfoStream();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfoStream> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaInfoStream, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䈛\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaInfoStream;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfoStream;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfoStream mediaInfoStream, String str) throws IOException, XmlPullParserException {
        if (mediaInfoStream == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䈛\u0001");
        }
        xmlSerializer.startTag("", str);
        if (mediaInfoStream.video != null) {
            for (int i4 = 0; i4 < mediaInfoStream.video.size(); i4++) {
                QCloudXml.toXml(xmlSerializer, mediaInfoStream.video.get(i4), ProtectedSandApp.s("䈜\u0001"));
            }
        }
        if (mediaInfoStream.audio != null) {
            for (int i5 = 0; i5 < mediaInfoStream.audio.size(); i5++) {
                QCloudXml.toXml(xmlSerializer, mediaInfoStream.audio.get(i5), ProtectedSandApp.s("䈝\u0001"));
            }
        }
        if (mediaInfoStream.subtitle != null) {
            for (int i6 = 0; i6 < mediaInfoStream.subtitle.size(); i6++) {
                QCloudXml.toXml(xmlSerializer, mediaInfoStream.subtitle.get(i6), ProtectedSandApp.s("䈞\u0001"));
            }
        }
        xmlSerializer.endTag("", str);
    }
}
