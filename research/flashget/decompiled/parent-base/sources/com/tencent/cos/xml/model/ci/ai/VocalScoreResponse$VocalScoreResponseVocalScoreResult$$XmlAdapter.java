package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScoreResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class VocalScoreResponse$VocalScoreResponseVocalScoreResult$$XmlAdapter extends IXmlAdapter<VocalScoreResponse.VocalScoreResponseVocalScoreResult> {
    private HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseVocalScoreResult>> childElementBinders;

    public VocalScoreResponse$VocalScoreResponseVocalScoreResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseVocalScoreResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽯\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseVocalScoreResult>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseVocalScoreResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseVocalScoreResult vocalScoreResponseVocalScoreResult, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseVocalScoreResult.pitchScore = (VocalScoreResponse.VocalScoreResponsePitchScore) QCloudXml.fromXml(xmlPullParser, VocalScoreResponse.VocalScoreResponsePitchScore.class, ProtectedSandApp.s("㽭\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽰\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseVocalScoreResult>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseVocalScoreResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseVocalScoreResult vocalScoreResponseVocalScoreResult, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseVocalScoreResult.rhythemScore = (VocalScoreResponse.VocalScoreResponseRhythemScore) QCloudXml.fromXml(xmlPullParser, VocalScoreResponse.VocalScoreResponseRhythemScore.class, ProtectedSandApp.s("㽮\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VocalScoreResponse.VocalScoreResponseVocalScoreResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VocalScoreResponse.VocalScoreResponseVocalScoreResult vocalScoreResponseVocalScoreResult = new VocalScoreResponse.VocalScoreResponseVocalScoreResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VocalScoreResponse.VocalScoreResponseVocalScoreResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, vocalScoreResponseVocalScoreResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㽱\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return vocalScoreResponseVocalScoreResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return vocalScoreResponseVocalScoreResult;
    }
}
