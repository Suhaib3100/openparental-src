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
public class MediaInfo$Format$$XmlAdapter extends IXmlAdapter<MediaInfo.Format> {
    private HashMap<String, ChildElementBinder<MediaInfo.Format>> childElementBinders;

    public MediaInfo$Format$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaInfo.Format>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䬤\u0001"), new ChildElementBinder<MediaInfo.Format>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Format$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Format format, String str) throws IOException, XmlPullParserException {
                format.numStream = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬥\u0001"), new ChildElementBinder<MediaInfo.Format>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Format$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Format format, String str) throws IOException, XmlPullParserException {
                format.numProgram = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬦\u0001"), new ChildElementBinder<MediaInfo.Format>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Format$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Format format, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                format.formatName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬧\u0001"), new ChildElementBinder<MediaInfo.Format>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Format$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Format format, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                format.formatLongName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬨\u0001"), new ChildElementBinder<MediaInfo.Format>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Format$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Format format, String str) throws IOException, XmlPullParserException {
                format.startTime = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬩\u0001"), new ChildElementBinder<MediaInfo.Format>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Format$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Format format, String str) throws IOException, XmlPullParserException {
                format.duration = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬪\u0001"), new ChildElementBinder<MediaInfo.Format>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Format$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Format format, String str) throws IOException, XmlPullParserException {
                format.bitrate = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䬫\u0001"), new ChildElementBinder<MediaInfo.Format>() { // from class: com.tencent.cos.xml.model.tag.MediaInfo$Format$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaInfo.Format format, String str) throws IOException, XmlPullParserException {
                format.size = b.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaInfo.Format fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaInfo.Format format = new MediaInfo.Format();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaInfo.Format> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, format, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䬬\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return format;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return format;
    }
}
