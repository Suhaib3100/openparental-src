package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class DescribeBucket$$XmlAdapter extends IXmlAdapter<DescribeBucket> {
    private HashMap<String, ChildElementBinder<DescribeBucket>> childElementBinders;

    public DescribeBucket$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeBucket>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䨛\u0001"), new ChildElementBinder<DescribeBucket>() { // from class: com.tencent.cos.xml.model.tag.DescribeBucket$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeBucket describeBucket, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeBucket.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨜\u0001"), new ChildElementBinder<DescribeBucket>() { // from class: com.tencent.cos.xml.model.tag.DescribeBucket$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeBucket describeBucket, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeBucket.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨝\u0001"), new ChildElementBinder<DescribeBucket>() { // from class: com.tencent.cos.xml.model.tag.DescribeBucket$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeBucket describeBucket, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeBucket.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨞\u0001"), new ChildElementBinder<DescribeBucket>() { // from class: com.tencent.cos.xml.model.tag.DescribeBucket$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeBucket describeBucket, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeBucket.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeBucket fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DescribeBucket describeBucket = new DescribeBucket();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeBucket> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, describeBucket, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䨟\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return describeBucket;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return describeBucket;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, DescribeBucket describeBucket, String str) throws IOException, XmlPullParserException {
        if (describeBucket == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䨟\u0001");
        }
        xmlSerializer.startTag("", str);
        if (describeBucket.bucketId != null) {
            String s4 = ProtectedSandApp.s("䨛\u0001");
            xmlSerializer.startTag("", s4);
            a.a(describeBucket.bucketId, xmlSerializer, "", s4);
        }
        if (describeBucket.name != null) {
            String s5 = ProtectedSandApp.s("䨜\u0001");
            xmlSerializer.startTag("", s5);
            a.a(describeBucket.name, xmlSerializer, "", s5);
        }
        if (describeBucket.region != null) {
            String s6 = ProtectedSandApp.s("䨝\u0001");
            xmlSerializer.startTag("", s6);
            a.a(describeBucket.region, xmlSerializer, "", s6);
        }
        if (describeBucket.createTime != null) {
            String s7 = ProtectedSandApp.s("䨞\u0001");
            xmlSerializer.startTag("", s7);
            a.a(describeBucket.createTime, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
