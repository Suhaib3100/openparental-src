package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter extends IXmlAdapter<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody> {
    private HashMap<String, ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>> childElementBinders;

    public PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㴬\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.mode = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴭\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.segmentType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴮\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.backgroundRed = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴯\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.backgroundGreen = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴰\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.backgroundBlue = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴱\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.6
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.backgroundLogoUrl = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴲\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.7
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.binaryThreshold = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴳\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.8
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.removeRed = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴴\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.9
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.removeGreen = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴵\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodySegmentVideoBody$$XmlAdapter.10
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodySegmentVideoBody.removeBlue = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody = new PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSegmentVideoBodySegmentVideoBody, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㴶\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSegmentVideoBodySegmentVideoBody;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSegmentVideoBodySegmentVideoBody;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSegmentVideoBody.PostSegmentVideoBodySegmentVideoBody postSegmentVideoBodySegmentVideoBody, String str) throws IOException, XmlPullParserException {
        if (postSegmentVideoBodySegmentVideoBody == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㴶\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postSegmentVideoBodySegmentVideoBody.mode != null) {
            String s4 = ProtectedSandApp.s("㴬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSegmentVideoBodySegmentVideoBody.mode, xmlSerializer, "", s4);
        }
        if (postSegmentVideoBodySegmentVideoBody.segmentType != null) {
            String s5 = ProtectedSandApp.s("㴭\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postSegmentVideoBodySegmentVideoBody.segmentType, xmlSerializer, "", s5);
        }
        if (postSegmentVideoBodySegmentVideoBody.backgroundRed != null) {
            String s6 = ProtectedSandApp.s("㴮\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postSegmentVideoBodySegmentVideoBody.backgroundRed, xmlSerializer, "", s6);
        }
        if (postSegmentVideoBodySegmentVideoBody.backgroundGreen != null) {
            String s7 = ProtectedSandApp.s("㴯\u0001");
            xmlSerializer.startTag("", s7);
            a.a(postSegmentVideoBodySegmentVideoBody.backgroundGreen, xmlSerializer, "", s7);
        }
        if (postSegmentVideoBodySegmentVideoBody.backgroundBlue != null) {
            String s10 = ProtectedSandApp.s("㴰\u0001");
            xmlSerializer.startTag("", s10);
            a.a(postSegmentVideoBodySegmentVideoBody.backgroundBlue, xmlSerializer, "", s10);
        }
        if (postSegmentVideoBodySegmentVideoBody.backgroundLogoUrl != null) {
            String s11 = ProtectedSandApp.s("㴱\u0001");
            xmlSerializer.startTag("", s11);
            a.a(postSegmentVideoBodySegmentVideoBody.backgroundLogoUrl, xmlSerializer, "", s11);
        }
        if (postSegmentVideoBodySegmentVideoBody.binaryThreshold != null) {
            String s12 = ProtectedSandApp.s("㴲\u0001");
            xmlSerializer.startTag("", s12);
            a.a(postSegmentVideoBodySegmentVideoBody.binaryThreshold, xmlSerializer, "", s12);
        }
        if (postSegmentVideoBodySegmentVideoBody.removeRed != null) {
            String s13 = ProtectedSandApp.s("㴳\u0001");
            xmlSerializer.startTag("", s13);
            a.a(postSegmentVideoBodySegmentVideoBody.removeRed, xmlSerializer, "", s13);
        }
        if (postSegmentVideoBodySegmentVideoBody.removeGreen != null) {
            String s14 = ProtectedSandApp.s("㴴\u0001");
            xmlSerializer.startTag("", s14);
            a.a(postSegmentVideoBodySegmentVideoBody.removeGreen, xmlSerializer, "", s14);
        }
        if (postSegmentVideoBodySegmentVideoBody.removeBlue != null) {
            String s15 = ProtectedSandApp.s("㴵\u0001");
            xmlSerializer.startTag("", s15);
            a.a(postSegmentVideoBodySegmentVideoBody.removeBlue, xmlSerializer, "", s15);
        }
        xmlSerializer.endTag("", str);
    }
}
