package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.ci.a;
import com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import com.tencent.qcloud.qcloudxml.core.QCloudXml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DescribeMediaBucketsResult$$XmlAdapter extends IXmlAdapter<DescribeMediaBucketsResult> {
    private HashMap<String, ChildElementBinder<DescribeMediaBucketsResult>> childElementBinders;

    public DescribeMediaBucketsResult$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeMediaBucketsResult>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䨨\u0001"), new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                describeMediaBucketsResult.requestId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨩\u0001"), new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult, String str) throws IOException, XmlPullParserException {
                describeMediaBucketsResult.totalCount = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨪\u0001"), new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult, String str) throws IOException, XmlPullParserException {
                describeMediaBucketsResult.pageNumber = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨫\u0001"), new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult, String str) throws IOException, XmlPullParserException {
                describeMediaBucketsResult.pageSize = a.a(xmlPullParser);
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨬\u0001"), new ChildElementBinder<DescribeMediaBucketsResult>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$$XmlAdapter.5
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult describeMediaBucketsResult, String str) throws IOException, XmlPullParserException {
                if (describeMediaBucketsResult.mediaBucketList == null) {
                    describeMediaBucketsResult.mediaBucketList = new ArrayList();
                }
                describeMediaBucketsResult.mediaBucketList.add((DescribeMediaBucketsResult.MediaBucketList) QCloudXml.fromXml(xmlPullParser, DescribeMediaBucketsResult.MediaBucketList.class, ProtectedSandApp.s("䨧\u0001")));
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeMediaBucketsResult fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DescribeMediaBucketsResult describeMediaBucketsResult = new DescribeMediaBucketsResult();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeMediaBucketsResult> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, describeMediaBucketsResult, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䨭\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return describeMediaBucketsResult;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return describeMediaBucketsResult;
    }
}
