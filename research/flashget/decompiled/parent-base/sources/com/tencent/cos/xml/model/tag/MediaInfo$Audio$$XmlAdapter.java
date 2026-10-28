package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.ci.ai.b;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class MediaInfo$Audio$$XmlAdapter extends IXmlAdapter<MediaInfo.Audio> {
    private HashMap<String, ChildElementBinder<MediaInfo.Audio>> childElementBinders;

    public MediaInfo$Audio$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo.Audio>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䬔\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                audio.index = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬕\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.codecName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬖\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.codecLongName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬗\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.codecTimeBase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬘\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.codecTagString = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬙\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.codecTag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬚\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.sampleFmt = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬛\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                audio.sampleRate = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬜\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                audio.channel = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬝\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.channelLayout = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬞\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.timebase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬟\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                audio.startTime = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬠\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                audio.duration = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬡\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                audio.bitrate = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬢\u0001"), new ChildElementBinder<MediaInfo.Audio>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Audio$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Audio audio, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                audio.language = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo.Audio fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfo.Audio audio = new MediaInfo.Audio();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo.Audio> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, audio, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䬣\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return audio;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return audio;
    }
}
