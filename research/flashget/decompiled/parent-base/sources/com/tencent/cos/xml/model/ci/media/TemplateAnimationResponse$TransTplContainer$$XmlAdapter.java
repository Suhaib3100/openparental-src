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
public class TemplateAnimationResponse$TransTplContainer$$XmlAdapter extends IXmlAdapter<TemplateAnimationResponse.TransTplContainer> {
    private HashMap<String, ChildElementBinder<TemplateAnimationResponse.TransTplContainer>> childElementBinders;

    public TemplateAnimationResponse$TransTplContainer$$XmlAdapter() {
        HashMap<String, ChildElementBinder<TemplateAnimationResponse.TransTplContainer>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䛾\u0001"), new ChildElementBinder<TemplateAnimationResponse.TransTplContainer>() { // from class: com.tencent.cos.xml.model.ci.media.TemplateAnimationResponse$TransTplContainer$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, TemplateAnimationResponse.TransTplContainer transTplContainer, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                transTplContainer.format = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public TemplateAnimationResponse.TransTplContainer fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        TemplateAnimationResponse.TransTplContainer transTplContainer = new TemplateAnimationResponse.TransTplContainer();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<TemplateAnimationResponse.TransTplContainer> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, transTplContainer, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䛿\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return transTplContainer;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return transTplContainer;
    }
}
