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
public class PicObject$$XmlAdapter extends IXmlAdapter<PicObject> {
    private HashMap<String, ChildElementBinder<PicObject>> childElementBinders;

    public PicObject$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PicObject>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("亳\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picObject.key = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亴\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picObject.location = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亵\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picObject.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亶\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                picObject.width = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亷\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                picObject.height = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亸\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                picObject.size = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亹\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                picObject.quality = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("人\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                picObject.etag = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("亻\u0001"), new ChildElementBinder<PicObject>() { // from class: com.tencent.cos.xml.model.tag.pic.PicObject$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicObject picObject, String str) throws IOException, XmlPullParserException {
                picObject.frameCount = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PicObject fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PicObject picObject = new PicObject();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PicObject> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, picObject, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("亼\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return picObject;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return picObject;
    }
}
