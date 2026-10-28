package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CreateCRcodeResponse$$XmlAdapter extends IXmlAdapter<CreateCRcodeResponse> {
    private HashMap<String, ChildElementBinder<CreateCRcodeResponse>> childElementBinders;

    public CreateCRcodeResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CreateCRcodeResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㰜\u0001"), new ChildElementBinder<CreateCRcodeResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.CreateCRcodeResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateCRcodeResponse createCRcodeResponse, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                createCRcodeResponse.resultImage = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CreateCRcodeResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CreateCRcodeResponse createCRcodeResponse = new CreateCRcodeResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CreateCRcodeResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, createCRcodeResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㰝\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return createCRcodeResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return createCRcodeResponse;
    }
}
