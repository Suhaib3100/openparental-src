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
public class PostSegmentVideoBody$PostSegmentVideoBodyInput$$XmlAdapter extends IXmlAdapter<PostSegmentVideoBody.PostSegmentVideoBodyInput> {
    private HashMap<String, ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyInput>> childElementBinders;

    public PostSegmentVideoBody$PostSegmentVideoBodyInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㴡\u0001"), new ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyInput>() { // from class: com.tencent.cos.xml.model.ci.ai.PostSegmentVideoBody$PostSegmentVideoBodyInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, PostSegmentVideoBody.PostSegmentVideoBodyInput postSegmentVideoBodyInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                postSegmentVideoBodyInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public PostSegmentVideoBody.PostSegmentVideoBodyInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        PostSegmentVideoBody.PostSegmentVideoBodyInput postSegmentVideoBodyInput = new PostSegmentVideoBody.PostSegmentVideoBodyInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<PostSegmentVideoBody.PostSegmentVideoBodyInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, postSegmentVideoBodyInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㴢\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return postSegmentVideoBodyInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return postSegmentVideoBodyInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, PostSegmentVideoBody.PostSegmentVideoBodyInput postSegmentVideoBodyInput, String str) throws IOException, XmlPullParserException {
        if (postSegmentVideoBodyInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㴢\u0001");
        }
        xmlSerializer.startTag("", str);
        if (postSegmentVideoBodyInput.object != null) {
            String s4 = ProtectedSandApp.s("㴡\u0001");
            xmlSerializer.startTag("", s4);
            a.a(postSegmentVideoBodyInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
