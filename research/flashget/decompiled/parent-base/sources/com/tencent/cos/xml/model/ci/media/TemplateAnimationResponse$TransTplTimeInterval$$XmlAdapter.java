package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class TemplateAnimationResponse$TransTplTimeInterval$$XmlAdapter extends IXmlAdapter<TemplateAnimationResponse.TransTplTimeInterval> {
    private HashMap<String, ChildElementBinder<TemplateAnimationResponse.TransTplTimeInterval>> childElementBinders;

    public TemplateAnimationResponse$TransTplTimeInterval$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateAnimationResponse.TransTplTimeInterval>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䜀\u0001"), new ChildElementBinder<TemplateAnimationResponse.TransTplTimeInterval>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$TransTplTimeInterval$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse.TransTplTimeInterval transTplTimeInterval, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                transTplTimeInterval.start = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䜁\u0001"), new ChildElementBinder<TemplateAnimationResponse.TransTplTimeInterval>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$TransTplTimeInterval$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse.TransTplTimeInterval transTplTimeInterval, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                transTplTimeInterval.duration = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateAnimationResponse.TransTplTimeInterval fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateAnimationResponse.TransTplTimeInterval transTplTimeInterval = new TemplateAnimationResponse.TransTplTimeInterval();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateAnimationResponse.TransTplTimeInterval> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, transTplTimeInterval, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䜂\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return transTplTimeInterval;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return transTplTimeInterval;
    }
}
