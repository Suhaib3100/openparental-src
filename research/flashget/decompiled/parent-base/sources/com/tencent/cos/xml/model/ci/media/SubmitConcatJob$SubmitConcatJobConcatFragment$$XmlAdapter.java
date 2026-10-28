package com.tencent.cos.xml.model.ci.media;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.a;
import com.tencent.cos.xml.model.ci.media.SubmitConcatJob;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class SubmitConcatJob$SubmitConcatJobConcatFragment$$XmlAdapter extends IXmlAdapter<SubmitConcatJob.SubmitConcatJobConcatFragment> {
    private HashMap<String, ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatFragment>> childElementBinders;

    public SubmitConcatJob$SubmitConcatJobConcatFragment$$XmlAdapter() {
        HashMap<String, ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatFragment>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䎬\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatFragment>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatFragment$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatFragment submitConcatJobConcatFragment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobConcatFragment.url = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎭\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatFragment>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatFragment$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatFragment submitConcatJobConcatFragment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobConcatFragment.fragmentIndex = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎮\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatFragment>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatFragment$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatFragment submitConcatJobConcatFragment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobConcatFragment.startTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䎯\u0001"), new ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatFragment>() { // from class: com.tencent.cos.xml.model.ci.media.SubmitConcatJob$SubmitConcatJobConcatFragment$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, SubmitConcatJob.SubmitConcatJobConcatFragment submitConcatJobConcatFragment, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                submitConcatJobConcatFragment.endTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public SubmitConcatJob.SubmitConcatJobConcatFragment fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        SubmitConcatJob.SubmitConcatJobConcatFragment submitConcatJobConcatFragment = new SubmitConcatJob.SubmitConcatJobConcatFragment();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<SubmitConcatJob.SubmitConcatJobConcatFragment> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, submitConcatJobConcatFragment, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䎰\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return submitConcatJobConcatFragment;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return submitConcatJobConcatFragment;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, SubmitConcatJob.SubmitConcatJobConcatFragment submitConcatJobConcatFragment, String str) throws IOException, XmlPullParserException {
        if (submitConcatJobConcatFragment == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("䎰\u0001");
        }
        xmlSerializer.startTag("", str);
        if (submitConcatJobConcatFragment.url != null) {
            String s4 = ProtectedSandApp.s("䎬\u0001");
            xmlSerializer.startTag("", s4);
            a.a(submitConcatJobConcatFragment.url, xmlSerializer, "", s4);
        }
        if (submitConcatJobConcatFragment.fragmentIndex != null) {
            String s5 = ProtectedSandApp.s("䎭\u0001");
            xmlSerializer.startTag("", s5);
            a.a(submitConcatJobConcatFragment.fragmentIndex, xmlSerializer, "", s5);
        }
        if (submitConcatJobConcatFragment.startTime != null) {
            String s6 = ProtectedSandApp.s("䎮\u0001");
            xmlSerializer.startTag("", s6);
            a.a(submitConcatJobConcatFragment.startTime, xmlSerializer, "", s6);
        }
        if (submitConcatJobConcatFragment.endTime != null) {
            String s7 = ProtectedSandApp.s("䎯\u0001");
            xmlSerializer.startTag("", s7);
            a.a(submitConcatJobConcatFragment.endTime, xmlSerializer, "", s7);
        }
        xmlSerializer.endTag("", str);
    }
}
