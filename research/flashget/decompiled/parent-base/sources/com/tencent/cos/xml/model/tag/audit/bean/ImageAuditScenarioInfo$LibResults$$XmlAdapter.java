package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class ImageAuditScenarioInfo$LibResults$$XmlAdapter extends IXmlAdapter<ImageAuditScenarioInfo.LibResults> {
    private HashMap<String, ChildElementBinder<ImageAuditScenarioInfo.LibResults>> childElementBinders;

    public ImageAuditScenarioInfo$LibResults$$XmlAdapter() {
        HashMap<String, ChildElementBinder<ImageAuditScenarioInfo.LibResults>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䱲\u0001"), new ChildElementBinder<ImageAuditScenarioInfo.LibResults>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$LibResults$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo.LibResults libResults, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                libResults.imageId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䱳\u0001"), new ChildElementBinder<ImageAuditScenarioInfo.LibResults>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.ImageAuditScenarioInfo$LibResults$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, ImageAuditScenarioInfo.LibResults libResults, String str) throws IOException, XmlPullParserException {
                libResults.score = a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public ImageAuditScenarioInfo.LibResults fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        ImageAuditScenarioInfo.LibResults libResults = new ImageAuditScenarioInfo.LibResults();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<ImageAuditScenarioInfo.LibResults> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, libResults, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䱴\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return libResults;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return libResults;
    }
}
