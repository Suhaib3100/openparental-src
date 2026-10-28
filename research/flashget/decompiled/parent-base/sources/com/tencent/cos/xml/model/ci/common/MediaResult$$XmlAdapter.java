package com.tencent.cos.xml.model.ci.common;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class MediaResult$$XmlAdapter extends IXmlAdapter<MediaResult> {
    private HashMap<String, ChildElementBinder<MediaResult>> childElementBinders;

    public MediaResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<MediaResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䉏\u0001"), new ChildElementBinder<MediaResult>() { // from class: com.tencent.cos.xml.model.ci.common.MediaResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, MediaResult mediaResult, String str) throws IOException, XmlPullParserException {
                mediaResult.outputFile = (MediaResultOutputFile) QCloudXml.fromXml(xmlPullParser, MediaResultOutputFile.class, ProtectedSandApp.s("䉎\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public MediaResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        MediaResult mediaResult = new MediaResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<MediaResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䉐\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaResult;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, MediaResult mediaResult, String str) throws IOException, XmlPullParserException {
        if (mediaResult == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䉐\u0001");
        }
        xmlSerializer.startTag("", str);
        MediaResultOutputFile mediaResultOutputFile = mediaResult.outputFile;
        if (mediaResultOutputFile != null) {
            QCloudXml.toXml(xmlSerializer, mediaResultOutputFile, ProtectedSandApp.s("䉏\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
