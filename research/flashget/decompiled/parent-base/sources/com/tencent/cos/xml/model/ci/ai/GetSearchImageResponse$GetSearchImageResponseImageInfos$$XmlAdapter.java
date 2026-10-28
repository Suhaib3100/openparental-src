package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetSearchImageResponse$GetSearchImageResponseImageInfos$$XmlAdapter extends IXmlAdapter<GetSearchImageResponse.GetSearchImageResponseImageInfos> {
    private HashMap<String, ChildElementBinder<GetSearchImageResponse.GetSearchImageResponseImageInfos>> childElementBinders;

    public GetSearchImageResponse$GetSearchImageResponseImageInfos$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetSearchImageResponse.GetSearchImageResponseImageInfos>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㲛\u0001"), new ChildElementBinder<GetSearchImageResponse.GetSearchImageResponseImageInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse$GetSearchImageResponseImageInfos$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetSearchImageResponse.GetSearchImageResponseImageInfos getSearchImageResponseImageInfos, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getSearchImageResponseImageInfos.entityId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㲜\u0001"), new ChildElementBinder<GetSearchImageResponse.GetSearchImageResponseImageInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse$GetSearchImageResponseImageInfos$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetSearchImageResponse.GetSearchImageResponseImageInfos getSearchImageResponseImageInfos, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getSearchImageResponseImageInfos.customContent = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㲝\u0001"), new ChildElementBinder<GetSearchImageResponse.GetSearchImageResponseImageInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse$GetSearchImageResponseImageInfos$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetSearchImageResponse.GetSearchImageResponseImageInfos getSearchImageResponseImageInfos, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getSearchImageResponseImageInfos.tags = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㲞\u0001"), new ChildElementBinder<GetSearchImageResponse.GetSearchImageResponseImageInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse$GetSearchImageResponseImageInfos$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetSearchImageResponse.GetSearchImageResponseImageInfos getSearchImageResponseImageInfos, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getSearchImageResponseImageInfos.picName = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㲟\u0001"), new ChildElementBinder<GetSearchImageResponse.GetSearchImageResponseImageInfos>() { // from class: com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse$GetSearchImageResponseImageInfos$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetSearchImageResponse.GetSearchImageResponseImageInfos getSearchImageResponseImageInfos, String str) throws IOException, XmlPullParserException {
                getSearchImageResponseImageInfos.score = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetSearchImageResponse.GetSearchImageResponseImageInfos fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetSearchImageResponse.GetSearchImageResponseImageInfos getSearchImageResponseImageInfos = new GetSearchImageResponse.GetSearchImageResponseImageInfos();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetSearchImageResponse.GetSearchImageResponseImageInfos> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getSearchImageResponseImageInfos, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㲠\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getSearchImageResponseImageInfos;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getSearchImageResponseImageInfos;
    }
}
