package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class MediaInfo$$XmlAdapter extends IXmlAdapter<MediaInfo> {
    private HashMap<String, ChildElementBinder<MediaInfo>> childElementBinders;

    public MediaInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䈉\u0001"), new ChildElementBinder<MediaInfo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo mediaInfo, String str) throws IOException, XmlPullParserException {
                mediaInfo.format = (MediaInfoFormat) QCloudXml.fromXml(xmlPullParser, MediaInfoFormat.class, ProtectedSandApp.s("䈇\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈊\u0001"), new ChildElementBinder<MediaInfo>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo mediaInfo, String str) throws IOException, XmlPullParserException {
                mediaInfo.stream = (MediaInfoStream) QCloudXml.fromXml(xmlPullParser, MediaInfoStream.class, ProtectedSandApp.s("䈈\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfo mediaInfo = new MediaInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䈋\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfo mediaInfo, String str) throws IOException, XmlPullParserException {
        if (mediaInfo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䈋\u0001");
        }
        xmlSerializer.startTag("", str);
        MediaInfoFormat mediaInfoFormat = mediaInfo.format;
        if (mediaInfoFormat != null) {
            QCloudXml.toXml(xmlSerializer, mediaInfoFormat, ProtectedSandApp.s("䈉\u0001"));
        }
        MediaInfoStream mediaInfoStream = mediaInfo.stream;
        if (mediaInfoStream != null) {
            QCloudXml.toXml(xmlSerializer, mediaInfoStream, ProtectedSandApp.s("䈊\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
