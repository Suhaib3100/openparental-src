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
public class VideoTargetRec$$XmlAdapter extends IXmlAdapter<VideoTargetRec> {
    private HashMap<String, ChildElementBinder<VideoTargetRec>> childElementBinders;

    public VideoTargetRec$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VideoTargetRec>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䊏\u0001"), new ChildElementBinder<VideoTargetRec>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetRec$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetRec videoTargetRec, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetRec.body = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊐\u0001"), new ChildElementBinder<VideoTargetRec>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetRec$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetRec videoTargetRec, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetRec.pet = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䊑\u0001"), new ChildElementBinder<VideoTargetRec>() { // from class: com.tencent.cos.xml.model.ci.common.VideoTargetRec$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VideoTargetRec videoTargetRec, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                videoTargetRec.car = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VideoTargetRec fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VideoTargetRec videoTargetRec = new VideoTargetRec();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VideoTargetRec> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, videoTargetRec, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䊒\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return videoTargetRec;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return videoTargetRec;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VideoTargetRec videoTargetRec, String str) throws IOException, XmlPullParserException {
        if (videoTargetRec == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䊒\u0001");
        }
        xmlSerializer.startTag("", str);
        if (videoTargetRec.body != null) {
            String s4 = ProtectedSandApp.s("䊏\u0001");
            xmlSerializer.startTag("", s4);
            a.a(videoTargetRec.body, xmlSerializer, "", s4);
        }
        if (videoTargetRec.pet != null) {
            String s5 = ProtectedSandApp.s("䊐\u0001");
            xmlSerializer.startTag("", s5);
            a.a(videoTargetRec.pet, xmlSerializer, "", s5);
        }
        if (videoTargetRec.car != null) {
            String s6 = ProtectedSandApp.s("䊑\u0001");
            xmlSerializer.startTag("", s6);
            a.a(videoTargetRec.car, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
