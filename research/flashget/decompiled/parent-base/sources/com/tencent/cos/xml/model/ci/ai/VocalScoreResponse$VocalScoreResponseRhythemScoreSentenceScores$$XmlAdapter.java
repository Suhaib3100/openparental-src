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
public class VocalScoreResponse$VocalScoreResponseRhythemScoreSentenceScores$$XmlAdapter extends IXmlAdapter<VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores> {
    private HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores>> childElementBinders;

    public VocalScoreResponse$VocalScoreResponseRhythemScoreSentenceScores$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽥\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseRhythemScoreSentenceScores$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores vocalScoreResponseRhythemScoreSentenceScores, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseRhythemScoreSentenceScores.startTime = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽦\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseRhythemScoreSentenceScores$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores vocalScoreResponseRhythemScoreSentenceScores, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseRhythemScoreSentenceScores.endTime = b.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽧\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseRhythemScoreSentenceScores$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores vocalScoreResponseRhythemScoreSentenceScores, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseRhythemScoreSentenceScores.score = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores vocalScoreResponseRhythemScoreSentenceScores = new VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VocalScoreResponse.VocalScoreResponseRhythemScoreSentenceScores> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, vocalScoreResponseRhythemScoreSentenceScores, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㽨\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return vocalScoreResponseRhythemScoreSentenceScores;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return vocalScoreResponseRhythemScoreSentenceScores;
    }
}
