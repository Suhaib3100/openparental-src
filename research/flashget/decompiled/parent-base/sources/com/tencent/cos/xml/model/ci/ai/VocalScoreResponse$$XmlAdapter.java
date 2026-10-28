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
public class VocalScoreResponse$$XmlAdapter extends IXmlAdapter<VocalScoreResponse> {
    private HashMap<String, ChildElementBinder<VocalScoreResponse>> childElementBinders;

    public VocalScoreResponse$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VocalScoreResponse>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㽆\u0001"), new ChildElementBinder<VocalScoreResponse>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScoreResponse$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScoreResponse vocalScoreResponse, String str) throws IOException, XmlPullParserException {
                if (vocalScoreResponse.jobsDetail == null) {
                    vocalScoreResponse.jobsDetail = new ArrayList();
                }
                vocalScoreResponse.jobsDetail.add((VocalScoreResponse.VocalScoreResponseJobsDetail) QCloudXml.fromXml(xmlPullParser, VocalScoreResponse.VocalScoreResponseJobsDetail.class, ProtectedSandApp.s("㽅\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VocalScoreResponse fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VocalScoreResponse vocalScoreResponse = new VocalScoreResponse();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VocalScoreResponse> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, vocalScoreResponse, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㽇\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return vocalScoreResponse;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return vocalScoreResponse;
    }
}
