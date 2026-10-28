package com.tencent.cos.xml.model.tag.pic;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PicOriginalInfo$$XmlAdapter extends IXmlAdapter<PicOriginalInfo> {
    private HashMap<String, ChildElementBinder<PicOriginalInfo>> childElementBinders;

    public PicOriginalInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PicOriginalInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("仆\u0001"), new ChildElementBinder<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picOriginalInfo.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("仇\u0001"), new ChildElementBinder<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picOriginalInfo.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("仈\u0001"), new ChildElementBinder<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picOriginalInfo.etag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("仉\u0001"), new ChildElementBinder<PicOriginalInfo>() { // from class: com.tencent.cos.xml.model.tag.pic.PicOriginalInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicOriginalInfo picOriginalInfo, String str) throws IOException, XmlPullParserException {
                picOriginalInfo.imageInfo = (ImageInfo) QCloudXml.fromXml(xmlPullParser, ImageInfo.class, ProtectedSandApp.s("仅\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PicOriginalInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PicOriginalInfo picOriginalInfo = new PicOriginalInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PicOriginalInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, picOriginalInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("今\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return picOriginalInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return picOriginalInfo;
    }
}
