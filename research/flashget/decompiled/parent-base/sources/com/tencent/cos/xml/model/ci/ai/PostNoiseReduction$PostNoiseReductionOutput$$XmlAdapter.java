package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.PostNoiseReduction;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class PostNoiseReduction$PostNoiseReductionOutput$$XmlAdapter extends IXmlAdapter<PostNoiseReduction.PostNoiseReductionOutput> {
    private HashMap<String, ChildElementBinder<PostNoiseReduction.PostNoiseReductionOutput>> childElementBinders;

    public PostNoiseReduction$PostNoiseReductionOutput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostNoiseReduction.PostNoiseReductionOutput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㳤\u0001"), new ChildElementBinder<PostNoiseReduction.PostNoiseReductionOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReduction$PostNoiseReductionOutput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReduction.PostNoiseReductionOutput postNoiseReductionOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionOutput.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳥\u0001"), new ChildElementBinder<PostNoiseReduction.PostNoiseReductionOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReduction$PostNoiseReductionOutput$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReduction.PostNoiseReductionOutput postNoiseReductionOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionOutput.bucket = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㳦\u0001"), new ChildElementBinder<PostNoiseReduction.PostNoiseReductionOutput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostNoiseReduction$PostNoiseReductionOutput$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostNoiseReduction.PostNoiseReductionOutput postNoiseReductionOutput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postNoiseReductionOutput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostNoiseReduction.PostNoiseReductionOutput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostNoiseReduction.PostNoiseReductionOutput postNoiseReductionOutput = new PostNoiseReduction.PostNoiseReductionOutput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostNoiseReduction.PostNoiseReductionOutput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postNoiseReductionOutput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㳧\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postNoiseReductionOutput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postNoiseReductionOutput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostNoiseReduction.PostNoiseReductionOutput postNoiseReductionOutput, String str) throws IOException, XmlPullParserException {
        if (postNoiseReductionOutput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㳧\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postNoiseReductionOutput.region != null) {
            String s4 = ProtectedSandApp.s("㳤\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postNoiseReductionOutput.region, xmlSerializer, "", s4);
        }
        if (postNoiseReductionOutput.bucket != null) {
            String s5 = ProtectedSandApp.s("㳥\u0001");
            xmlSerializer.startTag("", s5);
            a.a(postNoiseReductionOutput.bucket, xmlSerializer, "", s5);
        }
        if (postNoiseReductionOutput.object != null) {
            String s6 = ProtectedSandApp.s("㳦\u0001");
            xmlSerializer.startTag("", s6);
            a.a(postNoiseReductionOutput.object, xmlSerializer, "", s6);
        }
        xmlSerializer.endTag("", str);
    }
}
