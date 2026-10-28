package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetSearchImageResponse$$XmlAdapter extends IXmlAdapter<GetSearchImageResponse> {
    private HashMap<String, ChildElementBinder<GetSearchImageResponse>> childElementBinders;

    public GetSearchImageResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetSearchImageResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㲗\u0001"), new ChildElementBinder<GetSearchImageResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetSearchImageResponse getSearchImageResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                getSearchImageResponse.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㲘\u0001"), new ChildElementBinder<GetSearchImageResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetSearchImageResponse getSearchImageResponse, String str) throws IOException, XmlPullParserException {
                getSearchImageResponse.count = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㲙\u0001"), new ChildElementBinder<GetSearchImageResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.GetSearchImageResponse$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetSearchImageResponse getSearchImageResponse, String str) throws IOException, XmlPullParserException {
                if (getSearchImageResponse.imageInfos == null) {
                    getSearchImageResponse.imageInfos = new ArrayList();
                }
                getSearchImageResponse.imageInfos.add((GetSearchImageResponse.GetSearchImageResponseImageInfos) QCloudXml.fromXml(xmlPullParser, GetSearchImageResponse.GetSearchImageResponseImageInfos.class, ProtectedSandApp.s("㲖\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetSearchImageResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetSearchImageResponse getSearchImageResponse = new GetSearchImageResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetSearchImageResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, getSearchImageResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㲚\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return getSearchImageResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return getSearchImageResponse;
    }
}
