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
public class PostSegmentVideoBody$PostSegmentVideoBodyOutput$$XmlAdapter extends IXmlAdapter<PostSegmentVideoBody.PostSegmentVideoBodyOutput> {
    private HashMap<String, ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyOutput>> childElementBinders;

    public PostSegmentVideoBody$PostSegmentVideoBodyOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㴨\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodyOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodyOutput postSegmentVideoBodyOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴩\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodyOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodyOutput postSegmentVideoBodyOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㴪\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodyOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodyOutput postSegmentVideoBodyOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSegmentVideoBody.PostSegmentVideoBodyOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSegmentVideoBody.PostSegmentVideoBodyOutput postSegmentVideoBodyOutput = new PostSegmentVideoBody.PostSegmentVideoBodyOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSegmentVideoBodyOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㴫\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSegmentVideoBodyOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSegmentVideoBodyOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSegmentVideoBody.PostSegmentVideoBodyOutput postSegmentVideoBodyOutput, String str) throws IOException, XmlPullParserException {
        if (postSegmentVideoBodyOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㴫\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postSegmentVideoBodyOutput.region != null) {
            String s4 = ProtectedSandApp.s("㴨\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSegmentVideoBodyOutput.region, xmlSerializer, "", s4);
        }
        if (postSegmentVideoBodyOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("㴩\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postSegmentVideoBodyOutput.bucket, xmlSerializer, "", s5);
        }
        if (postSegmentVideoBodyOutput.object != null) {
            String s6 = ProtectedSandApp.s("㴪\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postSegmentVideoBodyOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
