package com.tencent.cos.xml.model.tag;

import com.tencent.qcloud.qcloudxml.annoation.XmlBean;
import com.tencent.qcloud.qcloudxml.annoation.XmlElement;
import java.util.List;

@XmlBean(method = XmlBean.GenerateMethod.FROM, name = "Response")
/* loaded from: classes7.dex */
public class DescribeDocProcessBuckets {

    @XmlElement(flatListNote = true)
    public List<BucketDocumentPreviewState> docBucketList;
    public int pageNumber;
    public int pageSize;
    public String requestId;
    public int totalCount;
}
