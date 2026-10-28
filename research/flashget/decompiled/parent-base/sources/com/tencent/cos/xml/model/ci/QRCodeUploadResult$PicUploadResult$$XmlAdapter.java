package com.tencent.cos.xml.model.ci;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.QRCodeUploadResult;
import com.tencent.cos.xml.model.tag.pic.PicOriginalInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class QRCodeUploadResult$PicUploadResult$$XmlAdapter extends IXmlAdapter<QRCodeUploadResult.PicUploadResult> {
    private HashMap<String, ChildElementBinder<QRCodeUploadResult.PicUploadResult>> childElementBinders;

    public QRCodeUploadResult$PicUploadResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<QRCodeUploadResult.PicUploadResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㫗\u0001"), new ChildElementBinder<QRCodeUploadResult.PicUploadResult>() { // from class: com.tencent.cos.xml.model.ci.QRCodeUploadResult$PicUploadResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, QRCodeUploadResult.PicUploadResult picUploadResult, String str) throws IOException, XmlPullParserException {
                picUploadResult.originalInfo = (PicOriginalInfo) QCloudXml.fromXml(xmlPullParser, PicOriginalInfo.class, ProtectedSandApp.s("㫔\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㫘\u0001"), new ChildElementBinder<QRCodeUploadResult.PicUploadResult>() { // from class: com.tencent.cos.xml.model.ci.QRCodeUploadResult$PicUploadResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, QRCodeUploadResult.PicUploadResult picUploadResult, String str) throws IOException, XmlPullParserException {
                if (picUploadResult.processResults == null) {
                    picUploadResult.processResults = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        picUploadResult.processResults.add((QRCodeUploadResult.QrPicObject) QCloudXml.fromXml(xmlPullParser, QRCodeUploadResult.QrPicObject.class, ProtectedSandApp.s("㫖\u0001")));
                    } else if (eventType == 3 && ProtectedSandApp.s("㫕\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public QRCodeUploadResult.PicUploadResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        QRCodeUploadResult.PicUploadResult picUploadResult = new QRCodeUploadResult.PicUploadResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<QRCodeUploadResult.PicUploadResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, picUploadResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㫙\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return picUploadResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return picUploadResult;
    }
}
