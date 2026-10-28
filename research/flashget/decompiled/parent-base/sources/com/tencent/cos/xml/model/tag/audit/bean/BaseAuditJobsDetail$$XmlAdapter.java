package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class BaseAuditJobsDetail$$XmlAdapter extends IXmlAdapter<BaseAuditJobsDetail> {
    private HashMap<String, ChildElementBinder<BaseAuditJobsDetail>> childElementBinders;

    public BaseAuditJobsDetail$$XmlAdapter() {
        HashMap<String, ChildElementBinder<BaseAuditJobsDetail>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䰵\u0001"), new ChildElementBinder<BaseAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.BaseAuditJobsDetail$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseAuditJobsDetail baseAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                baseAuditJobsDetail.jobId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰶\u0001"), new ChildElementBinder<BaseAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.BaseAuditJobsDetail$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseAuditJobsDetail baseAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                baseAuditJobsDetail.state = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰷\u0001"), new ChildElementBinder<BaseAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.BaseAuditJobsDetail$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseAuditJobsDetail baseAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                baseAuditJobsDetail.creationTime = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䰸\u0001"), new ChildElementBinder<BaseAuditJobsDetail>() { // from class: com.tencent.cos.xml.model.tag.audit.bean.BaseAuditJobsDetail$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, BaseAuditJobsDetail baseAuditJobsDetail, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                baseAuditJobsDetail.dataId = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public BaseAuditJobsDetail fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        BaseAuditJobsDetail baseAuditJobsDetail = new BaseAuditJobsDetail();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<BaseAuditJobsDetail> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, baseAuditJobsDetail, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䰹\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return baseAuditJobsDetail;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return baseAuditJobsDetail;
    }
}
