package com.tencent.cos.xml.model.tag;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult;
import com.tencent.qcloud.qcloudxml.core.ChildElementBinder;
import com.tencent.qcloud.qcloudxml.core.IXmlAdapter;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter extends IXmlAdapter<DescribeMediaBucketsResult.MediaBucketList> {
    private HashMap<String, ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>> childElementBinders;

    public DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter() {
        HashMap<String, ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>> hashMap = new HashMap<>();
        this.childElementBinders = hashMap;
        hashMap.put(ProtectedSandApp.s("䨮\u0001"), new ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter.1
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult.MediaBucketList mediaBucketList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaBucketList.bucketId = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨯\u0001"), new ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter.2
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult.MediaBucketList mediaBucketList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaBucketList.name = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨰\u0001"), new ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter.3
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult.MediaBucketList mediaBucketList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaBucketList.region = xmlPullParser.getText();
            }
        });
        this.childElementBinders.put(ProtectedSandApp.s("䨱\u0001"), new ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList>() { // from class: com.tencent.cos.xml.model.tag.DescribeMediaBucketsResult$MediaBucketList$$XmlAdapter.4
            @Override // com.tencent.qcloud.qcloudxml.core.ChildElementBinder
            public void fromXml(XmlPullParser xmlPullParser, DescribeMediaBucketsResult.MediaBucketList mediaBucketList, String str) throws IOException, XmlPullParserException {
                xmlPullParser.next();
                mediaBucketList.createTime = xmlPullParser.getText();
            }
        });
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.qcloud.qcloudxml.core.IXmlAdapter
    public DescribeMediaBucketsResult.MediaBucketList fromXml(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        DescribeMediaBucketsResult.MediaBucketList mediaBucketList = new DescribeMediaBucketsResult.MediaBucketList();
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                ChildElementBinder<DescribeMediaBucketsResult.MediaBucketList> childElementBinder = this.childElementBinders.get(xmlPullParser.getName());
                if (childElementBinder != null) {
                    childElementBinder.fromXml(xmlPullParser, mediaBucketList, null);
                }
            } else if (eventType == 3) {
                if ((str == null ? ProtectedSandApp.s("䨲\u0001") : str).equalsIgnoreCase(xmlPullParser.getName())) {
                    return mediaBucketList;
                }
            } else {
                continue;
            }
            eventType = xmlPullParser.next();
        }
        return mediaBucketList;
    }
}
