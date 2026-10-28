package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScoreResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class VocalScoreResponse$VocalScoreResponseSentenceScores$$XmlAdapter extends IXmlAdapter<VocalScoreResponse.VocalScoreResponseSentenceScores> {
    private HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseSentenceScores>> childElementBinders;

    public VocalScoreResponse$VocalScoreResponseSentenceScores$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseSentenceScores>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽩\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseSentenceScores>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseSentenceScores$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseSentenceScores vocalScoreResponseSentenceScores, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseSentenceScores.startTime = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽪\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseSentenceScores>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseSentenceScores$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseSentenceScores vocalScoreResponseSentenceScores, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseSentenceScores.endTime = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽫\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseSentenceScores>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseSentenceScores$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseSentenceScores vocalScoreResponseSentenceScores, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseSentenceScores.score = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VocalScoreResponse.VocalScoreResponseSentenceScores fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VocalScoreResponse.VocalScoreResponseSentenceScores vocalScoreResponseSentenceScores = new VocalScoreResponse.VocalScoreResponseSentenceScores();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VocalScoreResponse.VocalScoreResponseSentenceScores> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, vocalScoreResponseSentenceScores, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㽬\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return vocalScoreResponseSentenceScores;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return vocalScoreResponseSentenceScores;
    }
}
