package com.tencent.cos.xml.model.ci.ai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.ai.VocalScore;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes7.dex */
public class VocalScore$VocalScoreInput$$XmlAdapter extends IXmlAdapter<VocalScore.VocalScoreInput> {
    private HashMap<String, ChildElementBinder<VocalScore.VocalScoreInput>> childElementBinders;

    public VocalScore$VocalScoreInput$$XmlAdapter() {
        HashMap<String, ChildElementBinder<VocalScore.VocalScoreInput>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("㼷\u0001"), new ChildElementBinder<VocalScore.VocalScoreInput>() { // from class: com.tencent.cos.xml.model.ci.ai.VocalScore$VocalScoreInput$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, VocalScore.VocalScoreInput vocalScoreInput, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                vocalScoreInput.object = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public VocalScore.VocalScoreInput fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        VocalScore.VocalScoreInput vocalScoreInput = new VocalScore.VocalScoreInput();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<VocalScore.VocalScoreInput> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, vocalScoreInput, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("㼸\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return vocalScoreInput;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return vocalScoreInput;
    }

    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public void toXml(XmlSerializer xmlSerializer, VocalScore.VocalScoreInput vocalScoreInput, String str) throws IOException, XmlPullParserException {
        if (vocalScoreInput == null) {
            return;
        }
        if (str == null) {
            str = ProtectedSandApp.s("㼸\u0001");
        }
        xmlSerializer.startTag("", str);
        if (vocalScoreInput.object != null) {
            String s4 = ProtectedSandApp.s("㼷\u0001");
            xmlSerializer.startTag("", s4);
            a.a(vocalScoreInput.object, xmlSerializer, "", s4);
        }
        xmlSerializer.endTag("", str);
    }
}
