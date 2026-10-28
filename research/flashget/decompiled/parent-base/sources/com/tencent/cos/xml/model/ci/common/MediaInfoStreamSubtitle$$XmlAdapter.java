package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class MediaInfoStreamSubtitle$$XmlAdapter extends IXmlAdapter<MediaInfoStreamSubtitle> {
    private HashMap<String, ChildElementBinder<MediaInfoStreamSubtitle>> childElementBinders;

    public MediaInfoStreamSubtitle$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfoStreamSubtitle>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䈯\u0001"), new ChildElementBinder<MediaInfoStreamSubtitle>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamSubtitle$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamSubtitle mediaInfoStreamSubtitle, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamSubtitle.index = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䈰\u0001"), new ChildElementBinder<MediaInfoStreamSubtitle>() { // from class: com.tencent.cos.xml.model.ci.common.MediaInfoStreamSubtitle$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfoStreamSubtitle mediaInfoStreamSubtitle, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaInfoStreamSubtitle.language = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfoStreamSubtitle fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfoStreamSubtitle mediaInfoStreamSubtitle = new MediaInfoStreamSubtitle();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfoStreamSubtitle> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaInfoStreamSubtitle, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䈱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaInfoStreamSubtitle;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaInfoStreamSubtitle;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaInfoStreamSubtitle mediaInfoStreamSubtitle, String str) throws IOException, XmlPullParserException {
        if (mediaInfoStreamSubtitle == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䈱\u0001");
        }
        xmlSerializer.startTag("", str);
        if (mediaInfoStreamSubtitle.index != null) {
            String s4 = ProtectedSandApp.s("䈯\u0001");
            xmlSerializer.startTag("", s4);
            a.a(mediaInfoStreamSubtitle.index, xmlSerializer, "", s4);
        }
        if (mediaInfoStreamSubtitle.language != null) {
            String s5 = ProtectedSandApp.s("䈰\u0001");
            xmlSerializer.startTag("", s5);
            a.a(mediaInfoStreamSubtitle.language, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
