package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScore;
import com.tencent.cos.xml.model.ci.ai.VocalScoreResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class VocalScoreResponse$VocalScoreResponseOperation$$XmlAdapter extends IXmlAdapter<VocalScoreResponse.VocalScoreResponseOperation> {
    private HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseOperation>> childElementBinders;

    public VocalScoreResponse$VocalScoreResponseOperation$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VocalScoreResponse.VocalScoreResponseOperation>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽘\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseOperation$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseOperation vocalScoreResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseOperation.userData = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽙\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseOperation$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseOperation vocalScoreResponseOperation, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreResponseOperation.jobLevel = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽚\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseOperation$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseOperation vocalScoreResponseOperation, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseOperation.vocalScore = (VocalScore.VocalScoreVocalScore) QCloudXml.fromXml(xmlPullParser, VocalScore.VocalScoreVocalScore.class, ProtectedSandApp.s("㽖\u0001"));
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("㽛\u0001"), new ChildElementBinder<VocalScoreResponse.VocalScoreResponseOperation>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$VocalScoreResponseOperation$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse.VocalScoreResponseOperation vocalScoreResponseOperation, String str) throws IOException, XmlPullParserException {
                vocalScoreResponseOperation.vocalScoreResult = (VocalScoreResponse.VocalScoreResponseVocalScoreResult) QCloudXml.fromXml(xmlPullParser, VocalScoreResponse.VocalScoreResponseVocalScoreResult.class, ProtectedSandApp.s("㽗\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VocalScoreResponse.VocalScoreResponseOperation fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VocalScoreResponse.VocalScoreResponseOperation vocalScoreResponseOperation = new VocalScoreResponse.VocalScoreResponseOperation();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VocalScoreResponse.VocalScoreResponseOperation> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, vocalScoreResponseOperation, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㽜\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return vocalScoreResponseOperation;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return vocalScoreResponseOperation;
    }
}
