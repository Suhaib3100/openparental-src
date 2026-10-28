package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class MediaInfo$$XmlAdapter extends IXmlAdapter<MediaInfo> {
    private HashMap<String, ChildElementBinder<MediaInfo>> childElementBinders;

    public MediaInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䬑\u0001"), new ChildElementBinder<MediaInfo>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo mediaInfo, String str) throws IOException, XmlPullParserException {
                mediaInfo.stream = (MediaInfo.Stream) QCloudXml.fromXml(xmlPullParser, MediaInfo.Stream.class, ProtectedSandApp.s("䬏\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬒\u0001"), new ChildElementBinder<MediaInfo>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo mediaInfo, String str) throws IOException, XmlPullParserException {
                mediaInfo.format = (MediaInfo.Format) QCloudXml.fromXml(xmlPullParser, MediaInfo.Format.class, ProtectedSandApp.s("䬐\u0001"));
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
                if ((str == null ? ProtectedSandApp.s("䬓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfo;
    }
}
