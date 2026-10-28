package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.MediaInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class MediaInfo$Subtitle$$XmlAdapter extends IXmlAdapter<MediaInfo.Subtitle> {
    private HashMap<String, ChildElementBinder<MediaInfo.Subtitle>> childElementBinders;

    public MediaInfo$Subtitle$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo.Subtitle>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䬴\u0001"), new ChildElementBinder<MediaInfo.Subtitle>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Subtitle$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Subtitle subtitle, String str) throws IOException, XmlPullParserException {
                subtitle.index = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬵\u0001"), new ChildElementBinder<MediaInfo.Subtitle>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Subtitle$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Subtitle subtitle, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                subtitle.language = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo.Subtitle fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfo.Subtitle subtitle = new MediaInfo.Subtitle();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo.Subtitle> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, subtitle, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䬶\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return subtitle;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return subtitle;
    }
}
