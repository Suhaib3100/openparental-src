package com.tencent.cos.xml.model.ci.common;

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
public class NoiseReduction$$XmlAdapter extends IXmlAdapter<NoiseReduction> {
    private HashMap<String, ChildElementBinder<NoiseReduction>> childElementBinders;

    public NoiseReduction$$XmlAdapter() {
        HashMap<String, ChildElementBinder<NoiseReduction>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䉜\u0001"), new ChildElementBinder<NoiseReduction>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReduction$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReduction noiseReduction, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReduction.format = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䉝\u0001"), new ChildElementBinder<NoiseReduction>() { // from class: com.tencent.cos.xml.model.ci.common.NoiseReduction$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, NoiseReduction noiseReduction, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                noiseReduction.samplerate = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public NoiseReduction fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        NoiseReduction noiseReduction = new NoiseReduction();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<NoiseReduction> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, noiseReduction, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䉞\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return noiseReduction;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return noiseReduction;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, NoiseReduction noiseReduction, String str) throws IOException, XmlPullParserException {
        if (noiseReduction == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䉞\u0001");
        }
        xmlSerializer.startTag("", str);
        if (noiseReduction.format != null) {
            String s4 = ProtectedSandApp.s("䉜\u0001");
            xmlSerializer.startTag("", s4);
            a.a(noiseReduction.format, xmlSerializer, "", s4);
        }
        if (noiseReduction.samplerate != null) {
            String s5 = ProtectedSandApp.s("䉝\u0001");
            xmlSerializer.startTag("", s5);
            a.a(noiseReduction.samplerate, xmlSerializer, "", s5);
        }
        xmlSerializer.endTag("", str);
    }
}
