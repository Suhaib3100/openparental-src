package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.audit.CreateStrategy;
import com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetStrategyDetailResponse$Strategy$$XmlAdapter extends IXmlAdapter<GetStrategyDetailResponse.Strategy> {
    private HashMap<String, ChildElementBinder<GetStrategyDetailResponse.Strategy>> childElementBinders;

    public GetStrategyDetailResponse$Strategy$$XmlAdapter() {
        HashMap<String, ChildElementBinder<GetStrategyDetailResponse.Strategy>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䅗\u0001"), new ChildElementBinder<GetStrategyDetailResponse.Strategy>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse$Strategy$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyDetailResponse.Strategy strategy, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                strategy.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅘\u0001"), new ChildElementBinder<GetStrategyDetailResponse.Strategy>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse$Strategy$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyDetailResponse.Strategy strategy, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                strategy.service = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅙\u0001"), new ChildElementBinder<GetStrategyDetailResponse.Strategy>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse$Strategy$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyDetailResponse.Strategy strategy, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                strategy.bizType = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅚\u0001"), new ChildElementBinder<GetStrategyDetailResponse.Strategy>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse$Strategy$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyDetailResponse.Strategy strategy, String str) throws IOException, XmlPullParserException {
                if (strategy.textLibs == null) {
                    strategy.textLibs = new ArrayList();
                }
                int eventType = xmlPullParser.getEventType();
                while (eventType != 1) {
                    if (eventType == 2) {
                        xmlPullParser.next();
                        strategy.textLibs.add(xmlPullParser.getText());
                    } else if (eventType == 3 && ProtectedSandApp.s("䅕\u0001").equalsIgnoreCase(xmlPullParser.getName())) {
                        return;
                    }
                    eventType = xmlPullParser.next();
                }
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䅛\u0001"), new ChildElementBinder<GetStrategyDetailResponse.Strategy>() { // from class: com.tencent.cos.xml.model.ci.audit.GetStrategyDetailResponse$Strategy$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, GetStrategyDetailResponse.Strategy strategy, String str) throws IOException, XmlPullParserException {
                strategy.labels = (CreateStrategy.Labels) QCloudXml.fromXml(xmlPullParser, CreateStrategy.Labels.class, ProtectedSandApp.s("䅖\u0001"));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public GetStrategyDetailResponse.Strategy fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        GetStrategyDetailResponse.Strategy strategy = new GetStrategyDetailResponse.Strategy();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<GetStrategyDetailResponse.Strategy> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, strategy, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䅜\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return strategy;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return strategy;
    }
}
