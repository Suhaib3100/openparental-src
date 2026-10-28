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
public class MediaInfo$Video$$XmlAdapter extends IXmlAdapter<MediaInfo.Video> {
    private HashMap<String, ChildElementBinder<MediaInfo.Video>> childElementBinders;

    public MediaInfo$Video$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo.Video>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䬷\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.index = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬸\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.codecName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬹\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.codecLongName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬺\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.codecTimeBase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬻\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.codecTagString = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬼\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.codecTag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬽\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.profile = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬾\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.height = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬿\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.width = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭀\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.hasBFrame = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭁\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.11
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.refFrames = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭂\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.12
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.sar = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭃\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.13
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.dar = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭄\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.14
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.pixFormat = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭅\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.15
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.fieldOrder = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭆\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.16
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.level = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭇\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.17
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.fps = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭈\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.18
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.avgFps = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭉\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.19
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.timebase = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭊\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.20
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.startTime = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭋\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.21
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.duration = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭌\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.22
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.bitrate = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭍\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.23
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                video.numFrames = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䭎\u0001"), new ChildElementBinder<MediaInfo.Video>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Video$$XmlAdapter.24
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Video video, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                video.language = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo.Video fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfo.Video video = new MediaInfo.Video();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo.Video> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, video, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䭏\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return video;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return video;
    }
}
