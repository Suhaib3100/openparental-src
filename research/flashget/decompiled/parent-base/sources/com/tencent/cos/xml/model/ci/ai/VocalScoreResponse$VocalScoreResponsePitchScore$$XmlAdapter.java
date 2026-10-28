package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScoreResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class VocalScoreResponse$VocalScoreResponsePitchScore$$XmlAdapter extends IXmlAdapter<VocalScoreResponse.VocalScoreResponsePitchScore> {
    private HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponsePitchScore>> childElementBinders;

    public VocalScoreResponse$VocalScoreResponsePitchScore$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponsePitchScore>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽞\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponsePitchScore>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponsePitchScore$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponsePitchScore vocalScoreResponsePitchScore, String str) throws IOException, XmlPullParserException {
                if (vocalScoreResponsePitchScore.sentenceScores == null) {
                    vocalScoreResponsePitchScore.sentenceScores = new ArrayList();
                }
                vocalScoreResponsePitchScore.sentenceScores.add((VocalScoreResponse.VocalScoreResponseSentenceScores) QCloudXml.fromXml(xmlPullParser, VocalScoreResponse.VocalScoreResponseSentenceScores.class, ProtectedSandApp.s("㽝\u0001")));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽟\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponsePitchScore>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponsePitchScore$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponsePitchScore vocalScoreResponsePitchScore, String str) throws IOException, XmlPullParserException {
                vocalScoreResponsePitchScore.totalScore = com.tencent.cos.xml.model.ci.a.a(xmlPullParser);
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VocalScoreResponse.VocalScoreResponsePitchScore fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VocalScoreResponse.VocalScoreResponsePitchScore vocalScoreResponsePitchScore = new VocalScoreResponse.VocalScoreResponsePitchScore();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VocalScoreResponse.VocalScoreResponsePitchScore> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, vocalScoreResponsePitchScore, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㽠\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return vocalScoreResponsePitchScore;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return vocalScoreResponsePitchScore;
    }
}
