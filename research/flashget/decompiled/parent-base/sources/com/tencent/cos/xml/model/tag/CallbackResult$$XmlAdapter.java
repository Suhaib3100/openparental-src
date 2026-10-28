package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.CallbackResult;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class CallbackResult$$XmlAdapter extends IXmlAdapter<CallbackResult> {
    private HashMap<String, ChildElementBinder<CallbackResult>> childElementBinders;

    public CallbackResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CallbackResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䧳\u0001"), new ChildElementBinder<CallbackResult>() { // from class: com.tencent.cos.xml.model.tag.CallbackResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CallbackResult callbackResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                callbackResult.status = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䧴\u0001"), new ChildElementBinder<CallbackResult>() { // from class: com.tencent.cos.xml.model.tag.CallbackResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CallbackResult callbackResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                callbackResult.callbackBody = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䧵\u0001"), new ChildElementBinder<CallbackResult>() { // from class: com.tencent.cos.xml.model.tag.CallbackResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CallbackResult callbackResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                callbackResult.callbackBodyNotBase64 = Boolean.parseBoolean(xmlPullParser.getText());
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䧶\u0001"), new ChildElementBinder<CallbackResult>() { // from class: com.tencent.cos.xml.model.tag.CallbackResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CallbackResult callbackResult, String str) throws IOException, XmlPullParserException {
                callbackResult.error = (CallbackResult.Error) QCloudXml.fromXml(xmlPullParser, CallbackResult.Error.class, ProtectedSandApp.s("䧲\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CallbackResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CallbackResult callbackResult = new CallbackResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CallbackResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, callbackResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䧷\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return callbackResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return callbackResult;
    }
}
