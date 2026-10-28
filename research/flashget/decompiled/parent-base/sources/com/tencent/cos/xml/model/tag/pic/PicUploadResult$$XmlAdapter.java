package com.tencent.cos.xml.model.tag.pic;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class PicUploadResult$$XmlAdapter extends IXmlAdapter<PicUploadResult> {
    private HashMap<String, ChildElementBinder<PicUploadResult>> childElementBinders;

    public PicUploadResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PicUploadResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("从\u0001"), new ChildElementBinder<PicUploadResult>() { // from class: com.tencent.cos.xml.model.tag.pic.PicUploadResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicUploadResult picUploadResult, String str) throws IOException, XmlPullParserException {
                picUploadResult.originalInfo = (PicOriginalInfo) QCloudXml.fromXml(xmlPullParser, PicOriginalInfo.class, ProtectedSandApp.s("介\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("仏\u0001"), new ChildElementBinder<PicUploadResult>() { // from class: com.tencent.cos.xml.model.tag.pic.PicUploadResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PicUploadResult picUploadResult, String str) throws IOException, XmlPullParserException {
                if (picUploadResult.processResults == null) {
                    picUploadResult.processResults = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        picUploadResult.processResults.add((PicObject) QCloudXml.fromXml(xmlPullParser, PicObject.class, ProtectedSandApp.s("仍\u0001")));
                    } else if (eventType == 3 && ProtectedSandApp.s("仌\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PicUploadResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PicUploadResult picUploadResult = new PicUploadResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PicUploadResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, picUploadResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("仐\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
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
