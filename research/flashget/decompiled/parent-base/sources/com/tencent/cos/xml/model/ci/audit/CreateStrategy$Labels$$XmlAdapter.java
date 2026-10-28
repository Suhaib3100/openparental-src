package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.CreateStrategy;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateStrategy$Labels$$XmlAdapter extends IXmlAdapter<CreateStrategy.Labels> {
    private HashMap<String, ChildElementBinder<CreateStrategy.Labels>> childElementBinders;

    public CreateStrategy$Labels$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CreateStrategy.Labels>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䂊\u0001"), new ChildElementBinder<CreateStrategy.Labels>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$Labels$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.image = (CreateStrategy.LabelInfo) QCloudXml.fromXml(xmlPullParser, CreateStrategy.LabelInfo.class, ProtectedSandApp.s("䂇\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂋\u0001"), new ChildElementBinder<CreateStrategy.Labels>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$Labels$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.text = (CreateStrategy.LabelInfo) QCloudXml.fromXml(xmlPullParser, CreateStrategy.LabelInfo.class, ProtectedSandApp.s("䂈\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂌\u0001"), new ChildElementBinder<CreateStrategy.Labels>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$Labels$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.Labels labels, String str) throws IOException, XmlPullParserException {
                labels.audio = (CreateStrategy.LabelInfo) QCloudXml.fromXml(xmlPullParser, CreateStrategy.LabelInfo.class, ProtectedSandApp.s("䂉\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CreateStrategy.Labels fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CreateStrategy.Labels labels = new CreateStrategy.Labels();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CreateStrategy.Labels> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, labels, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䂍\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return labels;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return labels;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateStrategy.Labels labels, String str) throws IOException, XmlPullParserException {
        if (labels == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䂍\u0001");
        }
        xmlSerializer.startTag("", str);
        CreateStrategy.LabelInfo labelInfo = labels.image;
        if (labelInfo != null) {
            QCloudXml.toXml(xmlSerializer, labelInfo, ProtectedSandApp.s("䂊\u0001"));
        }
        CreateStrategy.LabelInfo labelInfo2 = labels.text;
        if (labelInfo2 != null) {
            QCloudXml.toXml(xmlSerializer, labelInfo2, ProtectedSandApp.s("䂋\u0001"));
        }
        CreateStrategy.LabelInfo labelInfo3 = labels.audio;
        if (labelInfo3 != null) {
            QCloudXml.toXml(xmlSerializer, labelInfo3, ProtectedSandApp.s("䂌\u0001"));
        }
        xmlSerializer.endTag("", str);
    }
}
