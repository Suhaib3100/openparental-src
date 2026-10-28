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
public class MediaResultMd5Info$$XmlAdapter extends IXmlAdapter<MediaResultMd5Info> {
    private HashMap<String, ChildElementBinder<MediaResultMd5Info>> childElementBinders;

    public MediaResultMd5Info$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaResultMd5Info>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䉑\u0001"), new ChildElementBinder<MediaResultMd5Info>() { // from class: com.tencent.cos.xml.model.ci.common.MediaResultMd5Info$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaResultMd5Info mediaResultMd5Info, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaResultMd5Info.objectName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉒\u0001"), new ChildElementBinder<MediaResultMd5Info>() { // from class: com.tencent.cos.xml.model.ci.common.MediaResultMd5Info$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaResultMd5Info mediaResultMd5Info, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaResultMd5Info.md5 = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaResultMd5Info fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaResultMd5Info mediaResultMd5Info = new MediaResultMd5Info();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaResultMd5Info> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaResultMd5Info, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䉓\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaResultMd5Info;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaResultMd5Info;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaResultMd5Info mediaResultMd5Info, String str) throws IOException, XmlPullParserException {
        if (mediaResultMd5Info == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䉓\u0001");
        }
        xmlSerializer.startTag("", str);
        if (mediaResultMd5Info.objectName != null) {
            String s4 = ProtectedSandApp.s("䉑\u0001");
            xmlSerializer.startTag("", s4);
            a.a(mediaResultMd5Info.objectName, xmlSerializer, "", s4);
        }
        if (mediaResultMd5Info.md5 != null) {
            String s5 = ProtectedSandApp.s("䉒\u0001");
            xmlSerializer.startTag("", s5);
            a.a(mediaResultMd5Info.md5, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
