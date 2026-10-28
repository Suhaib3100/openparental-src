package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DescribeDocProcessBuckets$$XmlAdapter extends IXmlAdapter<DescribeDocProcessBuckets> {
    private HashMap<String, ChildElementBinder<DescribeDocProcessBuckets>> childElementBinders;

    public DescribeDocProcessBuckets$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeDocProcessBuckets>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䨡\u0001"), new ChildElementBinder<DescribeDocProcessBuckets>() { // from class: com.tencent.cos.xml.model.tag.DescribeDocProcessBuckets$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeDocProcessBuckets describeDocProcessBuckets, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeDocProcessBuckets.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨢\u0001"), new ChildElementBinder<DescribeDocProcessBuckets>() { // from class: com.tencent.cos.xml.model.tag.DescribeDocProcessBuckets$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeDocProcessBuckets describeDocProcessBuckets, String str) throws IOException, XmlPullParserException {
                describeDocProcessBuckets.totalCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨣\u0001"), new ChildElementBinder<DescribeDocProcessBuckets>() { // from class: com.tencent.cos.xml.model.tag.DescribeDocProcessBuckets$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeDocProcessBuckets describeDocProcessBuckets, String str) throws IOException, XmlPullParserException {
                describeDocProcessBuckets.pageNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨤\u0001"), new ChildElementBinder<DescribeDocProcessBuckets>() { // from class: com.tencent.cos.xml.model.tag.DescribeDocProcessBuckets$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeDocProcessBuckets describeDocProcessBuckets, String str) throws IOException, XmlPullParserException {
                describeDocProcessBuckets.pageSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨥\u0001"), new ChildElementBinder<DescribeDocProcessBuckets>() { // from class: com.tencent.cos.xml.model.tag.DescribeDocProcessBuckets$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeDocProcessBuckets describeDocProcessBuckets, String str) throws IOException, XmlPullParserException {
                if (describeDocProcessBuckets.docBucketList == null) {
                    describeDocProcessBuckets.docBucketList = new ArrayList();
                }
                describeDocProcessBuckets.docBucketList.add((BucketDocumentPreviewState) QCloudXml.fromXml(xmlPullParser, BucketDocumentPreviewState.class, ProtectedSandApp.s("䨠\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeDocProcessBuckets fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DescribeDocProcessBuckets describeDocProcessBuckets = new DescribeDocProcessBuckets();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeDocProcessBuckets> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, describeDocProcessBuckets, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䨦\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return describeDocProcessBuckets;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return describeDocProcessBuckets;
    }
}
