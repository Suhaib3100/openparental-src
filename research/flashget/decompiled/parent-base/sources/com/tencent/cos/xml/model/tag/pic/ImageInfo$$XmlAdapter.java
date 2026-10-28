package com.tencent.cos.xml.model.tag.pic;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class ImageInfo$$XmlAdapter extends IXmlAdapter<ImageInfo> {
    private HashMap<String, ChildElementBinder<ImageInfo>> childElementBinders;

    public ImageInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ImageInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("享\u0001"), new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageInfo.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("京\u0001"), new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws IOException, XmlPullParserException {
                imageInfo.width = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亭\u0001"), new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws IOException, XmlPullParserException {
                imageInfo.height = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亮\u0001"), new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws IOException, XmlPullParserException {
                imageInfo.quality = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亯\u0001"), new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                imageInfo.ave = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亰\u0001"), new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws IOException, XmlPullParserException {
                imageInfo.orientation = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亱\u0001"), new ChildElementBinder<ImageInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.ImageInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageInfo imageInfo, String str) throws IOException, XmlPullParserException {
                imageInfo.frameCount = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ImageInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        ImageInfo imageInfo = new ImageInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ImageInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, imageInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("亲\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return imageInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return imageInfo;
    }
}
