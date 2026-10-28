package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.CreateStrategy;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class CreateStrategy$LabelInfo$$XmlAdapter extends IXmlAdapter<CreateStrategy.LabelInfo> {
    private HashMap<String, ChildElementBinder<CreateStrategy.LabelInfo>> childElementBinders;

    public CreateStrategy$LabelInfo$$XmlAdapter() {
        HashMap<String, ChildElementBinder<CreateStrategy.LabelInfo>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䂀\u0001"), new ChildElementBinder<CreateStrategy.LabelInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$LabelInfo$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.LabelInfo labelInfo, String str) throws IOException, XmlPullParserException {
                if (labelInfo.porn == null) {
                    labelInfo.porn = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        labelInfo.porn.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䁺\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂁\u0001"), new ChildElementBinder<CreateStrategy.LabelInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$LabelInfo$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.LabelInfo labelInfo, String str) throws IOException, XmlPullParserException {
                if (labelInfo.politics == null) {
                    labelInfo.politics = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        labelInfo.politics.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䁻\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂂\u0001"), new ChildElementBinder<CreateStrategy.LabelInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$LabelInfo$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.LabelInfo labelInfo, String str) throws IOException, XmlPullParserException {
                if (labelInfo.terrorism == null) {
                    labelInfo.terrorism = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        labelInfo.terrorism.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䁼\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂃\u0001"), new ChildElementBinder<CreateStrategy.LabelInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$LabelInfo$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.LabelInfo labelInfo, String str) throws IOException, XmlPullParserException {
                if (labelInfo.ads == null) {
                    labelInfo.ads = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        labelInfo.ads.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䁽\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂄\u0001"), new ChildElementBinder<CreateStrategy.LabelInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$LabelInfo$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.LabelInfo labelInfo, String str) throws IOException, XmlPullParserException {
                if (labelInfo.abuse == null) {
                    labelInfo.abuse = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        labelInfo.abuse.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䁾\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䂅\u0001"), new ChildElementBinder<CreateStrategy.LabelInfo>() { // from class: com.tencent.cos.xml.model.ci.audit.CreateStrategy$LabelInfo$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, CreateStrategy.LabelInfo labelInfo, String str) throws IOException, XmlPullParserException {
                if (labelInfo.illegal == null) {
                    labelInfo.illegal = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        labelInfo.illegal.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䁿\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public CreateStrategy.LabelInfo fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        CreateStrategy.LabelInfo labelInfo = new CreateStrategy.LabelInfo();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<CreateStrategy.LabelInfo> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, labelInfo, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䂆\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return labelInfo;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return labelInfo;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, CreateStrategy.LabelInfo labelInfo, String str) throws IOException, XmlPullParserException {
        if (labelInfo == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䂆\u0001");
        }
        xmlSerializer.startTag("", str);
        if (labelInfo.porn != null) {
            for (int i4 = 0; i4 < labelInfo.porn.size(); i4++) {
                String s4 = ProtectedSandApp.s("䂀\u0001");
                xmlSerializer.startTag("", s4);
                xmlSerializer.text(String.valueOf(labelInfo.porn.get(i4)));
                xmlSerializer.endTag("", s4);
            }
        }
        if (labelInfo.politics != null) {
            for (int i5 = 0; i5 < labelInfo.politics.size(); i5++) {
                String s5 = ProtectedSandApp.s("䂁\u0001");
                xmlSerializer.startTag("", s5);
                xmlSerializer.text(String.valueOf(labelInfo.politics.get(i5)));
                xmlSerializer.endTag("", s5);
            }
        }
        if (labelInfo.terrorism != null) {
            for (int i6 = 0; i6 < labelInfo.terrorism.size(); i6++) {
                String s6 = ProtectedSandApp.s("䂂\u0001");
                xmlSerializer.startTag("", s6);
                xmlSerializer.text(String.valueOf(labelInfo.terrorism.get(i6)));
                xmlSerializer.endTag("", s6);
            }
        }
        if (labelInfo.ads != null) {
            for (int i7 = 0; i7 < labelInfo.ads.size(); i7++) {
                String s7 = ProtectedSandApp.s("䂃\u0001");
                xmlSerializer.startTag("", s7);
                xmlSerializer.text(String.valueOf(labelInfo.ads.get(i7)));
                xmlSerializer.endTag("", s7);
            }
        }
        if (labelInfo.abuse != null) {
            for (int i10 = 0; i10 < labelInfo.abuse.size(); i10++) {
                String s10 = ProtectedSandApp.s("䂄\u0001");
                xmlSerializer.startTag("", s10);
                xmlSerializer.text(String.valueOf(labelInfo.abuse.get(i10)));
                xmlSerializer.endTag("", s10);
            }
        }
        if (labelInfo.illegal != null) {
            for (int i11 = 0; i11 < labelInfo.illegal.size(); i11++) {
                String s11 = ProtectedSandApp.s("䂅\u0001");
                xmlSerializer.startTag("", s11);
                xmlSerializer.text(String.valueOf(labelInfo.illegal.get(i11)));
                xmlSerializer.endTag("", s11);
            }
        }
        xmlSerializer.endTag("", str);
    }
}
