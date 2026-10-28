package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.RecognitionResult;
import com.tencent.cos.xml.model.tag.audit.bean.AuditLibResults;
import com.tencent.cos.xml.model.tag.audit.bean.AuditOcrResults;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class RecognitionResult$PornInfo$$XmlAdapter extends IXmlAdapter<RecognitionResult.PornInfo> {
    private HashMap<String, ChildElementBinder<RecognitionResult.PornInfo>> childElementBinders;

    public RecognitionResult$PornInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<RecognitionResult.PornInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䮈\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                pornInfo.code = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮉\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                pornInfo.msg = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮊\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                pornInfo.hitFlag = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮋\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                pornInfo.score = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮌\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                pornInfo.label = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮍\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                pornInfo.category = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮎\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                pornInfo.subLabel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮏\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                if (pornInfo.ocrResults == null) {
                    pornInfo.ocrResults = new ArrayList();
                }
                pornInfo.ocrResults.add((AuditOcrResults) QCloudXml.fromXml(xmlPullParser, AuditOcrResults.class, ProtectedSandApp.s("䮆\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䮐\u0001"), new ChildElementBinder<RecognitionResult.PornInfo>() { // from class: com.tencent.cos.xml.model.tag.RecognitionResult$PornInfo$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, RecognitionResult.PornInfo pornInfo, String str) throws IOException, XmlPullParserException {
                if (pornInfo.libResults == null) {
                    pornInfo.libResults = new ArrayList();
                }
                pornInfo.libResults.add((AuditLibResults) QCloudXml.fromXml(xmlPullParser, AuditLibResults.class, ProtectedSandApp.s("䮇\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public RecognitionResult.PornInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        RecognitionResult.PornInfo pornInfo = new RecognitionResult.PornInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<RecognitionResult.PornInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, pornInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䮑\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return pornInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return pornInfo;
    }
}
